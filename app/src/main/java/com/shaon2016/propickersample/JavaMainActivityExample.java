package com.shaon2016.propickersample;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.shaon2016.propicker.pro_image_picker.ProPicker;

import java.util.Objects;

public class JavaMainActivityExample extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        findViewById(R.id.btnChooser).setOnClickListener(v -> ProPicker.with(this).start((integer, intent) -> {

            ImageView iv = findViewById(R.id.iv);
            iv.setImageURI(Objects.requireNonNull(ProPicker.getPickerData(intent)).getUri());
            return null;
        }));


        /*ProPicker.with(this)
                .compressImage()
                .cameraOnly()
                .start((integer, intent) -> {

                    ImageView iv = findViewById(R.id.iv);
                    iv.setImageURI(ProPicker.getPickerData(intent).getUri());
                    return null;
                });*/
    }


}