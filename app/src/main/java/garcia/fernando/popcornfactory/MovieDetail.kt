package garcia.fernando.popcornfactory

import android.content.Intent
import android.os.Bundle
import android.widget.Button
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

        val bundle = intent.extras
        var ns = 0;
        var id = -1;
        var title = "";


        val lblImg : ImageView = findViewById(R.id.imagendetalle)
        val lblTitulo : TextView = findViewById(R.id.titulodetalle)
        val lblDesc : TextView = findViewById(R.id.descndetalle)
        val lblS : TextView = findViewById(R.id.seatsleft)
        val btnBuy : Button = findViewById(R.id.buyTickets)

        if (bundle != null){
            ns = bundle.getInt("nS")
            title = bundle.getString("titulo")!!
            lblImg.setImageResource(bundle.getInt("header"))
            lblTitulo.setText(title)
            lblDesc.setText(bundle.getString("sinopsis"))
            lblS.setText("$ns seats available")
            id = bundle.getInt("pos")
        }

        if (ns == 0){
            btnBuy.isActivated = false
        }else{
            btnBuy.isActivated = true
            btnBuy.setOnClickListener{
                val intent : Intent = Intent(this, SeatSelection::class.java)
                intent.putExtra("id", id)
                intent.putExtra("name", title)
                this.startActivity(intent)
            }
        }
    }
}