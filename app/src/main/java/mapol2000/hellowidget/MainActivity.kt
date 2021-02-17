package mapol2000.hellowidget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {

    lateinit var toggleButton: ToggleButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        if (toggleButton.isActivated) {
//            toggleButton.text = "코드로 시험중"
//        }

    }
}