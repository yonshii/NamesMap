package app;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class DataHandler {

    private final Map<Integer, String> map;

    public DataHandler() {

        this.map = new DataRepository().getData();
    }

    public String getAll() {
        StringBuilder sb = new StringBuilder();
        AtomicInteger count = new AtomicInteger(0);
        map.forEach((id, name) ->
                sb.append(String.format("%d) %d, %s%n",
                        count.incrementAndGet(), id, name)
                ));
        return "\nALL NAMES:\n" + sb;
    }

    public String getById(int id) {
        if (map.containsKey(id)) {
            return String.format("\nNAME: ID %d, %s", id, map.get(id));
        } else {
            return "No data!";
        }
    }
}