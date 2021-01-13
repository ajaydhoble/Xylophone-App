package com.ajayd.xylophone;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // TODO: Add member variables here
    private SoundPool soundPool;
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Create a new SoundPool
        // Helpful Constants
        int NR_OF_SIMULTANEOUS_SOUNDS = 7;
        soundPool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC,0);

        // TODO: Load and get the IDs to identify the sounds
        mCSoundId = soundPool.load(getApplicationContext(),R.raw.note1_c,1);
        mDSoundId = soundPool.load(getApplicationContext(),R.raw.note2_d,1);
        mESoundId = soundPool.load(getApplicationContext(),R.raw.note3_e,1);
        mFSoundId = soundPool.load(getApplicationContext(),R.raw.note4_f,1);
        mGSoundId = soundPool.load(getApplicationContext(),R.raw.note5_g,1);
        mASoundId = soundPool.load(getApplicationContext(),R.raw.note6_a,1);
        mBSoundId = soundPool.load(getApplicationContext(),R.raw.note7_b,1);

    }

    public void playC(View view) {
        soundPool.play(mCSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }

    public void playD(View view) {
        soundPool.play(mDSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }

    public void playE(View view) {
        soundPool.play(mESoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }

    public void playF(View view) {
        soundPool.play(mFSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }

    public void playG(View view) {
        soundPool.play(mGSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }

    public void playA(View view) {
        soundPool.play(mASoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }

    public void playB(View view) {
        soundPool.play(mBSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
}