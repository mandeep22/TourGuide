package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        final ArrayList<Activity> activities = new ArrayList<Activity>();
        activities.add(new Activity("Allegro Hotel", "$$", "171 West Randolph Street",
                "(312) 236-0123", R.drawable.hotel_allegro));
        activities.add(new Activity("Inn of Chicago", "$$", "162 E. Ohio Street",
                "(312)787-3100", R.drawable.hotel_inn_of_chicago));
        activities.add(new Activity("Freehand", "$$", "19 E. Ohio Street",
                "(312)940-3699", R.drawable.hotel_freehand));
        activities.add(new Activity("Wit", "$$$", "201 N State Street",
                "(312)467-0200", R.drawable.hotel_wit));
        activities.add(new Activity("Thompson", "$$$$", "21 E. Bellevue Place",
                "(312)266-2100", R.drawable.hotel_thompson));

        ActivityAdapter adapter = new ActivityAdapter(this, activities, R.color.color_stay);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
