package com.example.gpa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    button.setOnClickListener {
        var credit1 = credit11.text.toString()
        var credit2 = credit22.text.toString()
        var credit3 = credit33.text.toString()
        var credit4 = credit44.text.toString()
        var credit5 = credit55.text.toString()
        var point1 = point11.text.toString()
        var point2 = point22.text.toString()
        var point3 = point33.text.toString()
        var point4 = point44.text.toString()
        var point5 = point55.text.toString()
        if (credit1.isEmpty() || credit2.isEmpty() || credit3.isEmpty() || credit4.isEmpty() || credit5.isEmpty())
            return@setOnClickListener Toast.makeText(this@MainActivity,"Pleae Input text",Toast.LENGTH_SHORT).show()

        if (point1.isEmpty() || point2.isEmpty() || point3.isEmpty() || point4.isEmpty() || point5.isEmpty())
            return@setOnClickListener Toast.makeText(this@MainActivity,"Pleae Input text",Toast.LENGTH_SHORT).show()

        if (sub11.text.isEmpty() || sub22.text.isEmpty() || sub33.text.isEmpty() || sub44.text.isEmpty() || sub55.text.isEmpty())
            return@setOnClickListener Toast.makeText(this@MainActivity,"Pleae Input text",Toast.LENGTH_SHORT).show()

        var total = credit1.toInt()+credit2.toInt()+credit3.toInt()+credit4.toInt()+credit5.toInt()
        totals.text = total.toString()
        var sum = 0.0
        sum += (credit1.toDouble()*point1.toDouble())
        sum += (credit2.toDouble()*point2.toDouble())
        sum += (credit3.toDouble()*point3.toDouble())
        sum += (credit4.toDouble()*point4.toDouble())
        sum += (credit5.toDouble()*point5.toDouble())
        textView8.text = String.format("%.2f",sum/total)
    }
        button2.setOnClickListener {
            credit11.text.clear()
            credit22.text.clear()
            credit33.text.clear()
            credit44.text.clear()
            credit55.text.clear()
            point11.text.clear()
            point22.text.clear()
            point33.text.clear()
            point44.text.clear()
            point55.text.clear()
            sub11.text.clear()
            sub22.text.clear()
            sub33.text.clear()
            sub44.text.clear()
            sub55.text.clear()
        }
    }
}