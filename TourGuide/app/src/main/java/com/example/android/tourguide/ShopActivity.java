package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ShopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        final ArrayList<Activity> activities = new ArrayList<Activity>();
        activities.add(new Activity("Allegro Hotel", "$$", "171 West Randolph Street",
                "(312) 236-0123"));
        activities.add(new Activity("Inn of Chicago", "$$", "162 E. Ohio Street",
                "(312)787-3100"));

        ActivityAdapter adapter = new ActivityAdapter(this, activities, R.color.color_stay);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
