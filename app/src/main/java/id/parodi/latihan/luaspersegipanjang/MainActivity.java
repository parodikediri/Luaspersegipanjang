package id.parodi.latihan.luaspersegipanjang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//deklarasikan element dari desain
    EditText txt_panjang, txt_lebar;
    TextView lbl_hasil;
    Double panjang, lebar, hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_panjang =(EditText)findViewById(R.id.txt_panjang);
        txt_lebar =(EditText)findViewById(R.id.txt_lebar);
        lbl_hasil =(TextView)findViewById(R.id.txt_hasil);
    }
    //hitung adalah onclick dari button
    public void hitung (View v){
        panjang = Double.valueOf(txt_panjang.getText().toString());
        lebar = Double.valueOf(txt_lebar.getText().toString());
        try {
            hasil = panjang * lebar;
            lbl_hasil.setText(hasil.toString());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
