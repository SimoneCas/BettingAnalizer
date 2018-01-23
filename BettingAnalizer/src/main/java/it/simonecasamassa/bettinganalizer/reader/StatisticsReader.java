package it.simonecasamassa.bettinganalizer.reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.HeaderColumnNameTranslateMappingStrategy;
import com.opencsv.enums.CSVReaderNullFieldIndicator;
import com.opencsv.bean.CsvToBeanBuilder;

import it.simonecasamassa.bettinganalizer.model.ParsedEntry;
import it.simonecasamassa.bettinganalizer.model.ParsedEntryData;
import it.simonecasamassa.bettinganalizer.util.PropertiesReader;

@Component
public class StatisticsReader {

	@Autowired
	private PropertiesReader propReader;
	
	public List<ParsedEntry> readOldStatistics() throws IOException {
		List<ParsedEntryData> entryListData = new ArrayList<ParsedEntryData>();
		List<ParsedEntry> entryList = new ArrayList<ParsedEntry>();
		List<URL> urls = loadCsvUrl();

		for (URL url : urls){
			System.out.println(url.toString());
			entryListData.addAll(readEntries(url));
		}
		
		entryList = convertEntryListData(entryListData);
		System.out.println("Size  list "+ entryList.size());
		
		return entryList;
	}

	private List<ParsedEntry> convertEntryListData(List<ParsedEntryData> entryListData) {
		List<ParsedEntry> entryList = new ArrayList<>();
		for(ParsedEntryData e: entryListData){
			entryList.add(ParsedEntry.valueOf(e));
		}
		return entryList;
	}

	private List<URL> loadCsvUrl() throws MalformedURLException {
		Properties properties = propReader.getProperties();
		List<URL> urls = new ArrayList<URL>();
		urls.add(new URL(properties.getProperty("STATISTICHE_ITA_A")));
		urls.add(new URL(properties.getProperty("STATISTICHE_ITA_B")));
		urls.add(new URL(properties.getProperty("STATISTICHE_ENGL_PL")));
		urls.add(new URL(properties.getProperty("STATISTICHE_ENGL_CH")));
		urls.add(new URL(properties.getProperty("STATISTICHE_ENGL_1")));
		urls.add(new URL(properties.getProperty("STATISTICHE_ENGL_2")));
		urls.add(new URL(properties.getProperty("STATISTICHE_SCOTL")));
		urls.add(new URL(properties.getProperty("STATISTICHE_GERM_A")));
		urls.add(new URL(properties.getProperty("STATISTICHE_GERM_B")));
		urls.add(new URL(properties.getProperty("STATISTICHE_LIGA_A")));
		urls.add(new URL(properties.getProperty("STATISTICHE_LIGA_B")));
		urls.add(new URL(properties.getProperty("STATISTICHE_FRA_A")));
		urls.add(new URL(properties.getProperty("STATISTICHE_FRA_B")));
		urls.add(new URL(properties.getProperty("STATISTICHE_NED")));
		urls.add(new URL(properties.getProperty("STATISTICHE_BELG")));
		urls.add(new URL(properties.getProperty("STATISTICHE_PORT")));
		urls.add(new URL(properties.getProperty("STATISTICHE_TURK")));
		urls.add(new URL(properties.getProperty("STATISTICHE_GREC")));
		
		return urls;
	}

	private List<ParsedEntryData> readEntries(URL url) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

		
		Map<String, String> columnMapping = new HashMap<String, String>();
		columnMapping.put("Div", "division");
		columnMapping.put("Date", "date");
		columnMapping.put("HomeTeam", "homeTeam");
		columnMapping.put("AwayTeam", "awayTeam");
		columnMapping.put("FTHG", "FTHG");
		columnMapping.put("FTAG", "FTAG");
		columnMapping.put("FTR", "FTR");
		columnMapping.put("HTHG", "HTHG");
		columnMapping.put("HTAG", "HTAG");
		columnMapping.put("HTR", "HTR");
		columnMapping.put("HS", "HS");
		columnMapping.put("AS", "AS");
		columnMapping.put("HST", "HST");
		columnMapping.put("AST", "AST");
		columnMapping.put("HHW", "HHW");
		columnMapping.put("AHW", "AHW");
		columnMapping.put("HC", "HC");
		columnMapping.put("AC", "AC");
		columnMapping.put("HF", "HF");
		columnMapping.put("AF", "AF");
		columnMapping.put("HO", "HO");
		columnMapping.put("AO", "AO");
		columnMapping.put("HY", "HY");
		columnMapping.put("AY", "AY");
		columnMapping.put("HR", "HR");
		columnMapping.put("AR", "AR");
		columnMapping.put("HBP", "HBP");
		columnMapping.put("ABP", "ABP");
		columnMapping.put("B365H", "B365H");
		columnMapping.put("B365D", "B365D");
		columnMapping.put("B365A", "B365A");
		columnMapping.put("BSH", "BSH");
		columnMapping.put("BSD", "BSD");
		columnMapping.put("BSA", "BSA");
		columnMapping.put("BWH", "BWH");
		columnMapping.put("BWD", "BWD");
		columnMapping.put("BWA", "BWA");
		columnMapping.put("GBH", "GBH");
		columnMapping.put("GBD", "GBD");
		columnMapping.put("GBA", "GBA");
		columnMapping.put("IWH", "IWH");
		columnMapping.put("IWD", "IWD");
		columnMapping.put("IWA", "IWA");
		columnMapping.put("LBH", "LBH");
		columnMapping.put("LBD", "LBD");
		columnMapping.put("LBA", "LBA");
		columnMapping.put("PSH", "PSH");
		columnMapping.put("PSD", "PSD");
		columnMapping.put("PSA", "PSA");
		columnMapping.put("SOH", "SOH");
		columnMapping.put("SOD", "SOD");
		columnMapping.put("SOA", "SOA");
		columnMapping.put("SBH", "SBH");
		columnMapping.put("SBD", "SBD");
		columnMapping.put("SBA", "SBA");
		columnMapping.put("SJH", "SJH");
		columnMapping.put("SJD", "SJD");
		columnMapping.put("SJA", "SJA");
		columnMapping.put("SYH", "SYH");
		columnMapping.put("SYD", "SYD");
		columnMapping.put("SYA", "SYA");
		columnMapping.put("VCH", "VCH");
		columnMapping.put("VCD", "VCD");
		columnMapping.put("VCA", "VCA");
		columnMapping.put("WHH", "WHH");
		columnMapping.put("WHD", "WHD");
		columnMapping.put("WHA", "WHA");
		columnMapping.put("Bb1X2", "Bb1X2");
		columnMapping.put("BbMxH", "BbMxH");
		columnMapping.put("BbAvH", "BbAvH");
		columnMapping.put("BbMxD", "BbMxD");
		columnMapping.put("BbAvD", "BbAvD");
		columnMapping.put("BbMxA", "BbMxA");
		columnMapping.put("BbAvA", "BbAvA");
		columnMapping.put("MaxH", "MaxH");
		columnMapping.put("MaxD", "MaxD");
		columnMapping.put("MaxA", "MaxA");
		columnMapping.put("AvgH", "AvgH");
		columnMapping.put("AvgD", "AvgD");
		columnMapping.put("AvgA", "AvgA");
		columnMapping.put("BbMxGreater2_5", "BbMxGreater2_5");
		columnMapping.put("BbAvGreater2_5", "BbAvGreater2_5");
		columnMapping.put("BbMxLower2_5", "BbMxLower2_5");
		columnMapping.put("BbAvLower2_5", "BbAvLower2_5");
		columnMapping.put("GBGreater2_5", "GBGreater2_5");
		columnMapping.put("GBLower2_5", "GBLower2_5");
		columnMapping.put("B365Greater2_5", "B365Greater2_5");
		columnMapping.put("B365Lower2_5", "B365Lower2_5");
		
		HeaderColumnNameTranslateMappingStrategy<ParsedEntryData> strategy = new HeaderColumnNameTranslateMappingStrategy<ParsedEntryData>();
		strategy.setType(ParsedEntryData.class);
		strategy.setColumnMapping(columnMapping);

		List<ParsedEntryData> list = null;
		CSVReader reader = new CSVReader(in);
		//CsvToBean<ParsedEntry> csvToBean = new CsvToBean<ParsedEntry>();
		CsvToBean<ParsedEntryData> csvToBean = new CsvToBeanBuilder<ParsedEntryData>(new InputStreamReader(url.openStream()))
                .withType(ParsedEntryData.class)
                .build();
		list = csvToBean.parse(strategy, reader);

		System.out.println(list.size());
		for (ParsedEntryData p : list)
			System.out.println(p.toString());
		return list;
	}
}
