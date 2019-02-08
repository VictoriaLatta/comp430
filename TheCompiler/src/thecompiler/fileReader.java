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
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
 
public class fileReader 
{
    
 
    //Read file content into string with - Files.readAllBytes(Path path)
 
    public static String readAllBytesJava7(String filePath)
    {
        String content = "";
 
        try
        {
            content = new String ( Files.readAllBytes( Paths.get(filePath) ) );
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
 
        return content;
    }
}
