/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import java.util.Calendar;
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
public class RegistrarEquipo extends javax.swing.JFrame {

    int id_clientUp = 0;
    String user = "", name_client = "";

    /**
     * Creates new form RegistrarEquipo
     */
    public RegistrarEquipo() {
        initComponents();
        user = Login.user;
        id_clientUp = GestionarClientes.id_clientUp;

        try {
            Connection cn = Conexion.conect();
            PreparedStatement pst = cn.prepareStatement(
                    "select nombre_cliente from clientes where id_cliente = '" + id_clientUp + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                name_client = rs.getString("nombre_cliente");
            }

        } catch (SQLException e) {
            System.err.println("ERROR al consultar el nombre del cliente.");
        }

        setTitle("Registrar nuevo equipo para " + name_client);
        setSize(630, 445);
        setResizable(false);
        setLocationRelativeTo(null);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        ImageIcon wallpaper = new ImageIcon("src/images/wallpaperPrincipal.jpg");
        Icon icon = new ImageIcon(wallpaper.getImage().getScaledInstance(label_wallpaper.getWidth(),
                label_wallpaper.getHeight(), Image.SCALE_DEFAULT));
        label_wallpaper.setIcon(icon);
        this.repaint();

        txt_name.setText(name_client);
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
        label_name = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        label_equipmentType = new javax.swing.JLabel();
        cmb_equipmentType = new javax.swing.JComboBox<>();
        label_make = new javax.swing.JLabel();
        cmb_make = new javax.swing.JComboBox<>();
        label_model = new javax.swing.JLabel();
        txt_model = new javax.swing.JTextField();
        label_serialNumber = new javax.swing.JLabel();
        txt_serialNumber = new javax.swing.JTextField();
        label_modifiedBy1 = new javax.swing.JLabel();
        btn_register = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pane_observations = new javax.swing.JTextPane();
        label_footer = new javax.swing.JLabel();
        label_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_title.setFont(new java.awt.Font("DejaVuSansMono Nerd Font", 1, 24)); // NOI18N
        label_title.setForeground(new java.awt.Color(255, 255, 255));
        label_title.setText("Registro de equipo");
        getContentPane().add(label_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        label_name.setFont(new java.awt.Font("DejaVuSansMono Nerd Font", 0, 12)); // NOI18N
        label_name.setForeground(new java.awt.Color(255, 255, 255));
        label_name.setText("Nombre del Cliente:");
        getContentPane().add(label_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        txt_name.setBackground(new java.awt.Color(153, 153, 255));
        txt_name.setFont(new java.awt.Font("DejaVuSansMono Nerd Font", 1, 16)); // NOI18N
        txt_name.setForeground(new java.awt.Color(255, 255, 255));
        txt_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_name.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 210, -1));

        label_equipmentType.setFont(new java.awt.Font("DejaVuSansMono Nerd Font", 0, 12)); // NOI18N
        label_equipmentType.setForeground(new java.awt.Color(255, 255, 255));
        label_equipmentType.setText("Tipo de equipo:");
        getContentPane().add(label_equipmentType, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        cmb_equipmentType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laptop", "Desktop", "Impresora", "Multifuncional" }));
        getContentPane().add(cmb_equipmentType, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        label_make.setFont(new java.awt.Font("DejaVuSansMono Nerd Font", 0, 12)); // NOI18N
        label_make.setForeground(new java.awt.Color(255, 255, 255));
        label_make.setText("Marca:");
        getContentPane().add(label_make, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        cmb_make.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acer", "Alienware", "Apple", "Asus", "Brother", "Dell", "Hp", "Lenovo", "Samsung", "Toshiba", "Xerox" }));
        getContentPane().add(cmb_make, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        label_model.setFont(new java.awt.Font("DejaVuSansMono Nerd Font", 0, 12)); // NOI18N
        label_model.setForeground(new java.awt.Color(255, 255, 255));
        label_model.setText("Modelo:");
        getContentPane().add(label_model, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        txt_model.setBackground(new java.awt.Color(153, 153, 255));
        txt_model.setFont(new java.awt.Font("DejaVuSansMono Nerd Font", 1, 16)); // NOI18N
        txt_model.setForeground(new java.awt.Color(255, 255, 255));
        txt_model.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_model.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_model, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 210, -1));

        label_serialNumber.setFont(new java.awt.Font("DejaVuSansMono Nerd Font", 0, 12)); // NOI18N
        label_serialNumber.setForeground(new java.awt.Color(255, 255, 255));
        label_serialNumber.setText("Numero de serie:");
        getContentPane().add(label_serialNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        txt_serialNumber.setBackground(new java.awt.Color(153, 153, 255));
        txt_serialNumber.setFont(new java.awt.Font("DejaVuSansMono Nerd Font", 1, 16)); // NOI18N
        txt_serialNumber.setForeground(new java.awt.Color(255, 255, 255));
        txt_serialNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_serialNumber.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_serialNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 210, -1));

        label_modifiedBy1.setFont(new java.awt.Font("DejaVuSansMono Nerd Font", 0, 12)); // NOI18N
        label_modifiedBy1.setForeground(new java.awt.Color(255, 255, 255));
        label_modifiedBy1.setText("Daño reportado y observaciones:");
        getContentPane().add(label_modifiedBy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        btn_register.setBackground(new java.awt.Color(153, 153, 255));
        btn_register.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        btn_register.setForeground(new java.awt.Color(255, 255, 255));
        btn_register.setText("Registrar Equipo");
        btn_register.setBorder(null);
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });
        getContentPane().add(btn_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 210, 35));

        jScrollPane1.setViewportView(pane_observations);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 330, 230));

        label_footer.setText("Creado por MrlnTrrzs13");
        getContentPane().add(label_footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, -1, -1));
        getContentPane().add(label_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 445));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed
        int validation = 0;
        String equipment_type, make, model, number_serial, day_ingress, month_ingress, year_ingress,
                status, observations;

        equipment_type = cmb_equipmentType.getSelectedItem().toString();
        make = cmb_make.getSelectedItem().toString();
        model = txt_model.getText().trim();
        number_serial = txt_serialNumber.getText().trim();
        observations = pane_observations.getText();
        status = "Nuevo Ingreso";

        Calendar calendar = Calendar.getInstance();
        day_ingress = Integer.toString(calendar.get(Calendar.DATE));
        month_ingress = Integer.toString(calendar.get(Calendar.MONTH));
        year_ingress = Integer.toString(calendar.get(Calendar.YEAR));

        if (model.equals("")) {
            txt_model.setBackground(Color.red);
            validation++;
        }
        if (number_serial.equals("")) {
            txt_serialNumber.setBackground(Color.red);
            validation++;
        }
        if (observations.equals("")) {
            pane_observations.setText("Sin Observaciones.");
            validation++;
        }

        if (validation == 0) {
            try {
                Connection cn = Conexion.conect();
                PreparedStatement pst = cn.prepareStatement(
                        "insert into equipos values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

                pst.setInt(1, 0);
                pst.setInt(2, id_clientUp);
                pst.setString(3, equipment_type);
                pst.setString(4, make);
                pst.setString(5, model);
                pst.setString(6, number_serial);
                pst.setString(7, day_ingress);
                pst.setString(8, month_ingress);
                pst.setString(9, year_ingress);
                pst.setString(10, observations);
                pst.setString(11, status);
                pst.setString(12, user);
                pst.setString(13, "");
                pst.setString(14, "");
                pst.executeUpdate();

                cn.close();

                txt_name.setBackground(Color.green);
                txt_model.setBackground(Color.green);
                txt_serialNumber.setBackground(Color.green);

                JOptionPane.showMessageDialog(null, "Registro exitoso.");
                this.dispose();

            } catch (SQLException e) {
                System.err.println("ERROR en registrar equipo. " + e);
                JOptionPane.showMessageDialog(null, "¡¡ERROR al registrar equio.!!, conecte al Administrador.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe de llenar todos los campos.");
        }
    }//GEN-LAST:event_btn_registerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new RegistrarEquipo().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_register;
    private javax.swing.JComboBox<String> cmb_equipmentType;
    private javax.swing.JComboBox<String> cmb_make;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_equipmentType;
    private javax.swing.JLabel label_footer;
    private javax.swing.JLabel label_make;
    private javax.swing.JLabel label_model;
    private javax.swing.JLabel label_modifiedBy1;
    private javax.swing.JLabel label_name;
    private javax.swing.JLabel label_serialNumber;
    private javax.swing.JLabel label_title;
    private javax.swing.JLabel label_wallpaper;
    private javax.swing.JTextPane pane_observations;
    private javax.swing.JTextField txt_model;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_serialNumber;
    // End of variables declaration//GEN-END:variables
}
