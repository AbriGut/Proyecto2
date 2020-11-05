package Sistema;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class ConsultasVacunas_1 extends javax.swing.JFrame {

    private DefaultTableModel ModeloTabla;
    public ConsultasVacunas_1() {
        initComponents();
        this.setResizable(false);
        setTitle("CONSULTAS VACUNAS");
        ((JPanel)getContentPane()).setOpaque(false);
        //ImageIcon uno=new ImageIcon(this.getClass().getResource("/Sistema/fondoA.jpg"));
        JLabel fond=new JLabel();
        //fond.setIcon(uno);
        getLayeredPane().add(fond,JLayeredPane.FRAME_CONTENT_LAYER);
        //fond.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("../Sistema/iconoSis.png")).getImage());
        tfBusCodVacuna.setEnabled(false);
        busNom.setEnabled(false);
        inyectable.setEnabled(false);
        gotas.setEnabled(false);
        busTip.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoVacuna = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        label1 = new java.awt.Label();
        tfBusCodVacuna = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        nombreBuscr = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnConsGeneral = new javax.swing.JButton();
        label2 = new java.awt.Label();
        inyectable = new javax.swing.JRadioButton();
        gotas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDatos = new javax.swing.JTable();
        busNom = new javax.swing.JButton();
        busTip = new javax.swing.JButton();
        btnPDF = new javax.swing.JButton();

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
        label1.setText("Nombre de la vacuna");

        tfBusCodVacuna.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfBusCodVacunaKeyTyped(evt);
            }
        });

        jPanel2.setBackground(java.awt.SystemColor.activeCaption);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombreBuscr.setText("Buscar nombre");
        nombreBuscr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreBuscrActionPerformed(evt);
            }
        });
        jPanel2.add(nombreBuscr, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jButton2.setText("Buscar por tipo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        btnConsGeneral.setText("Consulta general");
        btnConsGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsGeneralActionPerformed(evt);
            }
        });
        jPanel2.add(btnConsGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        label2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label2.setText("Tipo de vacuna");

        tipoVacuna.add(inyectable);
        inyectable.setText("Inyectable");
        inyectable.setContentAreaFilled(false);

        tipoVacuna.add(gotas);
        gotas.setText("Gotas");
        gotas.setContentAreaFilled(false);

        tbDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Tipo", "Cantidad"
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

        busNom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/Busca1.png"))); // NOI18N
        busNom.setContentAreaFilled(false);
        busNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busNomActionPerformed(evt);
            }
        });

        busTip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/Busca1.png"))); // NOI18N
        busTip.setContentAreaFilled(false);
        busTip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busTipActionPerformed(evt);
            }
        });

        btnPDF.setText("PDF");
        btnPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPDF)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfBusCodVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(busNom, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gotas)
                            .addComponent(inyectable))
                        .addGap(18, 18, 18)
                        .addComponent(busTip, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(111, 111, 111)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVolver)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(busNom, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(tfBusCodVacuna, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(inyectable)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gotas))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(busTip, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPDF))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        vInicio abrir = new vInicio();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void tfBusCodVacunaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBusCodVacunaKeyTyped
        if(!Character.isLetter(evt.getKeyChar()) && !Character.isWhitespace(evt.getKeyChar()))
            evt.consume();
        if(tfBusCodVacuna.getText().length()>19)
            evt.consume();
    }//GEN-LAST:event_tfBusCodVacunaKeyTyped

    private void busTipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busTipActionPerformed
        conexion cc=new conexion();
        Connection cn = cc.conexion();
        String [] columnas={"Codigo","Nombre","Tipo","Cantidad"};
        String [] registro=new String[4];
        String sql,tip=null;
        ModeloTabla = new DefaultTableModel(null,columnas);
        if(gotas.isSelected()){
            tip="Gotas";
        } else if (inyectable.isSelected())
            tip="Inyectable";
        sql = "SELECT * from vacuna where tipo='"+tip+"'";
        if (tip==null){
            JOptionPane.showMessageDialog(null,"ERROR CAMPO VACIO");
        }
        else{
            try {
            PreparedStatement st = cn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

        while (rs.next()){
            registro[0]=rs.getString("codigo_v");
            registro[1]=rs.getString("nombre");
            registro[2]=rs.getString("tipo");
            registro[3]=rs.getString("cantidad_existente");
            ModeloTabla.addRow(registro);
           
        }
        tbDatos.setModel(ModeloTabla);
    } catch (SQLException e) {
      //JOptionPane.showMessageDialog(null, e, "Error durante el procedimiento", JOptionPane.ERROR_MESSAGE);      
      JOptionPane.showMessageDialog(null, "ERROR");
    }
    }
        
    }//GEN-LAST:event_busTipActionPerformed

    private void nombreBuscrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreBuscrActionPerformed
        tfBusCodVacuna.setEnabled(true);
        busNom.setEnabled(true);
        inyectable.setEnabled(false);
        gotas.setEnabled(false);
        busTip.setEnabled(false);
    }//GEN-LAST:event_nombreBuscrActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        tfBusCodVacuna.setEnabled(false);
        busNom.setEnabled(false);
        inyectable.setEnabled(true);
        gotas.setEnabled(true);
        busTip.setEnabled(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void busNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busNomActionPerformed
        conexion cc=new conexion();
        Connection cn = cc.conexion();
        String [] columnas={"Codigo","Nombre","Tipo","Cantidad"};
        String [] registro=new String[4];
        String sql,nom=null;
        ModeloTabla = new DefaultTableModel(null,columnas);
        nom = tfBusCodVacuna.getText();
        sql = "SELECT * from vacuna where nombre='"+nom+"'";
        if (tfBusCodVacuna.getText().length()==0){
            JOptionPane.showMessageDialog(null,"ERROR CAMPO VACIO");
        }
        else{
            try {
            PreparedStatement st = cn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

        while (rs.next()){
            registro[0]=rs.getString("codigo_v");
            registro[1]=rs.getString("nombre");
            registro[2]=rs.getString("tipo");
            registro[3]=rs.getString("cantidad_existente");
            ModeloTabla.addRow(registro);
           
        }
        tbDatos.setModel(ModeloTabla);
    } catch (SQLException e) {
      //JOptionPane.showMessageDialog(null, e, "Error durante el procedimiento", JOptionPane.ERROR_MESSAGE);      
      JOptionPane.showMessageDialog(null, "ERROR");
    }
    }
    }//GEN-LAST:event_busNomActionPerformed

    private void btnConsGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsGeneralActionPerformed
        btnPDF.setEnabled(true);
        conexion cc=new conexion();
        Connection cn = cc.conexion();
        String [] columnas={"Codigo","Nombre","Tipo","Cantidad"};
        String [] registro=new String[4];
        String sql;
        ModeloTabla = new DefaultTableModel(null,columnas);
        sql = "SELECT * from vacuna";
        try {
            PreparedStatement st = cn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

        while (rs.next()){
            registro[0]=rs.getString("codigo_v");
            registro[1]=rs.getString("nombre");
            registro[2]=rs.getString("tipo");
            registro[3]=rs.getString("cantidad_existente");
            ModeloTabla.addRow(registro);
           
        }
        tbDatos.setModel(ModeloTabla);
    } catch (SQLException e) {
      //JOptionPane.showMessageDialog(null, e, "Error durante el procedimiento", JOptionPane.ERROR_MESSAGE);      
      JOptionPane.showMessageDialog(null, "ERROR");
    }
    }//GEN-LAST:event_btnConsGeneralActionPerformed

    private void btnPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDFActionPerformed
        MessageFormat header = new MessageFormat("Inventario");
        
        MessageFormat footer = new MessageFormat("Pagina{0,number,integer}");
        try{
            tbDatos.print(JTable.PrintMode.NORMAL, header, footer);
        } catch (java.awt.print.PrinterException e){
            
            System.err.format("Cannot print %s%n", e.getMessage());
        }
    }//GEN-LAST:event_btnPDFActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultasVacunas_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultasVacunas_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultasVacunas_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultasVacunas_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultasVacunas_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsGeneral;
    private javax.swing.JButton btnPDF;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton busNom;
    private javax.swing.JButton busTip;
    private javax.swing.JRadioButton gotas;
    private javax.swing.JRadioButton inyectable;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private javax.swing.JButton nombreBuscr;
    private javax.swing.JTable tbDatos;
    private javax.swing.JTextField tfBusCodVacuna;
    private javax.swing.ButtonGroup tipoVacuna;
    // End of variables declaration//GEN-END:variables
}
