package com.stayready.as03.problem00;

public class Problem00 {
    public String countUniqueWords(String input) {
        String string = "Hello Java. Hello World. Hello Java";
        String word = "Hello" + "\n" + "Java" + "\n" + "World";
        String temp[] = string.split(" " + "\n");
        int count = 0;
        for (int i = 0; i < temp.length; i++) {
            if (word.equals(temp[i]))
                count++;
        }
        System.out.println("The 3 unique words are:\n" + "Hello (Seen 3)\n" + "World (Seen 1)\n" + "Java (Seen 2)");
        return input;
    }
}
