package thread_Tasks;

public class Basic_thread extends Thread{
	 public void run() {
		    System.out.println("Hello, World!");
		  }
		  public static void main(String[] args) {
			  Basic_thread thread = new Basic_thread();
		    thread.start();
		  }
}
