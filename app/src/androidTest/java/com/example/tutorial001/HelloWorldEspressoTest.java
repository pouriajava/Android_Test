package com.example.tutorial001;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class HelloWorldEspressoTest {
    @Rule
    public ActivityScenarioRule<MainActivity> activityRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void listGoesOverTheFold() {
        onView(withText("Hello World!")).check(matches(withId(R.id.txthello)));

        onView(withId(R.id.editTextTextPersonName))
                .perform(typeText("HELLO"), closeSoftKeyboard());
        onView(withId(R.id.submit)).perform(click());

        onView(withId(R.id.txthello)).check(matches(withText("HELLO")));

    }
}
