package gui;

import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author kakar
 */
public class Login extends javax.swing.JFrame {

    Prinsipal prinsipal = new Prinsipal();
    Connection con;

    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String user = "kakarotto639";
    private static final String pass = "kakarotto639";
    private static final String url = "jdbc:mysql://localhost:3306/prueva";

    public Login() {
        initComponents();
        IncorrectCC.setText("");
        InputPss.setText("");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setLocationRelativeTo(this);
        setImageLabel(jLabel1, "C:/Users/kakar/Pictures/logo1.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        InputCC = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        InputPss = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        BtnQR = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CheckRecoUsuario = new javax.swing.JCheckBox();
        CheckMantSesiIni = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        BtnLogin = new javax.swing.JButton();
        CheckVerPass = new javax.swing.JCheckBox();
        BtnAtras = new javax.swing.JButton();
        IncorrectPass = new javax.swing.JLabel();
        IncorrectCC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(207, 254, 178));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourses/logo 1.png"))); // NOI18N
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LOGIN");

        InputCC.setBackground(new java.awt.Color(207, 254, 178));
        InputCC.setForeground(new java.awt.Color(150, 149, 149));
        InputCC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 98, 100)));
        InputCC.setDisabledTextColor(new java.awt.Color(150, 149, 149));
        InputCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputCCActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabel3.setText("Cedula de Ciudadania");

        jLabel4.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabel4.setText("Contraseña");

        InputPss.setBackground(new java.awt.Color(207, 254, 178));
        InputPss.setForeground(new java.awt.Color(30, 30, 30));
        InputPss.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(150, 149, 149)));
        InputPss.setCaretColor(new java.awt.Color(150, 149, 149));
        InputPss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputPssActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourses/logo cedula (2).png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourses/candado (2).png"))); // NOI18N

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        BtnQR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourses/qr (2).png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabel8.setText("Codigo");

        jLabel9.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(30, 30, 30));
        jLabel9.setText("QR");

        CheckRecoUsuario.setBackground(new java.awt.Color(207, 254, 178));
        CheckRecoUsuario.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        CheckRecoUsuario.setForeground(new java.awt.Color(30, 30, 30));
        CheckRecoUsuario.setText("Recordar Usuario");
        CheckRecoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckRecoUsuarioActionPerformed(evt);
            }
        });

        CheckMantSesiIni.setBackground(new java.awt.Color(207, 254, 178));
        CheckMantSesiIni.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        CheckMantSesiIni.setForeground(new java.awt.Color(30, 30, 30));
        CheckMantSesiIni.setText("Mantener sesion iniciada");

        jLabel10.setBackground(new java.awt.Color(130, 249, 193));
        jLabel10.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(30, 30, 30));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Olvide mi contraseña");

        BtnLogin.setBackground(new java.awt.Color(144, 239, 203));
        BtnLogin.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        BtnLogin.setForeground(new java.awt.Color(30, 30, 30));
        BtnLogin.setText("LOGIN");
        BtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLoginActionPerformed(evt);
            }
        });

        CheckVerPass.setBackground(new java.awt.Color(102, 255, 204));
        CheckVerPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckVerPassActionPerformed(evt);
            }
        });

        BtnAtras.setBackground(new java.awt.Color(144, 239, 203));
        BtnAtras.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        BtnAtras.setForeground(new java.awt.Color(30, 30, 30));
        BtnAtras.setText("Atrás");
        BtnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IncorrectCC, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(344, 344, 344)
                            .addComponent(IncorrectPass, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGap(167, 167, 167)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(InputCC, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6))
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel3)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addGap(6, 6, 6)
                                                        .addComponent(CheckRecoUsuario)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(CheckMantSesiIni))
                                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(23, 23, 23)
                                        .addComponent(BtnQR, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(jLabel9))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(InputPss, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CheckVerPass)
                                        .addGap(83, 83, 83)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(jLabel4)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addComponent(jLabel2))
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(634, 634, 634)))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtnAtras))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addContainerGap(1227, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnAtras)
                .addGap(201, 201, 201)
                .addComponent(IncorrectCC, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(InputCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(BtnQR, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel9))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(InputPss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(CheckVerPass))))
                            .addComponent(IncorrectPass, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CheckRecoUsuario)
                            .addComponent(CheckMantSesiIni))))
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(BtnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InputCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputCCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputCCActionPerformed

    private void InputPssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputPssActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputPssActionPerformed

    private void CheckRecoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckRecoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckRecoUsuarioActionPerformed

    private void BtnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtrasActionPerformed
        PantallaIni1 inicio1 = new PantallaIni1();
        inicio1.setVisible(true);
        inicio1.setExtendedState(MAXIMIZED_BOTH);
        inicio1.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BtnAtrasActionPerformed

    private void CheckVerPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckVerPassActionPerformed

    }//GEN-LAST:event_CheckVerPassActionPerformed

    private void BtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLoginActionPerformed
        try {
            // TODO add your handling code here:
            
            boolean t=false;
            IncorrectCC.setText("");
            IncorrectPass.setText("");
            if (InputCC.getText().equals(IncorrectCC.getText())) {
                IncorrectCC.setText("debe llenar todos los campos");
            } else {
                con = DriverManager.getConnection(url, user, pass);
                Statement stmt = con.createStatement();
                //stmt.execute("delete from usuarios where Cedula="+InputCC.getText());//borrar datos
                if (InputPss.getText().equals(IncorrectPass.getText())) {
                    IncorrectPass.setText("debe llenar todos los campos");
                } else {
                    ResultSet rs = stmt.executeQuery("select * from usuarios where Cedula=" + InputCC.getText());
                    
                    while (rs.next()) {
                        if (rs.getString("contrasenia").equals(InputPss.getText())) {
                            
                            prinsipal.setLocationRelativeTo(null);
                            prinsipal.setVisible(true);
                            this.dispose();
                            t=true;
                        } else {
                            IncorrectPass.setText("la contraseña no es correcta");
                            InputPss.setText("");
                            t=true;
                        }
                    }
                    if(t==false){
                    IncorrectCC.setText("el usuario no esta registrado");
                    InputCC.setText("");
                    InputPss.setText("");
                    
                    }
                    rs.close();
                    stmt.close();
                    
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_BtnLoginActionPerformed

    private void setImageLabel(JLabel LabelName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(
                image.getImage().getScaledInstance(LabelName.getWidth(), LabelName.getHeight(), Image.SCALE_DEFAULT)
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAtras;
    private javax.swing.JButton BtnLogin;
    private javax.swing.JLabel BtnQR;
    private javax.swing.JCheckBox CheckMantSesiIni;
    private javax.swing.JCheckBox CheckRecoUsuario;
    private javax.swing.JCheckBox CheckVerPass;
    private javax.swing.JLabel IncorrectCC;
    private javax.swing.JLabel IncorrectPass;
    private javax.swing.JTextField InputCC;
    private javax.swing.JTextField InputPss;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
