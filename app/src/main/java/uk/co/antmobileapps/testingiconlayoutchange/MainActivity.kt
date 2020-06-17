package uk.co.antmobileapps.testingiconlayoutchange

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var blueNumber = findViewById<Button>(R.id.btnBlue_1)
        blueNumber.setOnClickListener {
            blueNumber.layoutParams.width = 0
            blueNumber.text = "T"
        }

    }
}