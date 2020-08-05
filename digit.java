/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1
import java.until.*;        
/**
 *
 * @author sksba
 */
public class digit {
    /**
     * @param args the command line arguments
     *
     */
    public static void main(string[] args) {
       scanner val=new scanner(system.in);
       int temp,count=0,dig;
       system.out.println("Enter value of n:");
       for(int i=1;i<=n;i++)
       {
           temp=i;
           while(temp!=0)
           {
               dig=temp%10;
               if(dig==5)
               {
                   count++;
                   break;
               }
               temp/=10;
               
           }    
           
       }
       system.out.println("numbers that have '5' as a digit" +count);

 