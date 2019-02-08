/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thecompiler;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Quelyn
 */
public class TheCompiler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    List<String> myList = new ArrayList<>(); //List for Tokens
    myList = Tokenizer.tokenize("c:/users/quelyn/documents/testC.c");
    
    }
    
}
