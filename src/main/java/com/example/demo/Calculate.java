package com.example.demo;

import java.util.ArrayList;

public class Calculate {
	
	
	
	
	public static String findFaultyRows() {
		
		ArrayList<String> faultyRows= new ArrayList<String>();
		
		
		for (int i = 1; i< readCSV.getWholeSheet().size() ; i++) {
			ArrayList<String> row = new ArrayList<>();
			row.addAll(readCSV.getWholeSheet().get(i));
			
			double units = Double.parseDouble(row.get(6));
			double unitCost = Double.parseDouble(row.get(7));
			double total = Double.parseDouble(row.get(8));
			
			double calculate = units * unitCost;
			
			double roundedTotal = Math.round(total * 100.0) / 100.0;
			double roundedCalculate = Math.round(calculate * 100.0) / 100.0;
			
			if(roundedCalculate != roundedTotal) {
				faultyRows.add(String.format(ConvertToJSON.pattern, row.get(0),row.get(1),row.get(2),row.get(3),row.get(4),row.get(5),row.get(6),row.get(7),row.get(8)));

				
				
			}
			
		}
		
		
		
		return faultyRows.toString();
	}

}
