
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Saksham
 */
public class BuyPropertyApp extends javax.swing.JFrame {

    static int pos = -1;  //Used to keep track of which House in the array of Houses the user is currently dealing with
    static int coordinates;

    DecimalFormat x = new DecimalFormat("##,###,###.##");

    public BuyPropertyApp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCoordinates = new javax.swing.JLabel();
        txtCoordinates = new javax.swing.JTextField();
        btnChoose = new javax.swing.JButton();
        lblPropertyCost = new javax.swing.JLabel();
        lblBuy = new javax.swing.JLabel();
        btnBuyProperty = new javax.swing.JButton();
        btnDontBuyProperty = new javax.swing.JButton();
        lblDisclaimer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblCoordinates.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCoordinates.setText("Input Coordinates of Property (x,y):");

        btnChoose.setText("Choose");
        btnChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseActionPerformed(evt);
            }
        });

        lblPropertyCost.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPropertyCost.setText("The cost of the property is:");

        lblBuy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblBuy.setText("Would you like to buy the property?");

        btnBuyProperty.setText("Buy Property");
        btnBuyProperty.setEnabled(false);
        btnBuyProperty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyPropertyActionPerformed(evt);
            }
        });

        btnDontBuyProperty.setText("Don't Buy Property");
        btnDontBuyProperty.setEnabled(false);
        btnDontBuyProperty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDontBuyPropertyActionPerformed(evt);
            }
        });

        lblDisclaimer.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblDisclaimer.setText("*If you choose not to buy the property, you will have to end your turn.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCoordinates)
                        .addGap(18, 18, 18)
                        .addComponent(txtCoordinates))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnChoose)
                            .addComponent(lblPropertyCost)
                            .addComponent(lblBuy)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBuyProperty)
                                .addGap(18, 18, 18)
                                .addComponent(btnDontBuyProperty))
                            .addComponent(lblDisclaimer))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCoordinates)
                    .addComponent(txtCoordinates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(btnChoose)
                .addGap(18, 18, 18)
                .addComponent(lblPropertyCost)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblBuy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuyProperty)
                    .addComponent(btnDontBuyProperty))
                .addGap(18, 18, 18)
                .addComponent(lblDisclaimer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public int getLabel() {
        /*
         Pre: Knows which coordinates correspond to whcih position in the array of Houses
         Post: Returns position in array
         */
        if (GameScreenApp.arrHouses[pos].getCoordinates() == 11) {
            return 1;
        } else if (GameScreenApp.arrHouses[pos].getCoordinates() == 21) {
            return 2;
        } else if (GameScreenApp.arrHouses[pos].getCoordinates() == 31) {
            return 3;
        } else if (GameScreenApp.arrHouses[pos].getCoordinates() == 32) {
            return 4;
        } else if (GameScreenApp.arrHouses[pos].getCoordinates() == 22) {
            return 5;
        } else if (GameScreenApp.arrHouses[pos].getCoordinates() == 12) {
            return 6;
        } else if (GameScreenApp.arrHouses[pos].getCoordinates() == 13) {
            return 7;
        } else if (GameScreenApp.arrHouses[pos].getCoordinates() == 23) {
            return 8;
        } else if (GameScreenApp.arrHouses[pos].getCoordinates() == 33) {
            return 9;
        } else if (GameScreenApp.arrHouses[pos].getCoordinates() == 34) {
            return 10;
        } else if (GameScreenApp.arrHouses[pos].getCoordinates() == 24) {
            return 11;
        } else if (GameScreenApp.arrHouses[pos].getCoordinates() == 14) {
            return 12;
        } else if (GameScreenApp.arrHouses[pos].getCoordinates() == 15) {
            return 13;
        } else if (GameScreenApp.arrHouses[pos].getCoordinates() == 25) {
            return 14;
        } else if (GameScreenApp.arrHouses[pos].getCoordinates() == 35) {
            return 15;
        } else if (GameScreenApp.arrHouses[pos].getCoordinates() == 36) {
            return 16;
        } else if (GameScreenApp.arrHouses[pos].getCoordinates() == 26) {
            return 17;
        } else if (GameScreenApp.arrHouses[pos].getCoordinates() == 16) {
            return 18;
        } else if (GameScreenApp.arrHouses[pos].getCoordinates() == 17) {
            return 19;
        } else if (GameScreenApp.arrHouses[pos].getCoordinates() == 27) {
            return 20;
        } else if (GameScreenApp.arrHouses[pos].getCoordinates() == 37) {
            return 21;
        } else if (GameScreenApp.arrHouses[pos].getCoordinates() == 47) {
            return 22;
        } else if (GameScreenApp.arrHouses[pos].getCoordinates() == 57) {
            return 23;
        } else if (GameScreenApp.arrHouses[pos].getCoordinates() == 67) {
            return 24;
        } else if (GameScreenApp.arrHouses[pos].getCoordinates() == 77) {
            return 25;
        } else if (GameScreenApp.arrHouses[pos].getCoordinates() == 76) {
            return 26;
        } else if (GameScreenApp.arrHouses[pos].getCoordinates() == 66) {
            return 27;
        } else if (GameScreenApp.arrHouses[pos].getCoordinates() == 56) {
            return 28;
        } else if (GameScreenApp.arrHouses[pos].getCoordinates() == 46) {
            return 29;
        } else if (GameScreenApp.arrHouses[pos].getCoordinates() == 45) {
            return 30;
        } else if (GameScreenApp.arrHouses[pos].getCoordinates() == 55) {
            return 31;
        } else if (GameScreenApp.arrHouses[pos].getCoordinates() == 65) {
            return 32;
        } else if (GameScreenApp.arrHouses[pos].getCoordinates() == 75) {
            return 33;
        } else if (GameScreenApp.arrHouses[pos].getCoordinates() == 74) {
            return 34;
        } else if (GameScreenApp.arrHouses[pos].getCoordinates() == 64) {
            return 35;
        } else if (GameScreenApp.arrHouses[pos].getCoordinates() == 54) {
            return 36;
        } else if (GameScreenApp.arrHouses[pos].getCoordinates() == 44) {
            return 37;
        } else if (GameScreenApp.arrHouses[pos].getCoordinates() == 43) {
            return 38;
        } else if (GameScreenApp.arrHouses[pos].getCoordinates() == 53) {
            return 39;
        } else if (GameScreenApp.arrHouses[pos].getCoordinates() == 63) {
            return 40;
        } else if (GameScreenApp.arrHouses[pos].getCoordinates() == 73) {
            return 41;
        } else if (GameScreenApp.arrHouses[pos].getCoordinates() == 72) {
            return 42;
        } else if (GameScreenApp.arrHouses[pos].getCoordinates() == 62) {
            return 43;
        } else if (GameScreenApp.arrHouses[pos].getCoordinates() == 52) {
            return 44;
        } else if (GameScreenApp.arrHouses[pos].getCoordinates() == 42) {
            return 45;
        } else if (GameScreenApp.arrHouses[pos].getCoordinates() == 41) {
            return 46;
        } else if (GameScreenApp.arrHouses[pos].getCoordinates() == 51) {
            return 47;
        } else if (GameScreenApp.arrHouses[pos].getCoordinates() == 61) {
            return 48;
        } else {
            return 49;
        }
    }

    private void btnBuyPropertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyPropertyActionPerformed
        ArrayList<Player> playerList = GameScreenApp.players;
        // Update player balance by subtracting property cost from previous balance
        playerList.get(GameScreenApp.turn - 1).setBalance((int) (playerList.get(GameScreenApp.turn - 1).getBalance() - GameScreenApp.arrHouses[pos].getPrice()));
        // Add property to player's property list
        playerList.get(GameScreenApp.turn - 1).addProperty(GameScreenApp.arrHouses[pos]);
        // Make property sold
        GameScreenApp.arrHouses[pos].setSold(true);

        int labelNum = getLabel();

        /*
         Pre: Program now knows the label number of the house that was bought
         Post: The property block's background is set to black to signify that it is sold
         */
        if (labelNum == 1) {
            GameScreenApp.lblHouse1.setBackground(Color.BLACK);
        } else if (labelNum == 2) {
            GameScreenApp.lblHouse2.setBackground(Color.BLACK);
        } else if (labelNum == 3) {
            GameScreenApp.lblHouse3.setBackground(Color.BLACK);
        } else if (labelNum == 4) {
            GameScreenApp.lblHouse4.setBackground(Color.BLACK);
        } else if (labelNum == 5) {
            GameScreenApp.lblHouse5.setBackground(Color.BLACK);
        } else if (labelNum == 6) {
            GameScreenApp.lblHouse6.setBackground(Color.BLACK);
        } else if (labelNum == 7) {
            GameScreenApp.lblHouse7.setBackground(Color.BLACK);
        } else if (labelNum == 8) {
            GameScreenApp.lblHouse8.setBackground(Color.BLACK);
        } else if (labelNum == 9) {
            GameScreenApp.lblHouse9.setBackground(Color.BLACK);
        } else if (labelNum == 10) {
            GameScreenApp.lblHouse10.setBackground(Color.BLACK);
        } else if (labelNum == 11) {
            GameScreenApp.lblHouse11.setBackground(Color.BLACK);
        } else if (labelNum == 12) {
            GameScreenApp.lblHouse12.setBackground(Color.BLACK);
        } else if (labelNum == 13) {
            GameScreenApp.lblHouse13.setBackground(Color.BLACK);
        } else if (labelNum == 14) {
            GameScreenApp.lblHouse14.setBackground(Color.BLACK);
        } else if (labelNum == 15) {
            GameScreenApp.lblHouse15.setBackground(Color.BLACK);
        } else if (labelNum == 16) {
            GameScreenApp.lblHouse16.setBackground(Color.BLACK);
        } else if (labelNum == 17) {
            GameScreenApp.lblHouse17.setBackground(Color.BLACK);
        } else if (labelNum == 18) {
            GameScreenApp.lblHouse18.setBackground(Color.BLACK);
        } else if (labelNum == 19) {
            GameScreenApp.lblHouse19.setBackground(Color.BLACK);
        } else if (labelNum == 20) {
            GameScreenApp.lblHouse20.setBackground(Color.BLACK);
        } else if (labelNum == 21) {
            GameScreenApp.lblHouse21.setBackground(Color.BLACK);
        } else if (labelNum == 22) {
            GameScreenApp.lblHouse22.setBackground(Color.BLACK);
        } else if (labelNum == 23) {
            GameScreenApp.lblHouse23.setBackground(Color.BLACK);
        } else if (labelNum == 24) {
            GameScreenApp.lblHouse24.setBackground(Color.BLACK);
        } else if (labelNum == 25) {
            GameScreenApp.lblHouse25.setBackground(Color.BLACK);
        } else if (labelNum == 26) {
            GameScreenApp.lblHouse26.setBackground(Color.BLACK);
        } else if (labelNum == 27) {
            GameScreenApp.lblHouse27.setBackground(Color.BLACK);
        } else if (labelNum == 28) {
            GameScreenApp.lblHouse28.setBackground(Color.BLACK);
        } else if (labelNum == 29) {
            GameScreenApp.lblHouse29.setBackground(Color.BLACK);
        } else if (labelNum == 30) {
            GameScreenApp.lblHouse30.setBackground(Color.BLACK);
        } else if (labelNum == 31) {
            GameScreenApp.lblHouse31.setBackground(Color.BLACK);
        } else if (labelNum == 32) {
            GameScreenApp.lblHouse32.setBackground(Color.BLACK);
        } else if (labelNum == 33) {
            GameScreenApp.lblHouse33.setBackground(Color.BLACK);
        } else if (labelNum == 34) {
            GameScreenApp.lblHouse34.setBackground(Color.BLACK);
        } else if (labelNum == 35) {
            GameScreenApp.lblHouse35.setBackground(Color.BLACK);
        } else if (labelNum == 36) {
            GameScreenApp.lblHouse36.setBackground(Color.BLACK);
        } else if (labelNum == 37) {
            GameScreenApp.lblHouse37.setBackground(Color.BLACK);
        } else if (labelNum == 38) {
            GameScreenApp.lblHouse38.setBackground(Color.BLACK);
        } else if (labelNum == 39) {
            GameScreenApp.lblHouse39.setBackground(Color.BLACK);
        } else if (labelNum == 40) {
            GameScreenApp.lblHouse40.setBackground(Color.BLACK);
        } else if (labelNum == 41) {
            GameScreenApp.lblHouse41.setBackground(Color.BLACK);
        } else if (labelNum == 42) {
            GameScreenApp.lblHouse42.setBackground(Color.BLACK);
        } else if (labelNum == 43) {
            GameScreenApp.lblHouse43.setBackground(Color.BLACK);
        } else if (labelNum == 44) {
            GameScreenApp.lblHouse44.setBackground(Color.BLACK);
        } else if (labelNum == 45) {
            GameScreenApp.lblHouse45.setBackground(Color.BLACK);
        } else if (labelNum == 46) {
            GameScreenApp.lblHouse46.setBackground(Color.BLACK);
        } else if (labelNum == 47) {
            GameScreenApp.lblHouse47.setBackground(Color.BLACK);
        } else if (labelNum == 48) {
            GameScreenApp.lblHouse48.setBackground(Color.BLACK);
        } else {
            GameScreenApp.lblHouse49.setBackground(Color.BLACK);
        }

        close();
    }//GEN-LAST:event_btnBuyPropertyActionPerformed

    private void btnDontBuyPropertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDontBuyPropertyActionPerformed
        close();
    }//GEN-LAST:event_btnDontBuyPropertyActionPerformed

    private void btnChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseActionPerformed

        String input = txtCoordinates.getText();
        House arrHouses[] = GameScreenApp.arrHouses;
        //Checks if input has 3 characters (Input validation - Step 1)
        if (input.length() == 3) {
            try {
                Integer.parseInt(Character.toString(input.charAt(0)));
                Integer.parseInt(Character.toString(input.charAt(2)));
                if (Integer.parseInt(Character.toString(input.charAt(0))) > 0 && Integer.parseInt(Character.toString(input.charAt(0))) < 8 && Integer.parseInt(Character.toString(input.charAt(2))) > 0 && Integer.parseInt(Character.toString(input.charAt(0))) < 8 && input.charAt(1) == ',') {
                    StringTokenizer s = new StringTokenizer(input, ",");
                    coordinates = Integer.parseInt(s.nextToken() + s.nextToken());

                    /*
             Pre: Program has coordinates (int)
             Post: Compares the coordinates inputted to the coordinates of each house in the array to find the position of the house
                     */
                    for (int i = 0; i < arrHouses.length; i++) {
                        if (arrHouses[i].getCoordinates() == coordinates) {
                            pos = i;
                        }
                    }

                    if (arrHouses[pos].getSold()) { //Checks if the chosen property is already sold or not (Input Validation - Step 3)
                        txtCoordinates.setText("House Sold");
                    } else {
                        btnBuyProperty.setEnabled(true);
                        btnDontBuyProperty.setEnabled(true);
                        btnChoose.setEnabled(false);

                        lblPropertyCost.setText("The cost of the property is: $" + x.format(arrHouses[pos].getPrice()));
                    }
                    //Disables the "Buy" button if player doesn't have enough money
                    if (arrHouses[pos].getPrice() > GameScreenApp.players.get(GameScreenApp.turn - 1).getBalance()) {
                        btnBuyProperty.setEnabled(false);
                    }
                } else {
                    txtCoordinates.setText("Invalid Entry");
                }

            } catch (NumberFormatException e) {
                txtCoordinates.setText("Invalid Entry");
            }
        } else {
            txtCoordinates.setText("Invalid Entry");
        }

    }//GEN-LAST:event_btnChooseActionPerformed

    public void close() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

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
            java.util.logging.Logger.getLogger(BuyPropertyApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuyPropertyApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuyPropertyApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuyPropertyApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuyPropertyApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuyProperty;
    private javax.swing.JButton btnChoose;
    private javax.swing.JButton btnDontBuyProperty;
    private javax.swing.JLabel lblBuy;
    private javax.swing.JLabel lblCoordinates;
    private javax.swing.JLabel lblDisclaimer;
    private javax.swing.JLabel lblPropertyCost;
    private javax.swing.JTextField txtCoordinates;
    // End of variables declaration//GEN-END:variables
}
