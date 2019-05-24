package kgu.klab.sumofsquare

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listNum: IntArray = intArrayOf(3,4,4,5,5,5,5,6,6,7)
        var deviation :Double =0.0
        var sum : Int =0
        var mean : Double
        var sumOfSquares : Double =0.0
        for(item in listNum){
            sum +=item
        }
        mean = sum.toDouble()/10

        for(i in 0..listNum.size -1){
            deviation = mean - listNum[i]
            sumOfSquares += deviation * deviation
        }

        System.out.println("平方和"+sumOfSquares)

        sosText.text="平方和は"+sumOfSquares.toString()
    }

}
