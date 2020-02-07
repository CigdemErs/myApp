package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
    /**
     * Rigourous Test :-)
     */
    
    public void testDivisionZeroTrue()
    {
        ArrayList<Integer> arr=new ArrayList<>();
        Integer[] inte=new Integer[10];
        char ch='a';
        for(int i=0;i<10;i++) {
            inte[i]=(int)Math.random()*10;
        }

        String str="a";

        assertFalse( new App().myMethod(arr,inte,str,ch) );
    }

    
    public void testTrue()
    {
        ArrayList<Integer> arr=new ArrayList<>();
        Integer[] inte=new Integer[10];
        char ch='a';
        for(int i=0;i<10;i++) {
            inte[i]=(int)Math.random()*10;
        }

        String str="bcd";

        assertTrue( new App().myMethod(arr,inte,str,ch) );
    }

}
