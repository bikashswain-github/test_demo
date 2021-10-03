package com.example.viewmodelexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private Button btn;
private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyViewModel model = new ViewModelProvider(this).get(MyViewModel.class);
        btn=findViewById(R.id.button);
        textView=findViewById(R.id.textView);
        textView.setText(""+model.count);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                model.getCount();
                textView.setText(""+model.count);
            }
        });

    }
}