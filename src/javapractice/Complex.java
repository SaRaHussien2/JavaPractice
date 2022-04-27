/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javapractice;

/**
 *
 * @author SaRa
 */
public class Complex {

   //attributes of the class
   private float img,real;

   //default constructor
    public Complex() {
    }

    //parametarize constructor with 1 param
    public Complex(float img) {
        this.img = img;
        real=img;
    }
    
    //parametarize constructor with 2 params
    public Complex(float img, float real) {
        this.img = img;
        this.real = real;
    }
    
    //getter of img
    public float getImg() {
        return img;
    }

    //setter of img
    public void setImg(float img) {
        this.img = img;
    }

    //getter of real
    public float getReal() {
        return real;
    }

    //setter of real
    public void setReal(float real) {
        this.real = real;
    }
    
    //add function
    public static Complex add(Complex c1,Complex c2)
    {
        Complex res=new Complex();
        res.setReal(c1.getReal()+c2.getReal());
        res.setImg(c1.getImg()+c2.getImg());
        return res;
    }


    //Substract function
    public static Complex sub(Complex c1,Complex c2)
    {
        Complex res=new Complex();
        res.setReal(c1.getReal()-c2.getReal());
        res.setImg(c1.getImg()-c2.getImg());
        return res;
    }

    
    //print function
     public void print() 
      {
          if(real==0 && img==0){
       // cout << img << endl;
        System.out.println(img);
        }
        else if(real==0){
            if (img == -1){
                System.out.println("-i");

            }
           else if (img == 1){
                System.out.println("i");

            }
         else {
            // System.out.println(getImg()+ "i");
             System.out.println(img +"i");
            }
        }
        else if(img==0){
            System.out.println(real);
        }
        else if (img>0){
            System.out.println(img + "+" + img +"i");
        }
       else if (img == -1){
            System.out.println(img +" -i");
        }
       else if (img == 1){
            System.out.println(real +" +i");
        }
        else {
            System.out.println(real + img +" i");
        }
    }
}
