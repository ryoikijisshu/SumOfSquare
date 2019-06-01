package kgu.klab.sumofsquare

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Math.pow

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        val sampleA = arrayOf(3,4,4,5,5,5,5,6,6,7)
        val sampleB = arrayOf(1,2,4,4,5,5,5,6,8,10)
        var sumofsquareA : Double
        var sumofsquareB : Double

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sumofsquareA = sumofsquare(sampleA)
        sumofsquareB = sumofsquare(sampleB)

        sumofsquareA_result.text = "標本Aの平方和:"+sumofsquareA
        sumofsquareB_result.text = "標本Bの平方和:"+sumofsquareB

    }

    fun sumofsquare(sample:Array<Int>):Double{

        var result = 0.0
        var sum  = 0.0
        val average : Double

        for(i in 0..9){

            sum += sample[i]
        }

        average = sum/10

        for(i in 0..9){

           result += pow(sample[i] - average, 2.0)

        }

        return result

    }
}