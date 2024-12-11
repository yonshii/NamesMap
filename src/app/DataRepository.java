package app;

import java.util.HashMap;
import java.util.Map;

public class DataRepository {

    public Map<Integer, String> getData() {
        Map<Integer, String> map = new HashMap<>();
        map.put(111,"Bob");
        map.put(123, "Kate");
        map.put(134, "Tom");
        map.put(554, "Kira");
        return map;
    }
}