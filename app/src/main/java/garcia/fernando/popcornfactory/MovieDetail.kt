package garcia.fernando.popcornfactory

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MovieDetail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)
        val lblImg : ImageView = findViewById(R.id.imagendetalle)
        val lblTitulo : TextView = findViewById(R.id.titulodetalle)
        val lblDesc : TextView = findViewById(R.id.descndetalle)
        var imagen : Int = intent.getIntExtra("image", R.drawable.popcorn)
        lblImg.setImageResource(imagen)
        var titulo : String = intent.getStringExtra("titulo").toString()
        lblTitulo.setText(titulo)
        var descripcion : String = intent.getStringExtra("sinopsis").toString()
        lblDesc.setText(descripcion)
    }
}