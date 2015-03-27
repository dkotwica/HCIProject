package domdomdom.myfirstapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by domk1_000 on 3/27/2015.
 */
public class TakeoverList {

    public static HashMap<String, List<String>> getInfo() {
        HashMap<String, List<String>> TakeoverWeeks = new HashMap<String, List<String>>();

        List<String> week1 = new ArrayList<String>();
        List<String> week2 = new ArrayList<String>();
        List<String> week3 = new ArrayList<String>();
        List<String> week4 = new ArrayList<String>();

        week1.add("Southern Tier - Crafty Bastard - Wednesday, March 25th");

        week2.add("None scheduled yet");

        week3.add("None scheduled yet");

        week4.add("None scheduled yet");

        TakeoverWeeks.put("April 12th - 18th", week4);
        TakeoverWeeks.put("March 29th - April 4th", week2);
        TakeoverWeeks.put("March 22nd - 28th", week1);
        TakeoverWeeks.put("April 5th - 11th", week3);


        return TakeoverWeeks;
    }
}