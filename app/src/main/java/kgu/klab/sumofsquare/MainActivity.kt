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
        val ss_a : Double = sumOfsquare( a )
        val ss_b : Double = sumOfsquare( b )

        textView1.text = ("Aの平方和は" + ss_a.toString())
        textView2.text = ("Bの平方和は" + ss_b.toString())
    }

    fun sumOfsquare( number : Array<Int>) : Double
    {
        var sum  = 0.0
        var sum2 = 0.0
        var ave  = 0.0
        var ss   = 0.0

        for(i in 0 .. number.size - 1)
        {
            sum  += number[i]
            sum2 += (number[i] * number[i])
        }

        ave = (sum * sum) / number.size
        ss = sum2 - ave

        return ss
    }
}