#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

class MainActivity extends Activity {

    override def onCreate(savedInstanceState: Bundle): Unit = {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
    }

    override def onCreateOptionsMenu(menu: Menu): Boolean = {
        getMenuInflater().inflate(R.menu.main, menu)
        true
    }

}

