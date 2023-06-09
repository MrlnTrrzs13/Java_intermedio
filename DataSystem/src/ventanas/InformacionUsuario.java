package ventanas;

import java.sql.*;
import clases.Conexion;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author mrln
 */
public class InformacionUsuario extends javax.swing.JFrame {
    
    String user = "", user_update = "";
    int id;

    /**
     * Creates new form InformacionUsuario
     */
    public InformacionUsuario() {
        initComponents();
        user = Login.user;
        user_update = GestionarUsuarios.user_uptade;
        
        setSize(630, 450);
        setResizable(false);
        setTitle("Información del usuario " + user_update + " - Sesión de " + user);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        ImageIcon wallpaper = new ImageIcon("src/images/wallpaperPrincipal.jpg");
        Icon icon = new ImageIcon(wallpaper.getImage().getScaledInstance(label_wallpaper.getWidth(),
                label_wallpaper.getHeight(), Image.SCALE_DEFAULT));
        label_wallpaper.setIcon(icon);
        this.repaint();
        
        label_titleInfo.setText("Información del usuario " + user_update);
        
        try {
            Connection cn = Conexion.conect();
            PreparedStatement pst = cn.prepareStatement(
                    "select * from usuarios where username = '" + user_update + "'");
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()) {
                id = rs.getInt("id_usuario");
                
                txt_name.setText(rs.getString("nombre_usuario"));
                txt_mail.setText(rs.getString("email"));
                txt_phone.setText(rs.getString("telefono"));
                txt_userName.setText(rs.getString("username"));
                txt_registeredBy.setText(rs.getString("registrado_por"));
                
                cmb_lavelType.setSelectedItem(rs.getString("tipo_nivel"));
                cmb_status.setSelectedItem(rs.getString("status"));
            }
            cn.close();
            
        } catch (SQLException e) {
            System.err.println("ERROR en cargar usuario. " + e);
            JOptionPane.showMessageDialog(null, "¡¡ERROR al cargar!!, Contacte al Administrador.");
        }
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

        label_titleInfo = new javax.swing.JLabel();
        label_name = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        label_mail = new javax.swing.JLabel();
        txt_mail = new javax.swing.JTextField();
        label_phone = new javax.swing.JLabel();
        txt_phone = new javax.swing.JTextField();
        label_levelType = new javax.swing.JLabel();
        cmb_lavelType = new javax.swing.JComboBox<>();
        label_userName = new javax.swing.JLabel();
        txt_userName = new javax.swing.JTextField();
        label_status = new javax.swing.JLabel();
        cmb_status = new javax.swing.JComboBox<>();
        label_registeredBy = new javax.swing.JLabel();
        txt_registeredBy = new javax.swing.JTextField();
        btn_update = new javax.swing.JButton();
        btn_password = new javax.swing.JButton();
        label_footer = new javax.swing.JLabel();
        label_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_titleInfo.setFont(new java.awt.Font("DejaVuSansMono Nerd Font", 1, 24)); // NOI18N
        label_titleInfo.setForeground(new java.awt.Color(255, 255, 255));
        label_titleInfo.setText("Información del Usuario");
        getContentPane().add(label_titleInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        label_name.setFont(new java.awt.Font("DejaVuSansMono Nerd Font", 0, 12)); // NOI18N
        label_name.setForeground(new java.awt.Color(255, 255, 255));
        label_name.setText("Nombre:");
        getContentPane().add(label_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        txt_name.setBackground(new java.awt.Color(153, 153, 255));
        txt_name.setFont(new java.awt.Font("DejaVuSansMono Nerd Font", 1, 16)); // NOI18N
        txt_name.setForeground(new java.awt.Color(255, 255, 255));
        txt_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_name.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 210, -1));

        label_mail.setFont(new java.awt.Font("DejaVuSansMono Nerd Font", 0, 12)); // NOI18N
        label_mail.setForeground(new java.awt.Color(255, 255, 255));
        label_mail.setText("email:");
        getContentPane().add(label_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        txt_mail.setBackground(new java.awt.Color(153, 153, 255));
        txt_mail.setFont(new java.awt.Font("DejaVuSansMono Nerd Font", 1, 16)); // NOI18N
        txt_mail.setForeground(new java.awt.Color(255, 255, 255));
        txt_mail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_mail.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 210, -1));

        label_phone.setFont(new java.awt.Font("DejaVuSansMono Nerd Font", 0, 12)); // NOI18N
        label_phone.setForeground(new java.awt.Color(255, 255, 255));
        label_phone.setText("telefono:");
        getContentPane().add(label_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        txt_phone.setBackground(new java.awt.Color(153, 153, 255));
        txt_phone.setFont(new java.awt.Font("DejaVuSansMono Nerd Font", 1, 16)); // NOI18N
        txt_phone.setForeground(new java.awt.Color(255, 255, 255));
        txt_phone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_phone.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 210, -1));

        label_levelType.setFont(new java.awt.Font("DejaVuSansMono Nerd Font", 0, 12)); // NOI18N
        label_levelType.setForeground(new java.awt.Color(255, 255, 255));
        label_levelType.setText("Permisos de:");
        getContentPane().add(label_levelType, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        cmb_lavelType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Capturista", "Tecnico" }));
        getContentPane().add(cmb_lavelType, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        label_userName.setFont(new java.awt.Font("DejaVuSansMono Nerd Font", 0, 12)); // NOI18N
        label_userName.setForeground(new java.awt.Color(255, 255, 255));
        label_userName.setText("Username:");
        getContentPane().add(label_userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        txt_userName.setBackground(new java.awt.Color(153, 153, 255));
        txt_userName.setFont(new java.awt.Font("DejaVuSansMono Nerd Font", 1, 16)); // NOI18N
        txt_userName.setForeground(new java.awt.Color(255, 255, 255));
        txt_userName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_userName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 210, -1));

        label_status.setFont(new java.awt.Font("DejaVuSansMono Nerd Font", 0, 12)); // NOI18N
        label_status.setForeground(new java.awt.Color(255, 255, 255));
        label_status.setText("Estatus:");
        getContentPane().add(label_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        cmb_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        getContentPane().add(cmb_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        label_registeredBy.setFont(new java.awt.Font("DejaVuSansMono Nerd Font", 0, 12)); // NOI18N
        label_registeredBy.setForeground(new java.awt.Color(255, 255, 255));
        label_registeredBy.setText("Registrado por:");
        getContentPane().add(label_registeredBy, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, -1, -1));

        txt_registeredBy.setBackground(new java.awt.Color(153, 153, 255));
        txt_registeredBy.setFont(new java.awt.Font("DejaVuSansMono Nerd Font", 1, 16)); // NOI18N
        txt_registeredBy.setForeground(new java.awt.Color(255, 255, 255));
        txt_registeredBy.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_registeredBy.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_registeredBy.setEnabled(false);
        getContentPane().add(txt_registeredBy, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 210, -1));

        btn_update.setBackground(new java.awt.Color(153, 153, 255));
        btn_update.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        btn_update.setForeground(new java.awt.Color(255, 255, 255));
        btn_update.setText("Actualizar Ususario");
        btn_update.setBorder(null);
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 210, 35));

        btn_password.setBackground(new java.awt.Color(153, 153, 255));
        btn_password.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        btn_password.setForeground(new java.awt.Color(255, 255, 255));
        btn_password.setText("Restaurar Password");
        btn_password.setBorder(null);
        btn_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_passwordActionPerformed(evt);
            }
        });
        getContentPane().add(btn_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 210, 35));

        label_footer.setText("Creado por MrlnTrrzs13");
        getContentPane().add(label_footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, -1, -1));
        getContentPane().add(label_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        int permissions_cmb, status_cmb, validation = 0;
        String name, mail, phone, username, permissions_string = "", status_string = "";
        
        name = txt_name.getText().trim();
        mail = txt_mail.getText().trim();
        username = txt_userName.getText().trim();
        phone = txt_phone.getText().trim();
        permissions_cmb = cmb_lavelType.getSelectedIndex() + 1;
        status_cmb = cmb_status.getSelectedIndex() + 1;
        
        if (name.equals("")) {
            txt_name.setBackground(Color.red);
            validation++;
        }
        if (mail.equals("")) {
            txt_mail.setBackground(Color.red);
            validation++;
        }
        if (username.equals("")) {
            txt_userName.setBackground(Color.red);
            validation++;
        }
        if (phone.equals("")) {
            txt_phone.setBackground(Color.red);
            validation++;
        }
        if (validation == 0) {
            if (permissions_cmb == 1) {
                permissions_string = "Administrador";
            }
            if (permissions_cmb == 2) {
                permissions_string = "Capturista";
            }
            if (permissions_cmb == 3) {
                permissions_string = "Tecnico";
            }
            
            if (status_cmb == 1) {
                status_string = "Activo";
            } else if (status_cmb == 2) {
                permissions_string = "Inactivo";
            }
            
            try {
                Connection cn = Conexion.conect();
                PreparedStatement pst = cn.prepareStatement(
                        "select username from usuarios where username = '" + username + "' and not id_usuario = '" + id + "'");
                ResultSet rs = pst.executeQuery();
                
                if (rs.next()) {
                    txt_userName.setBackground(Color.red);
                    JOptionPane.showMessageDialog(null, "Nombre de usuario no disponible");
                    cn.close();
                } else {
                    
                    Connection cn2 = Conexion.conect();
                    PreparedStatement pst2 = cn2.prepareStatement(
                            "update usuarios set nombre_usuario=?, email=?, telefono=?, username=?, tipo_nivel=?, status=? "
                            + "where id_usuario = '" + id + "'");
                    
                    pst2.setString(1, name);
                    pst2.setString(2, mail);
                    pst2.setString(3, phone);
                    pst2.setString(4, username);
                    pst2.setString(5, permissions_string);
                    pst2.setString(6, status_string);
                    
                    pst2.executeUpdate();
                    cn2.close();
                    
                    JOptionPane.showMessageDialog(null, "Modificación Exitosa.");
                }
                
            } catch (SQLException e) {
                System.err.println("ERROR al actualizar.");
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
        }

    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_passwordActionPerformed
        RestaurarPassword resetPassword = new RestaurarPassword();
        resetPassword.setVisible(true);
    }//GEN-LAST:event_btn_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(InformacionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_password;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> cmb_lavelType;
    private javax.swing.JComboBox<String> cmb_status;
    private javax.swing.JLabel label_footer;
    private javax.swing.JLabel label_levelType;
    private javax.swing.JLabel label_mail;
    private javax.swing.JLabel label_name;
    private javax.swing.JLabel label_phone;
    private javax.swing.JLabel label_registeredBy;
    private javax.swing.JLabel label_status;
    private javax.swing.JLabel label_titleInfo;
    private javax.swing.JLabel label_userName;
    private javax.swing.JLabel label_wallpaper;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JTextField txt_registeredBy;
    private javax.swing.JTextField txt_userName;
    // End of variables declaration//GEN-END:variables
}
