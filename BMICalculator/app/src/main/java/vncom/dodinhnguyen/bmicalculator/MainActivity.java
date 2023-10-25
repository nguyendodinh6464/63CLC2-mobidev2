package vncom.dodinhnguyen.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText weight = findViewById(R.id.canNang);
        EditText height = findViewById(R.id.chieuCao);
        Button submit = findViewById(R.id.submit);
        TextView ketQua = findViewById(R.id.ketQua);
        TextView ketQua2 = findViewById(R.id.ketQua2);
        submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                float chieuCao = Float.parseFloat(String.valueOf(height.getText()))/100;
                float cangNang = Float.parseFloat(String.valueOf(weight.getText()));
                float bmi = cangNang/(chieuCao*chieuCao);
                ketQua.setText(String.valueOf(bmi));
                if(bmi<18.5){
                    ketQua2.setText("Qua Om");
                } else if (bmi<23) {
                    ketQua2.setText("Binh Thuong");
                } else if (bmi == 23) {
                    ketQua2.setText("Map");
                } else if (bmi <25 ) {
                    ketQua2.setText("tien beo phi");
                } else if (bmi <30) {
                    ketQua2.setText("beo phi loai 2");
                }
                else {
                    ketQua2.setText("beo phi nang");
                }
            }
        }
        );
    }
}