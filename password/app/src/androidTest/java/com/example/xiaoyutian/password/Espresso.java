package com.example.xiaoyutian.password;

/**
 * Created by xiaoyutian on 2018-02-10.
 */
import android.support.test.rule.ActivityTestRule;
        import android.support.test.runner.AndroidJUnit4;

        import org.junit.After;
        import org.junit.Before;
        import org.junit.Rule;
        import org.junit.Test;
        import org.junit.runner.RunWith;

        import static android.support.test.espresso.Espresso.onView;
        import static android.support.test.espresso.action.ViewActions.click;
        import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
        import static android.support.test.espresso.action.ViewActions.typeText;
        import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Espresso {
        @Rule
        public ActivityTestRule<MainActivity>  mActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);



        @Before
        public void setUp() throws Exception {
        }

        @Test
        public void greeterSaysHello() {
                onView(withId(R.id.input)).perform(typeText("Steve"), closeSoftKeyboard());
                onView(withId(R.id.mybutton)).perform(click());
                onView(withId(R.id.output)).check(matches(withText("Not strong enough")));
        }

        @After
        public void tearDown() throws Exception {
        }
}
