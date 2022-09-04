//Queue interface and add 6 integers and print them and remove 2 integral out of it, print the drawn elements and existing elements (Queue)
//GDB compiler : https://onlinegdb.com/rm1MhHPaq
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<Integer>();
        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.add(40);
        q1.add(50);
                q1.add(60);
        System.out.println("Queue:"+q1);
        System.out.println("1.remove: "+q1.remove());
                System.out.println("2.remove: "+q1.remove());
        System.out.println("Last Queue:"+q1);
    }
}


