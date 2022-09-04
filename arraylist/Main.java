//wap to store the group of integers [order of insertion elements matters] using ArrayList
//GDB Compiler

import java.util.ArrayList;
import java.util.List;
public class Main
{
  public static void main (String[]args)
  {
    List < Integer > al = new ArrayList <> ();
    al.add (10);
    al.add (30);
    al.add (50);
    al.add (70);
    System.out.println (al);
    al.add (1, 20);
    al.add (3, 40);
    al.add (5, 60);
    System.out.println (al);
  }
}
