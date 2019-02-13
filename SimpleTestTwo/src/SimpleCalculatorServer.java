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

    public int divideIntegerNumbers(double c, double d) throws SimpleCalculatorServerException {
        if (d == 0) {
            throw new SimpleCalculatorServerException("cannot divide a number to zero");
        }
        if ((c == 0) && (d == 0)) {
            throw new SimpleCalculatorServerException("zero divided by zero is undetermined");
        }
        System.out.println("[SERVER]-Dividing " + c + " and " + d + " ... ");
        return c/ d;

    }
    
    public int subtractIntegerNumbers (int a,int b){
        System.out.println ("[SERVER]-Subtracting "+a+" and "+b+" ... ");
        return a - b;
    }
    
    public int multiplyIntegerNumbers(int a, int b){
        System.out.println ("[SERVER]-Multiplying "+a+" and "+b+" ... ");
        return a*b;
    }
    
    public int addIntegerArrays{
        for(int i=0;i<=a.length-1;i++){
        c[i]=a[i]+b[i]; //ADDING

       }

        System.out.println("SUM OF TWO ARRY");

            for( int j=0;j<=c.length-1;j++)

        {

            System.out.println(c[j]); //DISPLAYING

        }

    }

    

    public static class SimpleCalculatorServerException extends Exception {

        public SimpleCalculatorServerException(String cannot_divide_a_number_to_zero) {
            super(cannot_divide_a_number_to_zero);
        }
    }

}
