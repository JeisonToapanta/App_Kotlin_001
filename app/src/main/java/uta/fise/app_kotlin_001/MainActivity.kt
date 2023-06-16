package uta.fise.app_kotlin_001

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import uta.fise.app_kotlin_001.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //YA NO VA ASI EL CONTENTVIEW
        //setContentView(R.layout.activity_main)
        //AHORA VA ASI
        val binding = ActivityMainBinding.inflate(layoutInflater)  //Estoy apuntando a la raiz del layout o activity padre
        setContentView(binding.root)  //ESTO TOCA HACER PARA CADA FORMULARIO PARA REFERENCIAR

        //val editeTextNumberOne = findViewById<EditText>(R.id.editTextNumberOne);
        //val editTextNumberOne = binding.editTextNumberOne

        //val editeTextNumberTwo = findViewById<EditText>(R.id.editTextNumberTwo);
        //val editTextNumberTwo = binding.editTextNumberTwo

        //val editeTextResult = findViewById<EditText>(R.id.editTextResult);
        //val editTextResult = binding.editTextResult

        //val buttonAdd = findViewById<Button>(R.id.buttonAdd)
        //val buttonAdd = binding.buttonAdd

        binding.buttonAdd.setOnClickListener{
            //val a = editeTextNumberOne.text.toString().toInt()
            val a = binding.editTextNumberOne.text.toString().toInt()
            //val b = editeTextNumberTwo.text.toString().toInt()
            val b = binding.editTextNumberTwo.text.toString().toInt()
            val add = a + b

            binding.editTextResult.setText(add.toString())
        }

    }
}