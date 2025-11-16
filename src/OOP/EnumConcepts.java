package OOP;

import java.util.List;
import java.util.Vector;

public class EnumConcepts {
    enum Month{
        January, February, March, April, May, June, July, August, September, October, November, December;

        Month(){
            System.out.println("It will run more than once");
            System.out.println("This month is "+this);
        }
    }
    public static void main(String[] args) {
        List<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(11);
        vector.add(12);
        vector.add(13);
        System.out.println(vector);
        Month first = Month.April;
        System.out.println(first);
    }
}
