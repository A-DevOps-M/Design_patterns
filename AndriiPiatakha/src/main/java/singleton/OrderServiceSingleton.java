package singleton;

public class OrderServiceSingleton {

    public static OrderServiceSingleton instance;

    private OrderServiceSingleton() {
    }

    public static synchronized OrderServiceSingleton getInstance() {
        if(instance == null){
            instance = new OrderServiceSingleton();
        }
        return instance;
    }

    public void placeOrder(){
        System.out.println("Place order methode is aangeroepen");
    }
}
