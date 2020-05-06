package com.gmail.recipenow;

import android.content.DialogInterface;
import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Dashboard extends AppCompatActivity {

    private Button Bttn_foodfeed;
    private Button Bttn_favorites;
    private Button Bttn_scan;

    private int CAMERA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.all_recipes_img);

        Bttn_foodfeed = (Button) findViewById(R.id.Btn_foodfeed);
        Bttn_foodfeed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFoodFeed();
            }
        });

        Bttn_favorites = (Button) findViewById(R.id.Btn_favorites);
        Bttn_favorites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFavorites();
            }
        });

        Bttn_scan = (Button) findViewById(R.id.Btn_scan);
        Bttn_scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                takePhotoFromCamera();
                // create a method to mask
                //Bitmap finalMasking = MaskingProcess();
            }
        });

            }
    public void openFoodFeed(){
        Intent intent = new Intent(this, food_feed.class);
        startActivity(intent);
    }
    public void openFavorites(){
        Intent intent = new Intent(this, favorites.class);
        startActivity(intent);
    }

    private void takePhotoFromCamera(){
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, CAMERA);
    }

}
