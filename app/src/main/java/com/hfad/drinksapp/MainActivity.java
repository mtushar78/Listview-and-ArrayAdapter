package com.hfad.drinksapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private String[] string= new String[]{"Food","Drinks","Others"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView= findViewById(R.id.option_list);

       /*listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position==0){
                    Intent intent=new Intent(getApplicationContext(),DrinkCategory.class);
                    startActivity(intent);
                }
            }
        });*/
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,string);

        listView.setAdapter(arrayAdapter);

       /*AdapterView.OnItemClickListener itemClickListener=new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
               if(position==0){
                   Intent intent=new Intent(getApplicationContext(),DrinkCategory.class);
                   startActivity(intent);
               }
           }
       };*/

       //listView.setOnItemClickListener(itemClickListener);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    Intent intent=new Intent(getApplicationContext(),DrinkCategory.class);
                    startActivity(intent);
                }
            }
        });
    }
}
