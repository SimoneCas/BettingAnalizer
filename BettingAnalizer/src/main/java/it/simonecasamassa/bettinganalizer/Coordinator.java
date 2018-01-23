package it.simonecasamassa.bettinganalizer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.simonecasamassa.bettinganalizer.model.ParsedEntry;
import it.simonecasamassa.bettinganalizer.model.Team;
import it.simonecasamassa.bettinganalizer.reader.StatisticsReader;

@Component
public class Coordinator {

	@Autowired
	private StatisticsReader statisticsReader;
		
	@Autowired
	private DataGridManager datagrid;

	public void run() {
		try {
			// Caricamento iniziale dati storici
			List<ParsedEntry> matchList = statisticsReader.readOldStatistics();
			
			//generazione squadra
			List<Team> teamList = this.extractsTeamsFromMatches(matchList);
			
			// Caricamento quote weekend

			// Calcola valori aggregati

			// Applicazione regole

			// Condivisione risultati

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	private List<Team> extractsTeamsFromMatches(List<ParsedEntry> matches){
		List<Team> teams = new ArrayList<Team>();
		
		for(ParsedEntry p: matches){
			datagrid.putTeamsFromMatch(p);
		}
		System.out.println("LAZIO "+datagrid.getByKey("Lazio"));
		return teams;		
	}
}
