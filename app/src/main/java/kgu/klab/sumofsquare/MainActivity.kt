package kgu.klab.sumofsquare

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //小標本A
        var arrayofDoubleA: Array<Double> = arrayOf(3.0, 4.0, 4.0, 5.0, 5.0, 5.0, 5.0, 6.0, 6.0, 7.0)
        //小標本B
        var arrayofDoubleB: Array<Double> = arrayOf(1.0, 2.0, 4.0, 4.0, 5.0, 5.0, 5.0, 6.0, 8.0, 10.0)
        var a: Int = 0
        var b: Int = 0
        var d:Int = 0
        var e:Int = 0
        var sum: Double = 0.0
        var sum2: Double = 0.0
        var sum3: Double = 0.0
        var sum4:Double = 0.0
        var sum5:Double = 0.0
        var sum6:Double =0.0
        var result: Double = 0.0
        var result2:Double = 0.0
        var n: Double = 0.0
        var m:Double  =  0.0
        //Aの平方和を求める
        for (a in arrayofDoubleA) {
            sum += a*a
        }
        for( b in arrayofDoubleA) {
            sum2 += b
            n+=1
        }
        sum3 = ( sum2*sum2 ) / n

        result = sum-sum3
        TextView.text = result.toString()
        //Bの平方和を求める
        for (d in arrayofDoubleB) {
            sum4 += d*d
        }
        for( e in arrayofDoubleB) {
            sum5 += e
            m+=1
        }
        sum6 = ( sum5*sum5 ) / m

        result2 = sum4-sum6
        TextView2.text = result2.toString()

    }

}
