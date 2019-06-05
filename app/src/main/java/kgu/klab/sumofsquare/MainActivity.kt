package kgu.klab.sumofsquare

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val A = arrayOf(3,4,4,5,5,5,5,6,6,7)
        val B = arrayOf(1,2,4,4,5,5,5,6,8,10)
        answerA.text ="標本Aの平方和は" + SS(A)
        answerB.text ="標本Bの平方和は" + SS(B)

    }
    fun SS(array: Array<Int>): Double{
        var sum:Double = 0.0
        var sum2:Double = 0.0
        for (i in 0..array.size-1){
            sum += array[i]
            sum2 += array[i]*array[i]
        }
        return sum2-(sum*sum)/array.size
    }
}
