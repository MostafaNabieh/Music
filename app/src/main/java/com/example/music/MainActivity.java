package com.example.music;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private SoundPool soundPool;
    private int soundc;
    private int soundd;
    private int sounde;
    private int soundf;
    private int soundg;
    private int sounda;
    private int soundb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Configure();

    }

    private void Configure() {
        soundPool= new SoundPool(10, AudioManager.STREAM_MUSIC,0);
        soundc=soundPool.load(getApplicationContext(),R.raw.note1_c,1);
        soundd=soundPool.load(getApplicationContext(),R.raw.note2_d,1);
        sounde=soundPool.load(getApplicationContext(),R.raw.note3_e,1);
        soundf=soundPool.load(getApplicationContext(),R.raw.note4_f,1);
        soundg=soundPool.load(getApplicationContext(),R.raw.note5_g,1);
        sounda=soundPool.load(getApplicationContext(),R.raw.note6_a,1);
        soundb=soundPool.load(getApplicationContext(),R.raw.note7_b,1);
    }


    public void c_key(View view) {
        soundPool.play(soundc,1.0f,1.0f,0,0,1.0f);
    }

    public void d_key(View view) {
        soundPool.play(soundd,1.0f,1.0f,0,0,1.0f);
    }

    public void e_keu(View view) {
        soundPool.play(sounde,1.0f,1.0f,0,0,1.0f);
    }

    public void f_key(View view) {
        soundPool.play(soundf,1.0f,1.0f,0,0,1.0f);
    }

    public void g_key(View view) {
        soundPool.play(soundg,1.0f,1.0f,0,0,1.0f);
    }


    public void a_key(View view) {
        soundPool.play(sounda,1.0f,1.0f,0,0,1.0f);
    }

    public void b_key(View view) {
        soundPool.play(soundb,1.0f,1.0f,0,0,1.0f);
    }
}
