/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aft.email.parser;

/**
 *
 * @author yon
 */
import java.util.Scanner;
public class AftEmailParser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       while(true)
       {
       System.out.println("Running");
       String choice = in.nextLine();
       if(choice.equals("quit") ) break;
       else continue;
       }
    }
    
}
