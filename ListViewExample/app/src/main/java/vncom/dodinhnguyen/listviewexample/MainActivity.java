package vncom.dodinhnguyen.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> dsBaiHat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findControls();
    //b1 cb dlieu, cat vao bien
        dsBaiHat = new ArrayList<String>();
        dsBaiHat .add("Thu Do Cypher");
        dsBaiHat .add("SCHDTX1");
        dsBaiHat .add("Ghe Qua");
        dsBaiHat .add("May lang Thang");
        dsBaiHat .add("Co Mot Nguoi luon cuoi khi anh den");
        dsBaiHat .add("Anh Da On Hon");
        //b2 tao adapter
        ArrayAdapter<String> adapterBH;
        adapterBH = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,dsBaiHat);
        //b3 gan adapter
        ListViewBaiHat.setAdapter(adapterBH);
        //b4 bat su kien de xu li
        ListViewBaiHat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // i la vi tri cua muc vua chon
                // xu li : vi du ta lay ve ten bai vua chon
                String itemSelectedValue= adapterBH.getItem(i);
                // hoac ta co the lay tu nguon du lieu
                String itemChon= dsBaiHat.set(i);
                // thong bao ra man hinh
                String thongBao= "ban chon bai : " + itemChon;
                Toast.makeText(MainActivity.this,thongBao,Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void findControls(){
       ListViewBaiHat = findViewById(R.id.dsBaiHat);

    }
    ListView ListViewBaiHat;
}