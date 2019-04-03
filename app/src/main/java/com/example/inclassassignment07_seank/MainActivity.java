package com.example.inclassassignment07_seank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addRestaurant(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, RequestCodes.ADD_RESTAURANT);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == RequestCodes.ADD_RESTAURANT && resultCode == RESULT_OK) {
            Restaurant restaurant = (Restaurant) data.getSerializableExtra(Keys.RESTAURANT);

            TextView res =(TextView)findViewById(R.id.textView);
            res.setText(restaurant.toString());
        }
    }


}