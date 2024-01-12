package Literarium;

import javax.swing.JOptionPane;


public class Start extends javax.swing.JFrame {
    
    public Start() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splashScreenPanel = new javax.swing.JPanel();
        percentage = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        loadingLable = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        splashScreenPanel.setBackground(new java.awt.Color(217, 185, 155));

        percentage.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 16)); // NOI18N
        percentage.setForeground(new java.awt.Color(255, 255, 255));
        percentage.setText("%");
        percentage.setName("Percent"); // NOI18N

        logo.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        logo.setForeground(new java.awt.Color(255, 255, 255));
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Literarium/Images/Logo.png"))); // NOI18N

        loadingLable.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        loadingLable.setForeground(new java.awt.Color(255, 255, 255));
        loadingLable.setText("Loading...");

        javax.swing.GroupLayout splashScreenPanelLayout = new javax.swing.GroupLayout(splashScreenPanel);
        splashScreenPanel.setLayout(splashScreenPanelLayout);
        splashScreenPanelLayout.setHorizontalGroup(
            splashScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(splashScreenPanelLayout.createSequentialGroup()
                .addGroup(splashScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, splashScreenPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(loadingLable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(percentage))
                    .addGroup(splashScreenPanelLayout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 220, Short.MAX_VALUE)))
                .addContainerGap())
        );
        splashScreenPanelLayout.setVerticalGroup(
            splashScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(splashScreenPanelLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(splashScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(percentage)
                    .addComponent(loadingLable))
                .addContainerGap())
        );

        progressBar.setForeground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splashScreenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(splashScreenPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {
        Start splashScreen = new Start();

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
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        // Starting the main program
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                splashScreen.setVisible(true);
            }
        });

        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(2);
                splashScreen.progressBar.setValue(i);
                splashScreen.percentage.setText(Integer.toString(i) + "%");
                
                // Display specific loading messages at different loading percentage
                if (i == 10) {
                    splashScreen.loadingLable.setText("Turning on Modules...");
                }
                if (i == 20) {
                    splashScreen.loadingLable.setText("Loading Modules...");
                }
                if (i == 50) {
                    splashScreen.loadingLable.setText("Connecting to Database...");
                }
                if (i == 70) {
                    splashScreen.loadingLable.setText("Connection Successful!");
                }
                if (i == 80) {
                    splashScreen.loadingLable.setText("Launching Application...");
                }
            } 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        new Login().setVisible(true);

        splashScreen.dispose(); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel loadingLable;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel percentage;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JPanel splashScreenPanel;
    // End of variables declaration//GEN-END:variables
}
