package com.tracker.map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.tracker")
public class TrackerApplication{

	//Tracker for everything
	public static void main(String[] args) {
		SpringApplication.run(TrackerApplication.class, args);
	}

}
