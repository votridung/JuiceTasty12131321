package gamemobile.com.juicetasty.adapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import gamemobile.com.juicetasty.R;


/**
 * Created by Asus on 14/10/2017.
 */

public class CustomAdapter extends ArrayAdapter <Menu> {
    private Context context;
    private int resource;
    private ArrayList<Menu> arrMenu;

    public CustomAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull ArrayList<Menu> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.arrMenu=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        convertView = LayoutInflater.from(context).inflate(R.layout.row_item_menu,parent,true);

        TextView tv_picture = (TextView) convertView.findViewById(R.id.tv_picture);
        TextView tv_name = (TextView) convertView.findViewById(R.id.tv_name);

        Menu menu = arrMenu.get(position);


        return convertView;



    }
}
