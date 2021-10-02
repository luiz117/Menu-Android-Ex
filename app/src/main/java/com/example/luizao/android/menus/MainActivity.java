package com.example.luizao.android.menus;

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
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main  ,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.itemSave:
                Toast.makeText(MainActivity.this,"Item Salvar",
                        Toast.LENGTH_SHORT).show();
                break;

            case R.id.itemEdit:
                Toast.makeText(MainActivity.this,"Item Editar",
                        Toast.LENGTH_SHORT).show();
                break;

            case R.id.itemConfig:
                Toast.makeText(MainActivity.this,"Item Configurações",
                        Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}