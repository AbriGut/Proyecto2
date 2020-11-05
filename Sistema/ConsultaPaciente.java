package Sistema;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ConsultaPaciente extends javax.swing.JFrame {

    private DefaultTableModel ModeloTabla;
    public ConsultaPaciente() {
        initComponents();
        this.setResizable(false);
        setTitle("CONSULTAS PACIENTE");
        ((JPanel)getContentPane()).setOpaque(false);
        //ImageIcon uno=new ImageIcon(this.getClass().getResource("/Sistema/fondoA.jpg"));
        JLabel fond=new JLabel();
        //fond.setIcon(uno);
        getLayeredPane().add(fond,JLayeredPane.FRAME_CONTENT_LAYER);
        //fond.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("../Sistema/iconoSis.png")).getImage());
        femenino.setEnabled(false);
        masculino.setEnabled(false);
        busSex.setEnabled(false);
        tfBusClaveTu.setEnabled(false);
        busClavT.setEnabled(false);
        DefaultTableModel ModeloTabla;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGsexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        tfBusClaveTu = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnBusSexo = new javax.swing.JButton();
        btnBusTutor = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        femenino = new javax.swing.JRadioButton();
        masculino = new javax.swing.JRadioButton();
        busSex = new javax.swing.JButton();
        busClavT = new javax.swing.JButton();
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
        label1.setText("Sexo del paciente");

        label2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label2.setText("Clave del Tutor");

        tfBusClaveTu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfBusClaveTuKeyTyped(evt);
            }
        });

        jPanel2.setBackground(java.awt.SystemColor.activeCaption);

        btnBusSexo.setText("Por sexo");
        btnBusSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusSexoActionPerformed(evt);
            }
        });

        btnBusTutor.setText("Por tutor");
        btnBusTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusTutorActionPerformed(evt);
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
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(btnBusTutor)
                    .addComponent(btnBusSexo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBusSexo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBusTutor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnGsexo.add(femenino);
        femenino.setText("Femenino");

        btnGsexo.add(masculino);
        masculino.setText("Masculino");

        busSex.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/Busca1.png"))); // NOI18N
        busSex.setContentAreaFilled(false);
        busSex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busSexActionPerformed(evt);
            }
        });

        busClavT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/Busca1.png"))); // NOI18N
        busClavT.setContentAreaFilled(false);
        busClavT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busClavTActionPerformed(evt);
            }
        });

        tbDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Folio del paciente", "Nombre", "Apellido Paterno", "Apellido Materno"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfBusClaveTu)
                            .addComponent(femenino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(masculino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(busSex, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(busClavT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnVolver)
                                .addGap(4, 4, 4)
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(femenino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(masculino))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(busSex, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(busClavT, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfBusClaveTu, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
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

    private void tfBusClaveTuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBusClaveTuKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
        if(tfBusClaveTu.getText().length()>2)
            evt.consume();
    }//GEN-LAST:event_tfBusClaveTuKeyTyped

    private void btnBusSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusSexoActionPerformed
        femenino.setEnabled(true);
        masculino.setEnabled(true);
        busSex.setEnabled(true);
        tfBusClaveTu.setEnabled(false);
        busClavT.setEnabled(false);
    }//GEN-LAST:event_btnBusSexoActionPerformed

    private void btnBusTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusTutorActionPerformed
        tfBusClaveTu.setEnabled(true);
        busClavT.setEnabled(true);
        femenino.setEnabled(false);
        masculino.setEnabled(false);
        busSex.setEnabled(false);
    }//GEN-LAST:event_btnBusTutorActionPerformed

    private void busSexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busSexActionPerformed
    conexion cc=new conexion();
    Connection cn = cc.conexion();
    String [] columnas={"Folio del paciente","Nombre","Apellido Paterno","Apellido Materno"};
    String [] registro=new String[4];
    String sql, sex=null;
    if(femenino.isSelected()){
        sex="F";
    } else if (masculino.isSelected())
        sex="M";
    ModeloTabla = new DefaultTableModel(null,columnas);
    sql = "SELECT folio_p,nombre,apellidoPat,apellidoMat from paciente where sexo='"+sex+"'";
        if (sex==null){
            JOptionPane.showMessageDialog(null,"ERROR CAMPO VACIO");
        }
        else{
            try {
            PreparedStatement st = cn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

        while (rs.next()){
            registro[0]=rs.getString("folio_p");
            registro[1]=rs.getString("nombre");
            registro[2]=rs.getString("apellidoPat");
            registro[3]=rs.getString("apellidoMat");
          
            ModeloTabla.addRow(registro);
           
        }
        tbDatos.setModel(ModeloTabla);
    } catch (SQLException e) {
      //JOptionPane.showMessageDialog(null, e, "Error durante el procedimiento", JOptionPane.ERROR_MESSAGE);      
      JOptionPane.showMessageDialog(null, "ERROR");
    }
    }
    }//GEN-LAST:event_busSexActionPerformed

    private void busClavTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busClavTActionPerformed
    conexion cc=new conexion();
    Connection cn = cc.conexion();
    String [] columnas={"Folio del paciente","Nombre","Apellido Paterno","Apellido Materno"};
    String [] registro=new String[4];
    String sql,cla;
    ModeloTabla = new DefaultTableModel(null,columnas);
    cla = tfBusClaveTu.getText();
        sql = "SELECT folio_p,nombre,apellidoPat,apellidoMat from paciente where clave_t='"+cla+"'";
        if (tfBusClaveTu.getText().length()==0){
            JOptionPane.showMessageDialog(null,"ERROR CAMPO VACIO");
        }
        else{
            try {
            PreparedStatement st = cn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

        while (rs.next()){
            registro[0]=rs.getString("folio_p");
            registro[1]=rs.getString("nombre");
            registro[2]=rs.getString("apellidoPat");
            registro[3]=rs.getString("apellidoMat");
          
            ModeloTabla.addRow(registro);
           
        }
        tbDatos.setModel(ModeloTabla);
    } catch (SQLException e) {
      //JOptionPane.showMessageDialog(null, e, "Error durante el procedimiento", JOptionPane.ERROR_MESSAGE);      
      JOptionPane.showMessageDialog(null, "ERROR");
    }
        }
    
    }//GEN-LAST:event_busClavTActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        conexion cc=new conexion();
        Connection cn = cc.conexion();
        String [] columnas={"Folio del paciente","Nombre","Apellido Paterno","Apellido Materno"};
        String [] registro=new String[4];
        String sql;
        ModeloTabla = new DefaultTableModel(null,columnas);
        sql = "SELECT folio_p,nombre,apellidoPat,apellidoMat from paciente";
        try {
            PreparedStatement st = cn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

        while (rs.next()){
            registro[0]=rs.getString("folio_p");
            registro[1]=rs.getString("nombre");
            registro[2]=rs.getString("apellidoPat");
            registro[3]=rs.getString("apellidoMat");
          
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
            java.util.logging.Logger.getLogger(ConsultaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusSexo;
    private javax.swing.JButton btnBusTutor;
    private javax.swing.ButtonGroup btnGsexo;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton busClavT;
    private javax.swing.JButton busSex;
    private javax.swing.JRadioButton femenino;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private javax.swing.JRadioButton masculino;
    private javax.swing.JTable tbDatos;
    private javax.swing.JTextField tfBusClaveTu;
    // End of variables declaration//GEN-END:variables
}
