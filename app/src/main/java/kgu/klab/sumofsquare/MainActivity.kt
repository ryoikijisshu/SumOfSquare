package kgu.klab.sumofsquare

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //小標本A
        var arrayofDoubleA: Array<Double> = arrayOf(3.0, 4.0, 4.0, 5.0, 5.0, 5.0, 5.0, 6.0, 6.0, 7.0)
        //小標本B
        var arrayofDoubleB: Array<Double> = arrayOf(1.0, 2.0, 4.0, 4.0, 5.0, 5.0, 5.0, 6.0, 8.0, 10.0)

        val SSA:Double = functionSS(arrayofDoubleA)
        val SSB:Double = functionSS(arrayofDoubleB)
        TextView.text = SSA.toString()
        TextView2.text = SSB.toString()


    }
    fun functionSS( arrayDouble:Array<Double>): Double {
        var sum2: Double = 0.0
        var sum: Double = 0.0
        var SS: Double = 0.0
        for (a in arrayDouble) {
            sum2 += a * a
            sum += a
        }
        SS = sum2 - (sum * sum) / arrayDouble.size
        return SS
    }

}
