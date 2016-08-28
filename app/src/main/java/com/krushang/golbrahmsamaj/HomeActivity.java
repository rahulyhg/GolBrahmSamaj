package com.krushang.golbrahmsamaj;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.GridView;

import com.krushang.golbrahmsamaj.utils.adaptors.CategoryAdaptor;
import com.krushang.golbrahmsamaj.utils.beans.Categories;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vyas's on 29/08/2016.
 */
public class HomeActivity extends Activity {
    GridView grid;
    List<Categories> categories = new ArrayList<Categories>();
    Categories cat;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        grid = (GridView)findViewById(R.id.categoryGrid);

        for (int i = 0;i<=5;i++){
            cat = new Categories();
            cat.setCatTitle("Title "+i);
            cat.setCatImage(getResources().getIdentifier("@drawable/om", null, getPackageName()));
            categories.add(cat);
        }

        grid.setAdapter(new CategoryAdaptor(this.getApplicationContext(),categories));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        return true;
    }
}
