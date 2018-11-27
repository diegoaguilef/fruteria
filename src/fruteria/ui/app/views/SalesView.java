/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruteria.ui.app.views;

import fruteria.ui.app.controller.FruitsController;
import fruteria.ui.app.model.Fruit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author kdieg
 */
public class SalesView extends javax.swing.JFrame {
  private final String IMAGES_PATH = "src\\fruteria\\ui\\app\\assets\\images";
  /**
   * Creates new form SalesView
   */
  public SalesView() {
    initComponents();
    setLocationRelativeTo(this);
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    txtTicket = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    txtDate = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    comboClient = new javax.swing.JComboBox<>();
    jLabel5 = new javax.swing.JLabel();
    txtFruitId = new javax.swing.JTextField();
    btnSearch = new javax.swing.JButton();
    btnFruits = new javax.swing.JButton();
    jPanel2 = new javax.swing.JPanel();
    jLabel6 = new javax.swing.JLabel();
    txtFruitName = new javax.swing.JTextField();
    jLabel7 = new javax.swing.JLabel();
    txtFruitPrice = new javax.swing.JTextField();
    jLabel8 = new javax.swing.JLabel();
    txtFruitStock = new javax.swing.JTextField();
    stxImage = new javax.swing.JLabel();
    jLabel10 = new javax.swing.JLabel();
    txtQuantity = new javax.swing.JTextField();
    btnQuote = new javax.swing.JButton();
    txtTotal = new javax.swing.JTextField();
    jLabel11 = new javax.swing.JLabel();
    btnConfirm = new javax.swing.JButton();
    btnCancel = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(204, 255, 204));

    jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel1.setText("Menú de Venta");

    jLabel2.setText("N° BOLETA: ");

    jLabel3.setText("FECHA COMPRA:");

    jLabel4.setText("CLIENTE:");

    comboClient.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));

    jLabel5.setText("ID FRUTA:");

    btnSearch.setText("Buscar");
    btnSearch.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSearchActionPerformed(evt);
      }
    });

    btnFruits.setText("Ver Frutas");
    btnFruits.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnFruitsActionPerformed(evt);
      }
    });

    jPanel2.setBackground(new java.awt.Color(255, 255, 204));
    jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Producto"));

    jLabel6.setText("Nombre:");

    txtFruitName.setEditable(false);
    txtFruitName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
    txtFruitName.setForeground(new java.awt.Color(0, 204, 0));
    txtFruitName.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtFruitNameActionPerformed(evt);
      }
    });

    jLabel7.setText("Precio:");

    txtFruitPrice.setEditable(false);
    txtFruitPrice.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
    txtFruitPrice.setForeground(new java.awt.Color(0, 204, 0));
    txtFruitPrice.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtFruitPriceActionPerformed(evt);
      }
    });

    jLabel8.setText("Stock:");

    txtFruitStock.setEditable(false);
    txtFruitStock.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
    txtFruitStock.setForeground(new java.awt.Color(0, 204, 0));

    stxImage.setText("                   Imagen");
    stxImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jLabel6)
            .addGap(6, 6, 6)
            .addComponent(txtFruitName, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel7)
              .addComponent(jLabel8))
            .addGap(14, 14, 14)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(txtFruitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtFruitStock, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(stxImage, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(30, 30, 30))
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(33, 33, 33)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel6)
              .addComponent(txtFruitName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel7)
              .addComponent(txtFruitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel8)
              .addComponent(txtFruitStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(stxImage, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jLabel10.setText("CANTIDAD:");

    btnQuote.setText("Cotizar");
    btnQuote.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnQuoteActionPerformed(evt);
      }
    });

    txtTotal.setEditable(false);
    txtTotal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
    txtTotal.setForeground(new java.awt.Color(0, 204, 0));

    jLabel11.setText("Precio Total:");

    btnConfirm.setText("Confirmar Venta");
    btnConfirm.setEnabled(false);

    btnCancel.setText("Cancelar Venta");
    btnCancel.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCancelActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabel1))
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel5)
                .addGap(13, 13, 13)
                .addComponent(txtFruitId, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(btnSearch)
                .addGap(10, 10, 10)
                .addComponent(btnFruits))
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel10)
                .addGap(4, 4, 4)
                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnQuote)
                .addGap(40, 40, 40)
                .addComponent(jLabel11)
                .addGap(4, 4, 4)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(btnConfirm)
                .addGap(40, 40, 40)
                .addComponent(btnCancel)))
            .addGap(0, 93, Short.MAX_VALUE))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(10, 10, 10)
            .addComponent(jLabel2)
            .addGap(4, 4, 4)
            .addComponent(txtTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(10, 10, 10)
            .addComponent(jLabel3)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtDate)
            .addGap(18, 18, 18)
            .addComponent(jLabel4)
            .addGap(4, 4, 4)
            .addComponent(comboClient, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(6, 6, 6)
        .addComponent(jLabel1)
        .addGap(11, 11, 11)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(txtTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(comboClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(3, 3, 3)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel2)
              .addComponent(jLabel3)
              .addComponent(jLabel4))))
        .addGap(11, 11, 11)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(4, 4, 4)
            .addComponent(jLabel5))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(1, 1, 1)
            .addComponent(txtFruitId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(btnSearch)
          .addComponent(btnFruits))
        .addGap(11, 11, 11)
        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(6, 6, 6)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(4, 4, 4)
            .addComponent(jLabel10))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(1, 1, 1)
            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(btnQuote)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(3, 3, 3)
            .addComponent(jLabel11))
          .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(11, 11, 11)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(btnConfirm)
          .addComponent(btnCancel))
        .addContainerGap(27, Short.MAX_VALUE))
    );

    getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void txtFruitPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFruitPriceActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtFruitPriceActionPerformed

  private void txtFruitNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFruitNameActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtFruitNameActionPerformed

  private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
    // TODO add your handling code here:
    int id;
    String fruit_name;
    Fruit fruit;
    if(!txtFruitId.getText().equals("")){
      id = Integer.parseInt(txtFruitId.getText());
      fruit = FruitsController.find(id);
      if(fruit != null){
        fruit_name = fruit.getName();
        ImageIcon icon = new ImageIcon(IMAGES_PATH + "\\fruits\\"+fruit.getPhoto());
        txtFruitName.setText(fruit_name);
        txtFruitPrice.setText(String.valueOf(fruit.getPrice()));
        txtFruitStock.setText(String.valueOf(fruit.getStock()));
        stxImage.setIcon(icon);
      }
    }
    
  }//GEN-LAST:event_btnSearchActionPerformed

  private void btnFruitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFruitsActionPerformed
    // TODO add your handling code here:
    new FruitsTable().setVisible(true);
  }//GEN-LAST:event_btnFruitsActionPerformed

  private void btnQuoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuoteActionPerformed
    // TODO add your handling code here:
    int fruit_price = 0;
    int quantity = 0;
    int total_price;
    if(!txtFruitStock.getText().equals("0")){
      fruit_price = Integer.parseInt(txtFruitPrice.getText());
      quantity = Integer.parseInt(txtQuantity.getText());
      total_price = fruit_price * quantity;
      txtTotal.setText(String.valueOf(total_price));
      btnConfirm.setEnabled(true);
    }else{
      JOptionPane.showMessageDialog(null, "Producto sin Stock", "Cotizar Producto", JOptionPane.ERROR_MESSAGE);
    }
  }//GEN-LAST:event_btnQuoteActionPerformed

  private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
    // TODO add your handling code here:
    setVisible(false);
  }//GEN-LAST:event_btnCancelActionPerformed

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
      java.util.logging.Logger.getLogger(SalesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(SalesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(SalesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(SalesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new SalesView().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnCancel;
  private javax.swing.JButton btnConfirm;
  private javax.swing.JButton btnFruits;
  private javax.swing.JButton btnQuote;
  private javax.swing.JButton btnSearch;
  private javax.swing.JComboBox<String> comboClient;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JLabel stxImage;
  private javax.swing.JTextField txtDate;
  private javax.swing.JTextField txtFruitId;
  private javax.swing.JTextField txtFruitName;
  private javax.swing.JTextField txtFruitPrice;
  private javax.swing.JTextField txtFruitStock;
  private javax.swing.JTextField txtQuantity;
  private javax.swing.JTextField txtTicket;
  private javax.swing.JTextField txtTotal;
  // End of variables declaration//GEN-END:variables
}
