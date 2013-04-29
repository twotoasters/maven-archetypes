#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class) public class MainActivityTest {

    MainActivity activity;

    @Before public void setUp() throws Exception {
        activity = new MainActivity();
    }

    @Test public void itShouldNotBeNull() {
    	assertNotNull(activity);
    }
}