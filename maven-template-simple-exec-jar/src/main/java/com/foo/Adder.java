package com.foo;

import org.apache.log4j.Logger;

/**
 * @author prekezes.
 */
public class Adder {
	public static Logger log = Logger.getLogger(Adder.class);
	
    int add(int a, int b){
        return a+b;
    }
    
    public static void main(String[] args){
    	if ( args.length !=  2 ) {
    		log.error("Usage is com.foo.Adder <NUM1> <NUM2>");
    		System.exit(1);
    	}
    	try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			Adder obj = new Adder();
			System.out.println(""+a+"+"+b+"="+ obj.add(a,b));
		} catch (Exception e) {
			log.error("Adder error ",e);
    		System.exit(2);
		}
    	
    }
}
