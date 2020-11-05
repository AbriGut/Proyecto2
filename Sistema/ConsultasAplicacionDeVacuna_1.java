package Sistema;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.text.*;
import java.awt.print.*;
public class ConsultasAplicacionDeVacuna_1 extends javax.swing.JFrame {

    private DefaultTableModel ModeloTabla;
    public ConsultasAplicacionDeVacuna_1() {
        initComponents();
        this.setResizable(false);
        setTitle("CONSULTAS APLICACION DE VACUNA");
        ((JPanel)getContentPane()).setOpaque(false);
        //ImageIcon uno=new ImageIcon(this.getClass().getResource("/Sistema/fondoA.jpg"));
        JLabel fond=new JLabel();
        //fond.setIcon(uno);
        getLayeredPane().add(fond,JLayeredPane.FRAME_CONTENT_LAYER);
        //fond.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("../Sistema/iconoSis.png")).getImage());
        tfBusFolioP.setEnabled(false);
        porPaciente.setEnabled(false);
        fechaA.setEnabled(false);
        porFecha.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        tfBusFolioP = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        consPaciente = new javax.swing.JButton();
        ConFecha = new javax.swing.JButton();
        consGeneral = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDatos = new javax.swing.JTable();
        porFecha = new javax.swing.JButton();
        porPaciente = new javax.swing.JButton();
        fechaA = new com.toedter.calendar.JDateChooser();
        btnPDF = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/iVolver.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label1.setText("Folio del paciente");

        label2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label2.setText("Fecha");

        tfBusFolioP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfBusFolioPKeyTyped(evt);
            }
        });

        jPanel2.setBackground(java.awt.SystemColor.activeCaption);

        consPaciente.setText("Vacunas de un paciente");
        consPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consPacienteActionPerformed(evt);
            }
        });

        ConFecha.setText("Vacunas aplicadas en una fecha");
        ConFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConFechaActionPerformed(evt);
            }
        });

        consGeneral.setText("Consulta general");
        consGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consGeneralActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(consPaciente)
                    .addComponent(ConFecha)
                    .addComponent(consGeneral))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(consPaciente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ConFecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(consGeneral)
                .addContainerGap())
        );

        tbDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Paciente", "Vacuna", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
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
        }

        porFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/Busca1.png"))); // NOI18N
        porFecha.setContentAreaFilled(false);
        porFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porFechaActionPerformed(evt);
            }
        });

        porPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/Busca1.png"))); // NOI18N
        porPaciente.setContentAreaFilled(false);
        porPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porPacienteActionPerformed(evt);
            }
        });

        fechaA.setDateFormatString("yyyy/MM/d");

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fechaA, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(tfBusFolioP))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(porPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(porFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPDF))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(porPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfBusFolioP))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(porFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechaA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 332, Short.MAX_VALUE)
                        .addComponent(btnPDF))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        vInicio abrir = new vInicio();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfBusFolioPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBusFolioPKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
        if(tfBusFolioP.getText().length()>2)
            evt.consume();
      
    }//GEN-LAST:event_tfBusFolioPKeyTyped

    private void consGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consGeneralActionPerformed
        conexion cc=new conexion();
        Connection cn = cc.conexion();
        String [] columnas={"Paciente","Vacuna","Fecha"};
        String [] registro=new String[3];
        String sql;
        ModeloTabla = new DefaultTableModel(null,columnas);
        sql = "select concat(p.nombre,' ',p.apellidoPat,' ',p.apellidoMat) as paciente, v.nombre, r.fecha from paciente p inner join recibe r on p.folio_p = r.folio_p inner join vacuna v on v.codigo_v=r.codigo_v;";
        try {
            PreparedStatement st = cn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

        while (rs.next()){
            registro[0]=rs.getString("paciente");
            registro[1]=rs.getString("v.nombre");
            registro[2]=rs.getString("fecha");
          
            ModeloTabla.addRow(registro);
           
        }
        tbDatos.setModel(ModeloTabla);
    } catch (SQLException e) {
      //JOptionPane.showMessageDialog(null, e, "Error durante el procedimiento", JOptionPane.ERROR_MESSAGE);      
      JOptionPane.showMessageDialog(null, "ERROR");
    }
    }//GEN-LAST:event_consGeneralActionPerformed

    private void consPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consPacienteActionPerformed
        tfBusFolioP.setEnabled(true);
        porPaciente.setEnabled(true);
        fechaA.setEnabled(false);
        porFecha.setEnabled(false);
    }//GEN-LAST:event_consPacienteActionPerformed

    private void ConFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConFechaActionPerformed
        tfBusFolioP.setEnabled(false);
        porPaciente.setEnabled(false);
        fechaA.setEnabled(true);
        porFecha.setEnabled(true);
    }//GEN-LAST:event_ConFechaActionPerformed

    private void porPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porPacienteActionPerformed
        conexion cc=new conexion();
        Connection cn = cc.conexion();
        String [] columnas={"Folio","Código","Fecha"};
        String [] registro=new String[3];
        String sql,fol=null;
        ModeloTabla = new DefaultTableModel(null,columnas);
        fol = tfBusFolioP.getText();
        sql = "select concat(p.nombre,' ',p.apellidoPat,' ',p.apellidoMat) as paciente, v.nombre, r.fecha from paciente p inner join recibe r on p.folio_p = r.folio_p inner join vacuna v on v.codigo_v=r.codigo_v where p.folio_p='"+fol+"'";
        if (fol==null){
            JOptionPane.showMessageDialog(null,"ERROR CAMPO VACIO");
        }
        else{
            try {
                PreparedStatement st = cn.prepareStatement(sql);
                ResultSet rs = st.executeQuery();
            while (rs.next()){
                registro[0]=rs.getString("paciente");
                registro[1]=rs.getString("v.nombre");
                registro[2]=rs.getString("fecha");
                ModeloTabla.addRow(registro);
            }
            tbDatos.setModel(ModeloTabla);
    } catch (SQLException e) {
      //JOptionPane.showMessageDialog(null, e, "Error durante el procedimiento", JOptionPane.ERROR_MESSAGE);      
      JOptionPane.showMessageDialog(null, "ERROR");
    }
    }
    }//GEN-LAST:event_porPacienteActionPerformed

    private void porFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porFechaActionPerformed
        conexion cc=new conexion();
        Connection cn = cc.conexion();
        String [] columnas={"Folio","Código","Fecha"};
        String [] registro=new String[3];
        String sql,fech=null;
        ModeloTabla = new DefaultTableModel(null,columnas);
        fech = ((JTextField)fechaA.getDateEditor().getUiComponent()).getText();
        //System.out.println(""+fech);
        sql = "select concat(p.nombre,' ',p.apellidoPat,'',p.apellidoMat) as paciente, v.nombre, r.fecha from paciente p inner join recibe r on p.folio_p = r.folio_p inner join vacuna v on v.codigo_v=r.codigo_v where fecha='"+fech+"'";
        if (fech==null){
            JOptionPane.showMessageDialog(null,"ERROR CAMPO VACIO");
        }
        else{
            try {
                PreparedStatement st = cn.prepareStatement(sql);
                ResultSet rs = st.executeQuery();

            while (rs.next()){
                registro[0]=rs.getString("paciente");
                registro[1]=rs.getString("v.nombre");
                registro[2]=rs.getString("fecha");
                ModeloTabla.addRow(registro);

            }
            tbDatos.setModel(ModeloTabla);
    } catch (SQLException e) {
      //JOptionPane.showMessageDialog(null, e, "Error durante el procedimiento", JOptionPane.ERROR_MESSAGE);      
      JOptionPane.showMessageDialog(null, "ERROR");
    }
    }
    }//GEN-LAST:event_porFechaActionPerformed

    private void btnPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDFActionPerformed
        MessageFormat header = new MessageFormat("Registros de vacunas");
        
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
            java.util.logging.Logger.getLogger(ConsultasAplicacionDeVacuna_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultasAplicacionDeVacuna_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultasAplicacionDeVacuna_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultasAplicacionDeVacuna_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultasAplicacionDeVacuna_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConFecha;
    private javax.swing.JButton btnPDF;
    private javax.swing.JButton consGeneral;
    private javax.swing.JButton consPaciente;
    private com.toedter.calendar.JDateChooser fechaA;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private javax.swing.JButton porFecha;
    private javax.swing.JButton porPaciente;
    private javax.swing.JTable tbDatos;
    private javax.swing.JTextField tfBusFolioP;
    // End of variables declaration//GEN-END:variables
}
