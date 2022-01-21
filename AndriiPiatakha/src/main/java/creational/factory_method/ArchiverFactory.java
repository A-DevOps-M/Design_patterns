package creational.factory_method;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ArchiverFactory {

    public static Map<String, Supplier<Archiver>> typeConstructorMap = new HashMap<>();

    // A static block, or static initialization block, is code that is run once for each time a class is loaded into memory
    static {
        typeConstructorMap.put("zip", ZipArchiver::new);
        typeConstructorMap.put("rar", RarArchiver::new);
    }

    public static Archiver getArchiver(String archiverType){
        return typeConstructorMap.get(archiverType) == null ? null :
                typeConstructorMap.get(archiverType).get();
    }
}
