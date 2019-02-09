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
               
        StringTokenizer st =  
             new StringTokenizer( myString, "(,),{,},-,+, ,=,:,;,<,>,#,\",.,!,[,],',\\,",  true); 
        while (st.hasMoreTokens()) 
            myList.add(st.nextToken());
        
        for (int i = 0; i < myList.size(); i++) {
            
            if (StringUtils.isNotBlank(myList.get(i))){
            }else{myList.remove(myList.get(i));
            }
                       
        }    
        
        for (int j = 0; j < myList.size(); j++) {
           
            myList.set(j,myList.get(j).trim());
            
            if ("".equals(myList.get(j))){
            } 
            else {
                
                myList2.add(myList.get(j));
            }
        }   
                
        for (int i = 1; i < myList2.size(); i++) {
            
            //System.out.println(myList2.get(i).charAt(0));
            char x = myList2.get(i).charAt(0);
            char y = myList2.get(i-1).charAt(0);
            if (x == 't'){
                if (y == '\\'){
                    myList2.set(i-1,"\\t");
                    if(myList2.get(i).length() > 1){
                        myList2.set(i, myList2.get(i).substring(1));
                    }else{myList2.remove(i);}
                }
            }    
            
               
        }
        
        for (int k = 1; k < myList2.size(); k++) {
            
            //System.out.println(myList2.get(k).charAt(0));
            char x = myList2.get(k).charAt(0);
            char y = myList2.get(k-1).charAt(0);
            if (x == 'n'){
                if (y == '\\'){
                    myList2.set(k-1,"\\n");
                    if(myList2.get(k).length() > 1){
                        myList2.set(k, myList2.get(k).substring(1));
                    }else{myList2.remove(k);}
                }
            }    
            
               
        }
             
    return myList2;
    } 
} 
