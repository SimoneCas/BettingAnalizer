package it.simonecasamassa.bettinganalizer.rules;

import it.simonecasamassa.bettinganalizer.model.NextMatch;
import it.simonecasamassa.bettinganalizer.model.Ranking;
import it.simonecasamassa.bettinganalizer.model.Team;

public interface Rule {

	public boolean evaluate(NextMatch nextMatch, Ranking ranking, Team homeTeam, Team awayTeam);
}
