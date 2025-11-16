package OOP;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Student lax = new Student("Lakshmanan",1904023,98.5f);
        lax.greetings();
        System.out.println(lax.name);
        Student Mano = new Student(lax);
        System.out.println(Mano.name);
        System.out.println(Mano.name);
        CustomArrayList<Integer> x =new CustomArrayList<>();
        x.add(1);
        x.add(2);
        x.add(3);
        x.add(4);
        x.add(5);
        x.add(5);
        x.display();
        CustomArrayList<String> y = new CustomArrayList<>();
        y.add("L");
        y.add("A");
        y.add("K");
        y.add("S");
        y.add("H");
        y.add("M");
        y.add("A");
        y.add("N");
        y.add("A");
        y.add("N");
        y.display();
    }
}
