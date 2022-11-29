package com.raj1.ex3;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {

    TextView name,sur;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.name);
        sur=findViewById(R.id.sur);
        btn=findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String Name=name.getText().toString();
                String surname=sur.getText().toString();

                Intent intent=new Intent(MainActivity.this,second.class);

                intent.putExtra("name",Name);
                intent.putExtra("surname",surname);

                startActivity(intent);

            }
        });
    }
}