package backend;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    int firstNum = 27;
    int secondNum = 52;


    @Test
    void add() {
        int sum = Calculator.add(firstNum, secondNum);
        Assert.assertEquals(sum, firstNum+secondNum);
    }

    @Test
    void subtract() {
        int difference = Calculator.subtract(firstNum, secondNum);
        Assert.assertEquals(difference, firstNum-secondNum);
    }

    @Test
    void multiply() {
        int product = Calculator.multiply(firstNum, secondNum);
        Assert.assertEquals(product, firstNum*secondNum);
    }

    @Test
    void divide() {
        int dividend = Calculator.divide(firstNum, secondNum);
        Assert.assertEquals(dividend, firstNum/secondNum);
    }
}