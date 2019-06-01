package kgu.klab.sumofsquare

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayIntA: Array<Int> = arrayOf(3,4,4,5,5,5,5,6,6,7)
        val arrayIntB: Array<Int> = arrayOf(1,2,4,4,5,5,5,6,8,10)

        val ssA: Double=sumofsquare(arrayIntA)
        val ssB: Double=sumofsquare(arrayIntB)

        text1.text="Aの平方和は"+ssA.toString()

        text2.text="Bの平方和は"+ssB.toString()

    }

    fun sumofsquare(arrayInt: Array<Int>):Double{

        var sum:Int=0
        var sum2:Int=0
        var ss:Double=0.0

        for(x in arrayInt){
            sum+=x
            sum2+=(x*x)
        }

        ss=sum2-(sum.toDouble()*sum/arrayInt.size)

        return ss

    }


}
