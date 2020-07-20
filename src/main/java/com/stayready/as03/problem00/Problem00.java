package com.stayready.as03.problem00;

import java.util.ArrayList;
import java.util.HashMap;

public class Problem00 {

    private HashMap<String, Integer> temp;
    private ArrayList<String> list;
    public Problem00(){

        temp = new HashMap<String, Integer>();
        list = new ArrayList<>();
    }

    private String [] turnStringToArr(String input) {
        String [] arr = input.split(" ");
        return arr;
    }

    private String [] removeSpecialCharaters (String[] input) {

        for(int i = 0; i < input.length; i++) {
            if(!Character.isLetter(input[i].charAt(input[i].length()-1))) {

                input[i] = input[i].substring(0, input[i].length()-1);
            }
        }
        return input;
    }

    private String organizeMsg(ArrayList<String> list, HashMap<String, Integer> map){

        String msg = "The " + list.size()+ " unique words are:\n";
        for (int j = 0; j < list.size()-1; j++) {

            msg += list.get(j) +" (Seen " + map.get(list.get(j)) + ")\n";
        }
        msg += list.get(list.size()-1) +" (Seen " + map.get(list.get(list.size()-1)) + ")";


        return msg;
    }

    private void updateCollections(String input){

        if(!temp.containsKey(input)) {
            list.add(input);
            temp.put(input, 1);

        } else {

            temp.put(input, temp.get(input) + 1);
        }

    }

    public String countUniqueWords(String input){

        String [] tempArr = turnStringToArr(input);
        tempArr = removeSpecialCharaters(tempArr);
        for(int i = 0; i < tempArr.length; i++) {

            updateCollections(tempArr[i]);
        }

        return organizeMsg(list, temp);
    }

}
