package com.example.ex11062;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Costume[] costumes = new Costume[7];
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        makeData();
        ArrayAdapter<Costume> adapter = new ArrayAdapter<Costume>(this, android.R.layout.simple_spinner_dropdown_item, costumes);
        CustomAdapter customAdapter = new CustomAdapter(this, costumes);
        spinner.setAdapter(customAdapter);
    }

    public void makeData()
    {
        String[] accesories1 = new String[4];
        String[] accesories2 = new String[4];
        String[] accesories3 = new String[4];
        String[] accesories4 = new String[5];
        String[] accesories5 = new String[5];
        String[] accesories6 = new String[5];
        String[] accesories7 = new String[5];
        accesories1[0] = "tail";
        accesories1[1] = "brown clothes";
        accesories1[2] = "face makeup";
        accesories1[3] = "mane of a lion";
        accesories2[0] = "mask";
        accesories2[1] = "blue and red suit";
        accesories2[2] = "gloves";
        accesories2[3] = "toy web shotter";
        accesories3[0] = "whit robe";
        accesories3[1] = "Stethoscope";
        accesories3[2] = "name tag";
        accesories3[3] = "toy thermometer";
        accesories4[0] = "black eye patch";
        accesories4[1] = "bandana";
        accesories4[2] = "plastic sword";
        accesories4[3] = "hook";
        accesories4[4] = "black vest";
        accesories5[0] = "transparent helmet";
        accesories5[1] = "white suit";
        accesories5[2] = "backpack";
        accesories5[3] = "tiny flag";
        accesories5[4] = "silver boots";
        accesories6[0] = "red nose";
        accesories6[1] = "colorful wig";
        accesories6[2] = "huge shoes";
        accesories6[3] = "colorful clothes";
        accesories6[4] = "flower that shoots water";
        accesories7[0] = "light blue dress";
        accesories7[1] = "transparent mantle";
        accesories7[2] = "blonde wig";
        accesories7[3] = "silver crown";
        accesories7[4] = "ice wand";
        costumes[0] = new Costume("lion", "animals", 2, R.drawable.ic_lion, accesories1);
        costumes[1] = new Costume("spiderman", "superheros", 3, R.drawable.ic_spiderman, accesories2);
        costumes[2] = new Costume("doctor", "subjects", 1, R.drawable.ic_doctor, accesories3);
        costumes[0] = new Costume("pirate", "fairy tales", 3, R.drawable.ic_pirate, accesories4);
        costumes[4] = new Costume("astronaut", "space", 5, R.drawable.ic_astronaut, accesories5);
        costumes[5] = new Costume("clown", "circus", 4, R.drawable.ic_clown, accesories6);
        costumes[6] = new Costume("elsa", "movies princess", 3, R.drawable.ic_elsa, accesories7);
    }
}