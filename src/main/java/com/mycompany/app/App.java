package com.mycompany.app;

import java.util.*;
import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.post;
import spark.ModelAndView;
import spark.template.mustache.MustacheTemplateEngine;


public class App 
{
    public static void main( String[] args ) {
    port(getHerokuAssignedPort());

        get("/", (req, res) -> "Hello, World");

        post("/compute", (req, res) -> {
          //System.out.println(req.queryParams("input1"));
          //System.out.println(req.queryParams("input2"));

          String input1 = req.queryParams("input1");
          java.util.Scanner sc1 = new java.util.Scanner(input1);
          sc1.useDelimiter("[;\r\n]+");
          java.util.ArrayList<Integer> inputList = new java.util.ArrayList<>();
          while (sc1.hasNext())
          {
            int value = Integer.parseInt(sc1.next().replaceAll("\\s",""));
            inputList.add(value);
          }
          System.out.println(inputList);


          Scanner keyboard=new Scanner(System.in); 
        ArrayList<Integer> arr=new ArrayList<>();
        Integer[] inte=new Integer[10];
        
        for(int i=0;i<10;i++) {
            inte[i]=i*100+10000;
        }

        String str=keyboard.nextLine();
        char ch='a';

        boolean result=myMethod(arr, inte, str, ch);

         Map map = new HashMap();
          map.put("result", result);
          return new ModelAndView(map, "compute.mustache");
        }, new MustacheTemplateEngine());


        get("/compute",
            (rq, rs) -> {
              Map map = new HashMap();
              map.put("result", "not computed yet!");
              return new ModelAndView(map, "compute.mustache");
            },
            new MustacheTemplateEngine());
    }

    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)

        
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
