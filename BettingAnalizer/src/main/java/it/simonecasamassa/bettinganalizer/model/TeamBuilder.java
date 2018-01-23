package it.simonecasamassa.bettinganalizer.model;

public class TeamBuilder {

	private Team team;
	private String name;
	private String division;
	private int num_match;
	private int num_over_25;
	private int num_over_15;
	private int num_over_35;
	private int FTHG; // somma totale goal fatti in casa
	private int FTAG; // somma totale goal fatti fuori casa
	private int HTHG; // somma totale goal fatti in casa primo tempo
	private int HTAG; // somma totale goal fatti fuori casa primo tempo
	private int HC; // corner conquistati in casa
	private int AC; // corner conquistati fuori casa
	private int HF; // numero falli commessi in casa
	private int AF; // numero falli commessi fuori casa
	private int HO; // numero di fuorigiochi in casa
	private int AO; // numero di fuorigiochi fuori casa
	private int HY; // cartellini gialli in casa
	private int AY; // cartellini gialli fuori casa
	private int HR; // cartellini rossi in casa
	private int AR; // cartellini rossi fuori casa

	public TeamBuilder(Team team) {
		this.team = team;
	}

	public TeamBuilder setTeam(Team team) {
		this.team = team;
		return this;
	}

	public TeamBuilder setName(String name) {
		this.name = name;
		return this;
	}

	public TeamBuilder setDivision(String division) {
		this.division = division;
		return this;
	}

	public TeamBuilder setNum_match(int num_match) {
		this.num_match = num_match;
		return this;
	}

	public TeamBuilder setNum_over_25(int num_over_25) {
		this.num_over_25 = num_over_25;
		return this;
	}

	public TeamBuilder setNum_over_15(int num_over_15) {
		this.num_over_15 = num_over_15;
		return this;
	}

	public TeamBuilder setNum_over_35(int num_over_35) {
		this.num_over_35 = num_over_35;
		return this;
	}

	public TeamBuilder setFTHG(int fTHG) {
		FTHG = fTHG;
		return this;
	}

	public TeamBuilder setFTAG(int fTAG) {
		FTAG = fTAG;
		return this;
	}

	public TeamBuilder setHTHG(int hTHG) {
		HTHG = hTHG;
		return this;
	}

	public TeamBuilder setHTAG(int hTAG) {
		HTAG = hTAG;
		return this;
	}

	public TeamBuilder setHC(int hC) {
		HC = hC;
		return this;
	}

	public TeamBuilder setAC(int aC) {
		AC = aC;
		return this;
	}

	public TeamBuilder setHF(int hF) {
		HF = hF;
		return this;
	}

	public TeamBuilder setAF(int aF) {
		AF = aF;
		return this;
	}

	public TeamBuilder setHO(int hO) {
		HO = hO;
		return this;
	}

	public TeamBuilder setAO(int aO) {
		AO = aO;
		return this;
	}

	public TeamBuilder setHY(int hY) {
		HY = hY;
		return this;
	}

	public TeamBuilder setAY(int aY) {
		AY = aY;
		return this;
	}

	public TeamBuilder setHR(int hR) {
		HR = hR;
		return this;
	}

	public TeamBuilder setAR(int aR) {
		AR = aR;
		return this;
	}

	public Team generateNewTeamFromHome(ParsedEntry parsedEntry) {
		team.setFTHG(parsedEntry.getFTHG());
		team.setHTHG(parsedEntry.getHTHG());
		team.setHC(parsedEntry.getHC());
		team.setHF(parsedEntry.getHF());
		team.setHO(parsedEntry.getHO());
		team.setHY(parsedEntry.getHY());
		team.setHR(parsedEntry.getHR());
		team.setName(parsedEntry.getHomeTeam());
		team.setDivision(parsedEntry.getDivision());
		team.setNum_match(1);
		team.setNum_home_match(1);
		
		int home_goal = parsedEntry.getFTHG();
		int away_goal = parsedEntry.getFTAG();
		if (home_goal > away_goal)
			team.setPoints(3);
		else if (home_goal == away_goal)
			team.setPoints(1);
		else
			team.setPoints(0);

		if (home_goal > 3) {
			team.setNum_over_35(1);
			team.setNum_over_25(1);
			team.setNum_over_15(1);
			team.setH_num_over_35(1);
			team.setH_num_over_25(1);
			team.setH_num_over_15(1);
		} else if (home_goal > 2) {
			team.setNum_over_25(1);
			team.setNum_over_15(1);
			team.setH_num_over_25(1);
			team.setH_num_over_15(1);
		} else if (home_goal > 1){
			team.setNum_over_15(1);
			team.setH_num_over_15(1);
		}

		return this.team;
	}

	public Team generateNewTeamFromAway(ParsedEntry parsedEntry) {
		team.setFTAG(parsedEntry.getFTAG());
		team.setHTAG(parsedEntry.getHTAG());
		team.setAC(parsedEntry.getAC());
		team.setAF(parsedEntry.getAF());
		team.setAO(parsedEntry.getAO());
		team.setAY(parsedEntry.getAY());
		team.setAR(parsedEntry.getAR());
		team.setName(parsedEntry.getAwayTeam());
		team.setDivision(parsedEntry.getDivision());
		team.setNum_match(1);
		team.setNum_away_match(1);
		
		int home_goal = parsedEntry.getFTHG();
		int away_goal = parsedEntry.getFTAG();
		if (away_goal > home_goal)
			team.setPoints(3);
		else if (home_goal == away_goal)
			team.setPoints(1);
		else
			team.setPoints(0);

		if (away_goal > 3) {
			team.setNum_over_35(1);
			team.setNum_over_25(1);
			team.setNum_over_15(1);
			team.setA_num_over_35(1);
			team.setA_num_over_25(1);
			team.setA_num_over_15(1);
		} else if (away_goal > 2) {
			team.setNum_over_25(1);
			team.setNum_over_15(1);
			team.setA_num_over_25(1);
			team.setA_num_over_15(1);
		} else if (away_goal > 1) {
			team.setNum_over_15(1);
			team.setA_num_over_15(1);
		}

		return this.team;
	}

}
