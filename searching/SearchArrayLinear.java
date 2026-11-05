package m3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

// coursesupport timing libraries
import timing.ExecuteAlgorithm;
import timing.quiet.QuietAlgorithm;
import timing.Ticker;
import timing.utils.GenSizes;
import timing.utils.IntArrayGenerator;

public class SearchArrayLinear extends SearchArrayBase {

    public SearchArrayLinear() {
    	// no need to sort array here, unlike binary search
    }
    
    public SearchArrayLinear(int arraySize) {
    	super(arraySize);
    	// no need to sort
    }

    public SearchArrayLinear(int[] initArray) {
    	super(initArray);
    	// no need to sort
    }
    
    @Override
    public String toString()  {
    	return "SearchArrayLinear object, n= " + this.n 
    			+ " numQueries=" + this.numQueries;
    }
    
	@Override
	public void reset(Ticker ticker) {
		this.ticker = ticker;
		this.array = generateRandomArray(this.n);
	   	numQueries = this.n * NUM_QUERIES_FACTOR;
}

	// return value: index of query in array if found, else -1
	@Override
	public int search(int query)  {

		for (int i = 0; i < array.length; i++){
			ticker.tick();
			if (array[i] == query){
				return i;
			}
		}


		// TODO: Fill in code here to perform a linear search for
		//       the query in the array    
        return -1;

}

	

    public static void main(String[] args) {

    	GenSizes sizes = GenSizes.arithmetic(0, 200001, 20000);
//       	GenSizes sizes = GenSizes.geometric(1, 500001, 5);

    	
    	ExecuteAlgorithm.timeAlgorithm("array-linear-search",
    			"m3.SearchArrayLinear",
    			new IntArrayGenerator(),
    			sizes);

    }
}
