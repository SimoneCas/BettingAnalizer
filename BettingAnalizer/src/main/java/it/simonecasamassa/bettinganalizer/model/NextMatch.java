package it.simonecasamassa.bettinganalizer.model;

public class NextMatch {

	private String division;
	private String homeTeam;
	private String awayTeam;
	private String date;
	
	public NextMatch(){
		
	}
	
	

	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getHomeTeam() {
		return homeTeam;
	}

	public void setHomeTeam(String homeTeam) {
		this.homeTeam = homeTeam;
	}

	public String getAwayTeam() {
		return awayTeam;
	}

	public void setAwayTeam(String awayTeam) {
		this.awayTeam = awayTeam;
	}

	@Override
	public String toString() {
		return "NextMatch [division=" + division + ", homeTeam=" + homeTeam + ", awayTeam=" + awayTeam + ", date="
				+ date + "]";
	}
	
	
}
