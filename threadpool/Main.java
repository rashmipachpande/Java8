import java.util.concurrent.ExecutorService; 
import java.util.concurrent.Executors; 
public class ThreadPool {       
 public static void main(String[] args) {      
  ExecutorService executor = Executors.newFixedThreadPool(3);     
  for (int i = 0; i < 10; i++) {        
   Runnable myRunnable = new MyRunnable("" + i);      
   executor.execute(myRunnable);          
   }      
  executor.shutdown();    
  while (!executor.isTerminated()) {     
   
  }        
  System.out.println("Finished all threads");  
  } 
 }
