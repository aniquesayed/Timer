/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author aniquesayed
 */
public class Timer extends javax.swing.JFrame {

    public Timer() {
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

        DigitValue = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        ShowDigit = new javax.swing.JButton();
        AddOne = new javax.swing.JButton();
        OneSecsDisplay = new javax.swing.JButton();
        ShowOneSecs = new javax.swing.JButton();
        OneSecs = new javax.swing.JTextField();
        ShowTenSecs = new javax.swing.JButton();
        TenSecs = new javax.swing.JTextField();
        TenSecsDisplay = new javax.swing.JButton();
        Stop = new javax.swing.JButton();
        StartTimer = new javax.swing.JButton();
        ShowOneMins = new javax.swing.JButton();
        OneMinsDisplay = new javax.swing.JButton();
        OneMins = new javax.swing.JTextField();
        ShowTenMins = new javax.swing.JButton();
        TenMinsDisplay = new javax.swing.JButton();
        TenMins = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Digital Timer");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DigitValue.setText("000");
        DigitValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DigitValueActionPerformed(evt);
            }
        });
        getContentPane().add(DigitValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 100, -1));

        jTextField1.setBackground(new java.awt.Color(0, 0, 255));
        jTextField1.setText("   ");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 50, -1));

        jTextField2.setBackground(new java.awt.Color(0, 0, 255));
        jTextField2.setText("   ");
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, 100));

        jTextField3.setBackground(new java.awt.Color(0, 0, 255));
        jTextField3.setText("   ");
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, -1, 100));

        jTextField4.setBackground(new java.awt.Color(0, 0, 255));
        jTextField4.setText("   ");
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 50, -1));

        jTextField5.setBackground(new java.awt.Color(0, 0, 255));
        jTextField5.setText("   ");
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, -1, 100));

        jTextField6.setBackground(new java.awt.Color(0, 0, 255));
        jTextField6.setText("   ");
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, -1, 100));

        jTextField7.setBackground(new java.awt.Color(0, 0, 255));
        jTextField7.setText("   ");
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 50, -1));

        ShowDigit.setText("Show The Digit");
        ShowDigit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowDigitActionPerformed(evt);
            }
        });
        getContentPane().add(ShowDigit, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, -1, -1));

        AddOne.setText("Add One");
        AddOne.setToolTipText("");
        AddOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddOneActionPerformed(evt);
            }
        });
        getContentPane().add(AddOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, -1, -1));

        OneSecsDisplay.setText("jButton1");
        OneSecsDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OneSecsDisplayActionPerformed(evt);
            }
        });
        getContentPane().add(OneSecsDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 120, 180));

        ShowOneSecs.setText("Show One Secs");
        ShowOneSecs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowOneSecsActionPerformed(evt);
            }
        });
        getContentPane().add(ShowOneSecs, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 460, -1, -1));

        OneSecs.setText("000");
        OneSecs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OneSecsActionPerformed(evt);
            }
        });
        getContentPane().add(OneSecs, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 500, 140, -1));

        ShowTenSecs.setText("Show Ten Secs");
        ShowTenSecs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowTenSecsActionPerformed(evt);
            }
        });
        getContentPane().add(ShowTenSecs, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, -1, -1));

        TenSecs.setText("000");
        TenSecs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TenSecsActionPerformed(evt);
            }
        });
        getContentPane().add(TenSecs, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, 140, -1));

        TenSecsDisplay.setText("jButton2");
        getContentPane().add(TenSecsDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 120, 180));

        Stop.setText("End");
        Stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StopActionPerformed(evt);
            }
        });
        getContentPane().add(Stop, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        StartTimer.setText("Start");
        StartTimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartTimerActionPerformed(evt);
            }
        });
        getContentPane().add(StartTimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        ShowOneMins.setText("Show One Mins");
        ShowOneMins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowOneMinsActionPerformed(evt);
            }
        });
        getContentPane().add(ShowOneMins, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, -1, -1));

        OneMinsDisplay.setText("jButton3");
        getContentPane().add(OneMinsDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 120, 180));

        OneMins.setText("000");
        OneMins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OneMinsActionPerformed(evt);
            }
        });
        getContentPane().add(OneMins, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 500, 140, -1));

        ShowTenMins.setText("Show Ten Mins");
        ShowTenMins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowTenMinsActionPerformed(evt);
            }
        });
        getContentPane().add(ShowTenMins, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, -1));

        TenMinsDisplay.setText("jButton4");
        getContentPane().add(TenMinsDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 120, 180));

        TenMins.setText("000");
        TenMins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TenMinsActionPerformed(evt);
            }
        });
        getContentPane().add(TenMins, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 140, -1));

        pack();
    }// </editor-fold>                        

    private void ShowDigitActionPerformed(java.awt.event.ActionEvent evt) {

        int Digit1 = Integer.parseInt(DigitValue.getText());

        if (Digit1 == 0) {
            jTextField1.setVisible(true);
            jTextField2.setVisible(true);
            jTextField3.setVisible(true);
            jTextField4.setVisible(false);
            jTextField5.setVisible(true);
            jTextField6.setVisible(true);
            jTextField7.setVisible(true);
        }

        if (Digit1 == 1) {
            jTextField1.setVisible(false);
            jTextField2.setVisible(false);
            jTextField3.setVisible(true);
            jTextField4.setVisible(false);
            jTextField5.setVisible(false);
            jTextField6.setVisible(true);
            jTextField7.setVisible(false);
        }

        if (Digit1 == 2) {
            jTextField1.setVisible(true);
            jTextField2.setVisible(false);
            jTextField3.setVisible(true);
            jTextField4.setVisible(true);
            jTextField5.setVisible(true);
            jTextField6.setVisible(false);
            jTextField7.setVisible(true);
        }

        if (Digit1 == 3) {
            jTextField1.setVisible(true);
            jTextField2.setVisible(false);
            jTextField3.setVisible(true);
            jTextField4.setVisible(true);
            jTextField5.setVisible(false);
            jTextField6.setVisible(true);
            jTextField7.setVisible(true);
        }

        if (Digit1 == 4) {
            jTextField1.setVisible(false);
            jTextField2.setVisible(true);
            jTextField3.setVisible(true);
            jTextField4.setVisible(true);
            jTextField5.setVisible(false);
            jTextField6.setVisible(true);
            jTextField7.setVisible(false);
        }

        if (Digit1 == 5) {
            jTextField1.setVisible(true);
            jTextField2.setVisible(true);
            jTextField3.setVisible(false);
            jTextField4.setVisible(true);
            jTextField5.setVisible(false);
            jTextField6.setVisible(true);
            jTextField7.setVisible(true);
        }

        if (Digit1 == 6) {
            jTextField1.setVisible(true);
            jTextField2.setVisible(true);
            jTextField3.setVisible(false);
            jTextField4.setVisible(true);
            jTextField5.setVisible(true);
            jTextField6.setVisible(true);
            jTextField7.setVisible(true);
        }

        if (Digit1 == 7) {
            jTextField1.setVisible(true);
            jTextField2.setVisible(false);
            jTextField3.setVisible(true);
            jTextField4.setVisible(false);
            jTextField5.setVisible(false);
            jTextField6.setVisible(true);
            jTextField7.setVisible(false);
        }

        if (Digit1 == 8) {
            jTextField1.setVisible(true);
            jTextField2.setVisible(true);
            jTextField3.setVisible(true);
            jTextField4.setVisible(true);
            jTextField5.setVisible(true);
            jTextField6.setVisible(true);
            jTextField7.setVisible(true);
        }

        if (Digit1 == 9) {
            jTextField1.setVisible(true);
            jTextField2.setVisible(true);
            jTextField3.setVisible(true);
            jTextField4.setVisible(true);
            jTextField5.setVisible(false);
            jTextField6.setVisible(true);
            jTextField7.setVisible(false);
        }

    }

    private void AddOneActionPerformed(java.awt.event.ActionEvent evt) {

        int DV = Integer.parseInt(DigitValue.getText());
        int SV = Integer.parseInt(OneSecs.getText());
        int TV = Integer.parseInt(TenSecs.getText());
        int MVI = Integer.parseInt(OneMins.getText());
        int MVII = Integer.parseInt(TenMins.getText());
        DV = DV + 1;
        if (DV == 10) {
            DV = 0;
            SV = SV + 1;
            if (SV == 10) {
                SV = 0;
                TV = TV + 1;
                if (TV == 6) {
                    TV = 0;
                    MVI = MVI + 1;
                    if (MVI == 10) {
                        MVI = 0;
                        MVII = MVII + 1;
                    }
                }
            }
        }
        String DVONE = Integer.toString(DV);
        DigitValue.setText(DVONE);
        ShowDigitActionPerformed(evt);
        String SVONE = Integer.toString(SV);
        OneSecs.setText(SVONE);
        ShowOneSecsActionPerformed(evt);
        String TVONE = Integer.toString(TV);
        TenSecs.setText(TVONE);
        ShowTenSecsActionPerformed(evt);
        String MVIONE = Integer.toString(MVI);
        OneMins.setText(MVIONE);
        ShowOneMinsActionPerformed(evt);
        String MVIIONE = Integer.toString(MVII);
        TenMins.setText(MVIIONE);
        ShowTenMinsActionPerformed(evt);

    }

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void DigitValueActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void ShowOneSecsActionPerformed(java.awt.event.ActionEvent evt) {

        int OneSecsValue = Integer.parseInt(OneSecs.getText());

        if (OneSecsValue == 0) {
            OneSecsDisplay.setIcon(new javax.swing.ImageIcon("Please enter file location here."));
        }

        if (OneSecsValue == 1) {
            OneSecsDisplay.setIcon(new javax.swing.ImageIcon("Please enter file location here."));
        }

        if (OneSecsValue == 2) {
            OneSecsDisplay.setIcon(new javax.swing.ImageIcon("Please enter file location here."));
        }

        if (OneSecsValue == 3) {
            OneSecsDisplay.setIcon(new javax.swing.ImageIcon("Please enter file location here."));
        }

        if (OneSecsValue == 4) {
            OneSecsDisplay.setIcon(new javax.swing.ImageIcon("Please enter file location here."));
        }

        if (OneSecsValue == 5) {
            OneSecsDisplay.setIcon(new javax.swing.ImageIcon("Please enter file location here."));
        }

        if (OneSecsValue == 6) {
            OneSecsDisplay.setIcon(new javax.swing.ImageIcon("Please enter file location here."));
        }

        if (OneSecsValue == 7) {
            OneSecsDisplay.setIcon(new javax.swing.ImageIcon("Please enter file location here."));
        }

        if (OneSecsValue == 8) {
            OneSecsDisplay.setIcon(new javax.swing.ImageIcon("Please enter file location here."));
        }

        if (OneSecsValue == 9) {
            OneSecsDisplay.setIcon(new javax.swing.ImageIcon("Please enter file location here."));
        }

    }

    private void ShowTenSecsActionPerformed(java.awt.event.ActionEvent evt) {

        int TensSecsValue = Integer.parseInt(TenSecs.getText());

        if (TensSecsValue == 0) {
            TenSecsDisplay.setIcon(new javax.swing.ImageIcon("Please enter file location here."));
        }

        if (TensSecsValue == 1) {
            TenSecsDisplay.setIcon(new javax.swing.ImageIcon("Please enter file location here."));
        }

        if (TensSecsValue == 2) {
            TenSecsDisplay.setIcon(new javax.swing.ImageIcon("Please enter file location here."));
        }

        if (TensSecsValue == 3) {
            TenSecsDisplay.setIcon(new javax.swing.ImageIcon("Please enter file location here."));
        }

        if (TensSecsValue == 4) {
            TenSecsDisplay.setIcon(new javax.swing.ImageIcon("Please enter file location here."));
        }

        if (TensSecsValue == 5) {
            TenSecsDisplay.setIcon(new javax.swing.ImageIcon("Please enter file location here."));
        }

        if (TensSecsValue == 6) {
            TenSecsDisplay.setIcon(new javax.swing.ImageIcon("Please enter file location here."));
        }

    }

    private void OneSecsDisplayActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void TenSecsActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void OneSecsActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void StopActionPerformed(java.awt.event.ActionEvent evt) {

        this.dispose();
        System.exit(0);

    }

    private void StartTimerActionPerformed(java.awt.event.ActionEvent evt) {

        javax.swing.Timer tm = new javax.swing.Timer(100, new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AddOneActionPerformed(evt);
            }
        });
        tm.start();

    }

    private void ShowOneMinsActionPerformed(java.awt.event.ActionEvent evt) {

        int OneMinsValue = Integer.parseInt(OneMins.getText());

        if (OneMinsValue == 0) {
            OneMinsDisplay.setIcon(new javax.swing.ImageIcon("Please enter file location here."));
        }

        if (OneMinsValue == 1) {
            OneMinsDisplay.setIcon(new javax.swing.ImageIcon("Please enter file location here."));
        }

        if (OneMinsValue == 2) {
            OneMinsDisplay.setIcon(new javax.swing.ImageIcon("Please enter file location here."));
        }

        if (OneMinsValue == 3) {
            OneMinsDisplay.setIcon(new javax.swing.ImageIcon("Please enter file location here."));
        }

        if (OneMinsValue == 4) {
            OneMinsDisplay.setIcon(new javax.swing.ImageIcon("Please enter file location here."));
        }

        if (OneMinsValue == 5) {
            OneMinsDisplay.setIcon(new javax.swing.ImageIcon("Please enter file location here."));
        }

        if (OneMinsValue == 6) {
            OneMinsDisplay.setIcon(new javax.swing.ImageIcon("Please enter file location here."));
        }

        if (OneMinsValue == 7) {
            OneMinsDisplay.setIcon(new javax.swing.ImageIcon("Please enter file location here."));
        }

        if (OneMinsValue == 8) {
            OneMinsDisplay.setIcon(new javax.swing.ImageIcon("Please enter file location here."));
        }

        if (OneMinsValue == 9) {
            OneMinsDisplay.setIcon(new javax.swing.ImageIcon("Please enter file location here."));
        }

    }

    private void OneMinsActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void TenMinsActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void ShowTenMinsActionPerformed(java.awt.event.ActionEvent evt) {

        int TensMinsValue = Integer.parseInt(TenMins.getText());

        if (TensMinsValue == 0) {
            TenMinsDisplay.setIcon(new javax.swing.ImageIcon("Please enter file location here."));
        }

        if (TensMinsValue == 1) {
            TenMinsDisplay.setIcon(new javax.swing.ImageIcon("Please enter file location here."));
        }

        if (TensMinsValue == 2) {
            TenMinsDisplay.setIcon(new javax.swing.ImageIcon("Please enter file location here."));
        }

        if (TensMinsValue == 3) {
            TenMinsDisplay.setIcon(new javax.swing.ImageIcon("Please enter file location here."));
        }

        if (TensMinsValue == 4) {
            TenMinsDisplay.setIcon(new javax.swing.ImageIcon("Please enter file location here."));
        }

        if (TensMinsValue == 5) {
            TenMinsDisplay.setIcon(new javax.swing.ImageIcon("Please enter file location here."));
        }

        if (TensMinsValue == 6) {
            TenMinsDisplay.setIcon(new javax.swing.ImageIcon("Please enter file location here."));
        }

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
            java.util.logging.Logger.getLogger(Timer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Timer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Timer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Timer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Timer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton AddOne;
    private javax.swing.JTextField DigitValue;
    private javax.swing.JTextField OneMins;
    private javax.swing.JButton OneMinsDisplay;
    private javax.swing.JTextField OneSecs;
    private javax.swing.JButton OneSecsDisplay;
    private javax.swing.JButton ShowDigit;
    private javax.swing.JButton ShowOneMins;
    private javax.swing.JButton ShowOneSecs;
    private javax.swing.JButton ShowTenMins;
    private javax.swing.JButton ShowTenSecs;
    private javax.swing.JButton StartTimer;
    private javax.swing.JButton Stop;
    private javax.swing.JTextField TenMins;
    private javax.swing.JButton TenMinsDisplay;
    private javax.swing.JTextField TenSecs;
    private javax.swing.JButton TenSecsDisplay;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration                   
}
