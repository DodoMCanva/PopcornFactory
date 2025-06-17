package garcia.fernando.popcornfactory

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Ticket : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ticket)
        val txtNombre : TextView = findViewById(R.id.lblUsuarioTicket)
        val txtId : TextView = findViewById(R.id.lblIDTicket)
        val txtCosto : TextView = findViewById(R.id.lblCostoTicket)
        val txtPelicula : TextView = findViewById(R.id.lblPeliculaTicket)
        val bundle = intent.extras
        if (bundle != null) {
            txtPelicula.setText(bundle.getString("pelicula"))
            txtNombre.setText(bundle.getString("sesion"))
            txtId.setText(bundle.getString("id"))
            txtCosto.setText(bundle.getString("precio"))
        }
    }
}