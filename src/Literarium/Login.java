package Literarium;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import java.sql.*;



public class Login extends javax.swing.JFrame {
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        decoPanel = new javax.swing.JPanel();
        motto1 = new javax.swing.JLabel();
        motto2 = new javax.swing.JLabel();
        motto3 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        loginPanel = new javax.swing.JPanel();
        idSubtitle = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        roleComboBox = new javax.swing.JComboBox<>();
        pageTitle = new javax.swing.JLabel();
        passwordSubtitle = new javax.swing.JLabel();
        roleSubtitle = new javax.swing.JLabel();
        descText = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        showPassword = new javax.swing.JRadioButton();
        close = new javax.swing.JButton();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        decoPanel.setBackground(new java.awt.Color(217, 185, 155));

        motto1.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 22)); // NOI18N
        motto1.setForeground(new java.awt.Color(255, 255, 255));
        motto1.setText("The Reading Haven");

        motto2.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 22)); // NOI18N
        motto2.setForeground(new java.awt.Color(255, 255, 255));
        motto2.setText("Boundless Words");

        motto3.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 22)); // NOI18N
        motto3.setForeground(new java.awt.Color(255, 255, 255));
        motto3.setText("Stories for All");

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Literarium/Images/Logo.png"))); // NOI18N

        javax.swing.GroupLayout decoPanelLayout = new javax.swing.GroupLayout(decoPanel);
        decoPanel.setLayout(decoPanelLayout);
        decoPanelLayout.setHorizontalGroup(
            decoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(decoPanelLayout.createSequentialGroup()
                .addGroup(decoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(decoPanelLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(decoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(decoPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(motto2))
                            .addComponent(motto1)))
                    .addGroup(decoPanelLayout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(motto3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, decoPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        decoPanelLayout.setVerticalGroup(
            decoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(decoPanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(motto1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(motto2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(motto3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        loginPanel.setBackground(new java.awt.Color(250, 250, 250));

        idSubtitle.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        idSubtitle.setForeground(new java.awt.Color(123, 63, 0));
        idSubtitle.setText("UID");

        id.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        id.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        roleComboBox.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 16)); // NOI18N
        roleComboBox.setForeground(new java.awt.Color(123, 63, 0));
        roleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Customer" }));
        roleComboBox.setBorder(null);
        roleComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        pageTitle.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 36)); // NOI18N
        pageTitle.setForeground(new java.awt.Color(123, 63, 0));
        pageTitle.setText("LOGIN");

        passwordSubtitle.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        passwordSubtitle.setForeground(new java.awt.Color(123, 63, 0));
        passwordSubtitle.setText("Password");

        roleSubtitle.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        roleSubtitle.setForeground(new java.awt.Color(123, 63, 0));
        roleSubtitle.setText("Select Role");

        descText.setFont(new java.awt.Font(".AppleSystemUIFont", 2, 20)); // NOI18N
        descText.setForeground(new java.awt.Color(123, 63, 0));
        descText.setText("Bookstore");

        login.setBackground(new java.awt.Color(123, 63, 0));
        login.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 22)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Login");
        login.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        login.setBorderPainted(false);
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(123, 63, 0));
        clear.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 22)); // NOI18N
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setText("Clear");
        clear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clear.setBorderPainted(false);
        clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clear.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        clear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        password.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        showPassword.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        showPassword.setForeground(new java.awt.Color(117, 66, 0));
        showPassword.setText("Show Password");
        showPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordActionPerformed(evt);
            }
        });

        close.setBackground(new java.awt.Color(204, 0, 51));
        close.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 21)); // NOI18N
        close.setForeground(new java.awt.Color(255, 255, 255));
        close.setText("X");
        close.setBorder(null);
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(roleSubtitle)
                                    .addComponent(passwordSubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(92, 92, 92)
                                .addComponent(showPassword))
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addComponent(idSubtitle)
                                .addGap(79, 79, 79)
                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pageTitle)
                                    .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(id)
                                        .addComponent(password)
                                        .addComponent(roleComboBox, 0, 176, Short.MAX_VALUE)))))
                        .addGap(108, 108, 108))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addComponent(descText)
                        .addGap(161, 161, 161))))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(close)
                .addGap(70, 70, 70)
                .addComponent(pageTitle)
                .addGap(27, 27, 27)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roleSubtitle)
                    .addComponent(roleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idSubtitle)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordSubtitle)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(showPassword)
                .addGap(26, 26, 26)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(descText)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(decoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(decoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private Statement St;
    private Connection Con;
    private ResultSet Rs;
    private String sql;
    private String query;
    private PreparedStatement Ps;
    
    public Login() {
        initComponents();
        Con = databaseConnection.mycon();
    }
    
    // login button
    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed

        String IDText = id.getText();
        String passwordText = new String(password.getPassword());
        String selectedRole = roleComboBox.getSelectedItem().toString();
        
        try {
            if (selectedRole.equals("Admin")) {
            sql = "SELECT * FROM Admin WHERE adminId=? AND pass=?";
            query = "SELECT * FROM Admin WHERE adminId='" + IDText + "' AND pass='" + passwordText + "'";
        } else if (selectedRole.equals("Customer")) {
            sql = "SELECT * FROM Customer WHERE customerId=? AND pass=?";
            query = "SELECT * FROM Customer WHERE customerId='" + IDText + "' AND pass='" + passwordText + "'";
        } else {
            throw new IllegalArgumentException("Invalid role selected");
        }

            try (PreparedStatement preparedStatement = Con.prepareStatement(sql)) {
                preparedStatement.setString(1, IDText);
                preparedStatement.setString(2, passwordText);

                ResultSet rs = preparedStatement.executeQuery();

                if (rs.next()) {
                    this.setVisible(false);
                    if (selectedRole.equals("Admin")) {
                        new Admin().setVisible(true);
                    } else if (selectedRole.equals("Customer")) {
                        SharedData.setCustomerId(IDText);
                        new Store().setVisible(true);
                    }
                } else {
                JOptionPane.showMessageDialog(this, "Invalid " + selectedRole + " ID or Password.");
            }
        }
    } catch (SQLException e) {
        System.out.println(e);
    } catch (HeadlessException | IllegalArgumentException e) {
        System.out.println(e);
    }
    }//GEN-LAST:event_loginActionPerformed

    //clear button
    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        id.setText(null);
        password.setText(null);
    }//GEN-LAST:event_clearActionPerformed
  
    // show password button
    private void showPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordActionPerformed
        if (showPassword.isSelected()) {
            password.setEchoChar((char)0);
        } else {
            password.setEchoChar('*');
        }
    }//GEN-LAST:event_showPasswordActionPerformed

    // x button
    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed

    }//GEN-LAST:event_idActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JButton close;
    private javax.swing.JPanel decoPanel;
    private javax.swing.JLabel descText;
    private javax.swing.JTextField id;
    private javax.swing.JLabel idSubtitle;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JButton login;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel motto1;
    private javax.swing.JLabel motto2;
    private javax.swing.JLabel motto3;
    private javax.swing.JLabel pageTitle;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel passwordSubtitle;
    private javax.swing.JComboBox<String> roleComboBox;
    private javax.swing.JLabel roleSubtitle;
    private javax.swing.JRadioButton showPassword;
    // End of variables declaration//GEN-END:variables
}
