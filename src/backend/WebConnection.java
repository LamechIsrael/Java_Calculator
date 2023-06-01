package src.backend;
import io.javalin.Javalin;

public class WebConnection {

    public static void main(String[] args) {
        int first = 0;
        String operand = "";
        int second = 0;


        // Get Javalin for web functionality
        Javalin app = Javalin.create();

        // Main Page
        app.get("/", context -> {
            context.status(200);
            context.result("Welcome to Lamech's Employee/Expense page.");
        });





    }
}
