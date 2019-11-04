package net.inokinn.fizzbuzztest

import java.math.BigDecimal;

class Calculator {

    /**
     * 指定した四則演算処理を行う
     * @param num1Str 第1数
     * @param num2Str 第2数
     * @param symbolStr 四則演算記号
     * @return 演算結果
     */
    fun execCalculation(num1Str: String, num2Str: String, symbolStr: String): Float {
        // 入力値バリデーション
        val num1 = num1Str.toFloatOrNull() ?: return 0.0f
        val num2 = num2Str.toFloatOrNull() ?: return 0.0f

        return when (symbolStr) {
            "+" -> (BigDecimal((num1 + num2).toString()).setScale(2, BigDecimal.ROUND_HALF_UP)).toFloat()
            "-" -> (BigDecimal((num1 - num2).toString()).setScale(2, BigDecimal.ROUND_HALF_UP)).toFloat()
            "*" -> (BigDecimal((num1 * num2).toString()).setScale(2, BigDecimal.ROUND_HALF_UP)).toFloat()
            "/" -> (BigDecimal((num1 / num2).toString()).setScale(2, BigDecimal.ROUND_HALF_UP)).toFloat()
            else -> 0.0f
        }
    }
}