package com.example.student.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CPQV_Cau2_B extends AppCompatActivity {

    EditText edtA,edtB,edtC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpqv__cau2__b);
        edtA = (EditText)findViewById(R.id.edtA);
        edtB = (EditText)findViewById(R.id.edtB);
        edtC = (EditText)findViewById(R.id.edtC);
    }

    public void suKien(View view) {
        Intent t = new Intent(this,CPQV_Cau2.class);
        t.putExtra("result",giaiPTBac2(Float.parseFloat(edtA.getText().toString()),Float.parseFloat(edtB.getText().toString()),Float.parseFloat(edtC.getText().toString())));
        setResult(RESULT_OK,t);
        finish();
    }

    public String giaiPTBac2(float a, float b, float c) {
        // kiểm tra các hệ số
        if (a == 0) {
            if (b == 0) {
                return "Phương trình vô nghiệm!";
            } else {
                return "Phương trình có một nghiệm: "
                        + "x = " + (-c / b);
            }
        }
        // tính delta
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        // tính nghiệm
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            return "Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2;
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            return "Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1;
        } else {
            return "Phương trình vô nghiệm!";
        }
    }
}
