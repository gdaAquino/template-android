package com.giaquino.template;

import android.content.Intent;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * @author Gian Darren Aquino
 */
@LargeTest @RunWith(AndroidJUnit4.class) public class MainActivityTest {

    @Rule public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<>(
        MainActivity.class, true, false);

    @Test public void mainScreenDisplayTextHelloWorld() {
        mainActivityActivityTestRule.launchActivity(new Intent());
        onView(withId(R.id.main_label))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
            .check(ViewAssertions.matches(withText(R.string.main_hello_world)));
    }
}