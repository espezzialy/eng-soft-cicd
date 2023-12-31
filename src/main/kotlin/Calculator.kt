class Calculator(private val operators: Operators) {
    fun addTwoNumbers(a: Int, b: Int) = operators.add(a, b)
    fun subtractTwoNumbers(a: Int, b: Int) = operators.subtract(a, b)
    fun multiplyTwoNumbers(a: Int, b: Int) = operators.multiply(a, b)
    fun divideTwoNumbers(a: Int, b: Int) = operators.divide(a, b)
}