public class Person<T1> {
    private T1 name;  // Private variable

    // getter method using

    public T1 getName() {

        return name;
    }

    // Setter method

    public void setName(T1 name1) {
        this.name = name1;
        System.out.println("The Person name is : "+name);

    }

}

