package Sistema;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ConsultasTutor_1 extends javax.swing.JFrame {

    private DefaultTableModel ModeloTabla;

    public ConsultasTutor_1() {
        initComponents();
        this.setResizable(false);
        setTitle("CONSULTAS TUTOR");
        ((JPanel)getContentPane()).setOpaque(false);
        //ImageIcon uno=new ImageIcon(this.getClass().getResource("/Sistema/fondoA.jpg"));
        JLabel fond=new JLabel();
        //fond.setIcon(uno);
        getLayeredPane().add(fond,JLayeredPane.FRAME_CONTENT_LAYER);
        //fond.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("../Sistema/iconoSis.png")).getImage());
        tfBusClaveT.setEnabled(false);
        busTel.setEnabled(false);
        tfMunicipio.setEnabled(false);
        agruMun.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        label1 = new java.awt.Label();
        tfBusClaveT = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnBusTelTu = new javax.swing.JButton();
        btnAgrupMuniTu = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        label2 = new java.awt.Label();
        tfMunicipio = new javax.swing.JTextField();
        busTel = new javax.swing.JButton();
        agruMun = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/iVolver.png"))); // NOI18N
        btnVolver.setContentAreaFilled(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label1.setText("Clave del tutor");

        tfBusClaveT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfBusClaveTKeyTyped(evt);
            }
        });

        jPanel2.setBackground(java.awt.SystemColor.activeCaption);

        btnBusTelTu.setText("Datos de un tutor ");
        btnBusTelTu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusTelTuActionPerformed(evt);
            }
        });

        btnAgrupMuniTu.setText("Agrupar por municipio");
        btnAgrupMuniTu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgrupMuniTuActionPerformed(evt);
            }
        });

        jButton1.setText("Consulta general");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgrupMuniTu)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButton1))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnBusTelTu)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBusTelTu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgrupMuniTu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        label2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label2.setText("Municipio");

        tfMunicipio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfMunicipioKeyTyped(evt);
            }
        });

        busTel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/Busca1.png"))); // NOI18N
        busTel.setContentAreaFilled(false);
        busTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busTelActionPerformed(evt);
            }
        });

        agruMun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/Busca1.png"))); // NOI18N
        agruMun.setContentAreaFilled(false);
        agruMun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agruMunActionPerformed(evt);
            }
        });

        tbDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Clave", "Nombre", "Apellido Paterno", "Teléfono", "Municipio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbDatos);
        if (tbDatos.getColumnModel().getColumnCount() > 0) {
            tbDatos.getColumnModel().getColumn(0).setResizable(false);
            tbDatos.getColumnModel().getColumn(1).setResizable(false);
            tbDatos.getColumnModel().getColumn(2).setResizable(false);
            tbDatos.getColumnModel().getColumn(3).setResizable(false);
            tbDatos.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfBusClaveT, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(busTel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agruMun, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(busTel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfBusClaveT))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(agruMun, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfMunicipio)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVolver)
                        .addGap(12, 12, 12)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        vInicio abrir = new vInicio();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void tfBusClaveTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBusClaveTKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
        if(tfBusClaveT.getText().length()>2)
            evt.consume();
    }//GEN-LAST:event_tfBusClaveTKeyTyped

    private void tfMunicipioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMunicipioKeyTyped
        if(!Character.isLetter(evt.getKeyChar()) && !Character.isWhitespace(evt.getKeyChar()))
            evt.consume();
        if(tfMunicipio.getText().length()>14)
            evt.consume();
    }//GEN-LAST:event_tfMunicipioKeyTyped

    private void btnBusTelTuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusTelTuActionPerformed
        tfBusClaveT.setEnabled(true);
        busTel.setEnabled(true);
        tfMunicipio.setEnabled(false);
        agruMun.setEnabled(false);
    }//GEN-LAST:event_btnBusTelTuActionPerformed

    private void btnAgrupMuniTuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgrupMuniTuActionPerformed
        tfBusClaveT.setEnabled(false);
        busTel.setEnabled(false);
        tfMunicipio.setEnabled(true);
        agruMun.setEnabled(true);
    }//GEN-LAST:event_btnAgrupMuniTuActionPerformed

    private void busTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busTelActionPerformed
        conexion cc=new conexion();
        Connection cn = cc.conexion();
        String [] columnas={"Clave","Nombre","Apellido Paterno","Teléfono","Municipio"};
        String [] registro = new String[5];
        String sql, cla=null;
        ModeloTabla = new DefaultTableModel(null,columnas);
        cla = tfBusClaveT.getText();
        sql = "SELECT clave_t,nombre,apellidoPat,telefono,municipio from tutor where clave_t='"+cla+"'";
        if (tfBusClaveT.getText().length()==0){
            JOptionPane.showMessageDialog(null,"ERROR CAMPO VACIO");
        }
        else{
            try {
            PreparedStatement st = cn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

        while (rs.next()){
            registro[0]=rs.getString("clave_t");
            registro[1]=rs.getString("nombre");
            registro[2]=rs.getString("apellidoPat");
            registro[3]=rs.getString("telefono");
            registro[4]=rs.getString("municipio");
          
            ModeloTabla.addRow(registro);
           
        }
        tbDatos.setModel(ModeloTabla);
    } catch (SQLException e) {
      //JOptionPane.showMessageDialog(null, e, "Error durante el procedimiento", JOptionPane.ERROR_MESSAGE);      
      JOptionPane.showMessageDialog(null, "ERROR");
    }
        }
    }//GEN-LAST:event_busTelActionPerformed

    private void agruMunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agruMunActionPerformed
        conexion cc=new conexion();
        Connection cn = cc.conexion();
        String [] columnas={"Clave","Nombre","Apellido Paterno","Teléfono","Municipio"};
        String [] registro = new String[5];
        String sql, mun=null;
        ModeloTabla = new DefaultTableModel(null,columnas);
        mun = tfMunicipio.getText();
        sql = "SELECT clave_t,nombre,apellidoPat,telefono,municipio from tutor where municipio='"+mun+"'";
        if (tfMunicipio.getText().length()==0){
            JOptionPane.showMessageDialog(null,"ERROR CAMPO VACIO");
        }
        else{
            try {
            PreparedStatement st = cn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

        while (rs.next()){
            registro[0]=rs.getString("clave_t");
            registro[1]=rs.getString("nombre");
            registro[2]=rs.getString("apellidoPat");
            registro[3]=rs.getString("telefono");
            registro[4]=rs.getString("municipio");
          
            ModeloTabla.addRow(registro);
        }
        tbDatos.setModel(ModeloTabla);
    } catch (SQLException e) {
      //JOptionPane.showMessageDialog(null, e, "Error durante el procedimiento", JOptionPane.ERROR_MESSAGE);      
      JOptionPane.showMessageDialog(null, "ERROR");
    }
        }
    }//GEN-LAST:event_agruMunActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        conexion cc=new conexion();
        Connection cn = cc.conexion();
        String [] columnas={"Clave","Nombre","Apellido Paterno","Teléfono","Municipio"};
        String [] registro = new String[5];
        String sql;
        ModeloTabla = new DefaultTableModel(null,columnas);
        sql = "SELECT clave_t,nombre,apellidoPat,telefono,municipio from tutor";
        try {
            PreparedStatement st = cn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

        while (rs.next()){
            registro[0]=rs.getString("clave_t");
            registro[1]=rs.getString("nombre");
            registro[2]=rs.getString("apellidoPat");
            registro[3]=rs.getString("telefono");
            registro[4]=rs.getString("municipio");
          
            ModeloTabla.addRow(registro);
        }
        tbDatos.setModel(ModeloTabla);
    } catch (SQLException e) {
      //JOptionPane.showMessageDialog(null, e, "Error durante el procedimiento", JOptionPane.ERROR_MESSAGE);      
      JOptionPane.showMessageDialog(null, "ERROR");
    }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultasTutor_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultasTutor_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultasTutor_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultasTutor_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultasTutor_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agruMun;
    private javax.swing.JButton btnAgrupMuniTu;
    private javax.swing.JButton btnBusTelTu;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton busTel;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private javax.swing.JTable tbDatos;
    private javax.swing.JTextField tfBusClaveT;
    private javax.swing.JTextField tfMunicipio;
    // End of variables declaration//GEN-END:variables
}
