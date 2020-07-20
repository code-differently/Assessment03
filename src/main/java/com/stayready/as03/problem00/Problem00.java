package com.stayready.as03.problem00;

import java.util.HashMap;
import java.util.Map;

public class Problem00 {
        public String countUniqueWords(String input) {
            Map<String, String> map = new HashMap<String, String>();

            if (input != null) {
                input = input.replace(".", " ");
                input = input.replace("!", " ");
                input = input.replace("  ", " ");
                String[] separatedWords = input.split(" ");
                for (String str : separatedWords) {
                    if (map.containsKey(str)) {
                        int count = Integer.parseInt(map.get(str));
                        map.put(str, String.valueOf(count + 1));
                    } else {
                        map.put(str, "1");
                    }
                }
            }
            String key = "";
            Object value = 0;
            String finalVerdict = "The " + map.size()+ " unique words are: \n";
            for (Map.Entry<String, String> entry : map.entrySet()) {

                value = entry.getValue();
                key = entry.getKey();
                finalVerdict += key + " (Seen " + value + ")\n";


            }

            return finalVerdict;
        }

}
