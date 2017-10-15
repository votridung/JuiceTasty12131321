package gamemobile.com.juicetasty;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;

import java.util.ArrayList;

import gamemobile.com.juicetasty.adapter.CustomAdapter;

/**
 * Created by Asus on 14/10/2017.
 */

public class StActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_st);

        ArrayList<Menu> arrayList = new ArrayList<>();

        CustomAdapter customAdapter = new CustomAdapter(this,R.layout.row_item_menu,arrayList);

    }
}
