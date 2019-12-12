package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.InputStream;

public class Main2Activity extends AppCompatActivity {

Button btn;
ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn=findViewById(R.id.back);
        image = (ImageView)findViewById(R.id.image);

        image.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent=new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(intent,1);
            }
        });

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Main2Activity.this,MainActivity.class);

                startActivity(intent);
            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
    if(requestCode==1){
        if(resultCode==RESULT_OK){
            try{
                InputStream in = getContentResolver().openInputStream(data.getData());
                Bitmap img= BitmapFactory.decodeStream(in);
                in.close();
                image.setImageBitmap(img);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
     }
    }
}
