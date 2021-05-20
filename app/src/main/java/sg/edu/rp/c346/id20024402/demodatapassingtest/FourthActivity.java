package sg.edu.rp.c346.id20024402.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {
    TextView tvAnswerdouble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        tvAnswerdouble = findViewById(R.id.textViewDisplayDouble);

        Intent intentReceived = getIntent();
        double value = intentReceived.getDoubleExtra("value", 0.0);
        tvAnswerdouble.setText("Double value received is: " + value);
    }
}