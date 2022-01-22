package patterns.adapter;

public class App {

    public static void main(String[] args) {

        //////// Composition
        ConsoleLogWriter logWriter = new ConsoleLogWriter();

        CustomLogger logger = new CustomLogger(logWriter);
        logger.write("Hello");


        //////// Inheritance
        ConsoleLogWriter2 logWriter2 = new ConsoleLogWriter2();

        CustomLogger logger2 = new CustomLogger(logWriter2);
        logger2.write("Hello 2");
    }
}
