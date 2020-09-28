package aggregators;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import client.StockFileApplication;
import fileprocessors.StockFileData;
import fileprocessors.StockFileReader;
import aggregators.Aggregator;

public class AggregatorProcessor<T extends Aggregator> {
	
	T operation;
	String file;
	
	
	public AggregatorProcessor(T operation, String file) {
		super();
		this.operation = operation;
		this.file = file;
	}


	public double runAggregator(int i) throws IOException {
		StockFileReader fr = new StockFileReader("C:\\Users\\Saurabh\\Downloads\\stock-analysis (1)\\stock-analysis\\table.csv");
		for(String line : fr.readFileData())
		{	
			String [] nums = line.split(",");
			Double num = Double.valueOf(nums[i-1]);				
			operation.add(num);
		}
		//operation.calculate();

		return operation.calculate();
	}
	
	
}
