package net.inokinn.fizzbuzztest

import org.junit.After
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class CalculatorTest {

    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }

    @Test
    fun execCalculation() {
        val calculator = Calculator()
        // 整数の足し算が上手くいくことをチェック（正の数）
        assertEquals(calculator.execCalculation("34", "16", "+"), 50.0f)
        // 整数の足し算が上手くいくことをチェック（負の数）
        assertEquals(calculator.execCalculation("-12", "-4", "+"), -16.0f)
        // 小数の足し算が上手くいくことをチェック（正の数）
        assertEquals(calculator.execCalculation("24.2", "99.9", "+"), 124.1f)
        // 小数の足し算が上手くいくことをチェック（負の数）
        assertEquals(calculator.execCalculation("24.2", "-99.9", "+"), -75.7f)

        // 整数の引き算が上手くいくことをチェック（正の数）
        assertEquals(calculator.execCalculation("21", "19", "-"), 2.0f)
        // 整数の引き算が上手くいくことをチェック（負の数）
        assertEquals(calculator.execCalculation("21", "24", "-"), -3.0f)
        // 小数の引き算が上手くいくことをチェック（正の数）
        assertEquals(calculator.execCalculation("72.5", "32.6", "-"), 39.9f)
        // 小数の引き算が上手くいくことをチェック（負の数）
        assertEquals(calculator.execCalculation("9.5", "24.7", "-"), -15.2f)

        // 整数の掛け算が上手くいくことをチェック（正の数）
        assertEquals(calculator.execCalculation("34", "16", "*"), 544.0f)
        // 整数の掛け算が上手くいくことをチェック（負の数）
        assertEquals(calculator.execCalculation("-12", "-4", "*"), 48.0f)
        assertEquals(calculator.execCalculation("-12", "4", "*"), -48.0f)
        assertEquals(calculator.execCalculation("12", "-4", "*"), -48.0f)
        // 小数の掛け算が上手くいくことをチェック（正の数）
        assertEquals(calculator.execCalculation("24.2", "99.9", "*"), 2417.58f)
        // 小数の掛け算が上手くいくことをチェック（負の数）
        assertEquals(calculator.execCalculation("24.2", "-99.9", "*"), -2417.58f)
        assertEquals(calculator.execCalculation("-24.2", "99.9", "*"), -2417.58f)
        assertEquals(calculator.execCalculation("-24.2", "-99.9", "*"), 2417.58f)

        // 整数の割り算が上手くいくことをチェック（正の数）
        assertEquals(calculator.execCalculation("36", "3", "/"), 12.0f)
        // 整数の割り算が上手くいくことをチェック（負の数）
        assertEquals(calculator.execCalculation("-12", "-4", "/"), 3.0f)
        assertEquals(calculator.execCalculation("-12", "4", "/"), -3.0f)
        assertEquals(calculator.execCalculation("12", "-4", "/"), -3.0f)
        // 小数の割り算が上手くいくことをチェック（正の数）
        assertEquals(calculator.execCalculation("24.2", "99.9", "/"), 0.24f)
        // 小数の割り算が上手くいくことをチェック（負の数）
        assertEquals(calculator.execCalculation("24.2", "-99.9", "/"), -0.24f)
        assertEquals(calculator.execCalculation("-24.2", "99.9", "/"), -0.24f)
        assertEquals(calculator.execCalculation("-24.2", "-99.9", "/"), 0.24f)

        // 1つ目の数値に文字列を渡されたら0を返すことをチェック
        assertEquals(calculator.execCalculation("あ", "24", "+"), 0.0f)
        // 2つ目の数値に文字列を渡されたら0を返すことをチェック
        assertEquals(calculator.execCalculation("6", "うんこ", "+"), 0.0f)
        // 全角数字は使えないことをチェック
        assertEquals(calculator.execCalculation("１", "４", "+"), 0.0f)
    }
}