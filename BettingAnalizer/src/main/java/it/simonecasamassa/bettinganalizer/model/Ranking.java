package it.simonecasamassa.bettinganalizer.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

public class Ranking {

	private String id;
	private SortedSet<Team> teams = new ConcurrentSkipListSet<>();
	
	
	private Ranking(){
		
	}
	
	private Ranking(String teamDivision){
		this.id = teamDivision;
	}
	

	public String getId() {
		return id;
	}




	public void setId(String id) {
		this.id = id;
	}


	public static Ranking createRanking(String teamDivision) {
		return new Ranking(teamDivision);
	}

	public void insertTeam(Team t) {
		System.out.println("XXXX "+t.getDivision()+" "+t.getName() );
		//if(!this.teams.add(t)){
			//this.teams.remove(t);
			this.teams.add(t);
		//}
			
	}
	
	public int getPosition(Team t){
		int i = 1;
		for(Team team: this.teams){
			if(t.equals(team))
				return i;
			i++;
		}
		return -1;
			
	}

	public SortedSet<Team> getTeams() {
		return teams;
	}
		
	
}
