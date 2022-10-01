/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Rahul
 */
public class RegexCheckHelper {
    
    
    public static boolean dynamicRegexCheckHelper(String regex, String variableString)
    {
        Pattern p = Pattern.compile(regex);
        if (variableString == null) {
            return false;
        }
  
        Matcher m = p.matcher(variableString);
 
        return m.matches();
 
    }
    
}
