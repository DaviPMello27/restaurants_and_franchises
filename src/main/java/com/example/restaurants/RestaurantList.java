package com.example.restaurants;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.entities.Franchise;
import com.example.entities.Restaurant;
import com.example.list_helper.CardHelper;

public class RestaurantList extends AppCompatActivity {
    private Restaurant[] restaurantList = {};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getSupportActionBar().setTitle(this.getText(R.string.title_restaurantes));
        setContentView(R.layout.activity_restaurant_list);

        final String franchiseName = this.getIntent().getStringExtra("FRANCHISE_NAME");
        for(Franchise franchise: Franchise.sampleFranchises){
            if(franchise.name.equals(franchiseName)){
                restaurantList = franchise.restaurants;
                break;
            }
        }
        this.createRestaurantCards();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        this.getMenuInflater().inflate(R.menu.context_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String title=item.getTitle().toString();
        if(title.contentEquals(this.getText(R.string.voltar))) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

    private void createRestaurantCards(){
        LinearLayout restaurantsLayout = findViewById(R.id.restaurants_layout);
        for(int i = 0; i < this.restaurantList.length; i++){
            LinearLayout card = this.createCardLayout();
            card.setId(i);

            LinearLayout textLayout = new LinearLayout(this);
            textLayout.setOrientation(LinearLayout.VERTICAL);

            textLayout.addView(CardHelper.createCardTitle(this.restaurantList[i].name, textLayout.getContext()));
            textLayout.addView(CardHelper.createCardSubtitle(this.restaurantList[i].city, textLayout.getContext()));
            textLayout.addView(CardHelper.createCardText(this.restaurantList[i].address, textLayout.getContext()));

            ImageView image = this.createCardImage(this.restaurantList[i].image);

            card.addView(image);
            card.addView(textLayout);
            restaurantsLayout.addView(card);
        }
    }

    private LinearLayout createCardLayout(){
        LinearLayout card = new LinearLayout(this);
        card.setLayoutParams(new LinearLayout.LayoutParams(
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