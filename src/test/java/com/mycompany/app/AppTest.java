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
        	inte[i]=i*10+1000000;
        }

        String str="bcd";

        assertTrue( new App().myMethod(arr,inte,str,ch) );
    }
    
    public void testContainChar() {
    	
        ArrayList<Integer> arr=new ArrayList<>();
        Integer[] inte=new Integer[10];
        char ch='a';
        for(int i=0;i<10;i++) {
            inte[i]=(int)Math.random()*10;
        }

        String str="xklams";

        assertFalse( new App().myMethod(arr,inte,str,ch) );
    }
    
    public void testRepeatChar() {
    	ArrayList<Integer> arr=new ArrayList<>();
        Integer[] inte=new Integer[10];
        char ch='a';
        for(int i=0;i<10;i++) {
            inte[i]=(int)Math.random()*10;
        }

        String str="bbbbb";

        assertFalse( new App().myMethod(arr,inte,str,ch) );
    }
    
    public void testContainsSpecialUncceptableChar() {
    
    	ArrayList<Integer> arr=new ArrayList<>();
        Integer[] inte=new Integer[10];
        char ch='a';
        for(int i=0;i<10;i++) {
            inte[i]=(int)Math.random()*10;
        }

        String str="b5v2d6;*";

        assertFalse( new App().myMethod(arr,inte,str,ch) );
    
    }
    
    public void testContainsSpecialAcceptableChar() {
    
    	ArrayList<Integer> arr=new ArrayList<>();
        Integer[] inte=new Integer[10];
        char ch='a';
        for(int i=0;i<10;i++) {
            inte[i]=i*10+1000000;
        }

        String str="bcjkd_[s";

        assertTrue( new App().myMethod(arr,inte,str,ch) );
    
    }

}
