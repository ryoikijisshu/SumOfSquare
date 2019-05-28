package kgu.klab.sumofsquare

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Math.pow

class MainActivity : AppCompatActivity() {

    val list_a = listOf(3,4,4,5,5,5,5,6,6,7)
    //val list_b = listOf(1,2,4,4,5,5,5,6,8,10)

    var sum_a = 0
    var mean_a = 0.0
    var res_a = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for (i in list_a.indices){
            sum_a = sum_a + list_a[i]
        }
        println("合計:"+sum_a)

        mean_a = sum_a.toDouble() / (list_a.lastIndex+1)

        println("平均:"+mean_a+"\n配列長:"+list_a.lastIndex)

        for (i in list_a.indices) {
            res_a = res_a + pow(list_a[i] - mean_a, 2.0).toInt()
        }

        a.text = "標本aの平方和:"+res_a
        println("平方和:"+res_a)
    }

}
