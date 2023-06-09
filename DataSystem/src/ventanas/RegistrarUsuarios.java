/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import clases.Conexion;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author ma
 */
public class RegistrarUsuarios extends javax.swing.JFrame {

    String user;

    /**
     * Creates new form RegistarUsuarios
     */
    public RegistrarUsuarios() {
        initComponents();
        user = Login.user;

        setTitle("Registrar nuevo Ususario - Sesión de " + user);
        setSize(630, 350);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        ImageIcon wallpaper = new ImageIcon("src/images/wallpaperPrincipal.jpg");
        Icon icon = new ImageIcon(wallpaper.getImage().getScaledInstance(label_wallpaper.getWidth(),
                label_wallpaper.getHeight(), Image.SCALE_DEFAULT));
        label_wallpaper.setIcon(icon);
        this.repaint();
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

        label_titleRegister = new javax.swing.JLabel();
        label_name = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        label_mail = new javax.swing.JLabel();
        txt_mail = new javax.swing.JTextField();
        label_phone = new javax.swing.JLabel();
        txt_phone = new javax.swing.JTextField();
        label_permission = new javax.swing.JLabel();
        cmb_level = new javax.swing.JComboBox<>();
        label_Username = new javax.swing.JLabel();
        txt_Username = new javax.swing.JTextField();
        label_password = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        btn_add = new javax.swing.JButton();
        label_footer = new javax.swing.JLabel();
        label_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_titleRegister.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label_titleRegister.setForeground(new java.awt.Color(255, 255, 255));
        label_titleRegister.setText("Registro de Usuario");
        getContentPane().add(label_titleRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        label_name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label_name.setForeground(new java.awt.Color(255, 255, 255));
        label_name.setText("Nombre:");
        getContentPane().add(label_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        txt_name.setBackground(new java.awt.Color(153, 153, 255));
        txt_name.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_name.setForeground(new java.awt.Color(255, 255, 255));
        txt_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_name.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 210, -1));

        label_mail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label_mail.setForeground(new java.awt.Color(255, 255, 255));
        label_mail.setText("Email:");
        getContentPane().add(label_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        txt_mail.setBackground(new java.awt.Color(153, 153, 255));
        txt_mail.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_mail.setForeground(new java.awt.Color(255, 255, 255));
        txt_mail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_mail.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 210, -1));

        label_phone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label_phone.setForeground(new java.awt.Color(255, 255, 255));
        label_phone.setText("Telefono:");
        getContentPane().add(label_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        txt_phone.setBackground(new java.awt.Color(153, 153, 255));
        txt_phone.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_phone.setForeground(new java.awt.Color(255, 255, 255));
        txt_phone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_phone.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 210, -1));

        label_permission.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label_permission.setForeground(new java.awt.Color(255, 255, 255));
        label_permission.setText("Permisos de:");
        getContentPane().add(label_permission, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        cmb_level.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Capturista", "Tecnico" }));
        getContentPane().add(cmb_level, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        label_Username.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label_Username.setForeground(new java.awt.Color(255, 255, 255));
        label_Username.setText("Username:");
        getContentPane().add(label_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        txt_Username.setBackground(new java.awt.Color(153, 153, 255));
        txt_Username.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_Username.setForeground(new java.awt.Color(255, 255, 255));
        txt_Username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Username.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 210, -1));

        label_password.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label_password.setForeground(new java.awt.Color(255, 255, 255));
        label_password.setText("Password:");
        getContentPane().add(label_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        txt_password.setBackground(new java.awt.Color(153, 153, 255));
        txt_password.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_password.setForeground(new java.awt.Color(255, 255, 255));
        txt_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_password.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 210, -1));

        btn_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        getContentPane().add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 120, 100));

        label_footer.setText("Creado por MrlnTrrzs13");
        getContentPane().add(label_footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, -1, -1));
        getContentPane().add(label_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        int permissions_cmb, validation = 0;
        String name, mail, phone, userName, password, permissions_string = "";

        name = txt_name.getText().trim();
        mail = txt_mail.getText().trim();
        phone = txt_phone.getText().trim();
        userName = txt_Username.getText().trim();
        password = txt_password.getText().trim();
        permissions_cmb = cmb_level.getSelectedIndex() + 1;

        if (name.equals("")) {
            txt_name.setBackground(Color.red);
            validation++;
        }
        if (mail.equals("")) {
            txt_mail.setBackground(Color.red);
            validation++;
        }
        if (phone.equals("")) {
            txt_phone.setBackground(Color.red);
            validation++;
        }
        if (userName.equals("")) {
            txt_Username.setBackground(Color.red);
            validation++;
        }
        if (password.equals("")) {
            txt_password.setBackground(Color.red);
            validation++;
        }
        if (permissions_cmb == 1) {
            permissions_string = "Administrador";
        } else if (permissions_cmb == 2) {
            permissions_string = "Capturista";
        } else if (permissions_cmb == 3) {
            permissions_string = "Tecnico";
        }

        try {
            Connection cn = Conexion.conect();
            PreparedStatement pst = cn.prepareStatement(
                    "select username from usuarios where username  = '" + userName + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txt_Username.setBackground(Color.red);
                JOptionPane.showMessageDialog(null, "Nombre del Ususario no disponible.");
                cn.close();
            } else {
                cn.close();

                if (validation == 0) {
                    try {
                        Connection cn2 = Conexion.conect();
                        PreparedStatement pst2 = cn2.prepareStatement(
                                "insert into usuarios values (?,?,?,?,?,?,?,?,?)");

                        pst2.setInt(1, 0);
                        pst2.setString(2, name);
                        pst2.setString(3, mail);
                        pst2.setString(4, phone);
                        pst2.setString(5, userName);
                        pst2.setString(6, password);
                        pst2.setString(7, permissions_string);
                        pst2.setString(8, "Activo");
                        pst2.setString(9, user);

                        pst2.executeUpdate();
                        cn2.close();

                        Clear();

                        txt_mail.setBackground(Color.GREEN);
                        txt_Username.setBackground(Color.GREEN);
                        txt_password.setBackground(Color.GREEN);
                        txt_name.setBackground(Color.GREEN);
                        txt_phone.setBackground(Color.GREEN);

                        JOptionPane.showMessageDialog(null, "Registro exitoso.");
                        this.dispose();
                    } catch (SQLException e) {
                        System.err.println("ERROR en Registrar usuario. " + e);
                        JOptionPane.showMessageDialog(null, "¡¡ERROR al registrar!!, contacte al administrador.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos.");
                }
            }
        } catch (SQLException e) {
            System.err.println("ERROR en validar nombre de usuario." + e);
            JOptionPane.showMessageDialog(null, "¡ERROR al comparar usuario!. Contacte al Administrador");
        }
    }//GEN-LAST:event_btn_addActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JComboBox<String> cmb_level;
    private javax.swing.JLabel label_Username;
    private javax.swing.JLabel label_footer;
    private javax.swing.JLabel label_mail;
    private javax.swing.JLabel label_name;
    private javax.swing.JLabel label_password;
    private javax.swing.JLabel label_permission;
    private javax.swing.JLabel label_phone;
    private javax.swing.JLabel label_titleRegister;
    private javax.swing.JLabel label_wallpaper;
    private javax.swing.JTextField txt_Username;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_name;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_phone;
    // End of variables declaration//GEN-END:variables

    public void Clear() {
        txt_name.setText("");
        txt_mail.setText("");
        txt_password.setText("");
        txt_phone.setText("");
        txt_Username.setText("");
        cmb_level.setSelectedIndex(0);
    }
}
