package com.example.bitamirshafiee.bmiskeletonproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calculate(view: View){
        val weight :Double
        val height :Double
        var myBmi: Float

        weight = weight_text_view?.text.toString().toDouble()
        height = height_text_view?.text.toString().toDouble()
        myBmi = calculateBMI(weight,height)

        if(myBmi<18.5){
            image_view.setImageResource(R.drawable.underweight)
            bmi_text_view.text="Under Weight"
        }
        else if(myBmi>18.5 && myBmi<24.9){
            image_view.setImageResource(R.drawable.healthy)
            bmi_text_view.text="Healthy"
        }
        else if(myBmi>24.5 && myBmi<29.9){
            image_view.setImageResource(R.drawable.overweight)
            bmi_text_view.text="Over Weight"
        }
        else{
            image_view.setImageResource(R.drawable.obesity)
            bmi_text_view.text="Obese"
        }
    }

    fun calculateBMI(weight: Double, height: Double): Float{
        var BMI: Float
        BMI = (weight/(height)*(height)).toFloat()
        return BMI
    }
}
