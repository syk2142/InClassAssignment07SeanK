package com.example.inclassassignment07_seank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;

import java.io.Serializable;

public class SecondActivity extends AppCompatActivity {

    EditText mResName,mResZip,mResInfo;
    CheckBox mParking;
    RadioGroup g1;
    String cashOnly;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        initializeViewControls();

        g1 =(RadioGroup) findViewById(R.id.radioGroup);
        g1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.cash_radioButton){
                    cashOnly = "Yes!!!";
                }
                if(checkedId==R.id.card_radioButton){
                    cashOnly = "Accept both cards and cash!!!";
                }
            }
        });
    }

    private void initializeViewControls(){
        mResName = findViewById(R.id.resName);
        mResZip = findViewById(R.id.resZip);
        mResInfo = findViewById(R.id.resInfo);
        mParking = findViewById(R.id.parking_checkBox);
    }

    public void submitFriend(View view) {
        String resName = mResName.getText().toString();
        int resZip = Integer.valueOf(mResZip.getText().toString());
        String resInfo = mResInfo.getText().toString();
        boolean parking = mParking.isChecked();

        Restaurant rest= new Restaurant(resName,resZip, resInfo,parking,cashOnly);
        Intent data = new Intent();
        data.putExtra(Keys.RESTAURANT, rest);
        setResult(RESULT_OK, data);
        finish();
    }

}