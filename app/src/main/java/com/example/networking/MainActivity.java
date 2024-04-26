package com.example.networking;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;

@SuppressWarnings("FieldCanBeLocal")
public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {

    private final String JSON_URL = "HTTPS_URL_TO_JSON_DATA_CHANGE_THIS_URL";
    private final String JSON_FILE = "mountains.json";

    private ArrayList<Mountain> mountainArrayList=new ArrayList<>();

    ArrayList<RecyclerViewItem> RecyclerViewItem = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new JsonFile(this, this).execute(JSON_FILE);

        mountainArrayList.add(new Mountain("Matterhorn","Alps",4478));
        mountainArrayList.add(new Mountain("Mont Blanc","Alps",4808));
        mountainArrayList.add(new Mountain("Denali","Alaska",6190));
    }

    RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, RecyclerViewItem, new RecyclerViewAdapter.OnClickListener() {
        @Override
        public void onClick(RecyclerViewItem item) {
            Toast.makeText(MainActivity.this, item.getTitle(), Toast.LENGTH_SHORT).show();
        }
    });

    @Override
    public void onPostExecute(String json) {
        Log.d("MainActivity", json);
    }

}
