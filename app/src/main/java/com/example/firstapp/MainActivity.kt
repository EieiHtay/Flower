package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtNumOne=findViewById<EditText>(R.id.edt_num_one)
        val edtNumTwo=findViewById<EditText>(R.id.edt_num_two)

        val btnSum:Button=findViewById(R.id.btn_sum)
        val btnSub:Button=findViewById(R.id.btn_sub)
        val btnMul:Button=findViewById(R.id.btn_mul)
        val btnDiv:Button=findViewById(R.id.btn_div)

        val txtResult=findViewById<TextView>(R.id.txt_result)

        btnSum.setOnClickListener{
            var numOne:Int=edtNumOne.text.toString().toInt()
            var numTwo:Int=edtNumTwo.text.toString().toInt()
            var result=numOne+numTwo
            txtResult.text=result.toString()
        }
        btnSub.setOnClickListener{
            var numOne:Int=edtNumOne.text.toString().toInt()
            var numTwo:Int=edtNumTwo.text.toString().toInt()
            var result=numOne-numTwo
            txtResult.text=result.toString()
        }
        btnMul.setOnClickListener{
            var numOne:Int=edtNumOne.text.toString().toInt()
            var numTwo:Int=edtNumTwo.text.toString().toInt()
            var result=numOne*numTwo
            txtResult.text=result.toString()
        }
        btnDiv.setOnClickListener{
            var numOne:Int=edtNumOne.text.toString().toInt()
            var numTwo:Int=edtNumTwo.text.toString().toInt()
            var result=numOne/numTwo
            txtResult.text=result.toString()
        }
    }
}
