package src.backend;
import com.google.gson.Gson;
import io.javalin.Javalin;

public class WebConnection {

    // Create a Gson that will allow me to read information from the webpage
    public static Gson gson = new Gson();


    public static void main(String[] args) {

        // Get Javalin for web functionality
        Javalin app = Javalin.create().start();


        // Main Page

        app.get("/", context -> {

            // Initialize the final result and get the body from the webpage
            int result = 0;
            String body = context.body();

            // Will default to a normal homepage, if no information is fed to it
            if (body.length() < 3) {
                context.status(200);
                context.result("Welcome to Lamech's Full Stack Calculator.");


            } else {
                // If information is received, the application will try to do math

                try {
                    // Turn the Json data into a Gson.
                    // The Gson will create a Numbers object that holds the data needed for operation.
                    Numbers numbers = gson.fromJson(body, Numbers.class);

                    // Get the numbers and math question from the Numbers object
                    int firstNum = numbers.getFirstNumber();
                    String operand = numbers.getOperator();
                    int secondNum = numbers.getSecondNumber();

                    // Use the operand component to determine which math function should be used.
                    switch (operand) {
                        case "+":
                            result = Calculator.add(firstNum, secondNum);
                            break;
                        case "-":
                            result = Calculator.subtract(firstNum, secondNum);
                            break;
                        case "*":
                            result = Calculator.multiply(firstNum, secondNum);
                            break;
                        case "/":
                            result = Calculator.divide(firstNum, secondNum);
                            break;

                    }

                    // Return the result of the math equation to the webpage
                    context.result(String.valueOf(result));
                    context.status(200);

                } catch (Exception e) {
                    // If anything is wrong, give a 404 error.
                    context.result("Error! No math can be done...");
                    context.status(404);
                }
            }
        });
    }
}
