
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 2016088
 */
public class SimpleClient {

    SimpleCalculatorServer server = new SimpleCalculatorServer();

    public static void main(String[] args) {

        SimpleClient simpleClient = new SimpleClient();
        simpleClient.executeTest();

    }

    private void executeTest() {
        System.out.println("[CLIENT] - Testing if the server is connected...");
        if (server.isServerConnected()) {
            System.out.println("[CLIENT] - The Client is connected, the test can proceed...");
            int a = 2;
            int b = 5;
            System.out.println("[CLIENT]- Asking the server what is the sum of " + a + " and " + b + " is " + "...");
            int sum = server.addIntegerNumbers(a, b);
            System.out.println("[CLIENT]- The server has replied that the sum of " + a + " and " + b + " is " + sum);
            if (sum == a + b) {
                System.out.println("[CLIENT]-The result return from the server is correct.");
            } else {
                System.out.println("[CLIENT]-The result return from the server is NOT correct");
            }

            a = 0;
            b = 0;
            System.out.println("[CLIENT]- Asking the server what is the raito of " + a + " and " + b + " is " + " ... ");
            int div = 0;
            try {
                div = server.divideIntegerNumbers(a, b);
            } catch (SimpleCalculatorServer.SimpleCalculatorServerException ex) {
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("[CLIENT]- The server has replied that the ratio of " + a + " and " + b + " is " + div);

            if (div == a / b) {

                System.out.println("[CLIENT]-The result return from the server is correct.");
            } else {
                System.out.println("[CLIENT]-The result return from the server is NOT correct");
            }

        } else {
            System.out.println("[CLIENT] - The Client is NOT connected, the test has failed...");

        }
    }

}
