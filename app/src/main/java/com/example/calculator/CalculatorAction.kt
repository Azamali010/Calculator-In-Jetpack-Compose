package com.example.calculator

import androidx.compose.runtime.Composable



sealed class CalculatorAction {
    data class Number(val number: Int):CalculatorAction()
    object Clear : CalculatorAction()
    object Delete : CalculatorAction()
    object Decimal : CalculatorAction()
    object Calculate : CalculatorAction()

    data class Operation(val operations: CalculatorOperations): CalculatorAction()
}
