//wap to store the group of integers [order of insertion elements does not matter] (HashSet)
// GDB Compiler

import java.util.HashSet;
import java.util.Set;
public class Main
{
  public static void main (String[]args)
  {
    Set < Integer > hs = new HashSet < Integer > ();
    hs.add (50);
    hs.add (90);
    hs.add (10);
    hs.add (30);
    hs.add (100);
    hs.add (70);
    for (Integer number:hs)
      {
	System.out.println (number);
      }
  }
}
