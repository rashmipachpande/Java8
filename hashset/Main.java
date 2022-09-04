//wap java code to store the group of integers [ofder of insertion elements does not matter and store unique elements] (HashSet)
// GDB Compiler 

import java.util.*;
class Main
{
  public static void main (String args[])
  {
    HashSet < String > store = new HashSet < String > ();
    store.add ("Java");
    store.add ("Java");
    store.add ("Spring");
    store.add ("Hibernate");
    store.add ("SQL");
    store.add ("SQL");
    Iterator < String > itr = store.iterator ();
    while (itr.hasNext ())
      {
	System.out.println (itr.next ());
      }
  }
}
