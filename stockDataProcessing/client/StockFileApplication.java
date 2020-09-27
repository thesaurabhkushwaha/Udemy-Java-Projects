package client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import fileprocessors.StockFileData;
import fileprocessors.StockFileReader;

public class StockFileApplication {
	
	public static void main(String args[]) throws IOException{
		StockFileReader fr = new StockFileReader("C:\\Users\\Saurabh\\Downloads\\stock-analysis\\stock-analysis\\src\\fileprocessors\\table.csv");
		List<HashMap<String, Double>> dataResult = populateStockFileData(fr.getHeaders(), fr.readFileData());
		StockFileData fileData = new StockFileData();
		fileData.addData(dataResult);
		fileData.printData();
		System.out.println(dataResult.size());
	}
	
	public static List<HashMap<String, Double>> populateStockFileData(List<String> headers, List<String> lines){
		List<HashMap<String, Double>> dataResult = new ArrayList<>();

		for(String line : lines) {
			int h = 0;
			String [] values = line.split(",");
			LinkedHashMap<String,Double> entry = new LinkedHashMap<>();
			for(String value: values)
			{
				entry.put(headers.get(h), Double.parseDouble(value));
				
			}	
			dataResult.add(entry);
		}
		
		return dataResult;
	}
	
	
}
