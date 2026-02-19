package com.example.ex11062;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Costume[] costumes = new Costume[8];
    Spinner spin;
    TextView outputTv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        outputTv = findViewById(R.id.outputTv);
        spin = findViewById(R.id.spinner);
        makeData();
        CustomAdapter customAdapter = new CustomAdapter(this, costumes);
        spin.setAdapter(customAdapter);
        spin.setOnItemSelectedListener(this);
    }

    public void makeData()
    {
        ArrayList<String> accesories1 = new ArrayList<>();
        ArrayList<String> accesories2 = new ArrayList<>();
        ArrayList<String> accesories3 = new ArrayList<>();
        ArrayList<String> accesories4 = new ArrayList<>();
        ArrayList<String> accesories5 = new ArrayList<>();
        ArrayList<String> accesories6 = new ArrayList<>();
        ArrayList<String> accesories7 = new ArrayList<>();
        accesories1.add("tail");
        accesories1.add("brown clothes");
        accesories1.add("face makeup");
        accesories1.add("mane of a lion");
        accesories2.add("mask");
        accesories2.add("blue and red suit");
        accesories2.add("gloves");
        accesories2.add("toy web shotter");
        accesories3.add("whit robe");
        accesories3.add("Stethoscope");
        accesories3.add("name tag");
        accesories3.add("toy thermometer");
        accesories4.add("black eye patch");
        accesories4.add("bandana");
        accesories4.add("plastic sword");
        accesories4.add("hook");
        accesories4.add("black vest");
        accesories5.add("transparent helmet");
        accesories5.add("white suit");
        accesories5.add("backpack");
        accesories5.add("tiny flag");
        accesories5.add("silver boots");
        accesories6.add("red nose");
        accesories6.add("colorful wig");
        accesories6.add("huge shoes");
        accesories6.add("colorful clothes");
        accesories6.add("flower that shoots water");
        accesories7.add("light blue dress");
        accesories7.add("transparent mantle");
        accesories7.add("blonde wig");
        accesories7.add("silver crown");
        accesories7.add("ice wand");
        costumes[1] = new Costume("lion", "animals", 2, R.drawable.ic_lion, accesories1);
        costumes[2] = new Costume("spiderman", "superheros", 3, R.drawable.ic_spiderman, accesories2);
        costumes[3] = new Costume("doctor", "subjects", 1, R.drawable.ic_doctor, accesories3);
        costumes[4] = new Costume("pirate", "fairy tales", 3, R.drawable.ic_pirate, accesories4);
        costumes[5] = new Costume("astronaut", "space", 5, R.drawable.ic_astronaut, accesories5);
        costumes[6] = new Costume("clown", "circus", 4, R.drawable.ic_clown, accesories6);
        costumes[7] = new Costume("elsa", "movies princess", 3, R.drawable.ic_elsa, accesories7);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        if(costumes[i] != null) {
            Costume costume = costumes[i++];
            String text = "";
            for (String s : costume.get_accessories()) {
                text += s + ", ";
            }
            outputTv.setText(text.substring(0, text.length() - 2));
        }
        else
        {
            outputTv.setText("Nothing selected");
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        outputTv.setText("Nothing selected");
    }
}