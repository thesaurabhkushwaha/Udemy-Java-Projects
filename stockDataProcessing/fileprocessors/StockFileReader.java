package fileprocessors;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StockFileReader {
	
	String filePath = null;
	
	public StockFileReader(String filePath){
		this.filePath = filePath;
	}
	
	public List<String> getHeaders() throws IOException{
		String line = readFirstLine(filePath);
		String [] header = line.split(",");
		List<String> values = new ArrayList<String>();
		values = Arrays.asList(header);
		return values;
	}
	
	static String readFirstLine(String path) throws IOException {
	    try (BufferedReader br =
	                   new BufferedReader(new FileReader(path))) {
	        return br.readLine();
	    }
	}

	public List<String> readFileData() throws IOException{
		List<String> lines = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Saurabh\\Downloads\\stock-analysis\\stock-analysis\\src\\fileprocessors\\table.csv"));
		String line = null;
		String headers = br.readLine();
		while((line = br.readLine())!=null)
			lines.add(line);
	    return lines;
	}
	

}
