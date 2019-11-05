package net.inokinn.fizzbuzztest

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setTitle("でんたく")
        setContentView(R.layout.activity_main)
    }

    // Sendボタン押下時
    @SuppressLint("SetTextI18n")
    fun tapCalculationButton(view: View) {
        // 計算処理を行う
        val num1Str = num1.text.toString()
        val num2Str = num2.text.toString()
        val symbolStr = spinner.selectedItem.toString()
        val result = Calculator().execCalculation(num1Str, num2Str, symbolStr)
        resultTextView.text = num1Str + symbolStr + num2Str + "=" + result.toString()
    }
}
