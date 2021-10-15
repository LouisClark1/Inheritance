package test_folder;

import com.company.Digital;
import com.company.Films;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class First_test {

    @Test
    public void test_for_Films(){
        Films testFilm = new Films();
        assertEquals("This is the film test message","Default film title",testFilm.getName());

    }

    @Test
    public void test_for_digital_audiobook(){
        Digital testDigitalAudiobook = new Digital();
        assertEquals("This is the digital audiobook test message",0.0,testDigitalAudiobook.getDataSize());

    }
}

