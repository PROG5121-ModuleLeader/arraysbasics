/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjarraysinclasses;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rwanv
 */
public class DataTest {
    
    public DataTest() {
    }


   
    @Test
    public void testPrint_report()
    {
        Data d = new Data();
        String[] arrName ={"Jack","Tim"};
        int[] arrResults = {80,95};
        
        d.AddDataManu(arrName, arrResults);
        
        String strExpected = "STUDENT REPORT\n" +
                            "\n" +
                            "STUDENT: Jack: 80% \n" +
                            "STUDENT: Tim: 95% \n" +
                            "\n" +
                            "AVERAGE: 87.5";
        String Actual = d.print_report();
        
        assertEquals(strExpected,Actual);
        
    }
    
}
