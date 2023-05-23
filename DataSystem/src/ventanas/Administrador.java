package ventanas;

import java.sql.*;
import clases.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;

public class Administrador extends javax.swing.JFrame {

    String user, user_name;
    public static int session_user;

    public Administrador() {
        initComponents();
        user = Login.user;
        session_user = 1;
        setSize(650, 430);
        setResizable(false);
        setTitle("Administrador - Sesión de " + user);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        ImageIcon wallpaper = new ImageIcon("src/images/wallpaperPrincipal.jpg");
        Icon icon = new ImageIcon(wallpaper.getImage().getScaledInstance(label_wallpaper.getWidth(),
                label_wallpaper.getHeight(), Image.SCALE_DEFAULT));
        label_wallpaper.setIcon(icon);
        this.repaint();

        try {
            Connection cn = Conexion.conect();
            PreparedStatement pst = cn.prepareStatement(
                    "select nombre_usuario from usuarios where username = '" + user + "'");

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                user_name = rs.getString("nombre_usuario");
                label_userName.setText(user_name);
            }
        } catch (SQLException e) {
            System.err.println("ERROR en conexion desde la interfaz Administrador.");
        }
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icon.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        label_userName = new javax.swing.JLabel();
        btn_registerUser = new javax.swing.JButton();
        btn_manageUser = new javax.swing.JButton();
        btn_Creativity = new javax.swing.JButton();
        btn_userCapturer = new javax.swing.JButton();
        btn_userTechnical = new javax.swing.JButton();
        btn_about = new javax.swing.JButton();
        label_register = new javax.swing.JLabel();
        label_manage = new javax.swing.JLabel();
        label_creativity = new javax.swing.JLabel();
        label_capturer = new javax.swing.JLabel();
        label_technical = new javax.swing.JLabel();
        label_about = new javax.swing.JLabel();
        label_Footer = new javax.swing.JLabel();
        label_wallpaper = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setIconImages(getIconImages());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_userName.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        label_userName.setForeground(new java.awt.Color(255, 255, 255));
        label_userName.setText("User");
        getContentPane().add(label_userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btn_registerUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addUser.png"))); // NOI18N
        btn_registerUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerUserActionPerformed(evt);
            }
        });
        getContentPane().add(btn_registerUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 120, 100));

        btn_manageUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/informationuser.png"))); // NOI18N
        btn_manageUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_manageUserActionPerformed(evt);
            }
        });
        getContentPane().add(btn_manageUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 120, 100));

        btn_Creativity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/creatividad.png"))); // NOI18N
        getContentPane().add(btn_Creativity, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 120, 100));

        btn_userCapturer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/capturista.png"))); // NOI18N
        btn_userCapturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_userCapturerActionPerformed(evt);
            }
        });
        getContentPane().add(btn_userCapturer, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 120, 100));

        btn_userTechnical.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tecnico.png"))); // NOI18N
        btn_userTechnical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_userTechnicalActionPerformed(evt);
            }
        });
        getContentPane().add(btn_userTechnical, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 120, 100));

        btn_about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/geekipedia.png"))); // NOI18N
        btn_about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aboutActionPerformed(evt);
            }
        });
        getContentPane().add(btn_about, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 120, 100));

        label_register.setForeground(new java.awt.Color(255, 255, 255));
        label_register.setText("Registrar Ususario");
        getContentPane().add(label_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        label_manage.setForeground(new java.awt.Color(255, 255, 255));
        label_manage.setText("Gestionar Usuario");
        getContentPane().add(label_manage, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, -1, -1));

        label_creativity.setForeground(new java.awt.Color(255, 255, 255));
        label_creativity.setText("Creatividad");
        getContentPane().add(label_creativity, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, -1, -1));

        label_capturer.setForeground(new java.awt.Color(255, 255, 255));
        label_capturer.setText("Panel Vista Capturiata");
        getContentPane().add(label_capturer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        label_technical.setForeground(new java.awt.Color(255, 255, 255));
        label_technical.setText("Panel Vista Tecnico");
        getContentPane().add(label_technical, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, -1, -1));

        label_about.setForeground(new java.awt.Color(255, 255, 255));
        label_about.setText("Acerca de");
        getContentPane().add(label_about, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, -1, -1));

        label_Footer.setText("Creado por MrlnTrrzs13");
        getContentPane().add(label_Footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, -1, -1));
        getContentPane().add(label_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registerUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerUserActionPerformed
        RegistrarUsuarios registerUsers = new RegistrarUsuarios();
        registerUsers.setVisible(true);
    }//GEN-LAST:event_btn_registerUserActionPerformed

    private void btn_manageUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_manageUserActionPerformed
        GestionarUsuarios manageUser = new GestionarUsuarios();
        manageUser.setVisible(true);
    }//GEN-LAST:event_btn_manageUserActionPerformed

    private void btn_userCapturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_userCapturerActionPerformed
        Capturista capturist = new Capturista();
        capturist.setVisible(true);
    }//GEN-LAST:event_btn_userCapturerActionPerformed

    private void btn_userTechnicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_userTechnicalActionPerformed
        Tecnico technical = new Tecnico();
        technical.setVisible(true);
    }//GEN-LAST:event_btn_userTechnicalActionPerformed

    private void btn_aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aboutActionPerformed
        AcercaDe about = new AcercaDe();
        about.setVisible(true);
    }//GEN-LAST:event_btn_aboutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Administrador().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Creativity;
    private javax.swing.JButton btn_about;
    private javax.swing.JButton btn_manageUser;
    private javax.swing.JButton btn_registerUser;
    private javax.swing.JButton btn_userCapturer;
    private javax.swing.JButton btn_userTechnical;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel label_Footer;
    private javax.swing.JLabel label_about;
    private javax.swing.JLabel label_capturer;
    private javax.swing.JLabel label_creativity;
    private javax.swing.JLabel label_manage;
    private javax.swing.JLabel label_register;
    private javax.swing.JLabel label_technical;
    private javax.swing.JLabel label_userName;
    private javax.swing.JLabel label_wallpaper;
    // End of variables declaration//GEN-END:variables
}
