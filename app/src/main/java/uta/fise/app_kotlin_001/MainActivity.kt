package uta.fise.app_kotlin_001

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editeTextNumberOne = findViewById<EditText>(R.id.editTextNumberOne);
        val editeTextNumberTwo = findViewById<EditText>(R.id.editTextNumberTwo);

        val editeTextResult = findViewById<EditText>(R.id.editTextResult);
        val buttonAdd = findViewById<Button>(R.id.buttonAdd)

        buttonAdd.setOnClickListener{
            val a = editeTextNumberOne.text.toString().toInt()
            val b = editeTextNumberTwo.text.toString().toInt()

            val add = a + b

            editeTextResult.setText(add.toString())
        }


    }
}