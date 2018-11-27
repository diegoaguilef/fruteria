/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruteria.ui.app.views;

import fruteria.ui.app.controller.FruitsController;
import fruteria.ui.app.model.Fruit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author kdieg
 */
public class FruitsMaintainer extends javax.swing.JFrame {
  private final String IMAGES_PATH = "src\\fruteria\\ui\\app\\assets\\images";
  /**
   * Creates new form FruitsMaintainer
   */
  public FruitsMaintainer() {
    initComponents();
    this.setLocationRelativeTo(this);
  }
  
  public void listFruits(){
    areaList.setText("");
    for(Fruit fruit:FruitsController.getFruits()){
      areaList.append(fruit.toString() + "\n");
    }
  }
  
  public void clearInputs(){
    txtId.setText(null);
    txtSpecie.setText(null);
    txtVariety.setText(null);
    txtPrice.setText(null);
    txtStock.setText(null);
    txtPhoto.setText(null);
    stxPhoto.setText("\t\t\tFoto");
    stxPhoto.setIcon(null);
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
    jLabel3 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    txtId = new javax.swing.JTextField();
    txtSpecie = new javax.swing.JTextField();
    txtVariety = new javax.swing.JTextField();
    txtPrice = new javax.swing.JTextField();
    txtStock = new javax.swing.JTextField();
    txtPhoto = new javax.swing.JTextField();
    stxPhoto = new javax.swing.JLabel();
    btnCreate = new javax.swing.JButton();
    btnFind = new javax.swing.JButton();
    btnEdit = new javax.swing.JButton();
    btnDelete = new javax.swing.JButton();
    btnList = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    areaList = new javax.swing.JTextArea();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(255, 255, 204));

    jLabel1.setText("ID:");

    jLabel2.setText("ESPECIE:");

    jLabel3.setText("VARIEDAD:");

    jLabel5.setText("PRECIO:");

    jLabel6.setText("STOCK:");

    jLabel7.setText("IMAGEN:");

    jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel8.setText("Mantenedor de Frutas");

    stxPhoto.setText("                         FOTO");
    stxPhoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

    btnCreate.setBackground(new java.awt.Color(0, 204, 0));
    btnCreate.setText("Crear");
    btnCreate.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCreateActionPerformed(evt);
      }
    });

    btnFind.setBackground(new java.awt.Color(153, 153, 255));
    btnFind.setText("Buscar");
    btnFind.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnFindActionPerformed(evt);
      }
    });

    btnEdit.setBackground(new java.awt.Color(255, 153, 0));
    btnEdit.setText("Editar");
    btnEdit.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnEditActionPerformed(evt);
      }
    });

    btnDelete.setBackground(new java.awt.Color(255, 0, 0));
    btnDelete.setText("Eliminar");
    btnDelete.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnDeleteActionPerformed(evt);
      }
    });

    btnList.setBackground(new java.awt.Color(153, 153, 255));
    btnList.setText("Listar");
    btnList.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnListActionPerformed(evt);
      }
    });

    areaList.setColumns(20);
    areaList.setRows(5);
    jScrollPane1.setViewportView(areaList);

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(122, 122, 122)
            .addComponent(jLabel8))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel1)
                    .addGap(4, 4, 4)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addComponent(jLabel2)
                  .addComponent(jLabel3)))
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5))
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6))
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)))
            .addGap(4, 4, 4)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(txtSpecie, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtVariety, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(txtPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(stxPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(0, 10, Short.MAX_VALUE))
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane1)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(btnCreate)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(btnFind)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(btnEdit)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(btnDelete)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnList)))
        .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(11, 11, 11)
        .addComponent(jLabel8)
        .addGap(11, 11, 11)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(6, 6, 6)
            .addComponent(stxPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(jLabel1))
                  .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jLabel2))
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(txtSpecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jLabel3))
              .addComponent(txtVariety, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel5))
            .addGap(6, 6, 6)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel6))
            .addGap(6, 6, 6)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(txtPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel7))))
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(btnList)
          .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(btnCreate)
            .addComponent(btnFind)
            .addComponent(btnEdit)
            .addComponent(btnDelete)))
        .addGap(14, 14, 14)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
      // TODO add your handling code here:
      String specie, variety, photo;
      int price, stock;
      Fruit fruit = null;

      if(!txtSpecie.getText().equals("")
        && !txtVariety.getText().equals("")
        && !txtPrice.getText().equals("")
        && !txtStock.getText().equals("")
        && !txtPhoto.getText().equals("")){
        //
        specie = txtSpecie.getText();
        variety = txtVariety.getText();
        price = Integer.parseInt(txtPrice.getText());
        stock = Integer.parseInt(txtStock.getText());
        photo = txtPhoto.getText();
        fruit = new Fruit(specie, variety, price, stock, photo);
        
        if(FruitsController.create(fruit)){
          clearInputs();
          listFruits();
          JOptionPane.showMessageDialog(null, "Fruta Creada Correctamente", "Crear Fruta", JOptionPane.INFORMATION_MESSAGE);
        }else{
          JOptionPane.showMessageDialog(null, "Error al crear fruta", "Crear Fruta", JOptionPane.ERROR_MESSAGE);
        }
      }else{
        JOptionPane.showMessageDialog(null, "Complete todos los campos ", "Crear Fruta", JOptionPane.WARNING_MESSAGE);
      }
        
    }//GEN-LAST:event_btnCreateActionPerformed

  private void btnListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListActionPerformed
    // TODO add your handling code here:
    listFruits();
  }//GEN-LAST:event_btnListActionPerformed

  private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
    // TODO add your handling code here:
    int id;
    Fruit fruit;
    if(!txtId.getText().equals("")){
      id= Integer.parseInt(txtId.getText());
      fruit = FruitsController.find(id);
      if(fruit != null){
        txtSpecie.setText(fruit.getSpecie());
        txtVariety.setText(fruit.getVariety());
        txtPrice.setText(String.valueOf(fruit.getPrice()));
        txtStock.setText(String.valueOf(fruit.getStock()));
        txtPhoto.setText(fruit.getPhoto());
        ImageIcon icon = new ImageIcon(IMAGES_PATH + "\\fruits\\" + fruit.getPhoto());
        stxPhoto.setIcon(icon);
        JOptionPane.showMessageDialog(null, "Fruta encontrada", "Buscar", JOptionPane.INFORMATION_MESSAGE);
      }else{
        JOptionPane.showMessageDialog(null, "Fruta no encontrada", "Buscar", JOptionPane.INFORMATION_MESSAGE);
      }
    }else{
      JOptionPane.showMessageDialog(null, "Debe Ingresar Rut", "Buscar", JOptionPane.WARNING_MESSAGE);
    }
  }//GEN-LAST:event_btnFindActionPerformed

  private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
    // TODO add your handling code here:
    String specie, variety, photo;
    int price, stock, id;
    Fruit fruit = null;

    if(!txtId.getText().equals("")
      && !txtSpecie.getText().equals("")
      && !txtVariety.getText().equals("")
      && !txtPrice.getText().equals("")
      && !txtStock.getText().equals("")
      && !txtPhoto.getText().equals("")){
      //
      id = Integer.parseInt(txtId.getText());
      specie = txtSpecie.getText();
      variety = txtVariety.getText();
      price = Integer.parseInt(txtPrice.getText());
      stock = Integer.parseInt(txtStock.getText());
      photo = txtPhoto.getText();
      fruit = new Fruit(id, specie, variety, price, stock, photo);

      if(FruitsController.update(fruit)){
        clearInputs();
        listFruits();
        JOptionPane.showMessageDialog(null, "Fruta Editada Correctamente", "Editar Fruta", JOptionPane.INFORMATION_MESSAGE);
      }else{
        JOptionPane.showMessageDialog(null, "Error al Editar fruta", "Editar Fruta", JOptionPane.ERROR_MESSAGE);
      }
    }else{
      JOptionPane.showMessageDialog(null, "Complete todos los campos ", "Editar Fruta", JOptionPane.WARNING_MESSAGE);
    }
    
  }//GEN-LAST:event_btnEditActionPerformed

  private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
    // TODO add your handling code here:
    
    int id;
    if(!txtId.getText().equals("")){
      //
      id = Integer.parseInt(txtId.getText());
      if(FruitsController.delete(id)){
        clearInputs();
        listFruits();
        JOptionPane.showMessageDialog(null, "Fruta Eliminada", "Eliminar Fruta", JOptionPane.INFORMATION_MESSAGE);
      }else{
        JOptionPane.showMessageDialog(null, "Error al Eliminar fruta", "Eliminar Fruta", JOptionPane.ERROR_MESSAGE);
      }
    }else{
      JOptionPane.showMessageDialog(null, "Debe ingresar ID de Fruta", "Eliminar Fruta", JOptionPane.WARNING_MESSAGE);
    }
  }//GEN-LAST:event_btnDeleteActionPerformed

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
      java.util.logging.Logger.getLogger(FruitsMaintainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(FruitsMaintainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(FruitsMaintainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(FruitsMaintainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new FruitsMaintainer().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JTextArea areaList;
  private javax.swing.JButton btnCreate;
  private javax.swing.JButton btnDelete;
  private javax.swing.JButton btnEdit;
  private javax.swing.JButton btnFind;
  private javax.swing.JButton btnList;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel stxPhoto;
  private javax.swing.JTextField txtId;
  private javax.swing.JTextField txtPhoto;
  private javax.swing.JTextField txtPrice;
  private javax.swing.JTextField txtSpecie;
  private javax.swing.JTextField txtStock;
  private javax.swing.JTextField txtVariety;
  // End of variables declaration//GEN-END:variables
}
