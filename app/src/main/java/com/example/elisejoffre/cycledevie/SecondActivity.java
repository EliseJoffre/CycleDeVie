package com.example.elisejoffre.cycledevie;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by elisejoffre on 28/02/2018.
 */

public class SecondActivity extends AppCompatActivity {

    public Button boutonretour;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toast toast = Toast.makeText(getApplicationContext(), " On Create de l'activité 2…", Toast.LENGTH_SHORT);
        toast.show();
        boutonretour = (Button) findViewById(R.id.boutonretour);
        boutonretour.setOnClickListener(new View.OnClickListener() {
            @Override
            
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast toast = Toast.makeText(getApplicationContext(), " On Destroy de l'activité 2…", Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast toast = Toast.makeText(getApplicationContext(), " On Pause de l'activité 2…", Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast toast = Toast.makeText(getApplicationContext(), " On restart de l'activité 2…", Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast toast = Toast.makeText(getApplicationContext(), " On resume de l'activité 2…", Toast.LENGTH_SHORT);
        toast.show();
    }


    @Override
    protected void onStart() {
        super.onStart();
        Toast toast = Toast.makeText(getApplicationContext(), " On Start de l'activité 2 …", Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast toast = Toast.makeText(getApplicationContext(), " On Stop de l'activité 2…", Toast.LENGTH_SHORT);
        toast.show();
    }

}



