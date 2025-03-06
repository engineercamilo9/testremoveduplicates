package com.tests;

import java.lang.reflect.Array;
import java.util.stream.Collectors;

/**
 * remove duplicates
 *
 */
public class App 
{
    public static String remduplicates(String initiachain){
        if(initiachain==null){
            return "";
        }
        
        return initiachain.chars()
        .distinct() 
        .mapToObj(c -> String.valueOf((char) c)) 
        .collect(Collectors.joining());
    }
    public static void main( String[] args )
    {
        String input=args[0];
        System.out.println(remduplicates(input));
        
    }
}
