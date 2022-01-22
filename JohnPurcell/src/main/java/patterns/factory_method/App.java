package patterns.factory_method;

public class App {

    public static void main(String[] args) {

        Animal animal = AnimalFactory.createAnimal(AnimalFactory.CAT);
        animal.speak();
    }
}
