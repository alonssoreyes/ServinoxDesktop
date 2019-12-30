/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Models.Cliente;
import Models.Pedidos;
import Models.PedidosDAO;
import Models.detallePedido;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alons
 */
public class MostrarPedidosForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form MostrarPedidosForm
     */
    Pedidos p = new Pedidos();
    PedidosDAO pDAO = new PedidosDAO();
    detallePedido detped = new detallePedido();
    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel modelo2 = new DefaultTableModel();

    public MostrarPedidosForm() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCodPed = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPed = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaDetPed = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btnMostrarPedidos = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setClosable(true);
        setMaximumSize(new java.awt.Dimension(2147483647, 500));
        setMinimumSize(new java.awt.Dimension(38, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logoazul.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Open Sans", 1, 36)); // NOI18N
        jLabel2.setText("Pedidos realizados");

        jLabel3.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        jLabel3.setText("Código Pedido:");

        txtCodPed.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N

        btnBuscar.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tablaPed.setFont(new java.awt.Font("Open Sans", 0, 20)); // NOI18N
        tablaPed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código_Pedido", "Código Cliente", "Telefono", "Fecha", "Modificado", "Estado Actual", "Monto"
            }
        ));
        tablaPed.setRowHeight(25);
        jScrollPane1.setViewportView(tablaPed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        jLabel4.setText("Pedido:");

        tablaDetPed.setFont(new java.awt.Font("Open Sans", 0, 20)); // NOI18N
        tablaDetPed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código pedido", "Código Producto", "Cantidad Producto", "Subtotal"
            }
        ));
        tablaDetPed.setRowHeight(24);
        tablaDetPed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaDetPedMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaDetPed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        jLabel5.setText("Detalle Pedido:");

        btnMostrarPedidos.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        btnMostrarPedidos.setText("Mostrar Pedidos");
        btnMostrarPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarPedidosActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        jLabel6.setText("Estado");

        txtEstado.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N

        btnActualizar.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(30, 30, 30)
                                .addComponent(txtCodPed, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscar)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnMostrarPedidos)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 29, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCodPed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscar)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnMostrarPedidos)
                    .addComponent(jLabel6)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar))
                .addGap(7, 7, 7)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        limpiarTabla();
        limpiarSegundaTabla();
        getPedido();
        listarDetalle();
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnMostrarPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarPedidosActionPerformed
        limpiarTabla();
        listar();
        

    }//GEN-LAST:event_btnMostrarPedidosActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        
        actualizar();
        limpiarTabla();
        getPedido();
        this.txtEstado.setText("");
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void tablaDetPedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaDetPedMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaDetPedMouseClicked
    void actualizar(){
        pDAO.actualizarPedido(txtEstado.getText(), Integer.parseInt(txtCodPed.getText()));
        
    }
    void listar() {
        List<Pedidos> lista = pDAO.listart();
        modelo = (DefaultTableModel) tablaPed.getModel();
        Object[] ob = new Object[7];

        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getId_pedido();
            ob[1] = lista.get(i).getId_cliente();
            ob[2] = lista.get(i).getTelefono();
            ob[3] = lista.get(i).getHecho();
            ob[4] = lista.get(i).getActualizado();
            ob[5] = lista.get(i).getEstado_Actual();
            ob[6] = lista.get(i).getMonto();

            modelo.addRow(ob);
        }
        tablaPed.setModel(modelo);

    }

    void getPedido() {
        int id = Integer.parseInt(txtCodPed.getText());
        System.out.println(id);
        List<Pedidos> lista = pDAO.getPedido(id);
        modelo = (DefaultTableModel) tablaPed.getModel();
        Object[] ob = new Object[7];

        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getId_pedido();
            ob[1] = lista.get(i).getId_cliente();
            ob[2] = lista.get(i).getTelefono();
            ob[3] = lista.get(i).getHecho();
            ob[4] = lista.get(i).getActualizado();
            ob[5] = lista.get(i).getEstado_Actual();
            ob[6] = lista.get(i).getMonto();

            modelo.addRow(ob);
        }
        tablaPed.setModel(modelo);
        

    }

    void listarDetalle() {
        int id = Integer.parseInt(txtCodPed.getText());
        List<detallePedido> lista = pDAO.listarDetalle(id);
        System.out.println(lista.size());
        modelo2 = (DefaultTableModel) tablaDetPed.getModel();
        Object[] ob = new Object[4];
        System.out.println(lista.size());
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getId_pedido();
            ob[1] = lista.get(i).getId_producto();
            ob[2] = lista.get(i).getCantidad_producto();
            ob[3] = lista.get(i).getSubtotal();

            modelo2.addRow(ob);
        }
        tablaDetPed.setModel(modelo2);
    }

    void limpiarTabla() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }
    void limpiarSegundaTabla(){
        for (int i = 0; i < modelo2.getRowCount(); i++) {
            modelo2.removeRow(i);
            i -= 1;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnMostrarPedidos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaDetPed;
    private javax.swing.JTable tablaPed;
    private javax.swing.JTextField txtCodPed;
    private javax.swing.JTextField txtEstado;
    // End of variables declaration//GEN-END:variables
}
