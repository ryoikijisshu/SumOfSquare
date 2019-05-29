package kgu.klab.sumofsquare

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    val DataArray= arrayOf(3,4,4,5,5,5,5,6,6,7)
    val DataArrayB= arrayOf(1,2,4,4,5,5,5,6,8,10)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var DateSum1:Int=0
        var DateSum2:Double=0.0
        var SumOfSquare=0.0
        var DateSize:Int=0
        var DateSum1B:Int=0
        var DateSum2B:Double=0.0
        var SumOfSquareB=0.0
        var DateSizeB:Int=0
        for (i in DataArray.indices){
            DateSum1 += (DataArray[i])*(DataArray[i])//平方
            DateSum2+=DataArray[i]//和
            DateSize++
        }
        SumOfSquare=DateSum1-((DateSum2*DateSum2)/DateSize)
        println("Aの平方和:"+SumOfSquare)
        for (i in DataArrayB.indices){
            DateSum1B += (DataArrayB[i])*(DataArrayB[i])//平方
            DateSum2B+=DataArrayB[i]//和
            DateSizeB++
        }
        SumOfSquareB=DateSum1B-((DateSum2B*DateSum2B)/DateSizeB)
        println("Bの平方和:"+SumOfSquareB)


    }
}
