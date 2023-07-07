package com.example.drumpad

import android.media.AudioAttributes
import android.media.AudioManager
import android.media.SoundPool
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    private var sp: SoundPool? = null
    private var sound1: Int = 0
    private var sound2: Int = 0
    private var sound3: Int = 0
    private var sound4: Int = 0
    private var sound5: Int = 0
    private var sound6: Int = 0
    private var sound7: Int = 0
    private var sound8: Int = 0
    private var sound9: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sp = SoundPool.Builder()
            .setMaxStreams(2)
            .setAudioAttributes(
                AudioAttributes.Builder()
                    .setLegacyStreamType(AudioManager.STREAM_MUSIC)
                    .build()
            )
            .build()

        sound1 = sp?.load(applicationContext, R.raw.sound1, 1) ?: 0
        sound2 = sp?.load(applicationContext, R.raw.sound2, 1) ?: 0
        sound3 = sp?.load(applicationContext, R.raw.sound3, 1) ?: 0
        sound4 = sp?.load(applicationContext, R.raw.sound4, 1) ?: 0
        sound5 = sp?.load(applicationContext, R.raw.sound5, 1) ?: 0
        sound6 = sp?.load(applicationContext, R.raw.sound6, 1) ?: 0
        sound7 = sp?.load(applicationContext, R.raw.sound7, 1) ?: 0
        sound8 = sp?.load(applicationContext, R.raw.sound8, 1) ?: 0
        sound9 = sp?.load(applicationContext, R.raw.sound9, 1) ?: 0

}

    fun sound1 (view :View){
        sp?.play(sound1, 1.0f, 1.0f, 1, 0, 1.0f)

    }
    fun sound2 (view :View){
        sp?.play(sound2, 1.0f, 1.0f, 1, 0, 1.0f)

    }
    fun sound3 (view :View){
        sp?.play(sound3, 1.0f, 1.0f, 1, 0, 1.0f)

    }
    fun sound4 (view :View){
        sp?.play(sound4, 1.0f, 1.0f, 1, 0, 1.0f)

    }
    fun sound5 (view :View){
        sp?.play(sound5, 1.0f, 1.0f, 1, 0, 1.0f)

    }
    fun sound6 (view :View){
        sp?.play(sound6, 1.0f, 1.0f, 1, 0, 1.0f)

    }
    fun sound7 (view :View){
        sp?.play(sound7, 1.0f, 1.0f, 1, 0, 1.0f)

    }
    fun sound8 (view :View){
        sp?.play(sound8, 1.0f, 1.0f, 1, 0, 1.0f)

    }
    fun sound9 (view :View){
        sp?.play(sound9, 1.0f, 1.0f, 1, 0, 1.0f)

    }

}