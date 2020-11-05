package Sistema;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class vAplicarVacuna extends javax.swing.JFrame {
     ResultSet rs;
DefaultTableModel ModeloTabla;
    private String[] registro;
    private String SSQL;
    private Object tablacontactos;
    private Object tabla;
    String pac,cod;
    public vAplicarVacuna() {
        initComponents();
        this.setResizable(false);
        setTitle("Aplicar Vacuna");
        bloquear();
        this.setLocation(400,100);
        setIconImage(new ImageIcon(getClass().getResource("../Sistema/iconoSis.png")).getImage());
        
    }
void limpiar(){
    tfCodPacientePK.setText(null);
    tfCodVacunaPK.setText(null);
}
void bloquear(){
    tfCodPacientePK.setEnabled(false);
    tfCodVacunaPK.setEnabled(false);
    btnGuardarAV.setEnabled(false);
    btnEditarAV.setEnabled(false);
    btnBorrarAV.setEnabled(false);
}
void desbloquear(){
    tfCodPacientePK.setEnabled(true);
    tfCodVacunaPK.setEnabled(true);
    btnGuardarAV.setEnabled(true);
    btnEditarAV.setEnabled(true);
    btnBorrarAV.setEnabled(true);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        tfCodPacientePK = new javax.swing.JTextField();
        tfCodVacunaPK = new javax.swing.JTextField();
        fechaA = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        btnBorrarAV = new javax.swing.JButton();
        btnEditarAV = new javax.swing.JButton();
        btnGuardarAV = new javax.swing.JButton();
        NuevoA = new javax.swing.JButton();
        btnVolverAV = new javax.swing.JButton();
        btncod = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla1 = new javax.swing.JTable();
        foli = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aplicación de vacuna", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 36))); // NOI18N

        label1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label1.setText("Folio del paciente ");

        label2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label2.setText("Código de la vacuna");

        label3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label3.setText("Fecha de aplicación");

        tfCodPacientePK.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCodPacientePKKeyTyped(evt);
            }
        });

        tfCodVacunaPK.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCodVacunaPKKeyTyped(evt);
            }
        });

        fechaA.setDateFormatString("yyyy/MM/d");

        jPanel2.setBackground(java.awt.SystemColor.activeCaption);

        btnBorrarAV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/borrar.png"))); // NOI18N
        btnBorrarAV.setContentAreaFilled(false);
        btnBorrarAV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarAVActionPerformed(evt);
            }
        });

        btnEditarAV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/iEditar.png"))); // NOI18N
        btnEditarAV.setContentAreaFilled(false);
        btnEditarAV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarAVActionPerformed(evt);
            }
        });

        btnGuardarAV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/iGuardar.png"))); // NOI18N
        btnGuardarAV.setContentAreaFilled(false);
        btnGuardarAV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarAVActionPerformed(evt);
            }
        });

        NuevoA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/Guar2.png"))); // NOI18N
        NuevoA.setContentAreaFilled(false);
        NuevoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NuevoA, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrarAV, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarAV, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarAV, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NuevoA, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardarAV, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditarAV, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBorrarAV)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        btnVolverAV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/iVolver.png"))); // NOI18N
        btnVolverAV.setContentAreaFilled(false);
        btnVolverAV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverAVActionPerformed(evt);
            }
        });

        btncod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/Busca1.png"))); // NOI18N
        btncod.setText("Buscar codigo");
        btncod.setContentAreaFilled(false);
        btncod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncodActionPerformed(evt);
            }
        });

        Tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Folio", "Nombre", "Apellido Paterno", "Apellido Materno"
            }
        ));
        jScrollPane2.setViewportView(Tabla1);
        if (Tabla1.getColumnModel().getColumnCount() > 0) {
            Tabla1.getColumnModel().getColumn(3).setHeaderValue("Apellido Materno");
        }

        foli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/Busca1.png"))); // NOI18N
        foli.setText("Buscar folio");
        foli.setContentAreaFilled(false);
        foli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foliActionPerformed(evt);
            }
        });

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo_v", "Nombre", "Tipo"
            }
        ));
        jScrollPane3.setViewportView(tabla2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fechaA, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(foli))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCodVacunaPK, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(129, 176, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(btncod)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(tfCodPacientePK, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVolverAV, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnVolverAV)
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfCodPacientePK, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(foli, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCodVacunaPK, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btncod, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fechaA, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aux(){
        conexion cc=new conexion();
        Connection cn = cc.conexion();
        cod = tfCodVacunaPK.getText();
        try {
            String sql="UPDATE vacuna set cantidad_existente=(cantidad_existente-1) where codigo_v='"+cod+"'";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.executeUpdate();

        } catch (SQLException ex) {
            //Logger.getLogger(vInicio.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error al atualizar");
        } 
    }
    private void btnVolverAVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverAVActionPerformed
        vInicio abrir = new vInicio();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverAVActionPerformed

    private void tfCodPacientePKKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCodPacientePKKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
        if(tfCodPacientePK.getText().length()>2)
            evt.consume();
    }//GEN-LAST:event_tfCodPacientePKKeyTyped

    private void tfCodVacunaPKKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCodVacunaPKKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
        if(tfCodVacunaPK.getText().length()>2)
            evt.consume();
    }//GEN-LAST:event_tfCodVacunaPKKeyTyped

    private void btnGuardarAVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarAVActionPerformed
        conexion cc=new conexion();
        Connection cn = cc.conexion();
        //String pac,cod;
        String sql="";
        pac = tfCodPacientePK.getText();
        cod = tfCodVacunaPK.getText();
        if (tfCodPacientePK.getText().length()==0 || tfCodVacunaPK.getText().length()==0){
            JOptionPane.showMessageDialog(null,"ERROR CAMPOS VACIOS");
        }
        else{
            
            sql="INSERT INTO recibe (folio_p,codigo_v,fecha) VALUES (?,?,?)";
            try {
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1,pac);
                pst.setString(2,cod);
                pst.setString(3,((JTextField)fechaA.getDateEditor().getUiComponent()).getText());
                aux();
                int n=pst.executeUpdate();
                if(n>0){
                    JOptionPane.showMessageDialog(null,"Registro guardado con exito");
                    limpiar();
                    NuevoA.setEnabled(true);
                }
            } catch (SQLException ex) {
                //Logger.getLogger(vInicio.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"Aplicación de la vacuna ya registrada");
            }
        } 
    }//GEN-LAST:event_btnGuardarAVActionPerformed

    private void NuevoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoAActionPerformed
    desbloquear();
    }//GEN-LAST:event_NuevoAActionPerformed

    private void foliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foliActionPerformed
    conexion cc=new conexion();
    Connection cn = cc.conexion();
    String [] columnas={"Folio_P","Nombre","Apellido Paterno","Apellido Materno"};
    String [] registro=new String[4];
    ModeloTabla=new DefaultTableModel(null,columnas);      
    String SSQL;
    pac = tfCodPacientePK.getText();
        SSQL= "SELECT * FROM paciente WHERE folio_p='"+pac+"'";
        try {
        PreparedStatement st = cn.prepareStatement(SSQL);
        ResultSet rs = st.executeQuery();

        while (rs.next()){
            registro[0]=rs.getString("folio_p");
            registro[1]=rs.getString("nombre");
            registro[2]=rs.getString("apellidoPat");
            registro[3]=rs.getString("apellidoMat");
          
            ModeloTabla.addRow(registro);
           
        }
        Tabla1.setModel(ModeloTabla);
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, e, "Error durante el procedimiento", JOptionPane.ERROR_MESSAGE);      
    }
    }//GEN-LAST:event_foliActionPerformed

    private void btncodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncodActionPerformed
    conexion cc=new conexion();
    Connection cn = cc.conexion();
    String [] columnas={"Codigo_v","Nombre","tipo"};
    String [] registro=new String[3];
    ModeloTabla=new DefaultTableModel(null,columnas);      
    String SSQL;
    //String cod;
    cod = tfCodVacunaPK.getText();
        SSQL= "SELECT * FROM vacuna WHERE codigo_v='"+cod+"'";
        try {
        PreparedStatement st = cn.prepareStatement(SSQL);
        ResultSet rs = st.executeQuery();

        while (rs.next()){
            registro[0]=rs.getString("codigo_v");
            registro[1]=rs.getString("nombre");
            registro[2]=rs.getString("tipo");               
            ModeloTabla.addRow(registro);
           
        }
        tabla2.setModel(ModeloTabla);
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, e, "Error durante el procedimiento", JOptionPane.ERROR_MESSAGE);      
    }   
    }//GEN-LAST:event_btncodActionPerformed

    private void btnBorrarAVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarAVActionPerformed
        conexion cc=new conexion();
        Connection cn = cc.conexion();
        String cod,fol;
        fol = tfCodPacientePK.getText();
        cod = tfCodVacunaPK.getText();
        NuevoA.setEnabled(true);
        btnGuardarAV.setEnabled(false);
        if (tfCodPacientePK.getText().length()==0 || tfCodVacunaPK.getText().length()==0){
            JOptionPane.showMessageDialog(null,"ERROR CAMPOS VACIOS");
        }
        else{
            if(tfCodPacientePK.getText().length()>0){
            int r =JOptionPane.showConfirmDialog(null, "¿Seguro de que quiere eliminar los datos?");
            if(r==0){
                try {
                    PreparedStatement ppt = cn.prepareStatement("DELETE FROM recibe WHERE folio_p='"+fol+"' and codigo_v='"+cod+"'");
                    ppt.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Datos eliminados correctamente");
                    limpiar();
                } catch (SQLException ex) {
                    Logger.getLogger(vInicio.class.getName()).log(Level.SEVERE, null, ex);
                    }

            }else{
            }
            }
        }
    }//GEN-LAST:event_btnBorrarAVActionPerformed

    private void btnEditarAVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarAVActionPerformed
        conexion cc=new conexion();
        Connection cn = cc.conexion();
        String tip = null;
        Statement st;
        PreparedStatement ps;
        ResultSet rs;
        if (tfCodPacientePK.getText().length()==0 || tfCodVacunaPK.getText().length()==0){
            JOptionPane.showMessageDialog(null,"ERROR CAMPOS VACIOS");
        }
        else{
            String sql = "update recibe set folio_p = '"+tfCodPacientePK+"',clave_v = '"+tfCodVacunaPK+"'";
            try {
                PreparedStatement pst = cn.prepareStatement(sql);
                int res = pst.executeUpdate();
                if(res >0 ){
                    JOptionPane.showMessageDialog(null, "Datos modificados");
                    tfCodPacientePK.setText(null);
                    tfCodVacunaPK.setText(null);
                  }
                else{
                    JOptionPane.showMessageDialog(null, "Error al modificar los datos");
                }
            } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, String.valueOf(("Error: " + e)));
            }
        }
    }//GEN-LAST:event_btnEditarAVActionPerformed

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
            java.util.logging.Logger.getLogger(vAplicarVacuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vAplicarVacuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vAplicarVacuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vAplicarVacuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vAplicarVacuna().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NuevoA;
    private javax.swing.JTable Tabla1;
    private javax.swing.JButton btnBorrarAV;
    private javax.swing.JButton btnEditarAV;
    private javax.swing.JButton btnGuardarAV;
    private javax.swing.JButton btnVolverAV;
    private javax.swing.JButton btncod;
    private com.toedter.calendar.JDateChooser fechaA;
    private javax.swing.JButton foli;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private javax.swing.JTable tabla2;
    private javax.swing.JTextField tfCodPacientePK;
    private javax.swing.JTextField tfCodVacunaPK;
    // End of variables declaration//GEN-END:variables
}
