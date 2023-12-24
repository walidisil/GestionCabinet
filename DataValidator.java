/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SRC;

/**
 *
 * @author pc
 */
public class DataValidator {
    public static String passwordRegex = "[a-zA-Z0-9_]{8,30}";
    public static String nssRegex = "[0-9]{12,12}";
    public static String employeCodeRegex = ".*";
    public static String stringRegex = "[a-zA-Z]+";
    public static String dateRegex;
    
    public static enum result
    {
        valid, IntNotInRange, invalidInt, InvalidString
    };
    
    public static boolean checkDate(String date)
    {
        String[] dateParts = date.split("-:");
        int[] datePartsValue = new int[dateParts.length];
        
        return true;
    }
    public static boolean checkService(String service)
    {
        return service.matches(stringRegex);
    
    }
    
    public static boolean checkType(String type)
    {
        return type.matches(stringRegex);
    
    }
    public static result checkString(String string)
    {
        if ( string.matches("[a-zA-Z]+"))
        {
            return result.valid;
        }
        return result.InvalidString;
    }
    public static result checkInt(String num)
    {
        if (num.matches("^[0-9]+$"))
        {
            return result.valid;
        }
        return result.invalidInt;
    }
    public static result checkIntInRange(String num, int min, int max)
    {
        if (DataValidator.checkInt(num) == result.valid)
        {
            
            int value = Integer.parseInt(num);
            
            if (value  >= min && value <= max)
            {
                return result.valid;
            }
            return result.IntNotInRange;
        }
        return result.invalidInt;
    }
}
