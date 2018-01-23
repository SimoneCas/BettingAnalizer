package it.simonecasamassa.bettinganalizer.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class PropertiesReader {
	
	private static final Logger logger = LoggerFactory.getLogger(PropertiesReader.class);
	private static final String FILE_NAME = "configuration.properties";
	
	private Properties properties;
	
	public PropertiesReader(){
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		InputStream input = classLoader.getResourceAsStream(FILE_NAME);
		this.properties = new Properties();
		try {
			properties.load(input);
		} catch (IOException e) {
			logger.error("File properties {} NOT FOUND", FILE_NAME);
			e.printStackTrace();
		}
	}
	
	public Properties getProperties(){
		return properties;
	}
	
	
	
}
