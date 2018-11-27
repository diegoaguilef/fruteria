/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruteria.ui.app.views;

import fruteria.ui.app.controller.SalesController;
import fruteria.ui.app.helper.Date;
import fruteria.ui.app.model.Sale;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kdieg
 */
public class SalesReport extends javax.swing.JFrame {

  /**
   * Creates new form SalesReport
   */
  
  public SalesReport() {
    initComponents();
    setLocationRelativeTo(this);
    tableSales.getModel().addTableModelListener(new TableModelListener(){
      @Override
      public void tableChanged(TableModelEvent e) {
        // Type 0: UPDATE
        if(e.getType() == 0){
          int ticket = Integer.parseInt(tableSales.getValueAt(e.getFirstRow(), 0).toString());
          Date date = new Date(tableSales.getValueAt(e.getFirstRow(), 3).toString());
          int quantity = Integer.parseInt(tableSales.getValueAt(e.getFirstRow(), 4).toString());
          int totalPrice = Integer.parseInt(tableSales.getValueAt(e.getFirstRow(), 5).toString());
          Sale sale = SalesController.find(ticket);
          sale.setDate(date);
          sale.setQuantity(quantity);
          sale.setTotalPrice(totalPrice);
          if(SalesController.update(sale)){
            JOptionPane.showMessageDialog(null, "Valor Editado");
            fillSalesTable();
          }else{
            JOptionPane.showMessageDialog(null, "Error al Editar o Valores no válidos");
            fillSalesTable();
          }
          
        }
        //JOptionPane.showMessageDialog(null, "asdasdasdasd");
      }
      
    });
  }
  
  public boolean dateValidation(String fecha){
    boolean valid = false;
    if((fecha != null && fecha.split("/").length == 3) ||
      (fecha != null && fecha.split("-").length == 3)){
      valid = true;
    }
    return valid;
  }
  
  public String[] parseDate(String fecha){
    String[] f = {};
    if(fecha.split("/").length == 3){
      f = fecha.split("/");
    }else{
      f = fecha.split("-");
    }
    return f;
  }

  public void fillSalesTable(){
    DefaultTableModel model = (DefaultTableModel)tableSales.getModel();
    model.setNumRows(0);
    for(Sale sale: SalesController.getSales()){
      model.addRow(new Object[]{
        sale.getTicket(), 
        sale.getFruit().getName(), 
        sale.getClient().getName(), 
        sale.getDate(),
        sale.getQuantity(),
        sale.getTotalPrice()
      });
    }
  }
  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    contextMenu = new javax.swing.JPopupMenu();
    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    btnSalesList = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    tableSales = new javax.swing.JTable();
    btnCloseReport = new javax.swing.JButton();
    txtFindTicket = new javax.swing.JTextField();
    jButton1 = new javax.swing.JButton();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    txtFindDate = new javax.swing.JTextField();
    btnFindDate = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel1.setText("Reporte de ventas");

    btnSalesList.setText("Listar Ventas");
    btnSalesList.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSalesListActionPerformed(evt);
      }
    });

    tableSales.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "N° boleta", "Producto", "Cliente", "Fecha Venta", "Cantidad", "Precio Total Venta"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
      };
      boolean[] canEdit = new boolean [] {
        false, false, false, true, true, true
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    tableSales.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tableSalesMouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(tableSales);

    btnCloseReport.setText("CERRAR");
    btnCloseReport.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCloseReportActionPerformed(evt);
      }
    });

    txtFindTicket.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtFindTicketActionPerformed(evt);
      }
    });

    jButton1.setText("Buscar Venta");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    jLabel2.setText("Boleta: ");

    jLabel3.setText("Buscar Por Fecha:");

    btnFindDate.setText("Buscar");
    btnFindDate.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnFindDateActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane1))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(275, 275, 275)
            .addComponent(jLabel1)
            .addGap(0, 0, Short.MAX_VALUE)))
        .addContainerGap())
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addComponent(btnCloseReport)
        .addGap(18, 18, 18))
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(btnSalesList)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
        .addComponent(jLabel3)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(txtFindDate, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnFindDate)
        .addGap(14, 14, 14)
        .addComponent(jLabel2)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(txtFindTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jButton1)
        .addGap(35, 35, 35))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnSalesList)
          .addComponent(txtFindTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jButton1)
          .addComponent(jLabel2)
          .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabel3)
            .addComponent(txtFindDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnFindDate)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
        .addComponent(btnCloseReport)
        .addContainerGap())
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnCloseReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseReportActionPerformed
    // TODO add your handling code here:
    setVisible(false);
  }//GEN-LAST:event_btnCloseReportActionPerformed

  private void btnSalesListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalesListActionPerformed
    // TODO add your handling code here:
    fillSalesTable(); 
  }//GEN-LAST:event_btnSalesListActionPerformed

  private void tableSalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSalesMouseClicked
    // TODO add your handling code here:
    int rowIndex = tableSales.rowAtPoint(evt.getPoint());
    int colIndex = tableSales.columnAtPoint(evt.getPoint());
    DefaultTableModel model = (DefaultTableModel)tableSales.getModel();
    // Left click
    if(evt.getButton() == 3){
      JMenuItem delete = new JMenuItem("Eliminar");
      contextMenu.removeAll();
      delete.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          int saleId = Integer.parseInt(tableSales.getValueAt(rowIndex, 0).toString());
          SalesController.delete(saleId);
          fillSalesTable();
        }
      });
      contextMenu.add(delete);
      contextMenu.show(tableSales, evt.getX(), evt.getY());
    }
   
  }//GEN-LAST:event_tableSalesMouseClicked

  private void txtFindTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFindTicketActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtFindTicketActionPerformed

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    // TODO add your handling code here:
    Sale sale;
    int ticket;
    if(!txtFindTicket.getText().equals("")){
      ticket = Integer.parseInt(txtFindTicket.getText());
      sale = SalesController.find(ticket);
      if(sale != null){
        DefaultTableModel model = (DefaultTableModel)tableSales.getModel();
        model.setNumRows(0);
        model.addRow(new Object[]{
          sale.getTicket(),
          sale.getFruit().getName(),
          sale.getClient().getName(),
          sale.getDate(),
          sale.getQuantity(),
          sale.getTotalPrice()
        });
      }else{
        JOptionPane.showMessageDialog(null, "Boleta no encontrada");
      }
    }else{
      JOptionPane.showMessageDialog(null, "Debe ingresar Boleta para consultar");
    }
  }//GEN-LAST:event_jButton1ActionPerformed

  private void btnFindDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindDateActionPerformed
    // TODO add your handling code here:
    Date date;
    int day, month, year;
    ArrayList<Sale> sales;
    if(!txtFindDate.getText().equals("")
      && dateValidation(txtFindDate.getText())){
      day = Integer.parseInt(parseDate(txtFindDate.getText())[0]);
      month = Integer.parseInt(parseDate(txtFindDate.getText())[1]);
      year = Integer.parseInt(parseDate(txtFindDate.getText())[2]);
      date = new Date(day, month, year);
      sales = SalesController.findByDate(date);
      if(!sales.isEmpty()){
        DefaultTableModel model = (DefaultTableModel)tableSales.getModel();
        model.setNumRows(0);
        for(Sale sale: sales){
          model.addRow(new Object[]{
            sale.getTicket(), 
            sale.getFruit().getName(), 
            sale.getClient().getName(), 
            sale.getDate(),
            sale.getQuantity(),
            sale.getTotalPrice()
          });
        }
      }else{
        JOptionPane.showMessageDialog(null, "No se han encontrado Resultados");
      }
    }else{
      JOptionPane.showMessageDialog(null, "Fecha Vacía o no válida");
    }
  }//GEN-LAST:event_btnFindDateActionPerformed

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
      java.util.logging.Logger.getLogger(SalesReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(SalesReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(SalesReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(SalesReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new SalesReport().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnCloseReport;
  private javax.swing.JButton btnFindDate;
  private javax.swing.JButton btnSalesList;
  private javax.swing.JPopupMenu contextMenu;
  private javax.swing.JButton jButton1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable tableSales;
  private javax.swing.JTextField txtFindDate;
  private javax.swing.JTextField txtFindTicket;
  // End of variables declaration//GEN-END:variables
}
