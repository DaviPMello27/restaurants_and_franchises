package com.example.restaurants;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

import com.example.entities.Franchise;
import com.example.list_helper.CardHelper;

public class MainActivity extends AppCompatActivity {
    private Franchise[] franchiseList = Franchise.sampleFranchises;

    @Nullable
    @Override
    public View onCreateView(@NonNull String name, @NonNull Context context, @NonNull AttributeSet attrs) {
        return super.onCreateView(name, context, attrs);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getSupportActionBar().setTitle(this.getText(R.string.title_franchises));
        setContentView(R.layout.activity_main);
        this.createFranchiseCards();
    }



    private void createFranchiseCards(){
        setSearchFieldListeners();
        LinearLayout mainLayout = findViewById(R.id.main_layout);

        for(int i = 0; i < this.franchiseList.length; i++){
            LinearLayout card = this.createCardLayout();
            card.setId(i);

            LinearLayout textLayout = new LinearLayout(this);
            textLayout.setOrientation(LinearLayout.VERTICAL);

            textLayout.addView(CardHelper.createCardTitle(this.franchiseList[i].name, textLayout.getContext()));
            textLayout.addView(CardHelper.createCardText(this.franchiseList[i].description, textLayout.getContext()));

            ImageView image = this.createCardImage(this.franchiseList[i].image);
            int onClickI = i;
            image.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, RestaurantList.class);
                    intent.putExtra("FRANCHISE_NAME", franchiseList[onClickI].name);
                    startActivity(intent);
                }
            });
            card.addView(image);
            card.addView(textLayout);
            mainLayout.addView(card);
        }
    }

    private void filterList(String text){
        for(int i = 0; i < franchiseList.length; i++){
            if(franchiseList[i].name.toLowerCase().contains(text) || franchiseList[i].description.toLowerCase().contains(text)){
                this.findViewById(i).setVisibility(View.VISIBLE);
            } else {
                this.findViewById(i).setVisibility(View.GONE);
            }
        }
    }

    private void setSearchFieldListeners(){
        ((EditText)this.findViewById(R.id.search_field))
            .addTextChangedListener(
                new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {}

                    @Override
                    public void afterTextChanged(Editable s) {
                        filterList(s.toString().toLowerCase());
                    }
                 }
            );
    }

    private LinearLayout createCardLayout(){
        LinearLayout card = new LinearLayout(this);
        card.setLayoutParams(new LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        ));
        card.setOrientation(LinearLayout.HORIZONTAL);
        card.setPadding(30, 20, 30, 20);
        return card;
    }

    private ImageView createCardImage(int drawableId){
        ImageView image = new ImageView(this);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            image.setImageDrawable(this.getDrawable(drawableId));
        }
        image.setPadding(0, 0, 30, 0);
        return image;
    }
}