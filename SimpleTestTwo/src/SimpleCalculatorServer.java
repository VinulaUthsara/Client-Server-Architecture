/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2016088
 */
public class SimpleCalculatorServer {

    public boolean isServerConnected() {
        System.out.println("[SERVER]-Connection is being tested...");
        return true;
    }

    public int addIntegerNumbers(int a, int b) {
        System.out.println("[SERVER]-Adding " + a + " and " + b + " ... ");
        return a + b;
    }

    public int divideIntegerNumbers(int a, int b) throws SimpleCalculatorServerException {
        if (b == 0) {
            throw new SimpleCalculatorServerException("cannot divide a number to zero");
        }
        if ((a == 0) && (b == 0)) {
            throw new SimpleCalculatorServerException("zero divided by zero is undetermined");
        }
        System.out.println("[SERVER]-Dividing " + a + " and " + b + " ... ");
        return a / b;

    }

    public static class SimpleCalculatorServerException extends Exception {

        public SimpleCalculatorServerException(String cannot_divide_a_number_to_zero) {
        }
    }

}
