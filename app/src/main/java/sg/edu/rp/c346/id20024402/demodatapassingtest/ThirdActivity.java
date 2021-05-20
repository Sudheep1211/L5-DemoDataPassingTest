package sg.edu.rp.c346.id20024402.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ThirdActivity extends AppCompatActivity {
    TextView tvAnswerChar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tvAnswerChar = findViewById(R.id.textViewDisplayChar);

        Intent intentReceived = getIntent();
        char value = intentReceived.getCharExtra("value", 'x');
        tvAnswerChar.setText("Character value received is: " + value);
    }
}