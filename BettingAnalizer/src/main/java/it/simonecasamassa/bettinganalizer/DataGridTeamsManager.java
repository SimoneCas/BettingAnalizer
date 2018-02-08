package it.simonecasamassa.bettinganalizer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.simonecasamassa.bettinganalizer.model.ParsedEntry;
import it.simonecasamassa.bettinganalizer.model.Team;

@Component
@Scope("singleton")
public class DataGridTeamsManager {
	
	private Map<String, Team> teams = new HashMap<>();;

	public void putTeamsFromMatch(ParsedEntry p) {

		String match_home_team = p.getHomeTeam();
		String match_away_team = p.getAwayTeam();
		if(teams.containsKey(match_home_team)){
			//squadra che gioca in casa presente nella mappa
			Team t = teams.get(match_home_team);
			t.updateTeamFromHomeMatch(p);
			teams.put(match_home_team, t);
		} else {
			//squadra che gioca in casa non ancora presente in mappa
			teams.put(match_home_team, Team.getTeamBuilder().generateNewTeamFromHome(p));
		}
		
		if(teams.containsKey(match_away_team)){
			//squadra che gioca fuori casa presente nella mappa
			Team t = teams.get(match_away_team);
			t.updateTeamFromAwayMatch(p);
			teams.put(match_away_team, t);
		} else {
			//squadra che gioca fuori casa non ancora presente in mappa
			teams.put(match_away_team, Team.getTeamBuilder().generateNewTeamFromAway(p));
		}
		
	}
	
	public List<Team> getAllTeams(){
		return new ArrayList<Team>(teams.values());
	}
	
	public Team getByKey(String name){
		return teams.get(name);
	}
	
}
