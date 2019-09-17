package com.example.student.myapplication;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class CustomAdapter extends BaseAdapter {
    private Activity activity;
    private ArrayList<Member> lsMembers;
    private int customListItem;

    public CustomAdapter(Activity activity, int customListItem, ArrayList<Member> lsMembers) {
        this.activity = activity;
        this.customListItem = customListItem;
        this.lsMembers = lsMembers;
    }

    @Override
    public int getCount() {
        return lsMembers.size();
    }

    @Override
    public Object getItem(int position) {
        return lsMembers.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = activity.getLayoutInflater();
        convertView = inflater.inflate(R.layout.custom_list_1,null);

        ViewHolder vh = new ViewHolder();
        vh.imvHinh = (ImageView) convertView.findViewById(R.id.imvHinh);
        vh.imvDatNuoc = (ImageView) convertView.findViewById(R.id.imvDatNuoc);
        vh.tvTen = (TextView) convertView.findViewById(R.id.tvTen);
        vh.tvNam = (TextView)convertView.findViewById(R.id.tvNam);

        vh.imvHinh.setImageResource(lsMembers.get(position).getHinh());
        vh.imvDatNuoc.setImageResource(lsMembers.get(position).getDatNuoc());
        vh.tvTen.setText(lsMembers.get(position).getTen());
        vh.tvNam.setText(lsMembers.get(position).getNam() + "");
        Log.d("TEST", "getView: " + position);
        return convertView;
    }

    static class ViewHolder{
        TextView tvTen;
        TextView tvNam;
        ImageView imvHinh;
        ImageView imvDatNuoc;
    }
}
