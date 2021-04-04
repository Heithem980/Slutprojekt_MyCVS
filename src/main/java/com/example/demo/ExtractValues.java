package com.example.demo;

import java.util.ArrayList;

public class ExtractValues {

	public static String column;
	
	


	public static String columnValues() {
		int num = 0;
		
		switch (column.toLowerCase()) {
		
		  case ("orderdate"):
			  num = 1;
		    	break;
		  case ("region"):
			  num = 2;
			    break;
		  case ("rep1"):
			  num = 3;
			    break;
		  case ("rep2"):
			  num = 4;
			    break;
		  case ("item"):
			  num = 5;
			    break;
		  case ("units"):
			  num = 6;
			    break;
		  case ("unitcost"):
			  num = 7;
			    break;
		  case ("total"):
			  num = 8;
			    break;
		  
		
		}
		ArrayList<String> selectedValues = new ArrayList<>();
		
		
		for (int i = 1; i< readCSV.getWholeSheet().size() ; i++) {
			ArrayList<String> row = new ArrayList<>();
			
			
			row.addAll(readCSV.getWholeSheet().get(i));
			
			selectedValues.add(row.get(num));
			
		
		}
		
		return String.format("{\""+column+"\":\"%s\"}", selectedValues);
	}



	
	
	
	
	

}
