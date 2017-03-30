package at.pll.testappl.GUI;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.TreeSet;

import at.pll.testappl.Data.DatabaseGateway;
import at.pll.testappl.Data.Word;
import at.pll.testappl.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
    }
}
