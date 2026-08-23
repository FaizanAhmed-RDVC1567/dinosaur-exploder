package com.jvondermarck.dinosaurexploder

//import android.os.Bundle
//import androidx.activity.enableEdgeToEdge
//import androidx.appcompat.app.AppCompatActivity
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat
import com.almasb.fxgl.app.GameApplication
import com.almasb.fxgl.app.GameSettings

//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_main)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
//    }
//}
class MainActivity : GameApplication() {
    override fun initSettings(settings: GameSettings?) {
        settings?.width = 800
        settings?.height = 600
        settings?.title = "Dinosaur Exploder"
    }
}