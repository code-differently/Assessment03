package com.stayready.as03.problem04;

import java.util.HashMap;

public class Problem04 {
    public Boolean harmlessRansomNote(String message , String magazineText)
    {
        HashMap<String,Integer> noteCheck = new HashMap<String,Integer>();
       
        for (String word : magazineText.split(" "))
        {
          if (noteCheck.containsKey(word))
          {
            noteCheck.put(word, noteCheck.get(word)+1);
          }
          else
          {
            noteCheck.put(word, 1);
          }
        }

        for (String word : message.split(" "))
        {
          if (noteCheck.containsKey(word))
          {
            if (noteCheck.get(word) > 1)
            {
              noteCheck.put(word, noteCheck.get(word) - 1);
            }
            else
            {
              noteCheck.remove(word);
            }
          }
          else
          {
            return false;
          }
        }
        return true;
    }
}
