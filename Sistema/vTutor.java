package Sistema;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class vTutor extends javax.swing.JFrame {
    DefaultTableModel ModeloTabla;
    private String[] registro;
    private String SSQL;
    private Object tablacontactos;
    private Object tabla;
ResultSet rs;    
    public vTutor() {
        initComponents();
        bloquear();
        this.setResizable(false);
        setTitle("Tutor");
        ((JPanel)getContentPane()).setOpaque(false);
        //ImageIcon uno=new ImageIcon(this.getClass().getResource("/Sistema/fondoA.jpg"));
        JLabel fond=new JLabel();
        //fond.setIcon(uno);
        getLayeredPane().add(fond,JLayeredPane.FRAME_CONTENT_LAYER);
        //fond.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        this.setLocation(400,100);
        setIconImage(new ImageIcon(getClass().getResource("../Sistema/iconoSis.png")).getImage());
          
    }
void limpiar(){
    tfClaveT.setText(null);
    tfNombreT.setText(null);
    tfApellidoPatT.setText(null);
    tfApellidoMatT.setText(null);
    tfCalleT.setText(null);
    tfMunicipioT.setText(null);
    tfTelefonoT.setText(null);
}
void bloquear(){
    tfClaveT.setEnabled(false);
    tfNombreT.setEnabled(false);
    tfApellidoPatT.setEnabled(false);
    tfApellidoMatT.setEnabled(false);
    tfCalleT.setEnabled(false);
    tfMunicipioT.setEnabled(false);
    tfTelefonoT.setEnabled(false);
    btnGuardarT.setEnabled(false);
    btnEditarT.setEnabled(false);
    btnBorrarT.setEnabled(false);
   
}
void desbloquearu(){
    tfClaveT.setEnabled(true);
    tfNombreT.setEnabled(true);
    tfApellidoPatT.setEnabled(true);
    tfApellidoMatT.setEnabled(true);
    tfCalleT.setEnabled(true);
    tfMunicipioT.setEnabled(true);
    tfTelefonoT.setEnabled(true);
    btnGuardarT.setEnabled(true);
    btnEditarT.setEnabled(true);
    btnBorrarT.setEnabled(true);
}
     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label5 = new java.awt.Label();
        label4 = new java.awt.Label();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();
        tfClaveT = new javax.swing.JTextField();
        tfNombreT = new javax.swing.JTextField();
        tfApellidoPatT = new javax.swing.JTextField();
        tfApellidoMatT = new javax.swing.JTextField();
        tfCalleT = new javax.swing.JTextField();
        tfMunicipioT = new javax.swing.JTextField();
        tfTelefonoT = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        btnGuardarT = new javax.swing.JButton();
        btnEditarT = new javax.swing.JButton();
        btnBorrarT = new javax.swing.JButton();
        NuevoT = new javax.swing.JButton();
        BuscarT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/iVolver.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 20, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tutor", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 36))); // NOI18N

        label1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label1.setText("Clave");

        label2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label2.setText("Nombre");

        label3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label3.setText("Apellido Paterno");

        label5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label5.setText("Apellido Materno");

        label4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label4.setText("Calle");

        label6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label6.setText("Municipio");

        label7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label7.setText("Teléfono");

        tfClaveT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfClaveTActionPerformed(evt);
            }
        });
        tfClaveT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfClaveTKeyTyped(evt);
            }
        });

        tfNombreT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreTActionPerformed(evt);
            }
        });
        tfNombreT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNombreTKeyTyped(evt);
            }
        });

        tfApellidoPatT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfApellidoPatTActionPerformed(evt);
            }
        });
        tfApellidoPatT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfApellidoPatTKeyTyped(evt);
            }
        });

        tfApellidoMatT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfApellidoMatTActionPerformed(evt);
            }
        });
        tfApellidoMatT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfApellidoMatTKeyTyped(evt);
            }
        });

        tfCalleT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCalleTActionPerformed(evt);
            }
        });
        tfCalleT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCalleTKeyTyped(evt);
            }
        });

        tfMunicipioT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMunicipioTActionPerformed(evt);
            }
        });
        tfMunicipioT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfMunicipioTKeyTyped(evt);
            }
        });

        tfTelefonoT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTelefonoTActionPerformed(evt);
            }
        });
        tfTelefonoT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfTelefonoTKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tfMunicipioT, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfCalleT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                        .addComponent(tfApellidoMatT, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfApellidoPatT, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfNombreT, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(tfTelefonoT, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfClaveT, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfClaveT))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfNombreT))
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfApellidoPatT))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfApellidoMatT))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfCalleT))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfMunicipioT))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfTelefonoT))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 51, 320, 480));

        jPanel5.setBackground(java.awt.SystemColor.activeCaption);

        btnGuardarT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/iGuardar.png"))); // NOI18N
        btnGuardarT.setContentAreaFilled(false);
        btnGuardarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarTActionPerformed(evt);
            }
        });

        btnEditarT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/iEditar.png"))); // NOI18N
        btnEditarT.setContentAreaFilled(false);
        btnEditarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarTActionPerformed(evt);
            }
        });

        btnBorrarT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/borrar.png"))); // NOI18N
        btnBorrarT.setContentAreaFilled(false);
        btnBorrarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarTActionPerformed(evt);
            }
        });

        NuevoT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/Guar2.png"))); // NOI18N
        NuevoT.setContentAreaFilled(false);
        NuevoT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoTActionPerformed(evt);
            }
        });

        BuscarT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/Busca1.png"))); // NOI18N
        BuscarT.setContentAreaFilled(false);
        BuscarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BuscarT, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrarT, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NuevoT, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NuevoT, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardarT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditarT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBorrarT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BuscarT, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 40, 210));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        vInicio abrir = new vInicio();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfClaveTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfClaveTKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
        if(tfClaveT.getText().length()>2)
            evt.consume();
    }//GEN-LAST:event_tfClaveTKeyTyped

    private void tfNombreTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNombreTKeyTyped
        if(!Character.isLetter(evt.getKeyChar()) && !Character.isWhitespace(evt.getKeyChar()))
            evt.consume();
        if(tfNombreT.getText().length()>19)
            evt.consume();
    }//GEN-LAST:event_tfNombreTKeyTyped

    private void tfApellidoPatTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfApellidoPatTKeyTyped
        if(!Character.isLetter(evt.getKeyChar()) && !Character.isWhitespace(evt.getKeyChar()))
            evt.consume();
        if(tfApellidoPatT.getText().length()>14)
            evt.consume();
    }//GEN-LAST:event_tfApellidoPatTKeyTyped

    private void tfApellidoMatTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfApellidoMatTKeyTyped
        if(!Character.isLetter(evt.getKeyChar()) && !Character.isWhitespace(evt.getKeyChar()))
            evt.consume();
        if(tfApellidoMatT.getText().length()>14)
            evt.consume();
    }//GEN-LAST:event_tfApellidoMatTKeyTyped

    private void tfCalleTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCalleTKeyTyped
        if(!Character.isLetter(evt.getKeyChar()) && !Character.isWhitespace(evt.getKeyChar()) && !Character.isDigit(evt.getKeyChar()))
            evt.consume();
        if(tfCalleT.getText().length()>39)
            evt.consume();
    }//GEN-LAST:event_tfCalleTKeyTyped

    private void tfMunicipioTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMunicipioTKeyTyped
        if(!Character.isLetter(evt.getKeyChar()) && !Character.isWhitespace(evt.getKeyChar()))
            evt.consume();
        if(tfMunicipioT.getText().length()>14)
            evt.consume();
    }//GEN-LAST:event_tfMunicipioTKeyTyped

    private void tfTelefonoTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTelefonoTKeyTyped
        if(!Character.isDigit(evt.getKeyChar()))
            evt.consume();
        if(tfTelefonoT.getText().length()>=10)
            evt.consume();
    }//GEN-LAST:event_tfTelefonoTKeyTyped

    private void btnGuardarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarTActionPerformed
        conexion cc=new conexion();
        Connection cn = cc.conexion();
        String cla,nom,apat,amat,call,muni,tel;
        String sql="";
        cla = tfClaveT.getText();
        nom = tfNombreT.getText();
        apat = tfApellidoPatT.getText();
        amat = tfApellidoMatT.getText();
        call = tfCalleT.getText();
        muni = tfMunicipioT.getText();
        tel = tfTelefonoT.getText();
        
        if (tfClaveT.getText().length()==0 || tfNombreT.getText().length()==0 || tfApellidoMatT.getText().length()==0 || tfApellidoPatT.getText().length()==0 || tfCalleT.getText().length()==0 || tfMunicipioT.getText().length()==0 || tfTelefonoT.getText().length()==0){
            JOptionPane.showMessageDialog(null,"ERROR CAMPOS VACIOS");
        }
        else{
        sql="INSERT INTO tutor (clave_t,nombre,apellidoPat,apellidoMat,calle,municipio,telefono) VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1,cla);
            pst.setString(2,nom);
            pst.setString(3,apat);
            pst.setString(4,amat);
            pst.setString(5,call);
            pst.setString(6,muni);
            pst.setString(7,tel);
            int n=pst.executeUpdate();
            if(n>0){
                JOptionPane.showMessageDialog(null,"Registro guardado con exito");
                limpiar();
                NuevoT.setEnabled(true);
                bloquear();
            }
        } catch (SQLException ex) {
            //Logger.getLogger(vInicio.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Clave duplicada");
        }
        } 
    }//GEN-LAST:event_btnGuardarTActionPerformed

    private void tfClaveTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfClaveTActionPerformed
        tfClaveT.transferFocus();
    }//GEN-LAST:event_tfClaveTActionPerformed

    private void tfNombreTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreTActionPerformed
        tfNombreT.transferFocus();
    }//GEN-LAST:event_tfNombreTActionPerformed

    private void tfApellidoPatTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfApellidoPatTActionPerformed
        tfApellidoPatT.transferFocus();
    }//GEN-LAST:event_tfApellidoPatTActionPerformed

    private void tfApellidoMatTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfApellidoMatTActionPerformed
        tfApellidoMatT.transferFocus();
    }//GEN-LAST:event_tfApellidoMatTActionPerformed

    private void tfCalleTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCalleTActionPerformed
        tfCalleT.transferFocus();
    }//GEN-LAST:event_tfCalleTActionPerformed

    private void tfMunicipioTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMunicipioTActionPerformed
        tfMunicipioT.transferFocus();
    }//GEN-LAST:event_tfMunicipioTActionPerformed

    private void tfTelefonoTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTelefonoTActionPerformed
        tfTelefonoT.transferFocus();
    }//GEN-LAST:event_tfTelefonoTActionPerformed

    private void NuevoTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoTActionPerformed
       desbloquearu();
    }//GEN-LAST:event_NuevoTActionPerformed

    private void btnBorrarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarTActionPerformed
        conexion cc=new conexion();
        Connection cn = cc.conexion();
        String cla;
        cla = tfClaveT.getText();
        NuevoT.setEnabled(true);
        btnGuardarT.setEnabled(false);
        if(tfClaveT.getText().length()>0){
            if (tfClaveT.getText().length()==0 || tfNombreT.getText().length()==0 || tfApellidoMatT.getText().length()==0 || tfApellidoPatT.getText().length()==0 || tfCalleT.getText().length()==0 || tfMunicipioT.getText().length()==0 || tfTelefonoT.getText().length()==0){
                JOptionPane.showMessageDialog(null,"ERROR CAMPOS VACIOS");
        }
        else{
                int r =JOptionPane.showConfirmDialog(null, "¿Seguro de que quiere eliminar los datos?");
                if(r==0){
                    try {
                        PreparedStatement ppt = cn.prepareStatement("DELETE FROM tutor WHERE clave_t='"+cla+"'");
                        ppt.executeUpdate();
                        JOptionPane.showMessageDialog(null,"Datos eliminados correctamente");
                        limpiar();
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,"No se puede eliminar ya que corresponde a un paciente");
                        //Logger.getLogger(vInicio.class.getName()).log(Level.SEVERE, null, ex);
                        }

                }else{
                }
                }
        }
    }//GEN-LAST:event_btnBorrarTActionPerformed

    private void btnEditarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarTActionPerformed
        conexion cc=new conexion();
        Connection cn = cc.conexion();
        Statement st;
        PreparedStatement ps;
        ResultSet rs;
        String cla;
        cla = tfClaveT.getText();
        String sql = "UPDATE tutor SET nombre = '"+tfNombreT.getText()+"',apellidoPat = '"+tfApellidoPatT.getText()+"',apellidoMat = '"+tfApellidoMatT.getText()+"',calle = '"+tfCalleT.getText()+"',municipio = '"+tfMunicipioT.getText()+"',telefono = '"+tfTelefonoT.getText()+"' WHERE clave_t = '"+tfClaveT.getText()+"'";
        if (tfClaveT.getText().length()==0 || tfNombreT.getText().length()==0 || tfApellidoMatT.getText().length()==0 || tfApellidoPatT.getText().length()==0 || tfCalleT.getText().length()==0 || tfMunicipioT.getText().length()==0 || tfTelefonoT.getText().length()==0){
            JOptionPane.showMessageDialog(null,"ERROR CAMPOS VACIOS");
        }
        else{
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            int res = pst.executeUpdate();
            if(res >0 ){
                JOptionPane.showMessageDialog(null, "Datos modificados");
                tfClaveT.setText(null);
                tfNombreT.setText(null);
                tfApellidoPatT.setText(null);
                tfApellidoMatT.setText(null);
                tfCalleT.setText(null);
                tfMunicipioT.setText(null);
                tfTelefonoT.setText(null);
                }
            else{
                JOptionPane.showMessageDialog(null, "Error al modificar los datos");
            }
        } catch (Exception e) {
                 JOptionPane.showMessageDialog(null, String.valueOf(("Error: " + e)));
        }
        }
    }//GEN-LAST:event_btnEditarTActionPerformed

    private void BuscarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarTActionPerformed
        btnGuardarT.setEnabled(false);
        conexion cc=new conexion();
        Connection cn = cc.conexion();
        String sql="";
        sql="SELECT * FROM tutor WHERE clave_t=?";
        try{
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1,tfClaveT.getText());
            rs=pst.executeQuery();
            
            if(rs.next()){
                tfNombreT.setText(rs.getString("nombre"));
                tfApellidoPatT.setText(rs.getString("apellidoPat"));
                tfApellidoMatT.setText(rs.getString("apellidoMat"));
                tfCalleT.setText(rs.getString("calle"));
                tfMunicipioT.setText(rs.getString("municipio"));
                tfTelefonoT.setText(rs.getString("telefono"));
            }
            
        }catch (SQLException e) {
                 JOptionPane.showMessageDialog(null, String.valueOf(("Error: " + e)));
        }
    }//GEN-LAST:event_BuscarTActionPerformed

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
            java.util.logging.Logger.getLogger(vTutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vTutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vTutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vTutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vTutor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarT;
    private javax.swing.JButton NuevoT;
    private javax.swing.JButton btnBorrarT;
    private javax.swing.JButton btnEditarT;
    private javax.swing.JButton btnGuardarT;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private javax.swing.JTextField tfApellidoMatT;
    private javax.swing.JTextField tfApellidoPatT;
    private javax.swing.JTextField tfCalleT;
    private javax.swing.JTextField tfClaveT;
    private javax.swing.JTextField tfMunicipioT;
    private javax.swing.JTextField tfNombreT;
    private javax.swing.JTextField tfTelefonoT;
    // End of variables declaration//GEN-END:variables

}
