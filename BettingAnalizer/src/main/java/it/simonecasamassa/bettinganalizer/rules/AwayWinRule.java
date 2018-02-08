package it.simonecasamassa.bettinganalizer.rules;

import it.simonecasamassa.bettinganalizer.model.NextMatch;
import it.simonecasamassa.bettinganalizer.model.Ranking;
import it.simonecasamassa.bettinganalizer.model.Team;

public class AwayWinRule implements Rule {

	private int differenceBetweenTeams;

	public AwayWinRule(int differenceBetweenTeams) {
		this.differenceBetweenTeams = differenceBetweenTeams;
	}

	@Override
	public boolean evaluate(NextMatch nextMatch, Ranking ranking, Team homeTeam, Team awayTeam) {
		int homePosition = ranking.getPosition(homeTeam);
		int awayPosition = ranking.getPosition(awayTeam);
		if (awayPosition <= 0 || awayPosition <= 0)
			return false;
		int homeOffset = (homePosition - differenceBetweenTeams);
		int rankingOffset = (ranking.getTeams().size() / 3);
		if (awayPosition < homeOffset && awayPosition < rankingOffset)
			return true;
		else
			return false;
	}

	public String toString() {
		return "1X2 - 2";
	}

}
