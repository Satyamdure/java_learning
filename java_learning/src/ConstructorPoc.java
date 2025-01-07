public class ConstructorPoc {
    ConstructorPoc() {
        System.out.println("Hello this is constructor calling");
    }
    ConstructorPoc(int x) {

        System.out.println("The value of x:" + x);

    }
    ConstructorPoc(String name, int x) {
        System.out.println("Your name is "+name + " and your age is " + x+".");
    }
    public static void main(String[] args) {
        ConstructorPoc obj1 = new ConstructorPoc();

        ConstructorPoc obj2 = new ConstructorPoc();

        ConstructorPoc obj3 = new ConstructorPoc(3);

        ConstructorPoc obj4 = new ConstructorPoc("Shyam", 23);


    }
}
