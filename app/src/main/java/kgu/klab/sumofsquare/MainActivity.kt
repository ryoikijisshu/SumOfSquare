package kgu.klab.sumofsquare

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data: IntArray = intArrayOf(3,4,4,5,5,5,5,6,6,7)
        determineSS(data)
    }

    fun determineSS(listNum: IntArray){

        var deviation :Double =0.0
        var sum : Int =0
        var mean : Double
        var sumOfSquares : Double =0.0
        for(item in listNum){
            sum +=item
        }
        mean = sum.toDouble()/listNum.size

        for(item in listNum){
            deviation = mean - item
            sumOfSquares += deviation * deviation
        }

        System.out.println("平方和"+sumOfSquares)

        sosText.text="平方和は"+sumOfSquares.toString()

    }

}
