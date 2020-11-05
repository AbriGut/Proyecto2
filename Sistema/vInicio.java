package Sistema;
import java.sql.*;
import java.util.logging.*;
import javax.swing.*;

public class vInicio extends javax.swing.JFrame {
      ResultSet rs, rsa;
      boolean band;
    public vInicio() {
        initComponents();
        limpiar();
        //bloquear();
        this.setResizable(false);
        setTitle("Spa Perritos");
        ((JPanel)getContentPane()).setOpaque(false);
        JLabel fond=new JLabel();
        getLayeredPane().add(fond,JLayeredPane.FRAME_CONTENT_LAYER);
        this.setLocation(400,100);
        setIconImage(new ImageIcon(getClass().getResource("../Sistema/iconoSis.png")).getImage());
        lares.setVisible(false);
    }
    void limpiar(){
        tfCodigoV.setText(null);
        tfNombreV.setText(null);
        tfCantExisV.setText(null);
        lares.setText(null);
    }
    void bloquear(){
      tfCodigoV.setEnabled(false);
      tfNombreV.setEnabled(false);
      tfCantExisV.setEnabled(false);
      Nuevo.setEnabled(true);
      btnGuardar.setEnabled(false);
      btnEditar.setEnabled(false);
      
    }
    void desbloquear(){
      tfCodigoV.setEnabled(true);
      tfNombreV.setEnabled(true);
      tfCantExisV.setEnabled(true);
      Nuevo.setEnabled(false);
      btnGuardar.setEnabled(true);
      btnEditar.setEnabled(true);
         }
    void aux(){
        conexion cc=new conexion();
        Connection cn = cc.conexion();
        String cod,sql="";
        cod = tfCodigoV.getText();
        sql="select codigo_v from recibe where codigo_v='"+cod+"'";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            rsa=pst.executeQuery();
            if(rsa==null){
               band=true; 
            }else{band=false;}
        } catch (SQLException ex) {
            //Logger.getLogger(vInicio.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"ERROR AUX");
        }
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgConsultas = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnTutor = new javax.swing.JButton();
        btnAplic = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfCodigoV = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfNombreV = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfCantExisV = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        Nuevo = new javax.swing.JButton();
        buscarV = new javax.swing.JButton();
        Gotas = new javax.swing.JRadioButton();
        inyec = new javax.swing.JRadioButton();
        lares = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        consultaspa = new javax.swing.JMenu();
        consultasvacunas = new javax.swing.JMenu();
        consulaplivacu = new javax.swing.JMenu();
        consultatutor = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setForeground(new java.awt.Color(255, 204, 204));

        btnTutor.setBackground(new java.awt.Color(204, 204, 255));
        btnTutor.setText("Dueño");
        btnTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTutorActionPerformed(evt);
            }
        });

        btnAplic.setBackground(new java.awt.Color(204, 204, 255));
        btnAplic.setText("Aplicación de Servicio");
        btnAplic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicActionPerformed(evt);
            }
        });

        jButton1.setText("Mascota");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAplic)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(btnTutor))
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(btnTutor)
                .addGap(34, 34, 34)
                .addComponent(jButton1)
                .addGap(41, 41, 41)
                .addComponent(btnAplic)
                .addContainerGap(190, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel1.setText("Servicio");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Código");

        tfCodigoV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoVActionPerformed(evt);
            }
        });
        tfCodigoV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCodigoVKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nombre");

        tfNombreV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreVActionPerformed(evt);
            }
        });
        tfNombreV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNombreVKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Tipo");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Cantidad existente");

        tfCantExisV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCantExisVActionPerformed(evt);
            }
        });
        tfCantExisV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCantExisVKeyTyped(evt);
            }
        });

        jPanel3.setBackground(java.awt.SystemColor.activeCaption);

        btnGuardar.setBackground(new java.awt.Color(204, 204, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/iGuardar.png"))); // NOI18N
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(204, 204, 255));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/iEditar.png"))); // NOI18N
        btnEditar.setContentAreaFilled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        Nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/Guar2.png"))); // NOI18N
        Nuevo.setContentAreaFilled(false);
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });

        buscarV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/Busca1.png"))); // NOI18N
        buscarV.setContentAreaFilled(false);
        buscarV.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buscarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buscarV, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscarV, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonGroup1.add(Gotas);
        Gotas.setText("Estetica");
        Gotas.setContentAreaFilled(false);

        buttonGroup1.add(inyec);
        inyec.setText("Veterinaria");
        inyec.setContentAreaFilled(false);

        lares.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(inyec))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCodigoV, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNombreV, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCantExisV, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Gotas))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lares, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(37, 37, 37)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(tfCodigoV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(tfNombreV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(Gotas))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inyec)
                .addGap(3, 3, 3)
                .addComponent(lares, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(tfCantExisV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        consultaspa.setText("Consultar mascota");
        consultaspa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultaspaMouseClicked(evt);
            }
        });
        jMenuBar1.add(consultaspa);

        consultasvacunas.setText("Consultar servicio");
        consultasvacunas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultasvacunasMouseClicked(evt);
            }
        });
        jMenuBar1.add(consultasvacunas);

        consulaplivacu.setText("Consultar aplicación de servicio");
        consulaplivacu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consulaplivacuMouseClicked(evt);
            }
        });
        jMenuBar1.add(consulaplivacu);

        consultatutor.setBorder(null);
        consultatutor.setText("Consultar tutor");
        consultatutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultatutorMouseClicked(evt);
            }
        });
        jMenuBar1.add(consultatutor);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTutorActionPerformed
        vTutor abrir = new vTutor();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTutorActionPerformed

    private void btnAplicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicActionPerformed
        vAplicarVacuna abrir = new vAplicarVacuna();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAplicActionPerformed

    private void tfCodigoVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoVActionPerformed
        tfCodigoV.transferFocus();
    }//GEN-LAST:event_tfCodigoVActionPerformed

    private void tfCantExisVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCantExisVActionPerformed
        tfCantExisV.transferFocus();
    }//GEN-LAST:event_tfCantExisVActionPerformed

    private void tfNombreVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreVActionPerformed
        tfNombreV.transferFocus();
    }//GEN-LAST:event_tfNombreVActionPerformed

    private void tfCodigoVKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCodigoVKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
        if(tfCodigoV.getText().length()>2)
            evt.consume();
    }//GEN-LAST:event_tfCodigoVKeyTyped

    private void tfNombreVKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNombreVKeyTyped
        if(!Character.isLetter(evt.getKeyChar()) && !Character.isWhitespace(evt.getKeyChar()))
            evt.consume();
        if(tfNombreV.getText().length()>19)
            evt.consume();
    }//GEN-LAST:event_tfNombreVKeyTyped

    private void tfCantExisVKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCantExisVKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
        if(tfCantExisV.getText().length()>2)
            evt.consume();
    }//GEN-LAST:event_tfCantExisVKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        conexion cc=new conexion();
        Connection cn = cc.conexion();
        String nom,cod,tip = null,cnat;
        String sql="";
        if(Gotas.isSelected()){
            tip="Gotas";
        } else if (inyec.isSelected())
            tip="Inyectable";
        cod = tfCodigoV.getText();
        nom = tfNombreV.getText();
        cnat = tfCantExisV.getText();
        if (tfCodigoV.getText().length()==0 || tfNombreV.getText().length()==0 || tfCantExisV.getText().length()==0){
            JOptionPane.showMessageDialog(null,"ERROR CAMPOS VACIOS");
        }
        else{
        sql="INSERT INTO vacuna (codigo_v,nombre,tipo,cantidad_existente) VALUES (?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1,cod);
            pst.setString(2,nom);
            pst.setString(3,tip);
            pst.setString(4,cnat);
            int n=pst.executeUpdate();
            if(n>0){
                JOptionPane.showMessageDialog(null,"Registro guardado con exito");
                limpiar();
            }
        } catch (SQLException ex) {
            //Logger.getLogger(vInicio.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"ERROR CODIGO YA REGISTRADO");
        }
        } 
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        desbloquear();
        tfCodigoV.requestFocus();
    }//GEN-LAST:event_NuevoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        conexion cc=new conexion();
        Connection cn = cc.conexion();
        String tip = null;
        Statement st;
        PreparedStatement ps;
        ResultSet rs;
        if(Gotas.isSelected()){
            tip="Gotas";
        } else {if (inyec.isSelected())
            tip="Inyectable"; } 
        if (tfCodigoV.getText().length()==0 || tfNombreV.getText().length()==0 || tfCantExisV.getText().length()==0){
            JOptionPane.showMessageDialog(null,"ERROR CAMPOS VACIOS");
        }
        else{
            String sql = "update vacuna set Nombre = '"+tfNombreV.getText()+"',tipo = '"+tip+"',Cantidad_existente = '"+tfCantExisV.getText()+"' where codigo_v = "+tfCodigoV.getText();
            try {
                PreparedStatement pst = cn.prepareStatement(sql);
                int res = pst.executeUpdate();
                if(res >0 ){
                    JOptionPane.showMessageDialog(null, "Datos modificados");
                    tfCodigoV.setText(null);
                    tfNombreV.setText(null);
                    tfCantExisV.setText(null);
                    buttonGroup1.clearSelection();}
                else{
                    JOptionPane.showMessageDialog(null, "Error al modificar los datos");
                }
            } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, String.valueOf(("Error: " + e)));
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void consultaspaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultaspaMouseClicked
        ConsultaPaciente abrir = new ConsultaPaciente();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_consultaspaMouseClicked

    private void consultasvacunasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultasvacunasMouseClicked
        ConsultasVacunas_1 abrir = new ConsultasVacunas_1();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_consultasvacunasMouseClicked

    private void consulaplivacuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consulaplivacuMouseClicked
        ConsultasAplicacionDeVacuna_1 abrir = new ConsultasAplicacionDeVacuna_1();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_consulaplivacuMouseClicked

    private void consultatutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultatutorMouseClicked
        ConsultasTutor_1 abrir = new ConsultasTutor_1();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_consultatutorMouseClicked

    private void buscarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarVActionPerformed
        conexion cc=new conexion();
        Connection cn = cc.conexion();
        String sql="";
        lares.setVisible(true);
        sql="SELECT * FROM vacuna WHERE codigo_v=?";
        try{
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1,tfCodigoV.getText());
            rs=pst.executeQuery();
            
            if(rs.next()){
                tfNombreV.setText(rs.getString("nombre"));
                String w = rs.getString("tipo");
                lares.setText(rs.getString("tipo"));
                if ( w.equalsIgnoreCase("inyectable")){
                    inyec.setSelected(true);
                }else{ if(w.equalsIgnoreCase("gotas")){
                    Gotas.setSelected(true);}
                    else{
                        System.out.println("Error");
                        }}
                tfCantExisV.setText(rs.getString("cantidad_existente"));
            }
            
        }catch (SQLException e) {
                JOptionPane.showMessageDialog(null, String.valueOf(("Error: " + e)));
                //JOptionPane.showMessageDialog(null, "ERROR CÓDIGO NO EXISTENTE");
        }
    }//GEN-LAST:event_buscarVActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      vPaciente abrir = new vPaciente();
        abrir.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(vInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Gotas;
    private javax.swing.JButton Nuevo;
    private javax.swing.ButtonGroup bgConsultas;
    private javax.swing.JButton btnAplic;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnTutor;
    private javax.swing.JButton buscarV;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenu consulaplivacu;
    private javax.swing.JMenu consultaspa;
    private javax.swing.JMenu consultasvacunas;
    private javax.swing.JMenu consultatutor;
    private javax.swing.JRadioButton inyec;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lares;
    private javax.swing.JTextField tfCantExisV;
    private javax.swing.JTextField tfCodigoV;
    private javax.swing.JTextField tfNombreV;
    // End of variables declaration//GEN-END:variables
}
