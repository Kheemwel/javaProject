package DataStructures;

import java.util.HashMap;

public class Programs_HashMap {
    public static void main(String[] args) {
        HashMap<String, String> programs = new HashMap<>();
        programs.put("BSIT", "Bachelor of Science in Information Technology");
        programs.put("BSCS", "Bachelor of Science in Computer Science");
        programs.put("BSIS", "Bachelor of Science in Information Systems");

        System.out.println(programs.keySet());
        programs.remove("BSIT");
        System.out.println(programs.containsKey("BSCpE"));
    }
}