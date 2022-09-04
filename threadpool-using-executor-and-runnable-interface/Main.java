/******WAP to print first 10 numbers using a fixed thread pool of size 5 Execute using executor.
Behaviour of Executor framework :There are 4 types of executor framework are :
1. SingleThreadExecutor, 2. FixedThreadPool(n),3. CatchedThreadPool, 4. ScheduledExecutor.  
I have used fixedThreadPool(n) for size 5 in the given code. *****/

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThread implements Runnable {
  
    private String command;
    
    public MyThread(String s){
        this.command=s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" Start. Command = "+command);
        processCommand();
        System.out.println(Thread.currentThread().getName()+" End.");
    }

    private void processCommand() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString(){
        return this.command;
    }
}


public class Main {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            Runnable my = new MyThread("" + i);
            executor.execute(my);
          }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("Finished all threads");
    }
}
