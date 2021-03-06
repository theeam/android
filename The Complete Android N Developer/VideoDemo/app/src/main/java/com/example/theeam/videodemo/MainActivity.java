package com.example.theeam.videodemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView vv = (VideoView) findViewById(R.id.videoView);
        vv.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.saruman);


        MediaController mc = new MediaController(this);

        mc.setAnchorView(vv);

        vv.setMediaController(mc);

        vv.start();
    }
}
