package io_Streams_Tasks;
import java.util.*;
import java.io.*;
public class ByteArray {
	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter file path");
		   String fp = sc.nextLine();
		   InputStream f = null;
		        try {
		            f = new FileInputStream(fp);
		            byte file_content[] = new byte[2*1024];
		            int read_count = 0;
		            while((read_count = f.read(file_content)) > 0){
		                System.out.println(new String(file_content, 0, read_count-1));
		            }
		        } catch (FileNotFoundException e) {
		            e.printStackTrace();
		        } catch (IOException e) {
		            e.printStackTrace();
		        } finally {
		            try{
		                if(f != null) f.close();
		            } catch(Exception ex){
		                 
		            }
		        }
		    }
}
