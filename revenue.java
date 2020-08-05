/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;
import static java.time.Clock.system;
import java.util.*;
/**
 *
 * @author sksba
 */
public class revenue {
    
   /**
    * @param args the command line arguments
    * 
    */
public static void main(string[]args) {
    scanner val=new scanner(system.in);
    float discount;
    system.out.printLn("enter unit pricer:");
    float unitprice=val.nextFloat();
    system.out.printLn("Enter quantity:");
    int quantity=val.nextInt();
    if(quantity>120)
        discount=15;
    else if(quantity>=100 && quantity<=120)
        discount=15;
    else
        discount=10;
    else
        discount=0;
    double distant=(unitprice*quantity*discount)/100;
    double revenue=(unitprice*quantity)-disamt;
    system.out.printLn("the                             "+revenue);
    system.out.printLn("                     "+disamt+discount+"")
    }
}
            
           
            
}