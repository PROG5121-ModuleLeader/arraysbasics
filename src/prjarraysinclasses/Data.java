/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjarraysinclasses;

import javax.swing.JOptionPane;

/**
 *
 * @author rwanv
 */
public class Data 
{
    private static String[] strStudents;
    private static int[] intResults;
    private static int intAmountOfStudents;
    
    public void AskData(int iUsers)
    {        
        intAmountOfStudents=iUsers;
        strStudents = new String[intAmountOfStudents];//new String[5]
        intResults = new int[intAmountOfStudents];
        
        for(int x = 0; x < intAmountOfStudents; x++)
        {
            strStudents[x] = JOptionPane.showInputDialog(null,
                    "Enter student " + (x + 1));
            intResults[x] = Integer.parseInt(
                    JOptionPane.showInputDialog(null, 
                    "Enter the result for "
                    + strStudents[x]));
        }
        
    }
    
    public void AddDataManu(String[] arrName,int[] arrResults)
    {
        strStudents=arrName;
        intResults=arrResults;
    }
    public String print_report()
    {
        int x = 0;
        double dblAverage = 0.0;
        String strDisplay = "STUDENT REPORT\n\n";
        while(x < strStudents.length)
        {
            strDisplay += "STUDENT: " + strStudents[x] +
                    ": " + 
                    intResults[x] + "% \n";
            dblAverage += intResults[x];
            x+=1;
        }
        strDisplay += "\nAVERAGE: " + (dblAverage /
                strStudents.length) + "%";
        return strDisplay;
    }
}
