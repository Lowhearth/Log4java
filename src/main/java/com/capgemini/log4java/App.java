package com.capgemini.log4java;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class App {
	
	private final static Logger log = Logger.getLogger(App.class);
	private static String log4j = new File("src/main/java/com/capgemini/log4java/log4j.properties").getAbsolutePath();
	private static String log4jPath = log4j.replace("\\","/");

	public static void main(String[] args) {
		
		PropertyConfigurator.configure(log4jPath);
		
		FileReader fileReader =null;
		
		try {
			String file = new File("jugadores.txt").getAbsolutePath();
			String playersFile = file.replace("\\", "/");
			fileReader = new FileReader(playersFile);
			
			
			
		} catch(FileNotFoundException e) {
			System.out.println("Se enviara el error por correo");
			log.fatal(e);
		}
		
		
		
		

	}

}
