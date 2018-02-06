package com.example.shining.p003_voiceplayer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.shining.p003_voiceplayer.voiceutils.voicemanage.MediaManager;
import com.example.shining.p003_voiceplayer.voiceutils.widgets.VoiceWiget;


/**
 * Created by shining on 2017/11/15.
 */

public class DemoActivityVoice extends AppCompatActivity {


    private VoiceWiget fl1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_voice);
        fl1 = (VoiceWiget)findViewById(R.id.fl1);

        fl1.setup("/storage/emulated/0/geek_recorder_audios/c3c0912b-2f28-48c1-bc97-f9bc5abd103e.amr");
    }

    @Override
    protected void onPause() {
        MediaManager.pause();
        super.onPause();

    }

    @Override
    protected void onResume() {
        MediaManager.resume();
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        MediaManager.release();
        super.onDestroy();
    }

}
