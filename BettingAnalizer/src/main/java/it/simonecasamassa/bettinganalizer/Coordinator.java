package it.simonecasamassa.bettinganalizer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.simonecasamassa.bettinganalizer.model.NextMatch;
import it.simonecasamassa.bettinganalizer.model.ParsedEntry;
import it.simonecasamassa.bettinganalizer.model.Ranking;
import it.simonecasamassa.bettinganalizer.model.Team;
import it.simonecasamassa.bettinganalizer.reader.StatisticsReader;
import it.simonecasamassa.bettinganalizer.rules.AwayWinRule;
import it.simonecasamassa.bettinganalizer.rules.HomeWinRule;
import it.simonecasamassa.bettinganalizer.rules.Over15Rule;
import it.simonecasamassa.bettinganalizer.rules.Over25Rule;
import it.simonecasamassa.bettinganalizer.rules.Rule;

@Component
public class Coordinator {

	@Autowired
	private StatisticsReader statisticsReader;

	@Autowired
	private DataGridTeamsManager datagridTeams;

	@Autowired
	private DataGridRankingManager datagridRanking;

	public void run() {
		try {
			// Caricamento iniziale dati storici
			List<ParsedEntry> matchList = statisticsReader.readOldStatistics();

			// generazione squadra
			for (ParsedEntry p : matchList) {
				datagridTeams.putTeamsFromMatch(p);
			}

			// generazione classifica
			List<Team> teams = datagridTeams.getAllTeams();
			for (Team t : teams) {
				datagridRanking.putTeamInRanking(t);
			}

			this.datagridRanking.printRankings();

			// Caricamento quote weekend
			List<NextMatch> nextMatches = statisticsReader.readNewStatistics();

			System.out.println("********* BETTING **********");
			// Applicazione regole
			System.out.println("***** 1x2 - 1 ******");
			for (NextMatch m : nextMatches) {
				Ranking ranking = this.datagridRanking.getByKey(m.getDivision());
				Team home = this.datagridTeams.getByKey(m.getHomeTeam());
				Team away = this.datagridTeams.getByKey(m.getAwayTeam());

				if (home != null && away != null) {
					int diffBetweenTeams = ranking.getTeams().size() / 3;
					Rule ruleHomeWin = new HomeWinRule(diffBetweenTeams);
					if (ruleHomeWin.evaluate(m, ranking, home, away))
						System.out.println("BET " + ruleHomeWin.toString() + " " + m.toString());

				}
			}

			System.out.println("***** 1x2 - 2 ******");

			for (NextMatch m : nextMatches) {
				Ranking ranking = this.datagridRanking.getByKey(m.getDivision());
				Team home = this.datagridTeams.getByKey(m.getHomeTeam());
				Team away = this.datagridTeams.getByKey(m.getAwayTeam());

				if (home != null && away != null) {
					int diffBetweenTeams = ranking.getTeams().size() / 2;
					Rule ruleAwayWin = new AwayWinRule(diffBetweenTeams);
					if (ruleAwayWin.evaluate(m, ranking, home, away))
						System.out.println("BET " + ruleAwayWin.toString() + " " + m.toString());
				}
			}
			
			System.out.println("***** OVER 2.5 ******");

			for (NextMatch m : nextMatches) {
				Ranking ranking = this.datagridRanking.getByKey(m.getDivision());
				Team home = this.datagridTeams.getByKey(m.getHomeTeam());
				Team away = this.datagridTeams.getByKey(m.getAwayTeam());

				if (home != null && away != null) {
					double limitPercentMatching = 25;
					Rule ruleAwayWin = new Over25Rule(limitPercentMatching);
					if (ruleAwayWin.evaluate(m, ranking, home, away))
						System.out.println("BET " + ruleAwayWin.toString() + " " + m.toString());
				}
			}
			
			System.out.println("***** OVER 1.5 ******");

			for (NextMatch m : nextMatches) {
				Ranking ranking = this.datagridRanking.getByKey(m.getDivision());
				Team home = this.datagridTeams.getByKey(m.getHomeTeam());
				Team away = this.datagridTeams.getByKey(m.getAwayTeam());

				if (home != null && away != null) {
					double limitPercentMatching = 50;
					Rule ruleAwayWin = new Over15Rule(limitPercentMatching);
					if (ruleAwayWin.evaluate(m, ranking, home, away))
						System.out.println("BET " + ruleAwayWin.toString() + " " + m.toString());
				}
			}

			// Condivisione risultati

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
