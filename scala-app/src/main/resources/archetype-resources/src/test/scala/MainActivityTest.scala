#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

@RunWith(classOf[RobolectricTestRunner])
class MainActivityTest {

    var activity: MainActivity = null

    @Before def setup {
        activity = new MainActivity
        activity.onCreate(null)
    }

    @Test def itShouldNotBeNull {
    	assertNotNull(activity)
    }
}