package patterns.factory_method;

public class Dog implements Animal{

    @Override
    public void speak() {
        System.out.println("Woof!");
    }
}
