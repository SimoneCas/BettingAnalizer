package it.simonecasamassa.bettinganalizer;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.simonecasamassa.bettinganalizer.model.Ranking;
import it.simonecasamassa.bettinganalizer.model.Team;

@Component
@Scope("singleton")
public class DataGridRankingManager {

	private Map<String, Ranking> rankings = new HashMap<>();

	public Ranking getByKey(String key) {
		return rankings.get(key);
	}

	public void putTeamInRanking(Team t) {
		// Seleziona corretta classifica
		String teamDivision = t.getDivision();
		if (rankings.containsKey(teamDivision)) {
			// manifestazione già presente
			Ranking ranking = rankings.get(teamDivision);
			ranking.insertTeam(t);

		} else {
			// manifestazione non ancora presente
			Ranking ranking = Ranking.createRanking(teamDivision);
			ranking.insertTeam(t);
			rankings.put(teamDivision, ranking);
		}
	}

	public void printRankings() {
		for (Ranking r : this.rankings.values()) {
			SortedSet<Team> teams = r.getTeams();
			for (Team t : teams)
				System.out.println(t.getDivision() + "   " + t.getName());
		}
	}
}
