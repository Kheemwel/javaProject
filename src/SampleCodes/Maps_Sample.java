package SampleCodes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Maps_Sample {
    public static void main(String[] args) {
        Map<String, String> nameMap = new HashMap<>();
        nameMap.put("M1", "Mark");
        nameMap.put("M2", "Marco");
        nameMap.put("B", "Ben");
        nameMap.put("K", "Kim");
        nameMap.put("C", "Carl");

        System.out.println(nameMap.get("M1"));
        System.out.println(nameMap.containsKey("M2"));
        System.out.println(nameMap.containsValue("Kim"));
        System.out.println(nameMap.keySet());
        System.out.println(nameMap.values());
        nameMap.remove("M2");
        nameMap.replace("C", "Carlo");
        for (Entry<String, String> e : nameMap.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }
}
