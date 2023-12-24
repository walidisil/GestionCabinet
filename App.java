/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SRC;

import GUI.*;
import GUI.AdminSectionGUI.EmployeSection;
import UTILS.SimplifyConnection;
import UTILS.SimplifyStatement;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Dimension;
import javax.swing.JComponent;

/**
 *
 * @author pc
 */
public class App {
    public static JComponent currentComponent;
    public static AppGUI window = null;
    public static AuthentificateGUI authentificatePanel = null;
    public static EmployeGUI employeePanel = null;
    public static ClientGUI clientPanel = null;
    public static AdminGUI adminPanel = null;
    public static ResponsableGUI responsablePanel = null;
    public static int windowWidth;
    public static int windowHeight;
    
    public static void init(AppGUI app)
    {
        DBConnection.connection = new SimplifyConnection();
        DBConnection.statement = DBConnection.connection.statement();
        
        window = app;        
        window.setVisible(true);
        
        
//        adminPanel = new AdminGUI();
//        adminPanel.setVisible(true);
//        adminPanel.setSize(window.getWidth(), window.getHeight());
//        window.add(adminPanel);
        
        authentificatePanel = new AuthentificateGUI();
        adminPanel = new  AdminGUI();
        employeePanel = new EmployeGUI();
        clientPanel = new ClientGUI();
        responsablePanel = new ResponsableGUI();
        
        window.add(authentificatePanel);
        window.setSize(authentificatePanel.getWidth(), authentificatePanel.getHeight());

        currentComponent = authentificatePanel;
        
    }
    
    public static void setPanel(JComponent panel)
    {
        
        
        window.setSize(panel.getWidth(), panel.getHeight());
        
        window.remove(currentComponent);
        currentComponent.setVisible(false);
        
        window.add(panel);
        panel.setVisible(true);
        
        
        currentComponent = panel;
    }
}
