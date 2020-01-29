package com.jkapps.optionsmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                toastMessage("Menu 1 clicked");
                return true;
            case R.id.item2:
                toastMessage("Menu 2 clicked");
                return true;
            case R.id.item3:
                toastMessage("Menu 3 clicked");
                return true;
            case R.id.subitem1:
                toastMessage("Menu 3-1 clicked");
                return true;
            case R.id.subitem2:
                toastMessage("Menu 3-2 clicked");
                return true;
            case R.id.item4:
                toastMessage("Menu 4 clicked");
                return true;
            case R.id.item5:
                toastMessage("Menu 5 clicked");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void toastMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
