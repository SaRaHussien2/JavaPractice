/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javapractice;
import java.util.StringTokenizer;


/**
 *
 * @author SaRa
 */
public class Split {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         if(args.length==0 )
        {
            System.out.println("No arguments are passed");
        }
         else if( args[0].matches("^[\\d.]+$") ) 
        { 
         
         for(String x: args){
            StringTokenizer st=new StringTokenizer(x,".");
                while(st.hasMoreTokens()){
                    System.out.println(st.nextToken());
                }
            }
        }
    else 
         {
            System.out.println("invalid please enter a number or dot '.' only "); 
         } 
    }  
}
