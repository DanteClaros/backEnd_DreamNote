package com.dreamnote.api.controller;

import java.io.IOException;
import java.nio.file.*;

public class ApiController {
	public static String readJSONFile(String file) {
		String JSONFileContent;
		try {
			JSONFileContent = new String(Files.readAllBytes(Paths.get(file)));
			System.out.println(JSONFileContent);
		}catch(IOException e) {
			System.out.println("Could not read the file");
			JSONFileContent = "Error";
		}
		return JSONFileContent;
	}
}
