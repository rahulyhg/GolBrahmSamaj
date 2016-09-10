package com.krushang.golbrahmsamaj.unused;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.GridView;

import com.krushang.golbrahmsamaj.R;
import com.krushang.golbrahmsamaj.adapter.CategoryAdapter;
import com.krushang.golbrahmsamaj.data.Categories;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vyas's on 29/08/2016.
 */
public class HomeActivity extends AppCompatActivity {
    GridView grid;
    List<Categories> categories = new ArrayList<Categories>();
    Categories cat;
    private Toolbar toolbar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unused_activity_home);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        grid = (GridView) findViewById(R.id.categoryGrid);

        for (int i = 0; i <= 5; i++) {
            cat = new Categories();
            cat.setCatTitle("Title " + i);
            cat.setCatImage(getResources().getIdentifier("@mipmap/ic_launcher", null, getPackageName()));
            categories.add(cat);
        }
        grid.setAdapter(new CategoryAdapter(this.getApplicationContext(), categories));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        return true;
    }
}
