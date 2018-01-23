package it.simonecasamassa.bettinganalizer.model;

public class ParsedEntry {

	private String division; // = League Division
	private String date; // = Match Date (dd/mm/yy)
	private String homeTeam; // =Home Team
	private String awayTeam; // =Away Team
	private int FTHG; // =Full Time Home Team Goals
	private int FTAG; // =Full Time Away Team Goals
	private String FTR; // =Full Time Result (H=Home Win, D=Draw, A=Away Win)
	private int HTHG; // =Half Time Home Team Goals
	private int HTAG; // =Half Time Away Team Goals
	private String HTR; // =Half Time Result (H=Home Win, D=Draw, A=Away Win)

	// Match Statistics (where available)
	private int HS; // =Home Team Shots
	private int AS; // =Away Team Shots
	private int HST; // =Home Team Shots on Target
	private int AST; // =Away Team Shots on Target
	private int HHW; // =Home Team Hit Woodwork
	private int AHW; // =Away Team Hit Woodwork
	private int HC; // =Home Team Corners
	private int AC; // =Away Team Corners
	private int HF; // =Home Team Fouls Committed
	private int AF; // =Away Team Fouls Committed
	private int HO; // =Home Team Offsides
	private int AO; // =Away Team Offsides
	private int HY; // =Home Team Yellow Cards
	private int AY; // =Away Team Yellow Cards
	private int HR; // =Home Team Red Cards
	private int AR; // =Away Team Red Cards
	private int HBP; // =Home Team Bookings Points (10 ; //=yellow, 25 ; //=red)
	private int ABP; // =Away Team Bookings Points (10 ; //=yellow, 25 ; //=red)

	// Key to 1X2 (match) betting odds data:

	private double B365H; // =Bet365 home win odds
	private double B365D; // =Bet365 draw odds
	private double B365A; // =Bet365 away win odds
	private double BSH; // =Blue Square home win odds
	private double BSD; // =Blue Square draw odds
	private double BSA; // =Blue Square away win odds
	private double BWH; // =Bet&Win home win odds
	private double BWD; // =Bet&Win draw odds
	private double BWA; // =Bet&Win away win odds
	private double GBH; // =Gamebookers home win odds
	private double GBD; // =Gamebookers draw odds
	private double GBA; // =Gamebookers away win odds
	private double IWH; // =Interwetten home win odds
	private double IWD; // =Interwetten draw odds
	private double IWA; // =Interwetten away win odds
	private double LBH; // =Ladbrokes home win odds
	private double LBD; // =Ladbrokes draw odds
	private double LBA; // =Ladbrokes away win odds
	private double PSH; // =Pinnacle home win odds
	private double PSD; // =Pinnacle draw odds
	private double PSA; // =Pinnacle away win odds
	private double SOH; // =Sporting Odds home win odds
	private double SOD; // =Sporting Odds draw odds
	private double SOA; // =Sporting Odds away win odds
	private double SBH; // =Sportingbet home win odds
	private double SBD; // =Sportingbet draw odds
	private double SBA; // =Sportingbet away win odds
	private double SJH; // =Stan James home win odds
	private double SJD; // =Stan James draw odds
	private double SJA; // =Stan James away win odds
	private double SYH; // =Stanleybet home win odds
	private double SYD; // =Stanleybet draw odds
	private double SYA; // =Stanleybet away win odds
	private double VCH; // =VC Bet home win odds
	private double VCD; // =VC Bet draw odds
	private double VCA; // =VC Bet away win odds
	private double WHH; // =William Hill home win odds
	private double WHD; // =William Hill draw odds
	private double WHA; // =William Hill away win odds

	private double Bb1X2; // =Number of BetBrain bookmakers used to calculate
							// match odds averages and maximums
	private double BbMxH; // =Betbrain maximum home win odds
	private double BbAvH; // =Betbrain average home win odds
	private double BbMxD; // =Betbrain maximum draw odds
	private double BbAvD; // =Betbrain average draw win odds
	private double BbMxA; // =Betbrain maximum away win odds
	private double BbAvA; // =Betbrain average away win odds

	private double MaxH; // =Oddsportal maximum home win odds
	private double MaxD; // =Oddsportal maximum draw win odds
	private double MaxA; // =Oddsportal maximum away win odds
	private double AvgH; // =Oddsportal average home win odds
	private double AvgD; // =Oddsportal average draw win odds
	private double AvgA; // =Oddsportal average away win odds

	// Key to total goals betting odds:

	private double BbOU; // =Number of BetBrain bookmakers used to calculate
							// over/under 2.5 goals (total goals) averages and
							// maximums
	private double BbMxGreater2_5; // =Betbrain maximum over 2.5 goals
	private double BbAvGreater2_5; // =Betbrain average over 2.5 goals
	private double BbMxLower2_5; // =Betbrain maximum under 2.5 goals
	private double BbAvLower2_5; // =Betbrain average under 2.5 goals

	private double GBGreater2_5; // =Gamebookers over 2.5 goals
	private double GBLower2_5; // =Gamebookers under 2.5 goals
	private double B365Greater2_5; // =Bet365 over 2.5 goals
	private double B365Lower2_5; // =Bet365 under 2.5 goals
	
	
	@Override
	public String toString() {
		return "ParsedEntry [division=" + division + ", date=" + date + ", homeTeam=" + homeTeam + ", awayTeam="
				+ awayTeam + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((awayTeam == null) ? 0 : awayTeam.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((division == null) ? 0 : division.hashCode());
		result = prime * result + ((homeTeam == null) ? 0 : homeTeam.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ParsedEntry other = (ParsedEntry) obj;
		if (awayTeam == null) {
			if (other.awayTeam != null)
				return false;
		} else if (!awayTeam.equals(other.awayTeam))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (division == null) {
			if (other.division != null)
				return false;
		} else if (!division.equals(other.division))
			return false;
		if (homeTeam == null) {
			if (other.homeTeam != null)
				return false;
		} else if (!homeTeam.equals(other.homeTeam))
			return false;
		return true;
	}


	public String getDivision() {
		return division;
	}


	public void setDivision(String division) {
		this.division = division;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
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


	public int getFTHG() {
		return FTHG;
	}


	public void setFTHG(int fTHG) {
		FTHG = fTHG;
	}


	public int getFTAG() {
		return FTAG;
	}


	public void setFTAG(int fTAG) {
		FTAG = fTAG;
	}


	public String getFTR() {
		return FTR;
	}


	public void setFTR(String fTR) {
		FTR = fTR;
	}


	public int getHTHG() {
		return HTHG;
	}


	public void setHTHG(int hTHG) {
		HTHG = hTHG;
	}


	public int getHTAG() {
		return HTAG;
	}


	public void setHTAG(int hTAG) {
		HTAG = hTAG;
	}


	public String getHTR() {
		return HTR;
	}


	public void setHTR(String hTR) {
		HTR = hTR;
	}


	public int getHS() {
		return HS;
	}


	public void setHS(int hS) {
		HS = hS;
	}


	public int getAS() {
		return AS;
	}


	public void setAS(int aS) {
		AS = aS;
	}


	public int getHST() {
		return HST;
	}


	public void setHST(int hST) {
		HST = hST;
	}


	public int getAST() {
		return AST;
	}


	public void setAST(int aST) {
		AST = aST;
	}


	public int getHHW() {
		return HHW;
	}


	public void setHHW(int hHW) {
		HHW = hHW;
	}


	public int getAHW() {
		return AHW;
	}


	public void setAHW(int aHW) {
		AHW = aHW;
	}


	public int getHC() {
		return HC;
	}


	public void setHC(int hC) {
		HC = hC;
	}


	public int getAC() {
		return AC;
	}


	public void setAC(int aC) {
		AC = aC;
	}


	public int getHF() {
		return HF;
	}


	public void setHF(int hF) {
		HF = hF;
	}


	public int getAF() {
		return AF;
	}


	public void setAF(int aF) {
		AF = aF;
	}


	public int getHO() {
		return HO;
	}


	public void setHO(int hO) {
		HO = hO;
	}


	public int getAO() {
		return AO;
	}


	public void setAO(int aO) {
		AO = aO;
	}


	public int getHY() {
		return HY;
	}


	public void setHY(int hY) {
		HY = hY;
	}


	public int getAY() {
		return AY;
	}


	public void setAY(int aY) {
		AY = aY;
	}


	public int getHR() {
		return HR;
	}


	public void setHR(int hR) {
		HR = hR;
	}


	public int getAR() {
		return AR;
	}


	public void setAR(int aR) {
		AR = aR;
	}


	public int getHBP() {
		return HBP;
	}


	public void setHBP(int hBP) {
		HBP = hBP;
	}


	public int getABP() {
		return ABP;
	}


	public void setABP(int aBP) {
		ABP = aBP;
	}


	public double getB365H() {
		return B365H;
	}


	public void setB365H(double b365h) {
		B365H = b365h;
	}


	public double getB365D() {
		return B365D;
	}


	public void setB365D(double b365d) {
		B365D = b365d;
	}


	public double getB365A() {
		return B365A;
	}


	public void setB365A(double b365a) {
		B365A = b365a;
	}


	public double getBSH() {
		return BSH;
	}


	public void setBSH(double bSH) {
		BSH = bSH;
	}


	public double getBSD() {
		return BSD;
	}


	public void setBSD(double bSD) {
		BSD = bSD;
	}


	public double getBSA() {
		return BSA;
	}


	public void setBSA(double bSA) {
		BSA = bSA;
	}


	public double getBWH() {
		return BWH;
	}


	public void setBWH(double bWH) {
		BWH = bWH;
	}


	public double getBWD() {
		return BWD;
	}


	public void setBWD(double bWD) {
		BWD = bWD;
	}


	public double getBWA() {
		return BWA;
	}


	public void setBWA(double bWA) {
		BWA = bWA;
	}


	public double getGBH() {
		return GBH;
	}


	public void setGBH(double gBH) {
		GBH = gBH;
	}


	public double getGBD() {
		return GBD;
	}


	public void setGBD(double gBD) {
		GBD = gBD;
	}


	public double getGBA() {
		return GBA;
	}


	public void setGBA(double gBA) {
		GBA = gBA;
	}


	public double getIWH() {
		return IWH;
	}


	public void setIWH(double iWH) {
		IWH = iWH;
	}


	public double getIWD() {
		return IWD;
	}


	public void setIWD(double iWD) {
		IWD = iWD;
	}


	public double getIWA() {
		return IWA;
	}


	public void setIWA(double iWA) {
		IWA = iWA;
	}


	public double getLBH() {
		return LBH;
	}


	public void setLBH(double lBH) {
		LBH = lBH;
	}


	public double getLBD() {
		return LBD;
	}


	public void setLBD(double lBD) {
		LBD = lBD;
	}


	public double getLBA() {
		return LBA;
	}


	public void setLBA(double lBA) {
		LBA = lBA;
	}


	public double getPSH() {
		return PSH;
	}


	public void setPSH(double pSH) {
		PSH = pSH;
	}


	public double getPSD() {
		return PSD;
	}


	public void setPSD(double pSD) {
		PSD = pSD;
	}


	public double getPSA() {
		return PSA;
	}


	public void setPSA(double pSA) {
		PSA = pSA;
	}


	public double getSOH() {
		return SOH;
	}


	public void setSOH(double sOH) {
		SOH = sOH;
	}


	public double getSOD() {
		return SOD;
	}


	public void setSOD(double sOD) {
		SOD = sOD;
	}


	public double getSOA() {
		return SOA;
	}


	public void setSOA(double sOA) {
		SOA = sOA;
	}


	public double getSBH() {
		return SBH;
	}


	public void setSBH(double sBH) {
		SBH = sBH;
	}


	public double getSBD() {
		return SBD;
	}


	public void setSBD(double sBD) {
		SBD = sBD;
	}


	public double getSBA() {
		return SBA;
	}


	public void setSBA(double sBA) {
		SBA = sBA;
	}


	public double getSJH() {
		return SJH;
	}


	public void setSJH(double sJH) {
		SJH = sJH;
	}


	public double getSJD() {
		return SJD;
	}


	public void setSJD(double sJD) {
		SJD = sJD;
	}


	public double getSJA() {
		return SJA;
	}


	public void setSJA(double sJA) {
		SJA = sJA;
	}


	public double getSYH() {
		return SYH;
	}


	public void setSYH(double sYH) {
		SYH = sYH;
	}


	public double getSYD() {
		return SYD;
	}


	public void setSYD(double sYD) {
		SYD = sYD;
	}


	public double getSYA() {
		return SYA;
	}


	public void setSYA(double sYA) {
		SYA = sYA;
	}


	public double getVCH() {
		return VCH;
	}


	public void setVCH(double vCH) {
		VCH = vCH;
	}


	public double getVCD() {
		return VCD;
	}


	public void setVCD(double vCD) {
		VCD = vCD;
	}


	public double getVCA() {
		return VCA;
	}


	public void setVCA(double vCA) {
		VCA = vCA;
	}


	public double getWHH() {
		return WHH;
	}


	public void setWHH(double wHH) {
		WHH = wHH;
	}


	public double getWHD() {
		return WHD;
	}


	public void setWHD(double wHD) {
		WHD = wHD;
	}


	public double getWHA() {
		return WHA;
	}


	public void setWHA(double wHA) {
		WHA = wHA;
	}


	public double getBb1X2() {
		return Bb1X2;
	}


	public void setBb1X2(double bb1x2) {
		Bb1X2 = bb1x2;
	}


	public double getBbMxH() {
		return BbMxH;
	}


	public void setBbMxH(double bbMxH) {
		BbMxH = bbMxH;
	}


	public double getBbAvH() {
		return BbAvH;
	}


	public void setBbAvH(double bbAvH) {
		BbAvH = bbAvH;
	}


	public double getBbMxD() {
		return BbMxD;
	}


	public void setBbMxD(double bbMxD) {
		BbMxD = bbMxD;
	}


	public double getBbAvD() {
		return BbAvD;
	}


	public void setBbAvD(double bbAvD) {
		BbAvD = bbAvD;
	}


	public double getBbMxA() {
		return BbMxA;
	}


	public void setBbMxA(double bbMxA) {
		BbMxA = bbMxA;
	}


	public double getBbAvA() {
		return BbAvA;
	}


	public void setBbAvA(double bbAvA) {
		BbAvA = bbAvA;
	}


	public double getMaxH() {
		return MaxH;
	}


	public void setMaxH(double maxH) {
		MaxH = maxH;
	}


	public double getMaxD() {
		return MaxD;
	}


	public void setMaxD(double maxD) {
		MaxD = maxD;
	}


	public double getMaxA() {
		return MaxA;
	}


	public void setMaxA(double maxA) {
		MaxA = maxA;
	}


	public double getAvgH() {
		return AvgH;
	}


	public void setAvgH(double avgH) {
		AvgH = avgH;
	}


	public double getAvgD() {
		return AvgD;
	}


	public void setAvgD(double avgD) {
		AvgD = avgD;
	}


	public double getAvgA() {
		return AvgA;
	}


	public void setAvgA(double avgA) {
		AvgA = avgA;
	}


	public double getBbOU() {
		return BbOU;
	}


	public void setBbOU(double bbOU) {
		BbOU = bbOU;
	}


	public double getBbMxGreater2_5() {
		return BbMxGreater2_5;
	}


	public void setBbMxGreater2_5(double bbMxGreater2_5) {
		BbMxGreater2_5 = bbMxGreater2_5;
	}


	public double getBbAvGreater2_5() {
		return BbAvGreater2_5;
	}


	public void setBbAvGreater2_5(double bbAvGreater2_5) {
		BbAvGreater2_5 = bbAvGreater2_5;
	}


	public double getBbMxLower2_5() {
		return BbMxLower2_5;
	}


	public void setBbMxLower2_5(double bbMxLower2_5) {
		BbMxLower2_5 = bbMxLower2_5;
	}


	public double getBbAvLower2_5() {
		return BbAvLower2_5;
	}


	public void setBbAvLower2_5(double bbAvLower2_5) {
		BbAvLower2_5 = bbAvLower2_5;
	}


	public double getGBGreater2_5() {
		return GBGreater2_5;
	}


	public void setGBGreater2_5(double gBGreater2_5) {
		GBGreater2_5 = gBGreater2_5;
	}


	public double getGBLower2_5() {
		return GBLower2_5;
	}


	public void setGBLower2_5(double gBLower2_5) {
		GBLower2_5 = gBLower2_5;
	}


	public double getB365Greater2_5() {
		return B365Greater2_5;
	}


	public void setB365Greater2_5(double b365Greater2_5) {
		B365Greater2_5 = b365Greater2_5;
	}


	public double getB365Lower2_5() {
		return B365Lower2_5;
	}


	public void setB365Lower2_5(double b365Lower2_5) {
		B365Lower2_5 = b365Lower2_5;
	}


	public static ParsedEntry valueOf(ParsedEntryData e) {
		
		ParsedEntry result = new ParsedEntry();
		result.setDivision(e.getDivision());
		result.setDate(e.getDate());
		result.setHomeTeam(e.getHomeTeam());
		result.setAwayTeam(e.getAwayTeam());
		result.setFTHG(e.getFTHG()!=null && (!e.getFTHG().isEmpty()) ? Integer.valueOf(e.getFTHG()) : -1);
		result.setFTAG(e.getFTAG()!=null && (!e.getFTAG().isEmpty()) ? Integer.valueOf(e.getFTAG()) : -1);
		result.setFTR(e.getFTR());
		result.setHTHG(e.getHTHG()!=null && (!e.getHTHG().isEmpty()) ? Integer.valueOf(e.getHTHG()) : -1);
		result.setHTAG(e.getHTAG()!=null && (!e.getHTAG().isEmpty()) ? Integer.valueOf(e.getHTAG()) : -1);
		result.setHTR(e.getHTR());
		result.setHS(e.getHS()!=null && (!e.getHS().isEmpty()) ? Integer.valueOf(e.getHS()) : -1);
		result.setAS(e.getAS()!=null && (!e.getAS().isEmpty()) ? Integer.valueOf(e.getAS()) : -1);
		result.setHST(e.getHST()!=null && (!e.getHST().isEmpty()) ? Integer.valueOf(e.getHST()) : -1);
		result.setAST(e.getAST()!=null && (!e.getAST().isEmpty()) ? Integer.valueOf(e.getAST()) : -1);
		result.setHHW(e.getHHW()!=null && (!e.getHHW().isEmpty()) ? Integer.valueOf(e.getHHW()) : -1);
		result.setAHW(e.getAHW()!=null && (!e.getAHW().isEmpty()) ? Integer.valueOf(e.getAHW()) : -1);
		result.setHC(e.getHC()!=null && (!e.getHC().isEmpty()) ? Integer.valueOf(e.getHC()) : -1);
		result.setAC(e.getAC()!=null && (!e.getAC().isEmpty()) ? Integer.valueOf(e.getAC()) : -1);
		result.setHF(e.getHF()!=null && (!e.getHF().isEmpty()) ? Integer.valueOf(e.getHF()) : -1);
		result.setAF(e.getAF()!=null && (!e.getAF().isEmpty()) ? Integer.valueOf(e.getAF()) : -1);
		result.setHO(e.getHO()!=null && (!e.getHO().isEmpty()) ? Integer.valueOf(e.getHO()) : -1);
		result.setAO(e.getAO()!=null && (!e.getAO().isEmpty()) ? Integer.valueOf(e.getAO()) : -1);
		result.setHY(e.getHY()!=null && (!e.getHY().isEmpty()) ? Integer.valueOf(e.getHY()) : -1);
		result.setAY(e.getAY()!=null && (!e.getAY().isEmpty()) ? Integer.valueOf(e.getAY()) : -1);
		result.setHR(e.getHR()!=null && (!e.getHR().isEmpty()) ? Integer.valueOf(e.getHR()) : -1);
		result.setAR(e.getAR()!=null && (!e.getAR().isEmpty()) ? Integer.valueOf(e.getAR()) : -1);
		result.setHBP(e.getHBP()!=null && (!e.getHBP().isEmpty()) ? Integer.valueOf(e.getHBP()) : -1);
		result.setABP(e.getABP()!=null && (!e.getABP().isEmpty()) ? Integer.valueOf(e.getABP()) : -1);
		
		result.setB365H(e.getB365H()!=null && (!e.getB365H().isEmpty()) ? Double.valueOf(e.getB365H()) : -1);
		result.setB365D(e.getB365D()!=null && (!e.getB365D().isEmpty()) ? Double.valueOf(e.getB365D()) : -1);
		result.setB365A(e.getB365A()!=null && (!e.getB365A().isEmpty()) ? Double.valueOf(e.getB365A()) : -1);
		result.setBSH(e.getBSH()!=null && (!e.getBSH().isEmpty()) ? Double.valueOf(e.getBSH()) : -1);
		result.setBSD(e.getBSD()!=null && (!e.getBSD().isEmpty()) ? Double.valueOf(e.getBSD()) : -1);
		result.setBSA(e.getBSA()!=null && (!e.getBSA().isEmpty()) ? Double.valueOf(e.getBSA()) : -1);
		result.setBWH(e.getBWH()!=null && (!e.getBWH().isEmpty()) ? Double.valueOf(e.getBWH()) : -1);
		result.setBWD(e.getBWD()!=null && (!e.getBWD().isEmpty()) ? Double.valueOf(e.getBWD()) : -1);
		result.setBWA(e.getBWA()!=null && (!e.getBWA().isEmpty()) ? Double.valueOf(e.getBWA()) : -1);
		result.setGBH(e.getGBH()!=null && (!e.getGBH().isEmpty()) ? Double.valueOf(e.getGBH()) : -1);
		result.setGBD(e.getGBD()!=null && (!e.getGBD().isEmpty()) ? Double.valueOf(e.getGBD()) : -1);
		result.setGBA(e.getGBA()!=null && (!e.getGBA().isEmpty()) ? Double.valueOf(e.getGBA()) : -1);
		result.setIWH(e.getIWH()!=null && (!e.getIWH().isEmpty()) ? Double.valueOf(e.getIWH()) : -1);
		result.setIWD(e.getIWD()!=null && (!e.getIWD().isEmpty()) ? Double.valueOf(e.getIWD()) : -1);
		result.setIWA(e.getIWA()!=null && (!e.getIWA().isEmpty()) ? Double.valueOf(e.getIWA()) : -1);
		result.setLBH(e.getLBH()!=null && (!e.getLBH().isEmpty()) ? Double.valueOf(e.getLBH()) : -1);
		result.setLBD(e.getLBD()!=null && (!e.getLBD().isEmpty()) ? Double.valueOf(e.getLBD()) : -1);
		result.setLBA(e.getLBA()!=null && (!e.getLBA().isEmpty()) ? Double.valueOf(e.getLBA()) : -1);
		result.setPSH(e.getPSH()!=null && (!e.getPSH().isEmpty()) ? Double.valueOf(e.getPSH()) : -1);
		result.setPSD(e.getPSD()!=null && (!e.getPSD().isEmpty()) ? Double.valueOf(e.getPSD()) : -1);
		result.setPSA(e.getPSA()!=null && (!e.getPSA().isEmpty()) ? Double.valueOf(e.getPSA()) : -1);
		result.setSOH(e.getSOH()!=null && (!e.getSOH().isEmpty()) ? Double.valueOf(e.getSOH()) : -1);
		result.setSOD(e.getSOD()!=null && (!e.getSOD().isEmpty()) ? Double.valueOf(e.getSOD()) : -1);
		result.setSOA(e.getSOA()!=null && (!e.getSOA().isEmpty()) ? Double.valueOf(e.getSOA()) : -1);
		result.setSBH(e.getSBH()!=null && (!e.getSBH().isEmpty()) ? Double.valueOf(e.getSBH()) : -1);
		result.setSBD(e.getSBD()!=null && (!e.getSBD().isEmpty()) ? Double.valueOf(e.getSBD()) : -1);
		result.setSBA(e.getSBA()!=null && (!e.getSBA().isEmpty()) ? Double.valueOf(e.getSBA()) : -1);
		result.setSJH(e.getSJH()!=null && (!e.getSJH().isEmpty()) ? Double.valueOf(e.getSJH()) : -1);
		result.setSJD(e.getSJD()!=null && (!e.getSJD().isEmpty()) ? Double.valueOf(e.getSJD()) : -1);
		result.setSJA(e.getSJA()!=null && (!e.getSJA().isEmpty()) ? Double.valueOf(e.getSJA()) : -1);
		result.setSYH(e.getSYH()!=null && (!e.getSYH().isEmpty()) ? Double.valueOf(e.getSYH()) : -1);
		result.setSYD(e.getSYD()!=null && (!e.getSYD().isEmpty()) ? Double.valueOf(e.getSYD()) : -1);
		result.setSYA(e.getSYA()!=null && (!e.getSYA().isEmpty()) ? Double.valueOf(e.getSYA()) : -1);
		result.setVCH(e.getVCH()!=null && (!e.getVCH().isEmpty()) ? Double.valueOf(e.getVCH()) : -1);
		result.setVCD(e.getVCD()!=null && (!e.getVCD().isEmpty()) ? Double.valueOf(e.getVCD()) : -1);
		result.setVCA(e.getVCA()!=null && (!e.getVCA().isEmpty()) ? Double.valueOf(e.getVCA()) : -1);
		result.setWHH(e.getWHH()!=null && (!e.getWHH().isEmpty()) ? Double.valueOf(e.getWHH()) : -1);
		result.setWHD(e.getWHD()!=null && (!e.getWHD().isEmpty()) ? Double.valueOf(e.getWHD()) : -1);
		result.setWHA(e.getWHA()!=null && (!e.getWHA().isEmpty()) ? Double.valueOf(e.getWHA()) : -1);
		
		result.setBb1X2(e.getBb1X2()!=null && (!e.getBb1X2().isEmpty()) ? Double.valueOf(e.getBb1X2()) : -1);
		result.setBbMxH(e.getBbMxH()!=null && (!e.getBbMxH().isEmpty()) ? Double.valueOf(e.getBbMxH()) : -1);
		result.setBbAvH(e.getBbAvH()!=null && (!e.getBbAvH().isEmpty()) ? Double.valueOf(e.getBbAvH()) : -1);
		result.setBbMxD(e.getBbMxD()!=null && (!e.getBbMxD().isEmpty()) ? Double.valueOf(e.getBbMxD()) : -1);
		result.setBbAvD(e.getBbAvD()!=null && (!e.getBbAvD().isEmpty()) ? Double.valueOf(e.getBbAvD()) : -1);
		result.setBbMxA(e.getBbMxA()!=null && (!e.getBbMxA().isEmpty()) ? Double.valueOf(e.getBbMxA()) : -1);
		result.setBbAvA(e.getBbAvA()!=null && (!e.getBbAvA().isEmpty()) ? Double.valueOf(e.getBbAvA()) : -1);
		result.setMaxH(e.getMaxH()!=null && (!e.getMaxH().isEmpty()) ? Double.valueOf(e.getMaxH()) : -1);
		result.setMaxD(e.getMaxD()!=null && (!e.getMaxD().isEmpty()) ? Double.valueOf(e.getMaxD()) : -1);
		result.setMaxA(e.getMaxA()!=null && (!e.getMaxA().isEmpty()) ? Double.valueOf(e.getMaxA()) : -1);
		result.setAvgH(e.getAvgH()!=null && (!e.getAvgH().isEmpty()) ? Double.valueOf(e.getAvgH()) : -1);
		result.setAvgD(e.getAvgD()!=null && (!e.getAvgD().isEmpty()) ? Double.valueOf(e.getAvgD()) : -1);
		result.setAvgA(e.getAvgA()!=null && (!e.getAvgA().isEmpty()) ? Double.valueOf(e.getAvgA()) : -1);
		result.setBbOU(e.getBbOU()!=null && (!e.getBbOU().isEmpty()) ? Double.valueOf(e.getBbOU()) : -1);
		result.setBbMxGreater2_5(e.getBbMxGreater2_5()!=null && (!e.getBbMxGreater2_5().isEmpty()) ? Double.valueOf(e.getBbMxGreater2_5()) : -1);
		result.setBbAvGreater2_5(e.getBbAvGreater2_5()!=null && (!e.getBbAvGreater2_5().isEmpty()) ? Double.valueOf(e.getBbAvGreater2_5()) : -1);
		result.setBbMxLower2_5(e.getBbMxLower2_5()!=null && (!e.getBbMxLower2_5().isEmpty()) ? Double.valueOf(e.getBbMxLower2_5()) : -1);
		result.setBbAvLower2_5(e.getBbAvLower2_5()!=null && (!e.getBbAvLower2_5().isEmpty()) ? Double.valueOf(e.getBbAvLower2_5()) : -1);
		result.setGBGreater2_5(e.getGBGreater2_5()!=null && (!e.getGBGreater2_5().isEmpty()) ? Double.valueOf(e.getGBGreater2_5()) : -1);
		result.setGBLower2_5(e.getGBLower2_5()!=null && (!e.getGBLower2_5().isEmpty()) ? Double.valueOf(e.getGBLower2_5()) : -1);
		result.setB365Greater2_5(e.getB365Greater2_5()!=null && (!e.getB365Greater2_5().isEmpty()) ? Double.valueOf(e.getB365Greater2_5()) : -1);
		result.setB365Lower2_5(e.getB365Lower2_5()!=null && (!e.getB365Lower2_5().isEmpty()) ? Double.valueOf(e.getB365Lower2_5()) : -1);
		
		return result;
	}
	
	

	/*
	 * Key to Asian handicap betting odds:
	 * 
	 * BbAH ; //=Number of BetBrain bookmakers used to Asian handicap averages
	 * and maximums BbAHh ; //=Betbrain size of handicap (home team) BbMxAHH ;
	 * //=Betbrain maximum Asian handicap home team odds BbAvAHH ; //=Betbrain
	 * average Asian handicap home team odds BbMxAHA ; //=Betbrain maximum Asian
	 * handicap away team odds BbAvAHA ; //=Betbrain average Asian handicap away
	 * team odds
	 * 
	 * GBAHH ; //=Gamebookers Asian handicap home team odds GBAHA ;
	 * //=Gamebookers Asian handicap away team odds GBAH ; //=Gamebookers size
	 * of handicap (home team) LBAHH ; //=Ladbrokes Asian handicap home team
	 * odds LBAHA ; //=Ladbrokes Asian handicap away team odds LBAH ;
	 * //=Ladbrokes size of handicap (home team) B365AHH ; //=Bet365 Asian
	 * handicap home team odds B365AHA ; //=Bet365 Asian handicap away team odds
	 * B365AH ; //=Bet365 size of handicap (home team)
	 */
	
	
	

}
