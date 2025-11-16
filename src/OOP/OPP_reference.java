package OOP;

public class OPP_reference {
    public static void main(String[] args) {
        Student[] student1=new Student[5];
        Student Lax=new Student(1904023,"Lakshmanan",99.99f);
        Student Kishore=new Student(1904022,"Kishore",99.98f);
        Lax=Kishore;
        Lax.greetings();
        Lax.Changename("Don PatternProgs.Laxo");
        System.out.println("Roll No:"+Lax.rno);
        System.out.println("Name  :" +Lax.name);
        System.out.println("Mark  :"+Lax.mark);
//        System.out.println(Student);
        Lax.end();
    }
    static class Student{
        int rno;
        String name="CIT";
        float mark=0.0f;
        Student(int x,String y,float z){
            this.rno=x;
            this.name=y;
            this.mark=z;
        }
        Student(String name){
            this.name=name;
        }
        Student(Student other){
            this.name=other.name;
            this.name=other.name;
            this.mark=other.mark;
        }
        Student(){
            this(00,"null",0.0f);
        }
        void Changename(String changename){
            name=changename;
        }
        void greetings(){
            System.out.println("Hello !! My name is "+ this.name);
        }
        void end(){
            System.out.println("Thank You");
        }
    }
}
