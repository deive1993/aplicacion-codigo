package Clases;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Aplicacion extends JFrame {

    JLabel et1, et2;
    JTextField txt1, txt2;
    JButton b1, b2;
    JPanel panel;

    public Aplicacion() {
        super("SUMA");
        Container contenedor = getContentPane();
        et1 = new JLabel("NOMBRE");
        et2 = new JLabel("EDAD");
        txt1 = new JTextField(10);
        txt2 = new JTextField(10);
        b1 = new JButton("ACEPTAR");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"guardado", "informacion", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        b2 = new JButton("SALIR");
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 5, 5));
        panel.add(et1);
        panel.add(txt1);
        panel.add(et2);
        panel.add(txt2);
        panel.add(b1);
        panel.add(b2);
        contenedor.add(panel,BorderLayout.CENTER);
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        
        
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
        }
        Aplicacion app = new Aplicacion();
    }

}
