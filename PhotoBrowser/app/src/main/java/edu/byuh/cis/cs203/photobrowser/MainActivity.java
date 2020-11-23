package edu.byuh.cis.cs203.photobrowser;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout.LayoutParams nice = new LinearLayout.LayoutParams
                (LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.MATCH_PARENT, 1);

        final String[] roomNames = {
                "The Bank",
                "The Gold Room",
                "The Green Room",
                "The Machine Room",
                "The Milk Room",
                "The Office",
                "The Pink Room",
                "The Warm Room",
                "The White Room"
        };

        final int[] imageIDs = {
                R.drawable.bank,
                R.drawable.gold_room,
                R.drawable.green_room,
                R.drawable.machine_room,
                R.drawable.milk_room,
                R.drawable.office,
                R.drawable.pink_room,
                R.drawable.warm_room,
                R.drawable.white_room
        };

    }
}
