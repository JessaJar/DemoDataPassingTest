package sg.edu.rp.c346.id20014241.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvDisplay = findViewById(R.id.textView);
        Intent receiveIntent = getIntent();
        Character value2 = receiveIntent.getCharExtra("value", 'z');
        Integer value1 = receiveIntent.getIntExtra("value", 0);
        Double value3 = receiveIntent.getDoubleExtra("value", 0.0);
        tvDisplay.setText("Integer value received is: " + value1 + " \nCharacter value received is: " + value2 + " \nDouble value received is: " + value3);




    }
}