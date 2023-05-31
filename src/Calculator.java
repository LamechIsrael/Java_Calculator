package src;

public class Calculator {


    public static void main(String[] args) {

        System.out.println(add(11,5));

        System.out.println(subtract(11,5));

        System.out.println(multiply(11,5));

        System.out.println(divide(11,5));

    }


    public static int add(int firstNum, int secondNum){
        return firstNum + secondNum;
    }

    public static int subtract(int firstNum, int secondNum){
        return firstNum - secondNum;
    }

    public static int multiply(int firstNum, int secondNum){
        return firstNum * secondNum;
    }

    public static int divide(int firstNum, int secondNum){
        return firstNum / secondNum;
    }

}
