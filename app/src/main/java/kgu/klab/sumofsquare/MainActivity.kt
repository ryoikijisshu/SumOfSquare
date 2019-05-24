package kgu.klab.sumofsquare

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Math.pow

class MainActivity : AppCompatActivity() {

    val sampleA = arrayOf(3,4,4,5,5,5,5,6,6,7)
    val sampleB = arrayListOf(1,2,4,4,5,5,5,6,8,10)
    var sumA = 0
    var sumB = 0
    var i=0
    var averageA : Double = 0.0
    var averageB : Double = 0.0
    var sumofsquareA : Double = 0.0
    var sumofsquareB : Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        for(i in 0..9){

            sumA += sampleA[i]
            sumB += sampleB[i]

        }

        averageA = (sumA/10).toDouble()
        averageB = (sumB/10).toDouble()

        for(i in 0..9){

            sumofsquareA += pow(sampleA[i] - averageA, 2.0)
            sumofsquareB += pow(sampleB[i] - averageB, 2.0)

        }

        sumofsquareA_result.text = "標本Aの平方和"+sumofsquareA.toString()
        sumofsquareB_result.text = "標本Bの平方和"+sumofsquareB.toString()


        println("Aの平方和："+ sumofsquareA)
        println("Bの平方和："+ sumofsquareB)

    }
}
