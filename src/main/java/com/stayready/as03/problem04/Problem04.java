package com.stayready.as03.problem04;

import java.util.HashMap;
import java.util.Map;

public class Problem04 {
    public Boolean harmlessRansomNote(String message, String magazineText) {
        HashMap<String, Integer> note = new HashMap<>();

        for (String s : magazineText.split(" ")) {
            if (note.containsKey(s)) {
                note.put(s, note.get(s) + 1);
            } else {
                note.put(s, 1);
            }
        }

        for (String m : message.split(" ")) {
            if (!note.containsKey(m) || note.get(m) == 0) {
                return false;
            } else {
                note.put(m, note.get(m) - 1);
            }
        }
        return true;
    }
}
