package com.riobener;

import com.riobener.exceptions.NoteNameFormatException;

public class Note {
    private int octave;
    private String noteName;
    private int duration;
    String[] notes = new String[] {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B" };
    public Note(int octave, String noteName) {
        this.octave = octave;
        this.noteName = noteName;
    }

    public int getMidiNote(){
        return 0;
    }

    public String getNoteName(){
        return noteName;
    }

    public int getOctave() {
        return octave;
    }

    public void setOctave(int octave) {
        this.octave = octave;
    }

    public void setNoteName(String noteName) throws NoteNameFormatException {

    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
