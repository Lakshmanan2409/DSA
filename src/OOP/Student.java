package OOP;

import java.util.Scanner;

public class Student {
    public String name;
    public int roll_no;
    public float mark;
    public long phone_no;
    public String address;
    Scanner in =new Scanner(System.in);

    public Student(){
        this.roll_no = 10;
    }

    public Student(String name, int roll_no, float mark) {
        this.name = name;
        this.roll_no = roll_no;
        this.mark = mark;
    }

    public static void greetings(){
        System.out.println("Welcome To Students Class");
    }

    public Student(long phone_no) {
        this.phone_no = phone_no;
    }

    public Student(String address){
        this.address = address;
    }

    public Student(Student other){
        this.name = in.next();
        this.roll_no = other.roll_no;
        this.mark = other.mark;
        this.phone_no = other.phone_no;
        this.address = other.address;
    }
}
