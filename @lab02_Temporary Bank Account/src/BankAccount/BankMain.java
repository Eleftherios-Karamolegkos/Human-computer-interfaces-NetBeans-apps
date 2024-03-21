
package BankAccount;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;



public class BankMain extends javax.swing.JFrame {

    
    public BankMain() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new JButton();
        jLabel1 = new JLabel();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jButton6 = new JButton();
        jButton7 = new JButton();
        jLabel2 = new JLabel();
        nume12 = new JTextField();
        jTextField1 = new JTextField();
        jMenuBar1 = new JMenuBar();
        jMenu1 = new JMenu();
        jMenuItem1 = new JMenuItem();
        jSeparator1 = new JPopupMenu.Separator();
        jMenuItem3 = new JMenuItem();
        jMenuItem4 = new JMenuItem();
        jMenu2 = new JMenu();
        jMenuItem5 = new JMenuItem();
        jMenuItem6 = new JMenuItem();
        jMenuItem7 = new JMenuItem();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("ITSOURCECODE Bank Account Manager");
        setBackground(new Color(240, 114, 107));
        setForeground(Color.black);
        setIconImages(null);
        getContentPane().setLayout(new AbsoluteLayout());

        jButton1.setIcon(new ImageIcon(getClass().getResource("/BankAccount/account.png"))); // NOI18N
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new AbsoluteConstraints(20, 10, 60, 80));

        jLabel1.setFont(new Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        jLabel1.setForeground(new Color(255, 0, 51));
        jLabel1.setText("Temporary bank accounts");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new AbsoluteConstraints(160, 10, -1, 30));

        jButton2.setText("Deposit");
        jButton2.setMaximumSize(new Dimension(107, 23));
        jButton2.setMinimumSize(new Dimension(107, 23));
        jButton2.setPreferredSize(new Dimension(107, 23));
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new AbsoluteConstraints(130, 130, -1, 40));

        jButton3.setText("Withdraw");
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new AbsoluteConstraints(370, 130, 107, 40));

        jButton4.setIcon(new ImageIcon(getClass().getResource("/BankAccount/Balance.png"))); // NOI18N
        jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new AbsoluteConstraints(10, 230, 130, 40));

        jButton6.setIcon(new ImageIcon(getClass().getResource("/BankAccount/Quest.png"))); // NOI18N
        jButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new AbsoluteConstraints(560, 10, 30, 41));

        jButton7.setIcon(new ImageIcon(getClass().getResource("/BankAccount/Close.png"))); // NOI18N
        jButton7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new AbsoluteConstraints(510, 240, 70, 30));

        jLabel2.setIcon(new ImageIcon(getClass().getResource("/BankAccount/Background.png"))); // NOI18N
        getContentPane().add(jLabel2, new AbsoluteConstraints(0, 0, 610, 290));

        nume12.setBackground(new Color(0, 51, 102));
        nume12.setForeground(new Color(255, 255, 255));
        nume12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                nume12ActionPerformed(evt);
            }
        });
        getContentPane().add(nume12, new AbsoluteConstraints(180, 290, 430, 20));

        jTextField1.setBackground(new Color(0, 51, 102));
        jTextField1.setForeground(new Color(255, 255, 255));
        jTextField1.setText(" Encripting code name for account:");
        getContentPane().add(jTextField1, new AbsoluteConstraints(0, 290, 180, 20));

        jMenu1.setText("New");

        jMenuItem1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("New Account..");
        jMenuItem1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        jMenuItem3.setText("About");
        jMenuItem3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.ALT_DOWN_MASK));
        jMenuItem4.setText("Exit");
        jMenuItem4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Transaction");

        jMenuItem5.setText("Deposit Amount..");
        jMenuItem5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Withdraw Amount..");
        jMenuItem6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, InputEvent.CTRL_DOWN_MASK));
        jMenuItem7.setText("Check Account Balance..");
        jMenuItem7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private static Account acc;
    
    private void jMenuItem6ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
           try
           {
               String num;
               num = JOptionPane.showInputDialog(null, "Enter a Amount To Withdraw:", "Withdraw Amount", 1);
               double num1 = Double.parseDouble(num);
               acc.withdraw(num1);
           }
           catch(BankAccountException | NumberFormatException | NullPointerException ex)
           {
               JOptionPane.showMessageDialog(null, ex, "Error", 2);
           }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jButton2ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try
        {
           String num;
           num = JOptionPane.showInputDialog(null, "Enter a Value To Deposit:", "Deposit Amount", 1);
           double num1 = Double.parseDouble(num);
           acc.deposit(num1);
        }
        catch(NumberFormatException | NullPointerException nfe1)
        {
            JOptionPane.showMessageDialog(null, nfe1, "Error", 2);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        String name; 
        long num; 
        name = JOptionPane.showInputDialog(null, "Please Enter Account Holder Name:", "Create Account", 1);
        num = 1332522123;
       acc = new Account(name, num);
        
        JOptionPane.showMessageDialog(null, "Account Succesfully Created!", "Create Account", 1);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton6ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        JOptionPane.showMessageDialog(null,"Created By DANIEL GHINITA \n If you change account you will lose all money ", "About", 1);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jMenuItem3ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        JOptionPane.showMessageDialog(null,"Created By DANIEL GHINITA", "About", 1);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        try
        {
           String num;
           num = JOptionPane.showInputDialog(null, "Enter a Value To Deposit:", "Deposit Amount", 1);
           double num1 = Double.parseDouble(num);
           acc.deposit(num1);
        }
        catch(NumberFormatException | NullPointerException nfe1)
        {
            JOptionPane.showMessageDialog(null, nfe1, "Error", 2);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem7ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
       try
       {
         double num = acc.getBalance();
         JOptionPane.showMessageDialog(null, "Current Balance: " + num, "Current Balance", 1);
       }
       catch(NullPointerException npe)
       {
           JOptionPane.showMessageDialog(null, npe, "Error", 2);
       }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jButton1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name = ""; 
        long num; 
        name = JOptionPane.showInputDialog(null, "Please Enter Account Holder Name:");
        num = 1332522123;
        //acc = new Account(name, num);
        //JOptionPane.showMessageDialog(null, "Account Succesfully Created!", "Create Account", 1);
        
       
       
        
         if( name != "")
        {   acc = new Account(name, num);
            System.out.println("Acount created");
            nume12.setText("" +acc);
        
        }
        else
        {
           System.out.println("NU");
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try
           {
               String num;
               num = JOptionPane.showInputDialog(null, "Enter a Amount To Withdraw:", "Withdraw Amount", 1);
               double num1 = Double.parseDouble(num);
               acc.withdraw(num1);
           }
           catch(BankAccountException | NumberFormatException | NullPointerException ex)
           {
               JOptionPane.showMessageDialog(null, ex, "Error", 2);
           }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       try
       {
         double num = acc.getBalance();
         JOptionPane.showMessageDialog(null, "Current Balance: " + num, "Current Balance", 1);
       }
       catch(NullPointerException npe)
       {
           JOptionPane.showMessageDialog(null, npe, "Error", 2);
       }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void nume12ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_nume12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nume12ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Windows look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Windows (introduced in Java SE 4) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new BankMain().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton6;
    private JButton jButton7;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JMenu jMenu1;
    private JMenu jMenu2;
    private JMenuBar jMenuBar1;
    private JMenuItem jMenuItem1;
    private JMenuItem jMenuItem3;
    private JMenuItem jMenuItem4;
    private JMenuItem jMenuItem5;
    private JMenuItem jMenuItem6;
    private JMenuItem jMenuItem7;
    private JPopupMenu.Separator jSeparator1;
    private JTextField jTextField1;
    private JTextField nume12;
    // End of variables declaration//GEN-END:variables

    private String strlen(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
