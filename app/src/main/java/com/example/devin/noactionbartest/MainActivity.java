package com.example.devin.noactionbartest;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);

        toolbar.setTitleTextColor(Color.parseColor("#ffff33"));
        toolbar.setSubtitle(R.string.subtitle);
        toolbar.setNavigationIcon(R.mipmap.ic_launcher);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.crop_image_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.crop_image_menu_crop) {
            Toast.makeText(this, "크랍 버튼", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (item.getItemId() == R.id.crop_image_menu_rotate_left) {
            Toast.makeText(this, "좌측 회전 버튼", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (item.getItemId() == R.id.crop_image_menu_rotate_right) {
            Toast.makeText(this, "우측 회전 버튼", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (item.getItemId() == R.id.crop_image_menu_flip_horizontally) {
            Toast.makeText(this, "플립 호리즌털 버튼", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (item.getItemId() == R.id.crop_image_menu_flip_vertically) {
            Toast.makeText(this, "플립 버티컬 버튼", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (item.getItemId() == R.id.home) {
            Toast.makeText(this, "홈 버튼", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
