package br.edu.fatecpg.appsoma

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // SETANDO ELEMENTOS
        val edtNum1 = findViewById<EditText>(R.id.edt_num1)
        val edtNum2 = findViewById<EditText>(R.id.edt_num2)
        val textResultado = findViewById<TextView>(R.id.txt_resultado)
        val btnCalc = findViewById<Button>(R.id.btn_calc)
        val btnCalc2 = findViewById<Button>(R.id.btn_calc2)
        val btnCalc3 = findViewById<Button>(R.id.btn_calc3)
        val btnCalc4 = findViewById<Button>(R.id.btn_calc4)

        btnCalc.setOnClickListener {
            val valor1 = edtNum1.text.toString().toInt()
            val valor2 = edtNum2.text.toString().toInt()
            val resultado = valor1 + valor2
            textResultado.text = "O resultado é: $resultado"
        }
        btnCalc2.setOnClickListener {
            val valor1 = edtNum1.text.toString().toInt()
            val valor2 = edtNum2.text.toString().toInt()
            val resultado = valor1 - valor2
            textResultado.text = "O resultado é: $resultado"
        }
        btnCalc3.setOnClickListener {
            val valor1 = edtNum1.text.toString().toInt()
            val valor2 = edtNum2.text.toString().toInt()
            val resultado = valor1 * valor2
            textResultado.text = "O resultado é: $resultado"
        }
        btnCalc4.setOnClickListener {
            val valor1 = edtNum1.text.toString().toInt()
            val valor2 = edtNum2.text.toString().toInt()
            val resultado = valor1 / valor2
            textResultado.text = "O resultado é: $resultado"
        }
    }
}