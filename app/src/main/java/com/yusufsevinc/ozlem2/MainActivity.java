package com.yusufsevinc.ozlem2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static ImageView imageview;
    private static Button button;
    private static TextView textView;

    private int current_image,current_text;
    int [] images = {R.drawable.bakara255,R.drawable.bakara285,R.drawable.bakara286,R.drawable.fussilet44,R.drawable.isra82,R.drawable.nahl69,R.drawable.suara80,R.drawable.tevbe14,R.drawable.yunus57};
    String [] texts = {"Bakara 255.Ayet" , "Bakara 285. Ayet","Bakara 286. Ayet","Fussilet 44.Ayet" , "İsra 82.Ayet", "Nahl 69.Ayet","Suara 80.Ayet","Tevbe 14.Ayet","Yunus 57.Ayet"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonclick();
    }
    public void buttonclick() {


        imageview = (ImageView)findViewById(R.id.imageView);
        button = (Button)findViewById(R.id.button);
        textView = (TextView)findViewById(R.id.textView);

        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        current_text++;
                        current_image++;
                        current_image = current_image % images.length;
                        current_text = current_text % texts.length;
                        imageview.setImageResource(images[current_image]);
                        textView.setText(texts[current_text]);

                    }
                }
        );


    }
}