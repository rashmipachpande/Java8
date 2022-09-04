/** create 5 threads and print "Hello All"  using the thread class in java8 */
class Count extends Thread
{
   Count()
   {
     start();
   }
   public void run()
   {
     try
     {
        for (int i=0 ;i<5;i++)
        {
           System.out.println("Hello All " +i);
           Thread.sleep(1000);
        }
     }
     catch(InterruptedException e)
     {
        System.out.println("Thread interrupted");
     }
   }
}
class Main
{
   public static void main(String args[])
   {
      Count cnt = new Count();
      try
      {
         while(cnt.isAlive())
         {
           Thread.sleep(1500);
         }
      }
      catch(InterruptedException e)
      {
        System.out.println("Main thread interrupted");
      }
   }
}
