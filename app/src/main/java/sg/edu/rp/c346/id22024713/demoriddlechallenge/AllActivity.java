package sg.edu.rp.c346.id22024713.demoriddlechallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AllActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all);

        tv = findViewById(R.id.textView);
        Intent intentReceived = getIntent();
        String questionsSelected = intentReceived.getStringExtra("Question");

        if (questionsSelected.equals("Q1")){
            tv.setText(questionsSelected + " answer is: queue");
        }
        else {
            tv.setText(questionsSelected + " answer is: gone");
        }
    }
}