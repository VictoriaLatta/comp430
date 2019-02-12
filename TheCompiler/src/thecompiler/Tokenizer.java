/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thecompiler;

/**
 *
 * @author Quelyn
 */
import java.util.*; 

public class Tokenizer

{ 
    public static List<String> tokenize(String Path) 
    { 
        
        List<String> myList = new ArrayList<>(); //List for Tokens
        String myString = fileReader.readAllBytesJava7(Path);
               
        StringTokenizer st =  
             new StringTokenizer( myString, "(,),{,},-,+, ,=,:,;,<,>,#,\",.,!,[,],',\\,%,*,&,",  true); 
        while (st.hasMoreTokens()) 
            myList.add(st.nextToken());
        
        List<String> myList2 = cleanTokens.cleanTokens(myList);
        /*This method call will remove white space, empty strings
        and recognize special characters such as \n and \t as tokens
        */
             
    return myList2;
    } 
} 
