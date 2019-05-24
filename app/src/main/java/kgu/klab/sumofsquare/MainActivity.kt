package kgu.klab.sumofsquare

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayInt1: Array<Int> = arrayOf(3,4,4,5,5,5,5,6,6,7)
        val arrayInt2: Array<Int> = arrayOf(1,2,4,4,5,5,5,6,8,10)
        var ss1: Double=0.0
        var ss2: Double=0.0
        var sum1:Int=0
        var sum2:Int=0
        var sum11:Int=0
        var sum22:Int=0
        var n1:Int=0
        var n2:Int=0

        for(i in arrayInt1){
            n1++
        }

        for(ii in arrayInt2){
            n2++
        }

        for(x in arrayInt1){
            sum1=sum1+(x*x)
            sum2=sum2+x
        }

        for(y in arrayInt2){
            sum11=sum11+(y*y)
            sum22=sum22+y
        }

        ss1=sum1-(sum2.toDouble()*sum2/n1)

        ss2=sum11-(sum22.toDouble()*sum22/n2)

        text1.text="Aの平方和は"+ss1.toString()

        text2.text="Bの平方和は"+ss2.toString()

    }


}
