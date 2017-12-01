// This is my code 
// Sarah Flaherty
// CS312

package asn3;

import java.util.ArrayList;
import java.util.LinkedList;

public class RunTime 
{
	  public static void main(String [] args)
	  {
	    long start = System.currentTimeMillis();
	    double x = 2.0;
	    for(int i=0; i<2000000000; i++)
	       x = x * x;
	    LinkedList<Integer> sum = new LinkedList<>();
	    long stop = System.currentTimeMillis();
	    long memoryUsed = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
	    System.out.println("i took " + (stop -start) + "ms and used " + memoryUsed/1024 + "KB");
	  }
	}
