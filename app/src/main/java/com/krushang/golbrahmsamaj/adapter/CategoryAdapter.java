package com.krushang.golbrahmsamaj.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by Vyas's on 29/08/2016.
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;

import com.krushang.golbrahmsamaj.R;
import com.krushang.golbrahmsamaj.data.Categories;

import java.util.List;

public class CategoryAdapter extends BaseAdapter{
    private Context mContext;
    private List<Categories> categories = null;
    public CategoryAdapter(Context c, List<Categories> categories) {
        mContext = c;
        this.categories = categories;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return categories.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        View grid;
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {
            grid = new View(mContext);
            grid = inflater.inflate(R.layout.unused_home_custom_item, null);
            TextView textView = (TextView) grid.findViewById(R.id.home_category_text);
            ImageView imageView = (ImageView)grid.findViewById(R.id.home_category_hexa);
            textView.setText(categories.get(position).getCatTitle());
            imageView.setImageResource(categories.get(position).getCatImage());
        } else {
            grid = (View) convertView;
        }

        return grid;
    }
}