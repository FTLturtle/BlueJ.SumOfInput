/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int sum = sumOfInput();
        System.out.print("The sum of one to your integer is: " + sum);
    }
    
    /**
     * This method takes an integer as input from the user, and
     * returns the sum of 1 to that integer.
     */
    public static int sumOfInput(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        int sum = 0;
        
        for (int i = 1; i <= number; i++){
            sum = sum + i;
        }
        
        return sum;
    }
}
