package thread_Tasks;
import java.util.*;
public class ThreadSort extends Thread  {
	    private int[] array;

	    public ThreadSort(int[] array) {
	        this.array = array;
	    }

	    public void run() {
	        Arrays.sort(array);
	    }

	    public int[] getSortedArray() {
	        return array;
	    }
	}

	 class Sort{
	    public static void main(String[] args) {
	        int[] array = { 1, 2, 49, 1, 45, 43 };
	        System.out.println("Before Sorting:");
	        for(int i:array) {
	        	System.out.print(i+" ");
	        }

	        ThreadSort sortThread = new ThreadSort(array);
	        sortThread.start();

	        try {
	            sortThread.join(); 
	        } catch (Exception e) {
	            System.out.println("Error: "+e);
	        }
	        
	        System.out.println("\n\nAfter Sorting:");
	        for(int i:sortThread.getSortedArray()) {
	        	System.out.print(i+" ");
	        }
	    }
	}

