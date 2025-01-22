public class Child {
    public static void main(String[] args) {
        Person <String> person = new Person<>();
        person.setName("Shyam");

        System.out.println(person.getName());
        Person <Integer> person1 = new Person<>();
        person1.setName(10);
    }
}

