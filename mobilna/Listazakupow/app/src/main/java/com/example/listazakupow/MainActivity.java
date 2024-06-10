package com.example.listazakupow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> items;
    ArrayAdapter<String> itemsAdapter;
    ListView listView;
    Button buttonDodaj;
    EditText editTextElement;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.ZakupylistView);
        buttonDodaj = findViewById(R.id.buttonDodaj);
        editTextElement = findViewById(R.id.editTextElement);

        items = new ArrayList<>();
        items.add("Zakupy: chleb, masło, ser");
        items.add("Do zrobienia: obiad, umyć podłogi");
        items.add("weekend: kino, spacer z psem");

        itemsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(itemsAdapter);

        buttonDodaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String itemText = editTextElement.getText().toString();
                if(!itemText.isEmpty()){
                    itemsAdapter.add(itemText);
                    editTextElement.setText("");
                }
            }
        });
    }
}