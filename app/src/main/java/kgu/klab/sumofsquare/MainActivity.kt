package kgu.klab.sumofsquare

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numA = intArrayOf(3, 4, 4, 5, 5, 5, 5, 6, 6, 7)
        val numB = intArrayOf(1, 2, 4, 4, 5, 5, 5, 6, 8, 10)

        resultA.text = "Aの平方和は"+SumOfSquare(numA).toString()
        resultB.text = "Bの平方和は"+SumOfSquare(numB).toString()

    }

    fun SumOfSquare(num: IntArray):Int{
        var sos = 0
        var ss2 = 0
        var sum  = 0

        for (i in num) {
            ss2 += i*i
            sum += i
        }
        sos =  ss2 - sum * sum / num.size
        return(sos)
    }

}