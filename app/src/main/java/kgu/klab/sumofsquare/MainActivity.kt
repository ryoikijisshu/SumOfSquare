package kgu.klab.sumofsquare

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val dataarray= arrayOf(3,4,4,5,5,5,5,6,6,7)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        result.text=SumOfSquare(dataarray).toString()

    }
    fun SumOfSquare(args: Array<Int>):Double{
        var datesum1:Int=0
        var datesum2:Double=0.0
        var datesize:Int=0
        var resultnum:Double=0.0
        for (i in dataarray){
            datesum1 += i*i//
            datesum2 += i//
            datesize++
        }

        resultnum+=datesum1-((datesum2*datesum2)/datesize)
        return resultnum

    }
}
