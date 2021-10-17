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

    public String[] validateNoteList(String str){
        return null;
    }
}

