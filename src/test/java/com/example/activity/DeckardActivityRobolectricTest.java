package com.example.activity;

import android.app.Activity;
import com.example.robolectric.DeckardActivity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertTrue;

@Config(manifest = "./src/main/AndroidManifest.xml")
@RunWith(RobolectricTestRunner.class)
public class DeckardActivityRobolectricTest {
    
    @Test
    public void testSuccess()
    {
        assertTrue(true);
    }
    
    @Test
    public void testFailure()
    {
        assertTrue(false);
    }
}
