/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SRC;

import UTILS.SimplifyResultSet;
import SRC.DBConnection;

/**
 *
 * @author pc
 */
public class Authentificate {
    public static int ADMIN = 1;
    public static int EMPLOYEE = 2;
    public static int CLIENT= 3;
    
    public static boolean Login(String login, String password, int type)
    {
        String table = "";
        String ColName = "";
        if (type == ADMIN)
        {
            ColName = "code_";
            table = "admin";
        }
        else if (type == EMPLOYEE) {
            ColName = "code_";
            table = "employee";
        }
        else if (type == CLIENT) {
            ColName = "login";
            table = "client";
        }
        SimplifyResultSet result = DBConnection.statement.executeQuery(String.format(" select * from %s where %s = '%s' " , table, ColName, login));
        if (result.next())
        {
            System.out.println(result.getString("password_"));
            return result.getString("password_").equals(password);
        }
        else
        {
            System.out.println("No user named walid");
            return false;
        }
    }
    
}
