package sv.edu.ufg.fis.amb.practica3_sa100821

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

        private lateinit var btnEjecutar:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnEjecutar=findViewById(R.id.btn_disparador)


        btnEjecutar.setOnClickListener {

        val intent = Intent (this, Activitysecundaria::class.java )
        startActivity(intent)}
    }
}