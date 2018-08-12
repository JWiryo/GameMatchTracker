package com.personal.gameTracker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class GameTrackerApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(GameTrackerApplication.class);

	private static String logo =
			"\n" +
			"___       __      ______                                \n" +
			"__ |     / /_____ ___  /_____________ _______ ___ _____ \n" +
			"__ | /| / / _  _ \\__  / _  ___/_  __ \\__  __ `__ \\_  _ \\\n" +
			"__ |/ |/ /  /  __/_  /  / /__  / /_/ /_  / / / / //  __/\n" +
			"____/|__/   \\___/ /_/   \\___/  \\____/ /_/ /_/ /_/ \\___/ ";

	public static void main(String[] args) {

		SpringApplication.run(GameTrackerApplication.class, args);
		LOGGER.info(logo);
	}
}
