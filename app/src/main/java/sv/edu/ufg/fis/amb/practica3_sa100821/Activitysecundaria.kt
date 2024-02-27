package sv.edu.ufg.fis.amb.practica3_sa100821

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button

class Activitysecundaria : AppCompatActivity() {


    private lateinit var botonAtras:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activitysecundaria)

        botonAtras=findViewById(R.id.btn_volver)


        botonAtras.setOnClickListener {

            finish()}
    }
}