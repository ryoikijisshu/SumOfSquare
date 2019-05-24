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
        var sumA:Double = 0.0
        var sumB:Double = 0.0
        var sumA2:Double = 0.0
        var sumB2:Double = 0.0
        var SSA:Double = 0.0
        var SSB:Double = 0.0
        for (i in 0..9){
            sumA += A[i]
            sumB += B[i]
            sumA2 += A[i]*A[i]
            sumB2 += B[i]*B[i]
        }
        SSA = sumA2-sumA*sumA/10
        SSB = sumB2-sumB*sumB/10
        answerA.text ="標本Aの平方和は" + SSA
        answerB.text ="標本Bの平方和は" + SSB
    }
}
