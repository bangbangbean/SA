package com.example.sa;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

public class MyListAdapter extends BaseAdapter{
    private shoppingcar shoppingcarr;
    private String[][] date;
    private Context mContext;
    private LayoutInflater mLayoutInflater;
    private int index;

    MyListAdapter(String[][] date, shoppingcar context, int count){
        this.index = count;
        this.date = date;
        this.shoppingcarr = context;
        this.mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return index;
    }

    public Object getItem(int position){
        return null;
    }

    public long getItemId(int position){
        return position;
    }

    static class ViewHolder{
        public TextView sellername, goodname, price, num, textt, sizee, colorr;
        public Button btt, bbt;
    }

    public View getView(final int position, View convertView, ViewGroup parent){
        ViewHolder holder = null;
        if (convertView == null){
            convertView = mLayoutInflater.inflate(R.layout.activity_list_view, null);
            holder = new ViewHolder();
            holder.sellername = (TextView) convertView.findViewById(R.id.sellername);
            holder.goodname = (TextView) convertView.findViewById(R.id.goodname);
            holder.price = (TextView) convertView.findViewById(R.id.price);
            holder.num = (TextView) convertView.findViewById(R.id.num);
            holder.textt = (TextView) convertView.findViewById(R.id.textt);
            holder.sizee = (TextView) convertView.findViewById(R.id.size);
            holder.colorr = (TextView) convertView.findViewById(R.id.colorr);

            holder.btt = (Button) convertView.findViewById(R.id.btt);
            holder.bbt = (Button) convertView.findViewById(R.id.bbt);
            convertView.setTag(holder);
        }
        else{
            holder = (ViewHolder) convertView.getTag();
        }

        holder.sellername.setText(date[position][1]);
        holder.goodname.setText(date[position][2]);
        holder.price.setText(date[position][3]);
        holder.num.setText(date[position][4]);
        holder.textt.setText(date[position][5]);
        holder.sizee.setText(date[position][6]);
        holder.colorr.setText(date[position][7]);

        return convertView;
    }

}
