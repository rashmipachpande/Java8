//create 5 threads and print " Hello India" using  a runnable interface 
//compiler used GDB java
class MyRunnable implements Runnable
{
  public void run( )
  {
    for( int i = 0 ; i < 5 ; i++ )
 System.out.println( " Hello India : thread" + i ) ;
  }
}

public class Main
{
  public static void main( String[ ] args )
  {
    MyRunnable r = new MyRunnable( ) ;
    Thread t = new Thread( r ) ;
    t.start( ) ;
  } 
}
