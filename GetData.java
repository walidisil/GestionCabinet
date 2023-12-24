/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SRC;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JTextField;

/**
 *
 * @author pc
 */
public class GetData {
    
    
    
    public static HashMap<String, String> getData(HashMap<JTextField, String> inputData, boolean acceptEmptyData)
    {
        
//        make this function take a dictionnary of jtextField variable : column name to be able to use it in other places
        HashMap<String, String> data = new HashMap();
        String tempValue;
        String columnName;
        JTextField textField;
        
        for (Map.Entry<JTextField, String> entry : inputData.entrySet())
        {
            textField = entry.getKey();
            columnName = entry.getValue();
            tempValue = textField.getText();
            
            if (! tempValue.equals(""))
            {
                data.put(columnName, tempValue);
            }
            else if (acceptEmptyData)
            {
                data.put(columnName, tempValue);
            }
        }
        System.out.println(data);
        return data;
    }
}
