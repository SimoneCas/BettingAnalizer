package it.simonecasamassa.bettinganalizer;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	private static Coordinator coordinator;
	@Autowired
	private  Coordinator coordinatorInst;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		coordinator.run();
	}
	
	@PostConstruct
	   public void init() {
	        Application.coordinator = coordinatorInst;
	    }
}
