/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.Color;

/**
 *
 * @author Bravo
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    private int xMouse;
    private int yMouse;

    public Login() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PNMain = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        spPassword = new javax.swing.JSeparator();
        lblUser = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        spUser = new javax.swing.JSeparator();
        psPassword = new javax.swing.JPasswordField();
        pnButtonEnter = new javax.swing.JPanel();
        btnButtonEnter = new javax.swing.JLabel();
        pnBar = new javax.swing.JPanel();
        pnButtonExit = new javax.swing.JPanel();
        lblExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        PNMain.setBackground(new java.awt.Color(255, 255, 255));
        PNMain.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PNMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Sistema de Votación Electrónica");
        PNMain.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 390, -1));

        lblCity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/Catarata.gif"))); // NOI18N
        PNMain.add(lblCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 410, 510));

        lblLogin.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblLogin.setText("INICIAR SESIÓN");
        PNMain.add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 40));

        lblPassword.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblPassword.setText("Contraseña");
        PNMain.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 110, 30));
        PNMain.add(spPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 440, 20));

        lblUser.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblUser.setText("USUARIO");
        PNMain.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 90, 30));

        txtUser.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtUser.setForeground(new java.awt.Color(204, 204, 204));
        txtUser.setText("Ingrese su nombre de usuario");
        txtUser.setBorder(null);
        txtUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUserMousePressed(evt);
            }
        });
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        PNMain.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 430, 30));
        PNMain.add(spUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 440, 10));

        psPassword.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        psPassword.setForeground(new java.awt.Color(204, 204, 204));
        psPassword.setText("********");
        psPassword.setBorder(null);
        psPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                psPasswordMousePressed(evt);
            }
        });
        PNMain.add(psPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 440, 30));

        pnButtonEnter.setBackground(new java.awt.Color(0, 134, 190));

        btnButtonEnter.setBackground(new java.awt.Color(0, 100, 190));
        btnButtonEnter.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnButtonEnter.setForeground(new java.awt.Color(255, 255, 255));
        btnButtonEnter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnButtonEnter.setText("Entrar");
        btnButtonEnter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnButtonEnter.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnButtonEnter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnButtonEnterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnButtonEnterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnButtonEnterMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnButtonEnterLayout = new javax.swing.GroupLayout(pnButtonEnter);
        pnButtonEnter.setLayout(pnButtonEnterLayout);
        pnButtonEnterLayout.setHorizontalGroup(
            pnButtonEnterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnButtonEnterLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnButtonEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnButtonEnterLayout.setVerticalGroup(
            pnButtonEnterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnButtonEnterLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnButtonEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PNMain.add(pnButtonEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 110, 50));

        pnBar.setBackground(new java.awt.Color(255, 255, 255));
        pnBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnBarMouseDragged(evt);
            }
        });
        pnBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnBarMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnBarMousePressed(evt);
            }
        });

        pnButtonExit.setBackground(new java.awt.Color(255, 255, 255));

        lblExit.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExit.setText("X");
        lblExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnButtonExitLayout = new javax.swing.GroupLayout(pnButtonExit);
        pnButtonExit.setLayout(pnButtonExitLayout);
        pnButtonExitLayout.setHorizontalGroup(
            pnButtonExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblExit, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );
        pnButtonExitLayout.setVerticalGroup(
            pnButtonExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblExit, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnBarLayout = new javax.swing.GroupLayout(pnBar);
        pnBar.setLayout(pnBarLayout);
        pnBarLayout.setHorizontalGroup(
            pnBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBarLayout.createSequentialGroup()
                .addComponent(pnButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 779, Short.MAX_VALUE))
        );
        pnBarLayout.setVerticalGroup(
            pnBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnButtonExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PNMain.add(pnBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PNMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PNMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnBarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_pnBarMousePressed

    private void pnBarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnBarMouseEntered

    }//GEN-LAST:event_pnBarMouseEntered

    private void pnBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnBarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_pnBarMouseDragged

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        pnButtonExit.setBackground(Color.white);
        lblExit.setForeground(Color.black);
    }//GEN-LAST:event_lblExitMouseExited

    private void lblExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseEntered
        pnButtonExit.setBackground(Color.red);
        lblExit.setForeground(Color.white);
    }//GEN-LAST:event_lblExitMouseEntered

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblExitMouseClicked

    private void btnButtonEnterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnButtonEnterMouseExited
        pnButtonEnter.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_btnButtonEnterMouseExited

    private void btnButtonEnterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnButtonEnterMouseEntered
        pnButtonEnter.setBackground(new Color(0, 156, 233));
    }//GEN-LAST:event_btnButtonEnterMouseEntered

    private void btnButtonEnterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnButtonEnterMouseClicked
        String enteredMail = txtUser.getText();
        String enteredPassword = new String(psPassword.getPassword());
    }//GEN-LAST:event_btnButtonEnterMouseClicked

    private void psPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_psPasswordMousePressed
        if (String.valueOf(psPassword.getPassword()).equals("********")) {
            psPassword.setText("");
            psPassword.setForeground(Color.BLACK);
        }
        if (txtUser.getText().isEmpty()) {
            txtUser.setText("Ingrese su nombre de usuario");
            txtUser.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_psPasswordMousePressed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed

    }//GEN-LAST:event_txtUserActionPerformed

    private void txtUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserMousePressed
        if (txtUser.getText().equals("Ingrese su nombre de usuario")) {
            txtUser.setText("");
            txtUser.setForeground(Color.BLACK);
        }
        if (String.valueOf(psPassword.getPassword()).isEmpty()) {
            psPassword.setText("********");
            psPassword.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txtUserMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PNMain;
    private javax.swing.JLabel btnButtonEnter;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel pnBar;
    private javax.swing.JPanel pnButtonEnter;
    private javax.swing.JPanel pnButtonExit;
    private javax.swing.JPasswordField psPassword;
    private javax.swing.JSeparator spPassword;
    private javax.swing.JSeparator spUser;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
