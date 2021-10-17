package com.riobener;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class UserInputValidation {
    public int validateBPM(String count) {
        int countInt = Integer.parseInt(count);
        if ((countInt > 60) && (countInt < 300)) {
            return countInt;
        } else {
            return 0;
        }
    }

    public int validateInstrument(String count) {
        int countInt = Integer.parseInt(count);
        if ((countInt > -1) && (countInt < 100)) {
            return countInt;
        } else {
            return -1;
        }
    }
    public String[] validateNoteList(String str){
        String[] notes = new String[] {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B" };
        String s1 = str.replaceAll(" ","");
        long numOfNotes = str.chars().filter(ch -> ch == ',').count() + 1;
        String[] notesArray = s1.split(",");
        if(numOfNotes >= 4 && numOfNotes <=7 && !s1.startsWith(",") && !s1.contains(",,") && !s1.endsWith(",") && !str.contains(" #")){
            boolean flag = false;
            ArrayList<String> check = new ArrayList<String>();
            for (String note:notesArray){
                if(!Arrays.asList(notes).contains(note) || check.contains(note)){
                    flag =true;
                    break;
                }
                check.add(note);
            }
            if(flag) {
                notesArray = new String[0];
            }

        }else {
            notesArray = new String[0];
        }
        return notesArray;
    }
    public int[] validateRandomBeatRange(String str) {
        int[] ans = new int[0];

        return ans;
    }
    public int[] validateRandomOctaveRange(String str) {
        int[] ans = new int[0];

        return ans;
    }
}

