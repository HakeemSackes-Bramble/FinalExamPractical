package nyc.c4q.hakeemsackes_bramble.finalexampractical.custom_objects;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

import nyc.c4q.hakeemsackes_bramble.finalexampractical.LoginActivity;
import nyc.c4q.hakeemsackes_bramble.finalexampractical.SettingsActivity;

/**
 * Created by hakeemsackes-bramble on 2/12/17.
 */

public class CustomList {
    private ArrayList<DrawerDataObject> drawerDataObjects = new ArrayList<>();
    private Context context;


    public CustomList(final Context context) {
        this.context = context;
        for (int i = 0; i < 4; i++) {
            drawerDataObjects.add(new DrawerDataObject());
        }
        drawerDataObjects.get(0).setText("Selected Heart Activity");
        drawerDataObjects.get(0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, drawerDataObjects.get(0).getText(), Toast.LENGTH_SHORT).show();
            }
        });
        drawerDataObjects.get(1).setText("Selected Message Activity");
        drawerDataObjects.get(1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, drawerDataObjects.get(1).getText(), Toast.LENGTH_SHORT).show();
            }
        });
        drawerDataObjects.get(2).setText("Selected blah Activity");
        drawerDataObjects.get(2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, SettingsActivity.class);
                context.startActivity(intent);
                }
        });
        drawerDataObjects.get(3).setText("Selected Logout Activity");
        drawerDataObjects.get(3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, drawerDataObjects.get(3).getText(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context, LoginActivity.class);
                ;

            }
        });
    }

    public ArrayList<DrawerDataObject> getDrawerDataObjects() {
        return drawerDataObjects;
    }

    public void setDrawerDataObjects(ArrayList<DrawerDataObject> drawerDataObjects) {
        this.drawerDataObjects = drawerDataObjects;
    }
}
