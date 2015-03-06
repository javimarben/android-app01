/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.me.aplicacio001;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import java.util.Date;

/**
 *
 * @author mascport
 */
public class Aplicacio001 extends Activity  implements OnClickListener{

    private Button btn;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        btn = new Button(this);
        btn.setOnClickListener(this);
        posarData();
        setContentView(btn);
    }

    public void onClick(View view) {
        posarData();
    }

    private void posarData() {
        btn.setText(new Date().toString());
    }
}
