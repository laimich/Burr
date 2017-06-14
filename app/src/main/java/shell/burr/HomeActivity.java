package shell.burr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import static java.sql.DriverManager.println;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);


        ImageButton customInputButton = (ImageButton)findViewById(R.id.addNewEvent);
        customInputButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout options = (LinearLayout)findViewById(R.id.homeAddOptions);
                options.setVisibility(View.VISIBLE);
                // startActivity(new Intent(HomeActivity.this, CustomInputActivity.class));
            }
        });

        Button addYourself = (Button)findViewById(R.id.homeAddYourself);
        addYourself.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, CustomInputActivity.class));
            }
        });
        Button addSteps = (Button)findViewById(R.id.homeAddSteps);
        addSteps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(HomeActivity.this, otherthing.class));
            }
        });

    }
}
