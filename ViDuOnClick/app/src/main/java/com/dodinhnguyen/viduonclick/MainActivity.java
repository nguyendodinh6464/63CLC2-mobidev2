package com.dodinhnguyen.viduonclick;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Viet ham xu ly' su kien o day
    public void XuLyNoiHello(View v){
        // buoc 1. tim dieu khien
        EditText editText_Name= findViewById(R.id.edtName);
        // tu day, ta dung ben editText_Name de lam viec
        //buoc 2
        // lay chuoi user nhap
        String strName = editText_Name.getText().toString();

        // xuat theo ye cau

        String strThongBao = " Nice to see you \n" + strName;
        Toast.makeText(this,strThongBao, Toast.LENGTH_LONG).show();




    }

    public void XuLyNoiXinChao(View v){
        EditText editText_Name= findViewById(R.id.edtName);
        // tu day, ta dung ben editText_Name de lam viec
        //buoc 2
        // lay chuoi user nhap
        String strName = editText_Name.getText().toString();

        // xuat theo ye cau
        String strThongBao = "xin chao \n" + strName;
                Toast.makeText(this, strThongBao,Toast.LENGTH_LONG).show();
    }


}