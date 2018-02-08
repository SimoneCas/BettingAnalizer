package it.simonecasamassa.bettinganalizer.rules;

import it.simonecasamassa.bettinganalizer.model.NextMatch;
import it.simonecasamassa.bettinganalizer.model.Ranking;
import it.simonecasamassa.bettinganalizer.model.Team;

public class Over25Rule implements Rule {

	private double limitPercentMatching;

	public Over25Rule(double limitPercentMatching) {
		this.limitPercentMatching = limitPercentMatching;
	}

	@Override
	public boolean evaluate(NextMatch nextMatch, Ranking ranking, Team homeTeam, Team awayTeam) {
		int homeMatches = homeTeam.getNum_match();
		int homeAtHomeMatches = homeTeam.getNum_home_match();
		double numOverMatchingHome = homeTeam.getNum_over_25();
		double numOverMatchingHomeAtHome = homeTeam.getH_num_over_25();
		int awayMatches = awayTeam.getNum_match();
		int awayAtAwayMatches = awayTeam.getNum_away_match();
		double numOverMatchingAway = awayTeam.getNum_over_25();
		double numOverMatchingAwayAtAway = awayTeam.getA_num_over_25();

		double percentHome = numOverMatchingHome / homeMatches * 100;
		double percentHomeAtHome = numOverMatchingHomeAtHome / homeAtHomeMatches * 100;
		double percentAway = numOverMatchingAway / awayMatches * 100;
		double percentAwayAtAway = numOverMatchingAwayAtAway / awayAtAwayMatches * 100;

		if (percentHome > limitPercentMatching && percentHomeAtHome > limitPercentMatching
				&& percentAway > limitPercentMatching && percentAwayAtAway > limitPercentMatching)
			return true;
		if (percentHome > limitPercentMatching*3 || percentAway >limitPercentMatching*3)
			return true;
		return false;
	}

	public String toString() {
		return "OVER 2.5";
	}

}
