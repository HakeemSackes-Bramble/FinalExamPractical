package nyc.c4q.hakeemsackes_bramble.finalexampractical;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import nyc.c4q.hakeemsackes_bramble.finalexampractical.recycler_view.GenericRVAdapter;

/**
 * Created by hakeemsackes-bramble on 2/12/17.
 */

public class SettingsActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Integer> listInSettings;
    private int one = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        recyclerView = (RecyclerView) findViewById(R.id.integer_recycler_view);
        listInSettings = new ArrayList<>();
        for (int i = 0; i < 50 ; i++) {
            listInSettings.add(i,one++);
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(new GenericRVAdapter(listInSettings));

    }
}
