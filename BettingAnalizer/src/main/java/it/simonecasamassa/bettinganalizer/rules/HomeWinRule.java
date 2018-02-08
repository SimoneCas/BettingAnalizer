package it.simonecasamassa.bettinganalizer.rules;

import it.simonecasamassa.bettinganalizer.model.NextMatch;
import it.simonecasamassa.bettinganalizer.model.Ranking;
import it.simonecasamassa.bettinganalizer.model.Team;

public class HomeWinRule implements Rule {

	private int differenceBetweenTeams;

	public HomeWinRule(int differenceBetweenTeams) {
		this.differenceBetweenTeams = differenceBetweenTeams;
	}

	@Override
	public boolean evaluate(NextMatch nextMatch, Ranking ranking, Team homeTeam, Team awayTeam) {
		int homePosition = ranking.getPosition(homeTeam);
		int awayPosition = ranking.getPosition(awayTeam);
		if(homePosition <= 0 || awayPosition <=0)
			return false;
		if (homePosition < awayPosition - differenceBetweenTeams && homePosition < ranking.getTeams().size()/2)
			return true;
		else
			return false;
	}
	
	public String toString(){
		return "1X2 - 1";
	}

}
