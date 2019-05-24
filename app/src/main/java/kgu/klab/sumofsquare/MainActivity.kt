package kgu.klab.sumofsquare

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val list_a = arrayOf(3,4,4,5,5,5,5,6,6,7)
    val list_b = arrayOf(1,2,4,4,5,5,5,6,8,10)

    var sum_a = 0
    var sum_b = 0

    var mean_a = 0.0
    var mean_b = 0.0

    var res_a = 0
    var res_b = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for (i in 0 .. 9){
            sum_a = sum_a + list_a[i]
            sum_b = sum_b + list_b[i]
        }

        mean_a = sum_a.toDouble() / 10
        mean_b = sum_b.toDouble() / 10

        for (i in 0 .. 9) {
            res_a = res_a + Math.pow(list_a[i] - mean_a, 2.0).toInt()
            res_b = res_b + Math.pow(list_b[i] - mean_b, 2.0).toInt()
        }

        a.text = "標本aの平方和"+res_a
        b.text = "標本bの平方和"+res_b

        println(res_a)
        println(res_b)
    }
}
