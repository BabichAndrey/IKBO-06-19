package com.riobener.tests;

import com.riobener.Chord;
import com.riobener.Note;
import com.riobener.SoundPlayer;
import com.riobener.exceptions.UnableToCloseRhythmPlayerException;
import org.junit.jupiter.api.Test;

import javax.sound.midi.MidiUnavailableException;

import static org.junit.jupiter.api.Assertions.*;

public class SoundPlayerTest {

    @Test
    void initPlayer() {
        SoundPlayer player = new SoundPlayer();
        assertDoesNotThrow(() -> player.init(0));
    }

    @Test
    void closePlayer_withFailure() throws MidiUnavailableException {
        String notOpenMessage = "Impossible to close player when he is not opened yet";
        SoundPlayer player = new SoundPlayer();
        assertThrows(NullPointerException.class, player::close);
        player.init(0);
        Exception synthOpenException = assertThrows(UnableToCloseRhythmPlayerException.class, player::close);
        assertTrue(synthOpenException.getMessage().contains(notOpenMessage));
    }


}
