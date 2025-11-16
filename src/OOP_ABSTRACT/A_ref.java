package OOP_ABSTRACT;

public class A_ref extends A{
        @Override
    void name(String name) {
            System.out.println("MY NAME IS : "+name);
    }

    @Override
    void roll_no(int rollno) {
        System.out.println("MY ROLL NO IS : "+rollno);
    }

    @Override
    void year(int year,String dept) {
            System.out.println(year+"th YEAR & "+dept +" dept");
    }

}
