package edu.uw.ischool.mutiay.biggobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.view.View



class MainActivity : AppCompatActivity() {
    private lateinit var bigGo: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bigGo = findViewById(R.id.bigGobutton)
        bigGo.text = getString(R.string.button_initial_text)

        var clickedTimes = 0
        val clicked: (View) -> Unit = {it: View ->
            clickedTimes++
            if (clickedTimes == 1) {
                (it as Button).text = getString(R.string.button_first__click_text)
            } else {
                (it as Button).text = getString(R.string.button_clicked_text, clickedTimes)
            }
        }

        bigGo.setOnClickListener(clicked)
    }
}