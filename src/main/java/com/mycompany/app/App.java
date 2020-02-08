package com.mycompany.app;

import java.util.*;

public class App 
{
    public static void main( String[] args ) {
        Scanner keyboard=new Scanner(System.in); 
        ArrayList<Integer> arr=new ArrayList<>();
        Integer[] inte=new Integer[10];
        
        for(int i=0;i<10;i++) {
            inte[i]=(int)Math.random()*10;
        }

        String str=keyboard.nextLine();
        char ch='a';

        boolean b=myMethod(arr, inte, str, ch);
    }
    
    public static boolean myMethod(ArrayList<Integer> arr, Integer[] integers, String str, char ch) {
		boolean b=false;
        for(int i=0;i<str.length();i++) {
            for(int j=0;j<integers.length;j++) {
            	if(str.charAt(i)<65||str.charAt(i)>122) {
            		i=str.length();
            		b=false;
                    break;
            	}
            	
            	else if((str.charAt(i)-ch)==0) {
            		i=str.length();
            		b=false;
                    break;
                }
                
                else if (arr.contains(integers[j]/(str.charAt(i)-ch))) {
                	i=str.length();
            		b=false;
                    break;
                }
                
                else { 
                    arr.add(integers[j]/(str.charAt(i)-ch));
                    b=true;
                }
            }
        }

        return b;
    }
}
