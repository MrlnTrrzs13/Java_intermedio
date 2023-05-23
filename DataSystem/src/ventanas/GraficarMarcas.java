/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import clases.Conexion;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author mrln
 */
public class GraficarMarcas extends javax.swing.JFrame {

    int hp, lenovo, dell, acer, apple, toshiba, brother, samsung, asus, alienware, xerox;
    String user;
    String[] name_vector = new String[11];
    int[] quantity_vector = new int[11];

    /**
     * Creates new form GraficarEstatus
     */
    public GraficarMarcas() {
        initComponents();
        user = Login.user;

        setTitle("Tecnico - Sesión de " + user);
        setSize(550, 450);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        ImageIcon wallpaper = new ImageIcon("src/images/wallpaperPrincipal.jpg");
        Icon icon = new ImageIcon(wallpaper.getImage().getScaledInstance(label_wallpaper.getWidth(),
                label_wallpaper.getHeight(), Image.SCALE_DEFAULT));
        label_wallpaper.setIcon(icon);
        this.repaint();

        try {
            Connection cn = Conexion.conect();
            PreparedStatement pst = cn.prepareStatement(
                    "select marca, count(marca) as Marcas from equipos group by marca");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                int position = 0;
                do {
                    name_vector[position] = rs.getString(1);
                    quantity_vector[position] = rs.getInt(2);

                    if (name_vector[position].equalsIgnoreCase("Acer")) {
                        acer = quantity_vector[position];
                    } else if (name_vector[position].equalsIgnoreCase("Alienware")) {
                        alienware = quantity_vector[position];
                    } else if (name_vector[position].equalsIgnoreCase("Apple")) {
                        apple = quantity_vector[position];
                    } else if (name_vector[position].equalsIgnoreCase("Asus")) {
                        asus = quantity_vector[position];
                    } else if (name_vector[position].equalsIgnoreCase("Brother")) {
                        brother = quantity_vector[position];
                    } else if (name_vector[position].equalsIgnoreCase("Dell")) {
                        dell = quantity_vector[position];
                    } else if (name_vector[position].equalsIgnoreCase("Hp")) {
                        hp = quantity_vector[position];
                    } else if (name_vector[position].equalsIgnoreCase("Lenovo")) {
                        lenovo = quantity_vector[position];
                    } else if (name_vector[position].equalsIgnoreCase("Samsung")) {
                        samsung = quantity_vector[position];
                    } else if (name_vector[position].equalsIgnoreCase("Toshiba")) {
                        toshiba = quantity_vector[position];
                    } else if (name_vector[position].equalsIgnoreCase("Xerox")) {
                        xerox = quantity_vector[position];
                    }
                    position++;

                } while (rs.next());
            }

        } catch (SQLException e) {
            System.err.println("Error en la consulta." + e);
            JOptionPane.showMessageDialog(null, "Error en consultar datos, contacte al administrador.");
        }
        repaint();

    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icon.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_title = new javax.swing.JLabel();
        label_footer = new javax.swing.JLabel();
        label_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_title.setFont(new java.awt.Font("DejaVuSansMono Nerd Font", 1, 24)); // NOI18N
        label_title.setForeground(new java.awt.Color(255, 255, 255));
        label_title.setText("Grafica de Marcas");
        getContentPane().add(label_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        label_footer.setText("Creado por MrlnTrrzs13");
        getContentPane().add(label_footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, -1, -1));
        getContentPane().add(label_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GraficarMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraficarMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraficarMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraficarMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GraficarMarcas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel label_footer;
    private javax.swing.JLabel label_title;
    private javax.swing.JLabel label_wallpaper;
    // End of variables declaration//GEN-END:variables

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int totalMake = acer + alienware + asus + apple + brother + dell + hp + lenovo + samsung + toshiba + xerox;

        int degrees_acer = acer * 360 / totalMake;
        int degrees_alienware = alienware * 360 / totalMake;
        int degrees_asus = asus * 360 / totalMake;
        int degrees_apple = apple * 360 / totalMake;
        int degrees_brother = brother * 360 / totalMake;
        int degrees_dell = dell * 360 / totalMake;
        int degrees_hp = hp * 360 / totalMake;
        int degrees_lenovo = lenovo * 360 / totalMake;
        int degrees_samsung = samsung * 360 / totalMake;
        int degrees_toshiba = toshiba * 360 / totalMake;
        int degrees_xerox = xerox * 360 / totalMake;

        //Acer
        g.setColor(new Color(175, 122, 197));//Morado
        g.fillArc(25, 100, 270, 270, 0, degrees_acer);
        g.fillRect(310, 120, 20, 20);
        g.drawString(acer + " de Acer", 340, 135);

        //Alienware
        g.setColor(new Color(0, 85, 0));//verde
        g.fillArc(25, 100, 270, 270, degrees_acer, degrees_alienware);
        g.fillRect(310, 150, 20, 20);
        g.drawString(alienware + " de Alienware", 340, 165);

        //Apple
        g.setColor(new Color(0, 255, 255));//verde agua
        g.fillArc(25, 100, 270, 270, degrees_acer + degrees_alienware, degrees_apple);
        g.fillRect(310, 180, 20, 20);
        g.drawString(apple + " de Apple", 340, 195);

        //Asus
        g.setColor(new Color(55, 0, 255));//azul
        g.fillArc(25, 100, 270, 270, degrees_acer + degrees_alienware + degrees_apple, degrees_asus);
        g.fillRect(310, 210, 20, 20);
        g.drawString(asus + " de Asus", 340, 225);

        //Brother
        g.setColor(new Color(255, 255, 255));//Blanco
        g.fillArc(25, 100, 270, 270, degrees_acer + degrees_alienware + degrees_apple + degrees_asus, degrees_brother);
        g.fillRect(310, 240, 20, 20);
        g.drawString(brother + " de Brother", 340, 255);

        //Dell
        g.setColor(new Color(240, 248, 0));//Amarillo
        g.fillArc(25, 100, 270, 270,
                degrees_acer + degrees_alienware + degrees_apple + degrees_asus + degrees_brother, degrees_dell);
        g.fillRect(310, 270, 20, 20);
        g.drawString(dell + " de Dell", 340, 285);

        //Hp
        g.setColor(new Color(21, 42, 160));//AzulMarino
        g.fillArc(25, 100, 270, 270,
                degrees_acer + degrees_alienware + degrees_apple + degrees_asus + degrees_brother + degrees_dell, degrees_hp);
        g.fillRect(310, 300, 20, 20);
        g.drawString(hp + " de Hp", 340, 315);

        //Lenovo
        g.setColor(new Color(215, 96, 0));//Naranja
        g.fillArc(25, 100, 270, 270,
                degrees_acer + degrees_alienware + degrees_apple + degrees_asus + degrees_brother + degrees_dell + degrees_hp,
                degrees_lenovo);
        g.fillRect(310, 330, 20, 20);
        g.drawString(lenovo + " de Lenovo", 340, 345);

        //Samsung
        g.setColor(new Color(215, 96, 140));//Rosa
        g.fillArc(25, 100, 270, 270,
                degrees_acer + degrees_alienware + degrees_apple + degrees_asus + degrees_brother + degrees_dell + degrees_hp
                + degrees_lenovo, degrees_samsung);
        g.fillRect(430, 120, 20, 20);
        g.drawString(samsung + " de Samsung", 460, 135);

        //Toshiba
        g.setColor(new Color(215, 196, 25));//Amarillo Canario
        g.fillArc(25, 100, 270, 270,
                degrees_acer + degrees_alienware + degrees_apple + degrees_asus + degrees_brother + degrees_dell + degrees_hp
                + degrees_lenovo + degrees_samsung, degrees_toshiba);
        g.fillRect(430, 150, 20, 20);
        g.drawString(toshiba + " de Toshiba", 460, 165);

        //Xerox
        g.setColor(new Color(93, 173, 226));//Amarillo Canario
        g.fillArc(25, 100, 270, 270,
                degrees_acer + degrees_alienware + degrees_apple + degrees_asus + degrees_brother + degrees_dell + degrees_hp
                + degrees_lenovo + degrees_samsung + degrees_toshiba, degrees_xerox);
        g.fillRect(430, 180, 20, 20);
        g.drawString(xerox + " de Xerox", 460, 195);

    }
}