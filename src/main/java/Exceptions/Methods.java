package Exceptions;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Methods {
    public static int Sum(int first, int second) {
        Scanner sc = new Scanner(System.in);
        boolean repeat = true;
        int output = 0;
        while(repeat){
            try{
                output = first + second;
                repeat = false;
            } catch (InputMismatchException e){
                System.out.println("Try it again incorrect input an integer is required!!");
                sc.nextLine();
            }
        }
            return output;
    }

    //NumberFormatException - thrown to indicate that the application has attempted to convert a string to one of the numeric types, but the string doesn't have appropriate format
    //InputMismatchException - is thrown by Scanner to indicate that the token does not match the patter for the expected type, or that the token is out of range

    public static double Divide(int a, int b){
        Scanner sc = new Scanner(System.in);
        boolean repeat = true;
        double output = 0;
        while(repeat){
            try{
                output = (double) a/b;
                repeat = false;
            } catch (ArithmeticException e){
                System.out.println("Try it again incorrect input a second integer cannot be zero!!");
                sc.nextLine();
            } catch (NumberFormatException f){
                System.out.println("Try it again incorrect input an integer wasn't inputted!!");
                sc.nextLine();
            }
        }
        return output;
    }
}
