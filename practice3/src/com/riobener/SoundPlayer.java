package com.riobener;

import com.riobener.exceptions.UnableToCloseRhythmPlayerException;

import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SoundPlayer {
    private MidiChannel[] channels = null;
    private Synthesizer synth = null;
    private int instrumentNumber = 0;
    private int channel;

    public SoundPlayer() {

    }

    public int getInstrumentNumber() {
        return instrumentNumber;
    }

    public void setInstrumentNumber(int instrumentNumber) {
        this.instrumentNumber = instrumentNumber;
    }

    public void init(int instrumentNumber) throws MidiUnavailableException {

    }

    public void close() throws UnableToCloseRhythmPlayerException {

    }

    public MidiChannel[] getChannels() {
        return channels;
    }

    public void setChannels(MidiChannel[] channels) {
        this.channels = channels;
    }


}
