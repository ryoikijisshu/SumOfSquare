package kgu.klab.sumofsquare

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val numA = intArrayOf(3,4,4,5,5,5,5,6,6,7)
        val numB = intArrayOf(1,2,4,4,5,5,5,6,8,10)
        var SumA = 0
        var SumB = 0
        var SumC = 0
        var SumD = 0
        var ResultA = 0
        var ResultB = 0

        for (i in 0..9){
            SumA += numA[i] * numA[i]
            SumC += numB[i] * numB[i]
        }
        for (i in 0..9){
            SumB += numA[i]
            SumD += numB[i]
            if(i ==9){
                SumB *= SumB /10
                SumD *= SumD /10
            }
        }

        ResultA = SumA - SumB
        ResultB = SumC - SumD


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultA.text = ResultA.toString()
        resultB.text = ResultB.toString()
    }
}