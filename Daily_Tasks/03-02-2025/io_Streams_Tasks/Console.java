package io_Streams_Tasks;
import java.io.*;
public class Console {
	public static void main(String args[])throws Exception {
	    BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Input your College: ");
	    String name = b.readLine();
	    System.out.println("Your College is: " + name);
}
}