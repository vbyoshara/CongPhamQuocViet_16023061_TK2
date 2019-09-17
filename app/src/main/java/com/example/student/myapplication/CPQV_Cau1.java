package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class CPQV_Cau1 extends AppCompatActivity {

    ListView lsMember;
    ArrayList<Member> ls;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpqv__cau1);
        lsMember = (ListView)findViewById(R.id.lsMember);

        ls = new ArrayList<Member>();
        ls.add(new Member(R.mipmap.kyduyen,1990,"Kỳ Duyên",R.mipmap.mi));
        ls.add(new Member(R.mipmap.dangthuthao,1995,"Đặng Thu Thảo",R.mipmap.dangthuthao_datnuoc));
        ls.add(new Member(R.mipmap.nguyenthihuyen,1989,"Nguyễn Thị Huyền",R.mipmap.nguyenthihuyen_datnuoc));
        ls.add(new Member(R.mipmap.thanhhuyen,1979,"Thanh Huyền",R.mipmap.thanhhuyen_datnuoc));
        ls.add(new Member(R.mipmap.kyduyen,1990,"Kỳ Duyên",R.mipmap.mi));
        ls.add(new Member(R.mipmap.dangthuthao,1995,"Đặng Thu Thảo",R.mipmap.dangthuthao_datnuoc));
        ls.add(new Member(R.mipmap.nguyenthihuyen,1989,"Nguyễn Thị Huyền",R.mipmap.nguyenthihuyen_datnuoc));
        ls.add(new Member(R.mipmap.thanhhuyen,1979,"Thanh Huyền",R.mipmap.thanhhuyen_datnuoc));
        ls.add(new Member(R.mipmap.kyduyen,1990,"Kỳ Duyên",R.mipmap.mi));
        ls.add(new Member(R.mipmap.dangthuthao,1995,"Đặng Thu Thảo",R.mipmap.dangthuthao_datnuoc));
        ls.add(new Member(R.mipmap.nguyenthihuyen,1989,"Nguyễn Thị Huyền",R.mipmap.nguyenthihuyen_datnuoc));
        ls.add(new Member(R.mipmap.thanhhuyen,1979,"Thanh Huyền",R.mipmap.thanhhuyen_datnuoc));


        CustomAdapter customAdapter = new CustomAdapter(this,R.layout.custom_list_1,ls);
        lsMember.setAdapter(customAdapter);

    }


}
