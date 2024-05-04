package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //val cal=findViewById<TextView>(R.id.cal_tv)
        val text=findViewById<TextView>(R.id.text_tv)
        val input1=findViewById<EditText>(R.id.number_et)
        val input2=findViewById<EditText>(R.id.number2_et)
        val display=findViewById<TextView>(R.id.display_tv)
        val btn=findViewById<Button>(R.id.btn)
        val plus=findViewById<RadioButton>(R.id.checkBoxAddition)
        val minus=findViewById<RadioButton>(R.id.checkBoxSubtraction)
        val times=findViewById<RadioButton>(R.id.checkBoxMultiplication)
        val div=findViewById<RadioButton>(R.id.checkBoxDivision)
        var enteredNumber=""
        var enteredNumbers=""
        var dibad1=""
        var dibad2=""
        plus.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                btn.setOnClickListener {
                    dibad1=input1.text.toString()
                    dibad2=input2.text.toString()
                    if (dibad1=="")
                    {
                        text.text="\t\n\t\t\t\t\tPlease Enter the First Number"
                        // text.visibility= View.INVISIBLE
                    }
                    else if (dibad2=="")
                    {
                        text.text="\t\n\t\t\t\t\tPlease Enter the Second Number"

                    }
                    else
                    {
                        //display.text=dibad1+dibad2
                        val result = dibad1.toInt() + dibad2.toInt()
                        display.text = "The Addition BETWEEN $dibad1 and $dibad2 is: $result"
                        //display.text="Isku gayntu way shaqaynaysaa"
                    }

                }
            } else {
                text.text="\t\n\t\t\t\t\t\t\t\t\t\tPlease Check"
            }
        }
        var minus1=""
        var minus2=""
        minus.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                btn.setOnClickListener {
                    minus1=input1.text.toString()
                    minus2=input2.text.toString()
                    if (minus1=="")
                    {
                        text.text="\t\n\t\t\t\t\tPlease Enter the First Number"
                        // text.visibility= View.INVISIBLE
                    }
                    else if (minus2=="")
                    {
                        text.text="\t\n\t\t\t\t\tPlease Enter the Second Number"

                    }
                    else
                    {
                        //display.text="Kala gayntu way shaqaynaysaa"
                        //display.text=minus1-minus2
                        val result = minus1.toInt() - minus2.toInt()
                        display.text = "The Subtraction BETWEEN $minus1 and $minus2 is: $result"
                    }

                }
            } else {
                text.text="\t\n\t\t\t\t\t\t\t\t\t\tPlease Check"
            }
        }
        var times1=""
        var times2=""
        times.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                btn.setOnClickListener {
                    times1=input1.text.toString()
                    times2=input2.text.toString()
                    if (times1=="")
                    {
                        text.text="\t\n\t\t\t\t\tPlease Enter the First Number"
                        // text.visibility= View.INVISIBLE
                    }
                    else if (times2=="")
                    {
                        text.text="\t\n\t\t\t\t\tPlease Enter the Second Number"

                    }
                    else
                    {
                        //display.text=times1*times2
                        //display.text="Isku Dhufasahadu way shaqaynaysaa"
                        val result = times1.toInt() * times2.toInt()
                        display.text = "The Multiplication BETWEEN $times1 and $times2 is: $result"
                    }

                }
            } else {
                text.text="\t\n\t\t\t\t\t\t\t\t\t\tPlease Check"
            }
        }
        var div1=""
        var div2=""
        div.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                btn.setOnClickListener {
                    div1=input1.text.toString()
                    div2=input2.text.toString()
                    if (div1=="")
                    {
                        text.text="\t\n\t\t\t\t\tPlease Enter the First Number"
                        // text.visibility= View.INVISIBLE
                    }
                    else if (div2=="")
                    {
                        text.text="\t\n\t\t\t\t\tPlease Enter the Second Number"

                    }
                    else
                    {
                        //display.text=div1/div1
                        //display.text="Isku Qaybintuna way shaqaynaysaa"
                        val result = div1.toInt() / div2.toInt()
                        if (div2.toInt() == 0) {
                            display.text = "Cannot divide by zero"
                        } else {
                            display.text = "The Division BETWEEN $div1 and $div2 is: $result"
                        }

                    }

                }
            } else {
                text.text="\t\n\t\t\t\t\t\t\t\t\t\tPlease Check"
            }
        }
        btn.setOnClickListener {
            dibad1=input1.text.toString()
            dibad2=input2.text.toString()
            if (dibad1=="")
            {
                text.text="\t\n\t\t\t\t\t\t\t\t\t\tPlease Enter the First Number"
            }
            else if (dibad2=="")
            {
                text.text="\t\n\t\t\t\t\tPlease Enter the Second Number"
            }
            else
            {
                text.text="\t\n\t\t\t\t\t\t\t\t\t\tPlease Choose Operation"
            }

        }


    }
}