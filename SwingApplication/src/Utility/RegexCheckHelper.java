/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author rohitPanicker
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
    
    
    public static void main(String[] args) throws ParseException {
        String name =  "Rohit";
        System.out.println(RegexCheckHelper.dynamicRegexCheckHelper(RegexConstants.NAME_REGEX, name));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        String dateInString = "12/02/2013";
        Date date = simpleDateFormat.parse(dateInString);
        System.out.println(date.getYear());
        boolean result = true;
        if(result)
        {
            System.out.println("false aya");
        }
        else
        {
            System.out.println("true aya");
        }
        
    }
    
}
