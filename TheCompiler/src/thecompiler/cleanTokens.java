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

import org.apache.commons.lang3.StringUtils;
public class cleanTokens {
    
public static List<String> cleanTokens(List<String> listToClean){
List<String> myList = listToClean;
List<String> myList2 = new ArrayList<>();
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
