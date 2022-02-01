package SampleCodes.JSON;

import org.json.JSONObject;

public class JSonObjectEx {

    public static void main(String[] args) {

        var user = new JSONObject();

        user.put("name", "John Doe");
        user.put("occupation", "gardener");
        user.put("siblings", Integer.valueOf(2));
        user.put("height", Double.valueOf(172.35));
        user.put("married", Boolean.TRUE);

        var userJson = user.toString();

        System.out.println(userJson);
    }
}

//We create a JSONObject and transform it into a JSON string.
//{"siblings":2,"occupation":"gardener","name":"John Doe","married":true,"height":172.35}
//This is the final JSON string.