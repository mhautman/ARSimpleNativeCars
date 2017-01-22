package org.artoolkit.ar.samples.ARSimpleNativeCars;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends Activity {


    ImageButton play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        play = (ImageButton) findViewById(R.id.btn_start);
        play.setOnClickListener(new View.OnClickListener() // the error is on this line (specifically the .setOnClickListener)
        {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ARSimpleNativeCarsActivity2.class));
            }
        });

    }
}
