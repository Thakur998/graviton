package com.j2htmx.inline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

@EnableWebFlux
@SpringBootApplication
public class InlineApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(InlineApplication.class, args);
		executeCommand("npm run start");
	}

	private static void executeCommand(String command) throws IOException {
		try {
			log(command);
			Process runtime = Runtime.getRuntime().exec("cmd npm run start");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}



	private static SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss:SSS");

	private static synchronized void log(String message) {
		System.out.println(format.format(new Date()) + ": " + message);
	}

}
