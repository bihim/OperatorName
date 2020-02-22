package com.bihim.operatorname;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<OperatorAndCountry> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.spinner_test);


        arrayList = new ArrayList<>();
        arrayList.add(new OperatorAndCountry("50","FRiENDi"));
        arrayList.add(new OperatorAndCountry("51","ONEXOX"));
        arrayList.add(new OperatorAndCountry("52","RedOne"));
        arrayList.add(new OperatorAndCountry("49","Altel"));
        arrayList.add(new OperatorAndCountry("36","Maxis-hotlink"));
        arrayList.add(new OperatorAndCountry("43","Merchantrade"));
        arrayList.add(new OperatorAndCountry("38","UMobile"));
        arrayList.add(new OperatorAndCountry("56","Nijoi"));
        arrayList.add(new OperatorAndCountry("96","DIGI-Boaradband"));
        arrayList.add(new OperatorAndCountry("137","Maxis"));
        arrayList.add(new OperatorAndCountry("45","Tune Talk"));
        arrayList.add(new OperatorAndCountry("94","XOX"));
        arrayList.add(new OperatorAndCountry("95","XOX-Data"));
        arrayList.add(new OperatorAndCountry("35","Digi"));
        arrayList.add(new OperatorAndCountry("37","Celcom"));
        arrayList.add(new OperatorAndCountry("109","CIMB BANK"));
        arrayList.add(new OperatorAndCountry("98","MAY BANK"));
        //India
        arrayList.add(new OperatorAndCountry("76","MTNL"));
        arrayList.add(new OperatorAndCountry("75","MTS"));
        arrayList.add(new OperatorAndCountry("74","Jio"));
        arrayList.add(new OperatorAndCountry("72","Tata-Docomo"));
        arrayList.add(new OperatorAndCountry("71","Aircel"));
        arrayList.add(new OperatorAndCountry("69","BSNL"));
        arrayList.add(new OperatorAndCountry("67","Idea-Vodaphone"));
        arrayList.add(new OperatorAndCountry("66","Airtel"));
        arrayList.add(new OperatorAndCountry("70","Reliance Telecom"));
        

        ArrayAdapter<OperatorAndCountry> arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item , arrayList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                OperatorAndCountry operatorAndCountry = arrayList.get(position);

                Toast.makeText(MainActivity.this, operatorAndCountry.getId(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
