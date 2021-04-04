package com.example.demo;



import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {
	
	@RequestMapping(path ="/")
	public String index() {
		
		readCSV.loadCSV();
		readCSV.printCSV();
		
		return "WELCOME";
		
	}
	
	@RequestMapping(method = RequestMethod.GET, path ="/getJSON", produces = MediaType.APPLICATION_JSON_VALUE)
	public String convertToJSON() {
		
		
		return ConvertToJSON.JSON_Format();
		
		
	}
	
	@RequestMapping(method = RequestMethod.POST, path ="/getColumn", produces = MediaType.APPLICATION_JSON_VALUE)
	public String pullColumn(String getColumn) {
		
		ExtractValues.column = getColumn;
		
		
		return ExtractValues.columnValues();
		
		
	}	
	
	@RequestMapping(method = RequestMethod.GET, path ="/findFaultyRow", produces = MediaType.APPLICATION_JSON_VALUE)
	public String findFaultyRow() {
		
		
		
		
		
		
		return Calculate.findFaultyRows();
		
		
	}	
		
		
		
		
		
		
		
		
		
		
		
	
	
	

}
