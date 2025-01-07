public class Student {

        int sid = 101;
        String name = "Pradeep";
        String city = "Delhi";
        String courseName = "Java stack developer";
        double fee = 4500.54;

    void display() {
        System.out.println("This is student Id: " + sid);
        System.out.println("This is student name: " + name);
        System.out.println(courseName);
        System.out.println(city);
        System.out.println(fee);
    }
    }
    class Jtc1 extends Student {


    public static void main(String[] args) {
        // Object creation
        Student obj1 = new Student();

        //Recalling the void display method
        obj1.display();
        //Creating obj
        Jtc1 obj2 = new Jtc1();
        System.out.println( obj2.test1());
        //obj2.display();

    }
    int test1() {
        System.out.println("test1");

        return 10;


        }
}



