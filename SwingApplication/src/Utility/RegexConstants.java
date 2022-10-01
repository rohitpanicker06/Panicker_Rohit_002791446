/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utility;

/**
 *
 * @author Rahul
 */
public class RegexConstants {
    
    public static String NAME_REGEX = "^[A-Za-z]\\w{5,29}$";
    public static String INTEGER_REGEX = "^[1-9][0-9]{0,2}(?:,[0-9]{3}){0,3}$";
    public static String EMAIL_REGEX = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
    public static String PHONE_NUMBER_VALIDATOR_10_DIGIT = "^[0-9]{10}$";
        
}
