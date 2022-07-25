package ramos.s.j.mauricio.Conceitos_Classes_Abstratas_e_Interfaces;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

import static java.util.regex.Pattern.matches;

import android.content.Intent;
import android.view.View;

import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4ClassRunner.class)
public class MainActivityTest {


    @Test
    public void deveriaMainActivityEstarVisivel(){

        //Usando o generics"<>" e usando static
        ActivityScenario <MainActivity> activityScenario = ActivityScenario.launch(MainActivity.class);

        onView(withId(R.id.mainActivity)).check(matches(isDisplayed()));



    }


}