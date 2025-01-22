public class Test7 {
    public static void main(String[] args) {
        System.out.println("This is the just method learning");
        sayhello();
        Test7 test7 = new Test7();
        test7.gritting();
        counter();
    }
    public static void sayhello() {
        System.out.println("Hello World!");

    }
    void gritting() {
        System.out.println("Namste, Welcome to Java Learning");

        for(int i = 0; i < 5; i++) {
            System.out.println(i);
        }

    }
    public static void counter() {
        for (int x = 1; x <= 5; x++) {
            System.out.println(x);

        }

    }
}
