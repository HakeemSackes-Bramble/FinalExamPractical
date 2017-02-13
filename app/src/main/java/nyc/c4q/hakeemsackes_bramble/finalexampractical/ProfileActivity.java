package nyc.c4q.hakeemsackes_bramble.finalexampractical;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

import nyc.c4q.hakeemsackes_bramble.finalexampractical.custom_objects.CustomList;
import nyc.c4q.hakeemsackes_bramble.finalexampractical.custom_objects.DrawerDataObject;
import nyc.c4q.hakeemsackes_bramble.finalexampractical.recycler_view.GenericRVAdapter;

public class ProfileActivity extends AppCompatActivity {
    private DrawerLayout drawer;
    private Toolbar toolbar;
    RecyclerView recyclerView;
    ArrayList<DrawerDataObject> ListInDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        ListInDrawer = new CustomList(getApplicationContext()).getDrawerDataObjects();

        toolbar = (Toolbar) findViewById(R.id.profile_toolbar);
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.drawer_open, R.string.drawer_close);
        drawer.addDrawerListener(drawerToggle);
        recyclerView = (RecyclerView) findViewById(R.id.drawer_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(new GenericRVAdapter(ListInDrawer));

    }
}
