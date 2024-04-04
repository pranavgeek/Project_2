
package com.example.android.testing.espresso.BasicSample;

import android.app.Activity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    // String to be typed into the EditText
    public static final String STRING_TO_BE_TYPED = "Espresso";

    // Rule to launch the MainActivity before each test
    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule = new ActivityScenarioRule<>(MainActivity.class);

    // Test to validate correct strings in TextView in MainActivity
    @Test
    public void testCorrectStringsInTextView() {
        // Replace text in EditText with STRING_TO_BE_TYPED
        Espresso.onView(ViewMatchers.withId(R.id.editTextUserInput))
                .perform(ViewActions.replaceText(STRING_TO_BE_TYPED));

        // Click the Change Text button
        Espresso.onView(ViewMatchers.withId(R.id.changeTextBt))
                .perform(ViewActions.click());

        // Check if TextView has correct text
        Espresso.onView(ViewMatchers.withId(R.id.textToBeChanged))
                .check(ViewAssertions.matches(ViewMatchers.withText(STRING_TO_BE_TYPED)));
    }

    // Test to validate entering "123" and pressing Change Text button
    @Test
    public void testEnter123AndPressChangeTextButton() {
        // Replace text in EditText with "123"
        Espresso.onView(ViewMatchers.withId(R.id.editTextUserInput))
                .perform(ViewActions.replaceText("123"));

        // Click the Change Text button
        Espresso.onView(ViewMatchers.withId(R.id.changeTextBt))
                .perform(ViewActions.click());

        // Check if TextView has correct text
        Espresso.onView(ViewMatchers.withId(R.id.textToBeChanged))
                .check(ViewAssertions.matches(ViewMatchers.withText("123")));
    }

    // Test to validate entering "123" and pressing Open Activity and Change Text button
    @Test
    public void testEnter123AndPressOpenActivityAndChangeTextButton() {
        // Replace text in EditText with "123"
        Espresso.onView(ViewMatchers.withId(R.id.editTextUserInput))
                .perform(ViewActions.replaceText("123"));

        // Click the Open Activity and Change Text button
        Espresso.onView(ViewMatchers.withId(R.id.activityChangeTextBtn))
                .perform(ViewActions.click());

        // Check if TextView in ShowTextActivity has correct text
        Espresso.onView(ViewMatchers.withId(R.id.show_text_view))
                .check(ViewAssertions.matches(ViewMatchers.withText("123")));
    }

    // Test to validate behavior when no text is entered and Change Text button is pressed
    @Test
    public void testWithoutEnteringTextAndPressChangeTextButton() {
        // Click the Change Text button without entering any text
        Espresso.onView(ViewMatchers.withId(R.id.changeTextBt))
                .perform(ViewActions.click());

        // Check if TextView remains empty
        Espresso.onView(ViewMatchers.withId(R.id.textToBeChanged))
                .check(ViewAssertions.matches(ViewMatchers.withText("")));
    }

    // Test to validate behavior when no text is entered and Open Activity and Change Text button is pressed
    @Test
    public void testWithoutEnteringTextAndPressOpenActivityAndChangeTextButton() {
        // Click the Open Activity and Change Text button without entering any text
        Espresso.onView(ViewMatchers.withId(R.id.activityChangeTextBtn))
                .perform(ViewActions.click());

        // Check if TextView in ShowTextActivity remains empty
        Espresso.onView(ViewMatchers.withId(R.id.show_text_view))
                .check(ViewAssertions.matches(ViewMatchers.withText("")));
    }

    // Test to validate entering "abcdef" and pressing Change Text button
    @Test
    public void testEnterAbcdefAndPressChangeTextButton() {
        // Replace text in EditText with "abcdef"
        Espresso.onView(ViewMatchers.withId(R.id.editTextUserInput))
                .perform(ViewActions.replaceText("abcdef"));

        // Click the Change Text button
        Espresso.onView(ViewMatchers.withId(R.id.changeTextBt))
                .perform(ViewActions.click());

        // Check if TextView has correct text
        Espresso.onView(ViewMatchers.withId(R.id.textToBeChanged))
                .check(ViewAssertions.matches(ViewMatchers.withText("abcdef")));
    }

    // Test to validate entering "abcdef" and pressing Open Activity and Change Text button
    @Test
    public void testEnterAbcdefAndPressOpenActivityAndChangeTextButton() {
        // Replace text in EditText with "abcdef"
        Espresso.onView(ViewMatchers.withId(R.id.editTextUserInput))
                .perform(ViewActions.replaceText("abcdef"));

        // Click the Open Activity and Change Text button
        Espresso.onView(ViewMatchers.withId(R.id.activityChangeTextBtn))
                .perform(ViewActions.click());

        // Check if TextView in ShowTextActivity has correct text
        Espresso.onView(ViewMatchers.withId(R.id.show_text_view))
                .check(ViewAssertions.matches(ViewMatchers.withText("abcdef")));
    }
}
