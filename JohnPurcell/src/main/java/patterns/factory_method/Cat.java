package patterns.factory_method;

public class Cat implements Animal {

    @Override
    public void speak() {
        System.out.println("Meouw!");
    }
}
