package kgu.klab.sumofsquare

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val a_list = arrayListOf( 3, 4, 4, 5, 5, 5, 5, 6, 6, 7)
        val b_list = arrayListOf( 1, 2, 4, 4, 5, 5, 5, 6, 8, 10)
        var a_size: Int
        var b_size: Int
        var a_SumOfSquare: Double = 0.0
        var b_SumOfSquare: Double = 0.0
        var a_sum: Double = 0.0
        var b_sum: Double = 0.0
        var a_result: Double
        var b_result: Double
        var a_text: String = "Aの平方和:"
        var b_text: String = "Bの平方和:"

        a_size = a_list.count()
        b_size = b_list.count()

        for( i in 0..a_size - 1){
            a_SumOfSquare = a_SumOfSquare + (a_list.elementAt(i) * a_list.elementAt(i))
            a_sum = a_sum + a_list.elementAt(i)
        }
        a_result = a_SumOfSquare - ((a_sum * a_sum) / a_size)
        a_text += a_result.toString()
        textView.setText(a_text)

        for( j in 0..b_size - 1){
            b_SumOfSquare = b_SumOfSquare + (b_list.elementAt(j) * b_list.elementAt(j))
            b_sum = b_sum + b_list.elementAt(j)
        }
        b_result = b_SumOfSquare - ((b_sum * b_sum) / b_size)
        b_text += b_result.toString()
        textView3.setText(b_text)
    }
}
