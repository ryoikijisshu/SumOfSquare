package kgu.klab.sumofsquare

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val a = intArrayOf(3, 4, 4, 5, 5, 5, 5, 6, 6, 7)
        val b = intArrayOf(1, 2, 4, 4, 5, 5, 5, 6, 8, 10)

        fun SumOfSquare(n : IntArray) :Int {

            var sum:Int = 0
            var sum2:Int = 0
            var arraysize:Int = 0

            for(i in n.indices){
                sum += n[i]
                sum2 += n[i]*n[i]
                arraysize += 1
            }

            return sum2 - sum*sum/arraysize
        }

        resultA.text = SumOfSquare(a).toString()
        resultB.text = SumOfSquare(b).toString()

    }
}
