/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javapractice;

/**
 *
 * @author SaRa
 */
public class Stars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //draw stars equal number of lines
        // if length of array = 0
        if(args.length==0 )
        {
            System.out.println("No arguments are passed");
        }
         // accept digits only
        else if( args[0].matches("\\d+") ) 
        {
           // draw stars equal number of lines
                for(int i=1 ; i<= Integer.parseInt(args[0]) ; i++){
                
                for(int y=0; y<i ;y++)
                    System.out.print("* ");
                    System.out.println(); 
                }
                System.out.println(); 
                System.out.println(); 
            //draw triangle by number of line
                for(int i=1 ; i<=Integer.parseInt(args[0])  ; i++)
                {
                  for(int t=0; t<Integer.parseInt(args[0]) -i; t++)
                    System.out.print("  ");
                      for(int y=0; y<(2*i-1) ;y++)
                      System.out.print("* ");
                      System.out.println(); 
                }
         }
         else 
         {
            System.out.println("invalid please enter a number"); 
         }

        }
}