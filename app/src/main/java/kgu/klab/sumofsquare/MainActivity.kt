package kgu.klab.sumofsquare

import android.hardware.camera2.params.OisSample
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Math.pow

class MainActivity : AppCompatActivity() {

    val list_a = listOf(3,4,4,5,5,5,5,6,6,7)
    val list_b = listOf(1,2,4,4,5,5,5,6,8,10)

    var res_a = 0
    var res_b = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_a.setOnClickListener {
            res_a = sumofsquare(list_a)
            a.text = list_a.toString()+"\n\n標本aの平方和:"+res_a
        }

        button_b.setOnClickListener {
            res_b = sumofsquare(list_b)
            a.text = list_b.toString()+"\n\n標本bの平方和:"+res_b
        }

    }

    fun sumofsquare(sample:List<Int>): Int {
        var sum = 0
        var mean = 0.0
        var kekka = 0

        for (i in sample.indices){
            sum = sum + sample[i]
        }

        mean = sum.toDouble() / (sample.size)

        for (i in sample.indices) {
            kekka = kekka + pow(sample[i] - mean, 2.0).toInt()
        }

        return kekka
    }

}
