package com.stayready.as03.problem04;

//import com.stayready.as03.problem04.Problem04;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem04Test {
    private Problem04 solution;
    private String magazineText;
    @Before
    public void setup(){
        solution = new Problem04();
        magazineText =  "puerto rico is a great place you must hike far from town to find a secret "+
                "waterfall that i am an admirer of but note that it is not as hard as it seems "+
                "this is my advice for you";
    }

    @Test
    public void harmlessRansomNoteTestFail(){
        String noteText = "this is a secret note for you from a secret admirer";
        Boolean actual = solution.harmlessRansomNote(noteText, magazineText);
        Assert.assertFalse(actual);
    }

    @Test
    public void harmlessRansomNoteTestPass(){
        String noteText = "this is a note for you from a secret admirer";
        Boolean actual = solution.harmlessRansomNote(noteText, magazineText);
        Assert.assertTrue(actual);
    }
}
