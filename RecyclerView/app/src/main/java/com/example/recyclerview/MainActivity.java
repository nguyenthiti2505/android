package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView number_recycle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number_recycle=findViewById(R.id.reycle_number);
        number_recycle.setLayoutManager(new LinearLayoutManager(this));
        NumberAdapter adapter = new NumberAdapter();
        number_recycle.setAdapter(adapter);

        final List<String> data = new ArrayList<>();
        for(int i=0; i<=100;i++){
            data.add(""+i);
        }
        final NumberAdapter adapter1= new NumberAdapter();
        adapter.data=data;
        number_recycle.setAdapter(adapter);

        findViewById(R.id.btn_add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data.add("Hoc sinh moi");
                adapter1.notifyDataSetChanged();
            }
        });
    }
}
