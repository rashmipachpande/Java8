//Queue interface and add 6 integers and print them and remove 2 integral out of it, print the removed elements and existing elements (stack)
//GDB Compiler : https://onlinegdb.com/30jYf2fT5Q
import java.util.Stack;
public class Main
{
  public static void main (String a[])
  {
    Stack < Integer > s1 = new Stack <> ();
    s1.push (10);
    s1.push (20);
    s1.push (30);
    s1.push (40);
    s1.push (50);
    s1.push (60);
    System.out.println ("Initial stack: " + s1);
    System.out.println ("1.POP:" + s1.pop ());
    System.out.println ("2.POP:" + s1.pop ());
    System.out.println ("Last stack : " + s1);
  }
}
