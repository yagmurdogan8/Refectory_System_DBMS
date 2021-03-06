//@author Yağmur Doğan

public class frmLoginYEY extends javax.swing.JFrame {

    /**
     * Creates new form frmLoginYEY
     */
    public frmLoginYEY() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        btnLoginPageYEY = new javax.swing.JButton();
        btnUpdateYEY = new javax.swing.JButton();
        btnTableYEY = new javax.swing.JButton();
        btnDeleteYEY = new javax.swing.JButton();
        btnAddDataYEY = new javax.swing.JButton();
        lblYEY = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLoginPageYEY.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        btnLoginPageYEY.setForeground(new java.awt.Color(0, 0, 102));
        btnLoginPageYEY.setText("Log Out");
        btnLoginPageYEY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginPageYEYActionPerformed(evt);
            }
        });

        btnUpdateYEY.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        btnUpdateYEY.setForeground(new java.awt.Color(0, 0, 102));
        btnUpdateYEY.setText("Update Data");
        btnUpdateYEY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateYEYActionPerformed(evt);
            }
        });

        btnTableYEY.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        btnTableYEY.setForeground(new java.awt.Color(0, 0, 102));
        btnTableYEY.setText("Tables");
        btnTableYEY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTableYEYActionPerformed(evt);
            }
        });

        btnDeleteYEY.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        btnDeleteYEY.setForeground(new java.awt.Color(0, 0, 102));
        btnDeleteYEY.setText("Delete Data");
        btnDeleteYEY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteYEYActionPerformed(evt);
            }
        });

        btnAddDataYEY.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        btnAddDataYEY.setForeground(new java.awt.Color(0, 0, 102));
        btnAddDataYEY.setText("Add Data");
        btnAddDataYEY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDataYEYActionPerformed(evt);
            }
        });

        lblYEY.setFont(new java.awt.Font("Baskerville Old Face", 3, 24)); // NOI18N
        lblYEY.setForeground(new java.awt.Color(102, 0, 0));
        lblYEY.setText("In this page you can choose which process you intend to run.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(295, 295, 295)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnAddDataYEY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnLoginPageYEY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnUpdateYEY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnDeleteYEY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnTableYEY, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(58, Short.MAX_VALUE)
                                .addComponent(lblYEY, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(lblYEY, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(btnLoginPageYEY, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAddDataYEY, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdateYEY, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeleteYEY, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnTableYEY, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void btnLoginPageYEYActionPerformed(java.awt.event.ActionEvent evt) {

        new frmIntro().show();
        this.hide();
    }

    private void btnUpdateYEYActionPerformed(java.awt.event.ActionEvent evt) {
        new frmUpdate().show();
        this.hide();
    }

    private void btnTableYEYActionPerformed(java.awt.event.ActionEvent evt) {
        new frmTable().show();
        this.hide();
    }

    private void btnDeleteYEYActionPerformed(java.awt.event.ActionEvent evt) {
        new frmDelete().show();
        this.hide();
    }

    private void btnAddDataYEYActionPerformed(java.awt.event.ActionEvent evt) {
        new frmAdd().show();
        this.hide();
    }

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
            java.util.logging.Logger.getLogger(frmLoginYEY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLoginYEY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLoginYEY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLoginYEY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLoginYEY().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnAddDataYEY;
    private javax.swing.JButton btnDeleteYEY;
    private javax.swing.JButton btnLoginPageYEY;
    private javax.swing.JButton btnTableYEY;
    private javax.swing.JButton btnUpdateYEY;
    private javax.swing.JLabel lblYEY;
    // End of variables declaration
}
