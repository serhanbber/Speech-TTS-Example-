package com.ornek.newaf.speech;

import java.util.Locale;

import android.app.Activity;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends Activity  {

    TextToSpeech ttobj;
    EditText editText;
    ImageView en, ge, fr, it, ch, jp, tr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.editText);
        en = (ImageView)findViewById(R.id.imageView);
        ge = (ImageView)findViewById(R.id.imageView2);
        fr = (ImageView)findViewById(R.id.imageView3);
        it = (ImageView)findViewById(R.id.imageView4);
        ch = (ImageView)findViewById(R.id.imageView5);
        jp = (ImageView)findViewById(R.id.imageView6);
        tr = (ImageView)findViewById(R.id.imageView7);

        ttobj=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        if(status != TextToSpeech.ERROR){
                        }
                    }
                });

        en.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ttobj.setLanguage(Locale.UK);
                String toSpeak = editText.getText().toString();
                ttobj.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        ge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ttobj.setLanguage(Locale.GERMANY);
                String toSpeak = editText.getText().toString();
                ttobj.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        fr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ttobj.setLanguage(Locale.FRENCH);
                String toSpeak = editText.getText().toString();
                ttobj.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        it.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ttobj.setLanguage(Locale.ITALIAN);
                String toSpeak = editText.getText().toString();
                ttobj.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        ch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ttobj.setLanguage(Locale.CHINESE);
                String toSpeak = editText.getText().toString();
                ttobj.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        jp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ttobj.setLanguage(Locale.JAPANESE);
                String toSpeak = editText.getText().toString();
                ttobj.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        tr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ttobj.setLanguage(new Locale("tr-TR"));
                String toSpeak = editText.getText().toString();
                ttobj.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });
    }
}