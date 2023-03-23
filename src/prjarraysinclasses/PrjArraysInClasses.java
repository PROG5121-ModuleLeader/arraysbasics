/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjarraysinclasses;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author rwanv
 */
public class PrjArraysInClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {     
        
        //added new comment
        System.out.println("Welcome to the new system");
        
        Boolean bControl = false;
        Scanner read = new Scanner(System.in);
        while (bControl == false)
        {
            System.out.println("Please enter 1 to add students or 2 "
                    + "to view the report and anything else to exit");
            String strInput =read.nextLine();
            
            
            if (strInput.equals("1"))
            {
                StudentOption1();
            }
            else if (strInput.equals("2"))
            {
                StudentOption2();
            }
            else 
            {
                bControl =true;
            }
        }    
    }
    public static void StudentOption1()
    {
        Data d = new Data();
        
        int intAmountOfStudents = Integer.parseInt(
                JOptionPane.showInputDialog(null, 
                "Please enter the number "
                + "of students in the class"));
        
        d.AskData(intAmountOfStudents);
    }

    private static void StudentOption2() 
    {
        Data d = new Data();
        String print_report = d.print_report();
        JOptionPane.showMessageDialog(null, print_report);
    }
    
}
