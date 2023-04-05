package com.example.listviewdataimplementation;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private ListView listViewItems; // Declare ListView
    private String[] fruits = {"Apples", "Bananas", "Blackberries", "Blueberries", "Cherries", // Declare and initialize an array of fruits
                               "Dragon Fruit", "Durian", "Grapes", "Kiwis", "Lemons",
                               "Mangos", "Oranges", "Peach", "Passion Fruit", "Pineapples",
                               "Pomegranate", "Strawberries", "Watermelon"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Set the layout for the activity

        listViewItems = findViewById(R.id.listViewItems); // Initialize the ListView

        Arrays.sort(fruits);

        ArrayAdapter<String> itemAdapter = new ArrayAdapter<>(this, // Create an ArrayAdapter to convert the array of fruits into a list
                android.R.layout.simple_list_item_1, fruits);
        listViewItems.setAdapter(itemAdapter); // Set the ArrayAdapter to the ListView
    } // end of onCreate method
}// end MainActivity Class
