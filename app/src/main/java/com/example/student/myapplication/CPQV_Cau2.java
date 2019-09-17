package com.example.student.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CPQV_Cau2 extends AppCompatActivity {

    EditText edtKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpqv__cau2);
        edtKetQua = (EditText)findViewById(R.id.edtKetQua);

    }

    public void suKien(View view) {
        Intent t = new Intent(this, CPQV_Cau2_B.class);
        startActivityForResult(t,1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Toast.makeText(this, "ok", Toast.LENGTH_SHORT).show();
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                edtKetQua.setText(data.getStringExtra("result"));
            }
            if (resultCode == RESULT_CANCELED) {
                edtKetQua.setText("Không khả dụng");
            }
        }
    }
}
