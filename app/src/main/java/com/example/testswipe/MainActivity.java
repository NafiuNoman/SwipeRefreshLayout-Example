package com.example.testswipe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.testswipe.R.drawable.ic_butterfly;
import static com.example.testswipe.R.drawable.ic_frog;
import static com.example.testswipe.R.drawable.ic_insect;
import static com.example.testswipe.R.drawable.ic_monkey;
import static com.example.testswipe.R.drawable.ic_spider;
import static com.example.testswipe.R.drawable.ic_turtle;

public class MainActivity extends AppCompatActivity {

    SwipeRefreshLayout swipeRefreshLayout;
    ImageView imageView;
    int i=0;
    int [] image={R.drawable.ic_bee, R.drawable.ic_butterfly,ic_frog,ic_insect,ic_monkey,ic_turtle,ic_spider};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        swipeRefreshLayout = findViewById(R.id.swipeId);


        imageView = findViewById(R.id.ImageId);



        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {



                    imageView.setImageResource(image[i]);

                    i++;
                    swipeRefreshLayout.setRefreshing(false);
                if(i==image.length)
                {
                    i=0;
                }

            }


        });


    }

//    public void doSomething(View view) {
//
//
//        imageView.setImageResource(image[1]);
//    }
}