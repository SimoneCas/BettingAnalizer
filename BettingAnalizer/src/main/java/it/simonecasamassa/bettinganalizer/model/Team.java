package it.simonecasamassa.bettinganalizer.model;

public class Team implements Comparable<Team> {

	private String name;
	private String division;
	private int num_match; // da generare
	private int num_home_match; // numero match giocati in casa
	private int num_away_match; // numero match giocati fuori casa
	private int points; // da generare
	private int num_over_25 = 0; // da generare
	private int num_over_15 = 0; // da generare
	private int num_over_35 = 0; // da generare
	private int h_num_over_25 = 0; // da generare
	private int h_num_over_15 = 0; // da generare
	private int h_num_over_35 = 0; // da generare
	private int a_num_over_25 = 0; // da generare
	private int a_num_over_15 = 0; // da generare
	private int a_num_over_35 = 0; // da generare
	private int FTHG = 0; // somma totale goal fatti in casa
	private int FTAG = 0; // somma totale goal fatti fuori casa
	private int HTHG = 0; // somma totale goal fatti in casa primo tempo
	private int HTAG = 0; // somma totale goal fatti fuori casa primo tempo
	private int HC = 0; // corner conquistati in casa
	private int AC = 0; // corner conquistati fuori casa
	private int HF = 0; // numero falli commessi in casa
	private int AF = 0; // numero falli commessi fuori casa
	private int HO = 0; // numero di fuorigiochi in casa
	private int AO = 0; // numero di fuorigiochi fuori casa
	private int HY = 0; // cartellini gialli in casa
	private int AY = 0; // cartellini gialli fuori casa
	private int HR = 0; // cartellini rossi in casa
	private int AR = 0; // cartellini rossi fuori casa

	private Team() {

	}

	public void setPoints(int points) {
		this.points = points;
	}

	public void setNum_home_match(int num_home_match) {
		this.num_home_match = num_home_match;
	}

	public void setNum_away_match(int num_away_match) {
		this.num_away_match = num_away_match;
	}

	public void setH_num_over_25(int h_num_over_25) {
		this.h_num_over_25 = h_num_over_25;
	}

	public void setH_num_over_15(int h_num_over_15) {
		this.h_num_over_15 = h_num_over_15;
	}

	public void setH_num_over_35(int h_num_over_35) {
		this.h_num_over_35 = h_num_over_35;
	}

	public void setA_num_over_25(int a_num_over_25) {
		this.a_num_over_25 = a_num_over_25;
	}

	public void setA_num_over_15(int a_num_over_15) {
		this.a_num_over_15 = a_num_over_15;
	}

	public void setA_num_over_35(int a_num_over_35) {
		this.a_num_over_35 = a_num_over_35;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public void setNum_match(int num_match) {
		this.num_match = num_match;
	}

	public void setNum_over_25(int num_over_25) {
		this.num_over_25 = num_over_25;
	}

	public void setNum_over_15(int num_over_15) {
		this.num_over_15 = num_over_15;
	}

	public void setNum_over_35(int num_over_35) {
		this.num_over_35 = num_over_35;
	}

	public void setFTHG(int fTHG) {
		FTHG = fTHG;
	}

	public void setFTAG(int fTAG) {
		FTAG = fTAG;
	}

	public void setHTHG(int hTHG) {
		HTHG = hTHG;
	}

	public void setHTAG(int hTAG) {
		HTAG = hTAG;
	}

	public void setHC(int hC) {
		HC = hC;
	}

	public void setAC(int aC) {
		AC = aC;
	}

	public void setHF(int hF) {
		HF = hF;
	}

	public void setAF(int aF) {
		AF = aF;
	}

	public void setHO(int hO) {
		HO = hO;
	}

	public void setAO(int aO) {
		AO = aO;
	}

	public void setHY(int hY) {
		HY = hY;
	}

	public void setAY(int aY) {
		AY = aY;
	}

	public void setHR(int hR) {
		HR = hR;
	}

	public void setAR(int aR) {
		AR = aR;
	}

	public void updateTeamFromHomeMatch(ParsedEntry parsedEntry) {
		this.FTHG += (parsedEntry.getFTHG());
		this.HTHG += (parsedEntry.getHTHG());
		this.HC += (parsedEntry.getHC());
		this.HF += (parsedEntry.getHF());
		this.HO += (parsedEntry.getHO());
		this.HY += (parsedEntry.getHY());
		this.HR += (parsedEntry.getHR());
		this.num_match++;
		this.num_home_match++;

		int home_goal = parsedEntry.getFTHG();
		int away_goal = parsedEntry.getFTAG();
		if (home_goal > away_goal)
			this.points += 3;
		else if (home_goal == away_goal)
			this.points += 1;
		else
			this.points += 0;

		if (home_goal > 3) {
			this.num_over_35++;
			this.num_over_25++;
			this.num_over_15++;
			this.h_num_over_35++;
			this.h_num_over_25++;
			this.h_num_over_15++;
		} else if (home_goal > 2) {
			this.num_over_25++;
			this.num_over_15++;
			this.h_num_over_25++;
			this.h_num_over_15++;
		} else if (home_goal > 1) {
			this.num_over_15++;
			this.h_num_over_15++;
		}
	}

	public void updateTeamFromAwayMatch(ParsedEntry parsedEntry) {
		this.FTAG += (parsedEntry.getFTAG());
		this.HTAG += (parsedEntry.getHTAG());
		this.AC += (parsedEntry.getAC());
		this.AF += (parsedEntry.getAF());
		this.AO += (parsedEntry.getAO());
		this.AY += (parsedEntry.getAY());
		this.AR += (parsedEntry.getAR());
		this.num_match++;
		this.num_away_match++;

		int home_goal = parsedEntry.getFTHG();
		int away_goal = parsedEntry.getFTAG();
		if (away_goal > home_goal)
			this.points += 3;
		else if (home_goal == away_goal)
			this.points += 1;
		else
			this.points += 0;

		if (away_goal > 3) {
			this.num_over_35++;
			this.num_over_25++;
			this.num_over_15++;
			this.a_num_over_35++;
			this.a_num_over_25++;
			this.a_num_over_15++;
		} else if (away_goal > 2) {
			this.num_over_25++;
			this.num_over_15++;
			this.a_num_over_25++;
			this.a_num_over_15++;
		} else if (away_goal > 1) {
			this.num_over_15++;
			this.a_num_over_15++;
		}
	}

	public static TeamBuilder getTeamBuilder() {
		return new TeamBuilder(new Team());
	}

	@Override
	public String toString() {
		return "Team [name=" + name + ", division=" + division + ", num_match=" + num_match + ", num_home_match="
				+ num_home_match + ", num_away_match=" + num_away_match + ", points=" + points + ", num_over_25="
				+ num_over_25 + ", num_over_15=" + num_over_15 + ", num_over_35=" + num_over_35 + ", h_num_over_25="
				+ h_num_over_25 + ", h_num_over_15=" + h_num_over_15 + ", h_num_over_35=" + h_num_over_35
				+ ", a_num_over_25=" + a_num_over_25 + ", a_num_over_15=" + a_num_over_15 + ", a_num_over_35="
				+ a_num_over_35 + ", FTHG=" + FTHG + ", FTAG=" + FTAG + ", HTHG=" + HTHG + ", HTAG=" + HTAG + ", HC="
				+ HC + ", AC=" + AC + ", HF=" + HF + ", AF=" + AF + ", HO=" + HO + ", AO=" + AO + ", HY=" + HY + ", AY="
				+ AY + ", HR=" + HR + ", AR=" + AR + "]";
	}

	public String getName() {
		return name;
	}

	public String getDivision() {
		return division;
	}

	public int getNum_match() {
		return num_match;
	}

	public int getNum_home_match() {
		return num_home_match;
	}

	public int getNum_away_match() {
		return num_away_match;
	}

	public int getPoints() {
		return points;
	}

	public int getNum_over_25() {
		return num_over_25;
	}

	public int getNum_over_15() {
		return num_over_15;
	}

	public int getNum_over_35() {
		return num_over_35;
	}

	public int getH_num_over_25() {
		return h_num_over_25;
	}

	public int getH_num_over_15() {
		return h_num_over_15;
	}

	public int getH_num_over_35() {
		return h_num_over_35;
	}

	public int getA_num_over_25() {
		return a_num_over_25;
	}

	public int getA_num_over_15() {
		return a_num_over_15;
	}

	public int getA_num_over_35() {
		return a_num_over_35;
	}

	public int getFTHG() {
		return FTHG;
	}

	public int getFTAG() {
		return FTAG;
	}

	public int getHTHG() {
		return HTHG;
	}

	public int getHTAG() {
		return HTAG;
	}

	public int getHC() {
		return HC;
	}

	public int getAC() {
		return AC;
	}

	public int getHF() {
		return HF;
	}

	public int getAF() {
		return AF;
	}

	public int getHO() {
		return HO;
	}

	public int getAO() {
		return AO;
	}

	public int getHY() {
		return HY;
	}

	public int getAY() {
		return AY;
	}

	public int getHR() {
		return HR;
	}

	public int getAR() {
		return AR;
	}

	@Override
	public int compareTo(Team t) {
		if (this.points > t.getPoints())
			return -1;
		else if (this.points == t.getPoints())
			return 0;
		else
			return 1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + AC;
		result = prime * result + AF;
		result = prime * result + AO;
		result = prime * result + AR;
		result = prime * result + AY;
		result = prime * result + FTAG;
		result = prime * result + FTHG;
		result = prime * result + HC;
		result = prime * result + HF;
		result = prime * result + HO;
		result = prime * result + HR;
		result = prime * result + HTAG;
		result = prime * result + HTHG;
		result = prime * result + HY;
		result = prime * result + a_num_over_15;
		result = prime * result + a_num_over_25;
		result = prime * result + a_num_over_35;
		result = prime * result + ((division == null) ? 0 : division.hashCode());
		result = prime * result + h_num_over_15;
		result = prime * result + h_num_over_25;
		result = prime * result + h_num_over_35;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + num_away_match;
		result = prime * result + num_home_match;
		result = prime * result + num_match;
		result = prime * result + num_over_15;
		result = prime * result + num_over_25;
		result = prime * result + num_over_35;
		result = prime * result + points;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		Team other = (Team) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
}
