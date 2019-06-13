package com.example.sa;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.List;

public class MyListAdapter extends ArrayAdapter<Res<ShopCar>> {
    private Context mContext;
    private List<Res<ShopCar>> mShopcarList;

    MyListAdapter(Context context, List<Res<ShopCar>> shopcarList) {
        super(context, 0, shopcarList);
        mContext = context;
        mShopcarList = shopcarList;
    }

    @Override
    public int getCount() {
        return mShopcarList.size();
    }

    static class ViewHolder {
        public TextView sellername, goodname, price, num, textt, sizee, colorr;
        public Button btt, bbt;
    }

    public View getView(final int position, View convertView, ViewGroup parent) {
        Res<ShopCar> shopCarRes = mShopcarList.get(position);
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.activity_list_view, parent, false);
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
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.sellername.setText(shopCarRes.getFields().getMember_name().get(0));
        holder.goodname.setText(shopCarRes.getFields().getShopcar_name().get(0));
        holder.price.setText(shopCarRes.getFields().getShopcar_price().get(0));
        holder.btt.setText("-");
        holder.num.setText(shopCarRes.getFields().getShopcar_num() + "");
        holder.bbt.setText("+");
        holder.textt.setText("規格");
        holder.sizee.setText(shopCarRes.getFields().getShopcar_size().get(0));
        holder.colorr.setText(shopCarRes.getFields().getShopcar_color().get(0));

        return convertView;
    }

}
