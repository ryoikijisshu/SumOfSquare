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
        var sumA1:Int = 0
        var sumA2:Int = 0
        var sumB1:Int = 0
        var sumB2:Int = 0

        for(i in 0 .. 9){
            sumA1 += a[i]
            sumA2 += a[i]*a[i]
            sumB1 += b[i]
            sumB2 += b[i]*b[i]
        }

        val ssA = sumA2 - sumA1*sumA1/10
        val ssB = sumB2 - sumB1*sumB1/10

        resultA.text = ssA.toString()
        resultB.text = ssB.toString()




    }
}
