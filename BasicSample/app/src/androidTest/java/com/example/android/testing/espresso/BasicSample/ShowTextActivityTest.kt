package com.example.android.testing.espresso.BasicSample

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.activityScenarioRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry

@RunWith(AndroidJUnit4::class)
class ShowTextActivityTest {

    @get:Rule
    var activityScenarioRule = activityScenarioRule<MainActivity>()

    // Test to validate correct strings in the TextView in ShowTextActivity
    @Test
    fun testCorrectStringsInShowTextActivity() {
        // Define the test message
        val message = "Test Message"

        // Create an intent with the test message
        val intent = ShowTextActivity.newStartIntent(
            InstrumentationRegistry.getInstrumentation().targetContext,
            message
        )

        // Launch the ShowTextActivity with the intent
        val scenario = ActivityScenario.launch<ShowTextActivity>(intent)

        // Check if the TextView in ShowTextActivity has the correct text
        onView(withId(R.id.show_text_view))
            .check(matches(withText(message)))

        // Close the activity after the test
        scenario.close()
    }
}
