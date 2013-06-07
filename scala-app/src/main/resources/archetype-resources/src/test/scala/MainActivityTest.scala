#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import android.widget.TextView

import org.fest.assertions.api.ANDROID._
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner

@RunWith(classOf[RobolectricTestRunner])
class MainActivityTest {

    var activity: MainActivity = null
    var boomText : TextView = null

    @Before def setup {
        activity = Robolectric.buildActivity(classOf[MainActivity])
            .create()
            .get();
        boomText = activity.findViewById(R.id.text_boom).asInstanceOf[TextView]
    }

    @Test def itShouldNotBeNull {
    	assertNotNull(activity)
    	assertThat(boomText).containsText("Boom. Toasted")
    }
}