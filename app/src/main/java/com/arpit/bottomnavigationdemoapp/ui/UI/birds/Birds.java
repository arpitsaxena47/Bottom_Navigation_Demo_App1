package com.arpit.bottomnavigationdemoapp.ui.UI.birds;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;

import com.arpit.bottomnavigationdemoapp.R;

public class Birds extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_birds);
        Drawable backgroundImage = getResources().getDrawable(R.drawable.bird);
        backgroundImage.setAlpha(40);

        NestedScrollView nestedScrollView = findViewById(R.id.birdsScrollView);
        nestedScrollView.setBackground(backgroundImage);




    }


}
