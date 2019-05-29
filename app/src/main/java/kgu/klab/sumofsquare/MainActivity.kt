package kgu.klab.sumofsquare

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val a = arrayOf(3,4,4,5,5,5,5,6,6,7)
        val b = arrayOf(1,2,4,4,5,5,5,6,8,10)

        var sum_a : Double = 0.0
        var sum_aa : Double = 0.0
        var sum_b : Double = 0.0
        var sum_bb : Double = 0.0


        for(i in 0..9)
        {
            sum_a += a[i]
            sum_aa += a[i] * a[i]
            sum_b += b[i]
            sum_bb += b[i] * b[i]
        }

        var ave_a : Double = 0.0
        var ave_b : Double = 0.0
        var ss_a : Double = 0.0
        var ss_b : Double = 0.0

        ave_a = (sum_a * sum_a) / 10
        ave_b = (sum_b * sum_b) / 10

        ss_a = sum_aa - ave_a
        ss_b = sum_bb - ave_b

        textView4.text = ("Aの平方和は" + ss_a.toString())
        textView6.text = ("Bの平方和は" + ss_b.toString())




    }
}
