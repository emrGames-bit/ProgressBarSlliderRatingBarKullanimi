package com.emrckmk.progressbarslliderratingbarkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import androidx.core.view.isInvisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonBasla.setOnClickListener {
            progressBar.visibility = View.VISIBLE

        }
        buttonDur.setOnClickListener {
            progressBar.visibility = View.INVISIBLE
        }

        slider.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                textView.text = "Sonuc : $progress"
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {


            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }
        })

        buttonGoster.setOnClickListener {
            val gelenIlerleme = slider.progress
            val gelenOylama = ratingBar.rating

            textView.text ="Şu anki genel durum; Sliderİlerlemesi:$gelenIlerleme, Oylama:$gelenOylama"

        }

    }
}