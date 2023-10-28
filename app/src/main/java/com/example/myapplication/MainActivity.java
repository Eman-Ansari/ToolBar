package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        androidx.appcompat.widget.Toolbar toolbar=findViewById(R.id.toolbaR);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId=item.getItemId();
        if(itemId==R.id.profile){
            Toast.makeText(this,"Profile",Toast.LENGTH_SHORT).show();
        }
        else if(itemId==R.id.contact){
            Toast.makeText(this,"Contact",Toast.LENGTH_SHORT).show();
        }
        else if(itemId==R.id.search){
            Toast.makeText(this,"Search",Toast.LENGTH_SHORT).show();
        }

        return true;
    }
}