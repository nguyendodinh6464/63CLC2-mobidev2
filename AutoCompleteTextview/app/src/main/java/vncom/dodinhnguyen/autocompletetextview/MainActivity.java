package vncom.dodinhnguyen.autocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> dsQuocGia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //b0
        findControls();
        //bb1 chuan bi nguon du lieu, cat vao bien
        dsQuocGia = new ArrayList<String>();
        dsQuocGia .add("Viet Nam");
        dsQuocGia .add("England");
        dsQuocGia .add("Australia");
        dsQuocGia .add("USA");
        dsQuocGia .add("Portugal");
        dsQuocGia .add("France");
        //b2 tao adapter
        ArrayAdapter<String> adapterQG;
        adapterQG = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,dsQuocGia);
        //b3 gan adapter
        autoQUOCGIA.setAdapter(adapterQG);

    }

    public void findControls(){
        autoQUOCGIA = findViewById(R.id.autoCompleteQUOCGIA);
    }
    AutoCompleteTextView autoQUOCGIA;
}