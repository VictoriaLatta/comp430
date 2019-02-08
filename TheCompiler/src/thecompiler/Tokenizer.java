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
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.apache.commons.lang3.StringUtils;

public class Tokenizer

{ 
    public static List<String> tokenize(String Path) 
    { 
        
        List<String> myList = new ArrayList<>(); //List for Tokens
        List<String> myList2 = new ArrayList<>(); //List for Tokens
        String myString = fileReader.readAllBytesJava7(Path);
        System.out.println(myString);
        
        StringTokenizer st =  
             new StringTokenizer( myString, "(,),{,},-,+, ,=,:,;,<,>,#,\",.,!,",  true); 
        while (st.hasMoreTokens()) 
            myList.add(st.nextToken());
        
        for (int i = 0; i < myList.size(); i++) {
            
            if (StringUtils.isNotBlank(myList.get(i))){
            }else{myList.remove(myList.get(i));
            }
                       
        }    
        
        for (int i = 0; i < myList.size(); i++) {
            
            myList.set(i,myList.get(i).trim());
            
            if ("".equals(myList.get(i))){
            } 
            else {
                
                myList2.add(myList.get(i));
            }
        
        }
        
        for (int j = 0; j <myList2.size(); j++) {
            System.out.println(myList2.get(j));
        }
                
        System.out.println(myList.size());
    return myList2;
    } 
} 
