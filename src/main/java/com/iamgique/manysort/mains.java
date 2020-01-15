package com.iamgique.manysort;

import java.util.HashMap;
import java.util.Map;

public class mains {
    public static void main(String... args) {

        Map<String, Integer> resp = new HashMap<String, Integer>();
        if(!resp.containsKey("A")){
            resp.put("A", 1);

        } else {
            Integer i = resp.get("A");
            resp.put("A", resp.get("A") + 1);
        }

    }
}
