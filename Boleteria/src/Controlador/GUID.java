/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUID {

    public void limpiar_texto(JPanel panel) {
        for (int i = 0; panel.getComponents().length > i; i++) {
            if (panel.getComponents()[i] instanceof JTextField) {
                ((JTextField) panel.getComponents()[i]).setText("");
            } else if (panel.getComponents()[i] instanceof JPasswordField) {
                ((JPasswordField) panel.getComponents()[i]).setText("");
            }
        }
    }

    public void Enable_Desa(JPanel panel, boolean x) {
        for (int i = 0; panel.getComponents().length > i; i++) {
            if (panel.getComponents()[i] instanceof JTextField) {
                ((JTextField) panel.getComponents()[i]).setEnabled(x);
            } else if (panel.getComponents()[i] instanceof JButton) {
                ((JButton) panel.getComponents()[i]).setEnabled(x);
            }
        }
    }

    public void DeskopPnae(JDesktopPane panel, boolean x) {
        for (int i = 0; panel.getComponents().length > i; i++) {
            if (panel.getComponents()[i] instanceof JInternalFrame) {
                ((JInternalFrame) panel.getComponents()[i]).setVisible(x);
                System.out.println("Encontro");
            } else if (panel.getComponents()[i] instanceof JInternalFrame) {
                ((JInternalFrame) panel.getComponents()[i]).setVisible(x);
            }
        }
    }

    public static java.sql.Date formateadorFecha(String a) throws Exception {

        java.text.SimpleDateFormat format = new java.text.SimpleDateFormat(a);
        java.util.Date utilDate = format.parse(a);
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

        return sqlDate;
    }

}
