/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javapractice;

/**
 *
 * @author SaRa
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if(args.length==0)
        {
             System.out.println("No arguments are passed");
        }
        else
        {

        if ( args[0].matches("\\d+") && args[2].matches("\\d+") ) {
        
            int a   =  Integer.parseInt(args[0]);
            char p  =   args[1].charAt(0);
            int b = Integer.parseInt(args[2]);
        
        switch(p)
        {
            case '+':
                System.out.println("Addition of "+a+" and "+b+" : "+(a+b));
                break;

            case '-':
                System.out.println("Subtraction of "+a+" and "+b+" : "+(a-b));
                break;

            case 'x':
                System.out.println("Multiplication of "+a+" and "+b+" : "+(a*b));
                break;

            case '/':
                if(b==0){
                   System.out.println("Invalid Division");
                }
                else {
                    System.out.println("Division of "+a+" and "+b+" : "+(a/b));
                }
                break;

            case '%':
                System.out.println("Modulo of "+a+" and "+b+" : "+(a%b));
                break;

            default:
                System.out.println("Please Enter '+', '-', '*', '/' & '%' operator only.");
            }
        } 
        else {
            System.out.println("invalid input please enter numbers");
        }
    
        }

    }
    
}
