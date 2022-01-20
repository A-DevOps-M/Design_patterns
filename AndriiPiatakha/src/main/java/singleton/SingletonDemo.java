package singleton;

public class SingletonDemo {

    public static void main(String[] args) {

        var instance1 = OrderServiceSingleton.getInstance();
        var instance2 = OrderServiceSingleton.getInstance();

        System.out.println("instance1 == instance2? " + (instance1 == instance2));
        System.out.println("instance1 == instance2? " + (instance1.equals(instance2)));

    }
}
