package creational.factory_method;

import java.io.File;

public class FactoryMethodDemo {

    public static void main(String[] args) {

        // https://www.javatpoint.com/factory-method-design-pattern

        Archiver archiver1 = ArchiverFactory.getArchiver("zip");
        Archiver archiver2 = ArchiverFactory.getArchiver("rar");

        archiver1.archive(new File(""));
        archiver2.archive(new File(""));

        System.out.println(ArchiverFactory.getArchiver("zip") == archiver1);  // false; niet hetzelfde object
        System.out.println(ArchiverFactory.getArchiver("rar") == archiver2);  // false; niet hetzelfde object
    }
}
