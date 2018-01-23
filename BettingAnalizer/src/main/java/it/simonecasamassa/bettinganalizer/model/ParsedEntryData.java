package it.simonecasamassa.bettinganalizer.model;

public class ParsedEntryData {

	private String division; // = League Division
	private String date; // = Match Date (dd/mm/yy)
	private String homeTeam; // =Home Team
	private String awayTeam; // =Away Team
	private String FTHG; // =Full Time Home Team Goals
	private String FTAG; // =Full Time Away Team Goals
	private String FTR; // =Full Time Result (H=Home Win, D=Draw, A=Away Win)
	private String HTHG; // =Half Time Home Team Goals
	private String HTAG; // =Half Time Away Team Goals
	private String HTR; // =Half Time Result (H=Home Win, D=Draw, A=Away Win)

	// Match Statistics (where available)
	private String HS; // =Home Team Shots
	private String AS; // =Away Team Shots
	private String HST; // =Home Team Shots on Target
	private String AST; // =Away Team Shots on Target
	private String HHW; // =Home Team Hit Woodwork
	private String AHW; // =Away Team Hit Woodwork
	private String HC; // =Home Team Corners
	private String AC; // =Away Team Corners
	private String HF; // =Home Team Fouls Committed
	private String AF; // =Away Team Fouls Committed
	private String HO; // =Home Team Offsides
	private String AO; // =Away Team Offsides
	private String HY; // =Home Team Yellow Cards
	private String AY; // =Away Team Yellow Cards
	private String HR; // =Home Team Red Cards
	private String AR; // =Away Team Red Cards
	private String HBP; // =Home Team Bookings Points (10 ; //=yellow, 25 ; //=red)
	private String ABP; // =Away Team Bookings Points (10 ; //=yellow, 25 ; //=red)

	// Key to 1X2 (match) betting odds data:

	private String B365H; // =Bet365 home win odds
	private String B365D; // =Bet365 draw odds
	private String B365A; // =Bet365 away win odds
	private String BSH; // =Blue Square home win odds
	private String BSD; // =Blue Square draw odds
	private String BSA; // =Blue Square away win odds
	private String BWH; // =Bet&Win home win odds
	private String BWD; // =Bet&Win draw odds
	private String BWA; // =Bet&Win away win odds
	private String GBH; // =Gamebookers home win odds
	private String GBD; // =Gamebookers draw odds
	private String GBA; // =Gamebookers away win odds
	private String IWH; // =Interwetten home win odds
	private String IWD; // =Interwetten draw odds
	private String IWA; // =Interwetten away win odds
	private String LBH; // =Ladbrokes home win odds
	private String LBD; // =Ladbrokes draw odds
	private String LBA; // =Ladbrokes away win odds
	private String PSH; // =Pinnacle home win odds
	private String PSD; // =Pinnacle draw odds
	private String PSA; // =Pinnacle away win odds
	private String SOH; // =Sporting Odds home win odds
	private String SOD; // =Sporting Odds draw odds
	private String SOA; // =Sporting Odds away win odds
	private String SBH; // =Sportingbet home win odds
	private String SBD; // =Sportingbet draw odds
	private String SBA; // =Sportingbet away win odds
	private String SJH; // =Stan James home win odds
	private String SJD; // =Stan James draw odds
	private String SJA; // =Stan James away win odds
	private String SYH; // =Stanleybet home win odds
	private String SYD; // =Stanleybet draw odds
	private String SYA; // =Stanleybet away win odds
	private String VCH; // =VC Bet home win odds
	private String VCD; // =VC Bet draw odds
	private String VCA; // =VC Bet away win odds
	private String WHH; // =William Hill home win odds
	private String WHD; // =William Hill draw odds
	private String WHA; // =William Hill away win odds

	private String Bb1X2; // =Number of BetBrain bookmakers used to calculate
							// match odds averages and maximums
	private String BbMxH; // =Betbrain maximum home win odds
	private String BbAvH; // =Betbrain average home win odds
	private String BbMxD; // =Betbrain maximum draw odds
	private String BbAvD; // =Betbrain average draw win odds
	private String BbMxA; // =Betbrain maximum away win odds
	private String BbAvA; // =Betbrain average away win odds

	private String MaxH; // =Oddsportal maximum home win odds
	private String MaxD; // =Oddsportal maximum draw win odds
	private String MaxA; // =Oddsportal maximum away win odds
	private String AvgH; // =Oddsportal average home win odds
	private String AvgD; // =Oddsportal average draw win odds
	private String AvgA; // =Oddsportal average away win odds

	// Key to total goals betting odds:

	private String BbOU; // =Number of BetBrain bookmakers used to calculate
							// over/under 2.5 goals (total goals) averages and
							// maximums
	private String BbMxGreater2_5; // =Betbrain maximum over 2.5 goals
	private String BbAvGreater2_5; // =Betbrain average over 2.5 goals
	private String BbMxLower2_5; // =Betbrain maximum under 2.5 goals
	private String BbAvLower2_5; // =Betbrain average under 2.5 goals

	private String GBGreater2_5; // =Gamebookers over 2.5 goals
	private String GBLower2_5; // =Gamebookers under 2.5 goals
	private String B365Greater2_5; // =Bet365 over 2.5 goals
	private String B365Lower2_5; // =Bet365 under 2.5 goals
	
	
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
		ParsedEntryData other = (ParsedEntryData) obj;
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


	public String getFTHG() {
		return FTHG;
	}


	public void setFTHG(String fTHG) {
		FTHG = fTHG;
	}


	public String getFTAG() {
		return FTAG;
	}


	public void setFTAG(String fTAG) {
		FTAG = fTAG;
	}


	public String getFTR() {
		return FTR;
	}


	public void setFTR(String fTR) {
		FTR = fTR;
	}


	public String getHTHG() {
		return HTHG;
	}


	public void setHTHG(String hTHG) {
		HTHG = hTHG;
	}


	public String getHTAG() {
		return HTAG;
	}


	public void setHTAG(String hTAG) {
		HTAG = hTAG;
	}


	public String getHTR() {
		return HTR;
	}


	public void setHTR(String hTR) {
		HTR = hTR;
	}


	public String getHS() {
		return HS;
	}


	public void setHS(String hS) {
		HS = hS;
	}


	public String getAS() {
		return AS;
	}


	public void setAS(String aS) {
		AS = aS;
	}


	public String getHST() {
		return HST;
	}


	public void setHST(String hST) {
		HST = hST;
	}


	public String getAST() {
		return AST;
	}


	public void setAST(String aST) {
		AST = aST;
	}


	public String getHHW() {
		return HHW;
	}


	public void setHHW(String hHW) {
		HHW = hHW;
	}


	public String getAHW() {
		return AHW;
	}


	public void setAHW(String aHW) {
		AHW = aHW;
	}


	public String getHC() {
		return HC;
	}


	public void setHC(String hC) {
		HC = hC;
	}


	public String getAC() {
		return AC;
	}


	public void setAC(String aC) {
		AC = aC;
	}


	public String getHF() {
		return HF;
	}


	public void setHF(String hF) {
		HF = hF;
	}


	public String getAF() {
		return AF;
	}


	public void setAF(String aF) {
		AF = aF;
	}


	public String getHO() {
		return HO;
	}


	public void setHO(String hO) {
		HO = hO;
	}


	public String getAO() {
		return AO;
	}


	public void setAO(String aO) {
		AO = aO;
	}


	public String getHY() {
		return HY;
	}


	public void setHY(String hY) {
		HY = hY;
	}


	public String getAY() {
		return AY;
	}


	public void setAY(String aY) {
		AY = aY;
	}


	public String getHR() {
		return HR;
	}


	public void setHR(String hR) {
		HR = hR;
	}


	public String getAR() {
		return AR;
	}


	public void setAR(String aR) {
		AR = aR;
	}


	public String getHBP() {
		return HBP;
	}


	public void setHBP(String hBP) {
		HBP = hBP;
	}


	public String getABP() {
		return ABP;
	}


	public void setABP(String aBP) {
		ABP = aBP;
	}


	public String getB365H() {
		return B365H;
	}


	public void setB365H(String b365h) {
		B365H = b365h;
	}


	public String getB365D() {
		return B365D;
	}


	public void setB365D(String b365d) {
		B365D = b365d;
	}


	public String getB365A() {
		return B365A;
	}


	public void setB365A(String b365a) {
		B365A = b365a;
	}


	public String getBSH() {
		return BSH;
	}


	public void setBSH(String bSH) {
		BSH = bSH;
	}


	public String getBSD() {
		return BSD;
	}


	public void setBSD(String bSD) {
		BSD = bSD;
	}


	public String getBSA() {
		return BSA;
	}


	public void setBSA(String bSA) {
		BSA = bSA;
	}


	public String getBWH() {
		return BWH;
	}


	public void setBWH(String bWH) {
		BWH = bWH;
	}


	public String getBWD() {
		return BWD;
	}


	public void setBWD(String bWD) {
		BWD = bWD;
	}


	public String getBWA() {
		return BWA;
	}


	public void setBWA(String bWA) {
		BWA = bWA;
	}


	public String getGBH() {
		return GBH;
	}


	public void setGBH(String gBH) {
		GBH = gBH;
	}


	public String getGBD() {
		return GBD;
	}


	public void setGBD(String gBD) {
		GBD = gBD;
	}


	public String getGBA() {
		return GBA;
	}


	public void setGBA(String gBA) {
		GBA = gBA;
	}


	public String getIWH() {
		return IWH;
	}


	public void setIWH(String iWH) {
		IWH = iWH;
	}


	public String getIWD() {
		return IWD;
	}


	public void setIWD(String iWD) {
		IWD = iWD;
	}


	public String getIWA() {
		return IWA;
	}


	public void setIWA(String iWA) {
		IWA = iWA;
	}


	public String getLBH() {
		return LBH;
	}


	public void setLBH(String lBH) {
		LBH = lBH;
	}


	public String getLBD() {
		return LBD;
	}


	public void setLBD(String lBD) {
		LBD = lBD;
	}


	public String getLBA() {
		return LBA;
	}


	public void setLBA(String lBA) {
		LBA = lBA;
	}


	public String getPSH() {
		return PSH;
	}


	public void setPSH(String pSH) {
		PSH = pSH;
	}


	public String getPSD() {
		return PSD;
	}


	public void setPSD(String pSD) {
		PSD = pSD;
	}


	public String getPSA() {
		return PSA;
	}


	public void setPSA(String pSA) {
		PSA = pSA;
	}


	public String getSOH() {
		return SOH;
	}


	public void setSOH(String sOH) {
		SOH = sOH;
	}


	public String getSOD() {
		return SOD;
	}


	public void setSOD(String sOD) {
		SOD = sOD;
	}


	public String getSOA() {
		return SOA;
	}


	public void setSOA(String sOA) {
		SOA = sOA;
	}


	public String getSBH() {
		return SBH;
	}


	public void setSBH(String sBH) {
		SBH = sBH;
	}


	public String getSBD() {
		return SBD;
	}


	public void setSBD(String sBD) {
		SBD = sBD;
	}


	public String getSBA() {
		return SBA;
	}


	public void setSBA(String sBA) {
		SBA = sBA;
	}


	public String getSJH() {
		return SJH;
	}


	public void setSJH(String sJH) {
		SJH = sJH;
	}


	public String getSJD() {
		return SJD;
	}


	public void setSJD(String sJD) {
		SJD = sJD;
	}


	public String getSJA() {
		return SJA;
	}


	public void setSJA(String sJA) {
		SJA = sJA;
	}


	public String getSYH() {
		return SYH;
	}


	public void setSYH(String sYH) {
		SYH = sYH;
	}


	public String getSYD() {
		return SYD;
	}


	public void setSYD(String sYD) {
		SYD = sYD;
	}


	public String getSYA() {
		return SYA;
	}


	public void setSYA(String sYA) {
		SYA = sYA;
	}


	public String getVCH() {
		return VCH;
	}


	public void setVCH(String vCH) {
		VCH = vCH;
	}


	public String getVCD() {
		return VCD;
	}


	public void setVCD(String vCD) {
		VCD = vCD;
	}


	public String getVCA() {
		return VCA;
	}


	public void setVCA(String vCA) {
		VCA = vCA;
	}


	public String getWHH() {
		return WHH;
	}


	public void setWHH(String wHH) {
		WHH = wHH;
	}


	public String getWHD() {
		return WHD;
	}


	public void setWHD(String wHD) {
		WHD = wHD;
	}


	public String getWHA() {
		return WHA;
	}


	public void setWHA(String wHA) {
		WHA = wHA;
	}


	public String getBb1X2() {
		return Bb1X2;
	}


	public void setBb1X2(String bb1x2) {
		Bb1X2 = bb1x2;
	}


	public String getBbMxH() {
		return BbMxH;
	}


	public void setBbMxH(String bbMxH) {
		BbMxH = bbMxH;
	}


	public String getBbAvH() {
		return BbAvH;
	}


	public void setBbAvH(String bbAvH) {
		BbAvH = bbAvH;
	}


	public String getBbMxD() {
		return BbMxD;
	}


	public void setBbMxD(String bbMxD) {
		BbMxD = bbMxD;
	}


	public String getBbAvD() {
		return BbAvD;
	}


	public void setBbAvD(String bbAvD) {
		BbAvD = bbAvD;
	}


	public String getBbMxA() {
		return BbMxA;
	}


	public void setBbMxA(String bbMxA) {
		BbMxA = bbMxA;
	}


	public String getBbAvA() {
		return BbAvA;
	}


	public void setBbAvA(String bbAvA) {
		BbAvA = bbAvA;
	}


	public String getMaxH() {
		return MaxH;
	}


	public void setMaxH(String maxH) {
		MaxH = maxH;
	}


	public String getMaxD() {
		return MaxD;
	}


	public void setMaxD(String maxD) {
		MaxD = maxD;
	}


	public String getMaxA() {
		return MaxA;
	}


	public void setMaxA(String maxA) {
		MaxA = maxA;
	}


	public String getAvgH() {
		return AvgH;
	}


	public void setAvgH(String avgH) {
		AvgH = avgH;
	}


	public String getAvgD() {
		return AvgD;
	}


	public void setAvgD(String avgD) {
		AvgD = avgD;
	}


	public String getAvgA() {
		return AvgA;
	}


	public void setAvgA(String avgA) {
		AvgA = avgA;
	}


	public String getBbOU() {
		return BbOU;
	}


	public void setBbOU(String bbOU) {
		BbOU = bbOU;
	}


	public String getBbMxGreater2_5() {
		return BbMxGreater2_5;
	}


	public void setBbMxGreater2_5(String bbMxGreater2_5) {
		BbMxGreater2_5 = bbMxGreater2_5;
	}


	public String getBbAvGreater2_5() {
		return BbAvGreater2_5;
	}


	public void setBbAvGreater2_5(String bbAvGreater2_5) {
		BbAvGreater2_5 = bbAvGreater2_5;
	}


	public String getBbMxLower2_5() {
		return BbMxLower2_5;
	}


	public void setBbMxLower2_5(String bbMxLower2_5) {
		BbMxLower2_5 = bbMxLower2_5;
	}


	public String getBbAvLower2_5() {
		return BbAvLower2_5;
	}


	public void setBbAvLower2_5(String bbAvLower2_5) {
		BbAvLower2_5 = bbAvLower2_5;
	}


	public String getGBGreater2_5() {
		return GBGreater2_5;
	}


	public void setGBGreater2_5(String gBGreater2_5) {
		GBGreater2_5 = gBGreater2_5;
	}


	public String getGBLower2_5() {
		return GBLower2_5;
	}


	public void setGBLower2_5(String gBLower2_5) {
		GBLower2_5 = gBLower2_5;
	}


	public String getB365Greater2_5() {
		return B365Greater2_5;
	}


	public void setB365Greater2_5(String b365Greater2_5) {
		B365Greater2_5 = b365Greater2_5;
	}


	public String getB365Lower2_5() {
		return B365Lower2_5;
	}


	public void setB365Lower2_5(String b365Lower2_5) {
		B365Lower2_5 = b365Lower2_5;
	}

	

}