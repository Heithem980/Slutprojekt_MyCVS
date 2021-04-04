package com.example.demo;

import java.util.ArrayList;

public class ConvertToJSON {
	
	public static String pattern = "{\"Number\":\"%s\",\"OrderDate\":\"%s\", \"Region\":\"%s\", \"Rep1\": \"%s\", \"Rep2\": \"%s\", \"Item\":\"%s\", \"Units\":\"%s\", \"unitCost\":\"%s\", \"Total\":\"%s\"}";


	
	
	public static String JSON_Format() {
		
		
		
		String JSONtoSend = "  {\"Numbers\": [";
		
		for (int i = 1; i< readCSV.getWholeSheet().size() ; i++) {
			ArrayList<String> row = new ArrayList<>();
			row.addAll(readCSV.getWholeSheet().get(i));
			
			
			
			JSONtoSend += String.format(pattern, row.get(0),row.get(1),row.get(2),row.get(3),row.get(4),row.get(5),row.get(6),row.get(7),row.get(8));
			
			
			if (  Integer.parseInt(row.get(0)) != 43) {
				
				JSONtoSend += ",";
			}
		}
		JSONtoSend += "]}";
		
		return JSONtoSend;
	}
	
	
	
	
	
	
	

}
