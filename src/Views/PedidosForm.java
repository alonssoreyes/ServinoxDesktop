/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Models.Cliente;
import Models.ClienteDAO;
import Models.Conexion;
import Models.Empleado;
import Models.Pedidos;
import Models.PedidosDAO;
import Models.Producto;
import Models.ProductoDAO;
import Models.detallePedido;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author alons
 */
public class PedidosForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form PedidosForm
     */
    ClienteDAO cDAO = new ClienteDAO();
    ProductoDAO pDAO = new ProductoDAO();
    PedidosDAO peDAO = new PedidosDAO();
    Producto pro = new Producto();
    Pedidos p = new Pedidos();
    detallePedido dp = new detallePedido();
    int idp;
    int item;
    double totalpagar;
    double pre;
    int cantidad;
    int id;

    DefaultTableModel modelo = new DefaultTableModel();

    public PedidosForm(Empleado e) {
        initComponents();
        Calendar calendar = new GregorianCalendar();
        int mes = (calendar.get(Calendar.MONTH))+1;
        
        txtFecha.setText("" + calendar.get(Calendar.YEAR) + "/" + mes + "/" + calendar.get(Calendar.DAY_OF_MONTH));
        txtVend.setText(e.getNombre() + " " + e.getApellidos());
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
        txtFecha = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCodiCliente = new javax.swing.JTextField();
        txtCodProd = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JSpinner();
        btnCodCliente = new javax.swing.JButton();
        btnCodProd = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtVend = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDetalle = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        txtTotal = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnGenerar = new javax.swing.JButton();
        txtCancelar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Pedidos");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logoazul.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Open Sans", 1, 36)); // NOI18N
        jLabel2.setText("PUNTO DE VENTA SERVINOX");

        jLabel3.setFont(new java.awt.Font("Open Sans", 2, 24)); // NOI18N
        jLabel3.setText("Todo para tu negocio");

        txtFecha.setEditable(false);
        txtFecha.setFont(new java.awt.Font("Open Sans", 0, 22)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jLabel13.setText("Fecha");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(jLabel3))))
                    .addComponent(jLabel13))
                .addContainerGap(194, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setPreferredSize(new java.awt.Dimension(0, 154));

        jLabel4.setFont(new java.awt.Font("Open Sans", 1, 22)); // NOI18N
        jLabel4.setText("Código Cliente:");

        jLabel5.setFont(new java.awt.Font("Open Sans", 1, 22)); // NOI18N
        jLabel5.setText("Código Producto:");

        txtCodiCliente.setFont(new java.awt.Font("Open Sans", 0, 22)); // NOI18N

        txtCodProd.setFont(new java.awt.Font("Open Sans", 0, 22)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Open Sans", 1, 22)); // NOI18N
        jLabel6.setText("Precio:");

        txtPrecio.setEditable(false);
        txtPrecio.setFont(new java.awt.Font("Open Sans", 1, 22)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(0, 51, 102));

        jLabel7.setFont(new java.awt.Font("Open Sans", 1, 22)); // NOI18N
        jLabel7.setText("Cantidad:");

        txtCantidad.setFont(new java.awt.Font("Open Sans", 0, 22)); // NOI18N

        btnCodCliente.setFont(new java.awt.Font("Open Sans", 0, 20)); // NOI18N
        btnCodCliente.setText("Buscar");
        btnCodCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCodClienteActionPerformed(evt);
            }
        });

        btnCodProd.setFont(new java.awt.Font("Open Sans", 0, 20)); // NOI18N
        btnCodProd.setText("Buscar");
        btnCodProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCodProdActionPerformed(evt);
            }
        });

        btnAgregar.setFont(new java.awt.Font("Open Sans", 0, 20)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Open Sans", 1, 22)); // NOI18N
        jLabel8.setText("Cliente:");

        txtCliente.setFont(new java.awt.Font("Open Sans", 0, 22)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Open Sans", 1, 22)); // NOI18N
        jLabel9.setText("Producto:");

        txtProducto.setEditable(false);
        txtProducto.setFont(new java.awt.Font("Open Sans", 1, 22)); // NOI18N
        txtProducto.setForeground(new java.awt.Color(0, 51, 102));

        jLabel10.setFont(new java.awt.Font("Open Sans", 1, 22)); // NOI18N
        jLabel10.setText("Stock:");

        txtStock.setEditable(false);
        txtStock.setFont(new java.awt.Font("Open Sans", 1, 22)); // NOI18N
        txtStock.setForeground(new java.awt.Color(0, 51, 102));

        jLabel11.setFont(new java.awt.Font("Open Sans", 1, 22)); // NOI18N
        jLabel11.setText("Vendedor:");

        txtVend.setEditable(false);
        txtVend.setFont(new java.awt.Font("Open Sans", 0, 22)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCodiCliente)
                    .addComponent(txtCodProd)
                    .addComponent(txtPrecio)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCodCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCodProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCliente)
                    .addComponent(txtProducto)
                    .addComponent(txtStock)
                    .addComponent(txtVend, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCodiCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCodCliente)
                    .addComponent(jLabel8)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCodProd)
                    .addComponent(jLabel9)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar)
                    .addComponent(jLabel10)
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(txtVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaDetalle.setFont(new java.awt.Font("Open Sans", 0, 20)); // NOI18N
        tablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Código Producto", "Producto", "Cantidad", "Precio", "Total"
            }
        ));
        tablaDetalle.setRowHeight(24);
        jScrollPane1.setViewportView(tablaDetalle);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
        );

        txtTotal.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        jLabel12.setText("Total a pagar");

        btnGenerar.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        btnGenerar.setText("Generar Venta");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        txtCancelar.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        txtCancelar.setText("Cancelar");
        txtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(339, Short.MAX_VALUE)
                .addComponent(txtCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGenerar)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(btnGenerar)
                        .addComponent(txtCancelar))
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCodClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCodClienteActionPerformed
        if (!txtCodiCliente.getText().equals("")) {
            buscarCliente();
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese el numero de cliente a buscar");
        }
    }//GEN-LAST:event_btnCodClienteActionPerformed

    private void btnCodProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCodProdActionPerformed
        if (!txtCodProd.getText().equals("")) {
            buscarProducto();
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese el codigo de producto a buscar");
        }
    }//GEN-LAST:event_btnCodProdActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (!txtCodiCliente.getText().equals("")
                && !txtCodProd.getText().equals("")
                && !txtPrecio.getText().equals("")
                && !txtStock.getText().equals("")) {
            agregar();
        } else {
            JOptionPane.showMessageDialog(this, "Rellene todos los campos");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        if (guardarPedido()) {
            guardarDetalle();
            limpiarTabla();
            id = Integer.parseInt(peDAO.idPedido());
            imprimirReporte(id);
            limpiarTabla();
        }else{
            JOptionPane.showMessageDialog(null, "Algo salio mal, verifique los datos");
        }

    }//GEN-LAST:event_btnGenerarActionPerformed

    private void txtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCancelarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_txtCancelarActionPerformed
    boolean guardarPedido() {
        int idc = 0;
        boolean result = false;
        if (!txtCodiCliente.getText().equals("") && !txtTotal.getText().equals("")) {
            idc = Integer.parseInt(txtCodiCliente.getText());
            double total = Double.parseDouble(txtTotal.getText());
            p.setId_cliente(idc);
            p.setMonto(total);
            peDAO.GuardarPedido(p);
            result = true;
        } else {
            JOptionPane.showMessageDialog(null, "Realice la venta");
        }
        return result;
    }

    void limpiarCampos() {
        txtCodiCliente.setText("");
        txtCodProd.setText("");
        txtPrecio.setText("");
        txtCantidad.setValue(0);
        txtCliente.setText("");
        txtProducto.setText("");
        txtStock.setText("");
        txtVend.setText("");
        txtTotal.setText("");
    }

    void guardarDetalle() {
        String idp = peDAO.idPedido();
        int idpe = Integer.parseInt(idp);

        for (int i = 0; i < tablaDetalle.getRowCount(); i++) {
            int idprod = Integer.parseInt(tablaDetalle.getValueAt(i, 1).toString());
            cantidad = Integer.parseInt(tablaDetalle.getValueAt(i, 3).toString());
            float total = Float.parseFloat(tablaDetalle.getValueAt(i, 5).toString());

            dp.setId_pedido(Integer.parseInt(idp));
            dp.setId_producto(idprod);
            dp.setCantidad_producto(cantidad);
            dp.setSubtotal(total);

            peDAO.guardarDetallePedido(dp);
        }
    }

    void limpiarTabla() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }

    void imprimirReporte(int id) {
        Conexion con = new Conexion();

        try {
            Connection conexion = con.getConnection();
            JasperReport reporte = null;
            String ruta = "src\\Reportes\\Reporte.jasper";
            reporte = (JasperReport) JRLoader.loadObjectFromFile(ruta);
            Map param = new HashMap();
            param.put("id_pedido", id);
            JasperPrint imprimirReporte = JasperFillManager.fillReport(reporte, param, conexion);
            JasperViewer vista = new JasperViewer(imprimirReporte, false);
            vista.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            vista.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void agregar() {
        double total;
        modelo = (DefaultTableModel) tablaDetalle.getModel();
        item = item + 1;
        idp = pro.getId_producto();
        String nompr = txtProducto.getText();
        pre = Double.parseDouble(txtPrecio.getText());
        cantidad = Integer.parseInt(txtCantidad.getValue().toString());
        int stock = Integer.parseInt(txtStock.getText());
        total = cantidad * pre;
        ArrayList lista = new ArrayList();

        if (stock > 0) {
            if (cantidad > 0) {
                lista.add(item);
                lista.add(idp);
                lista.add(nompr);
                lista.add(cantidad);
                lista.add(pre);
                lista.add(total);
                Object[] ob = new Object[6];
                ob[0] = lista.get(0);
                ob[1] = lista.get(1);
                ob[2] = lista.get(2);
                ob[3] = lista.get(3);
                ob[4] = lista.get(4);
                ob[5] = lista.get(5);

                modelo.addRow(ob);

                tablaDetalle.setModel(modelo);
                calcularTotal();
            } else {
                JOptionPane.showMessageDialog(this, "Ingrese la cantidad que desea del producto");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Producto Agotado");
        }
    }

    void calcularTotal() {
        totalpagar = 0;

        for (int i = 0; i < tablaDetalle.getRowCount(); i++) {
            cantidad = Integer.parseInt(tablaDetalle.getValueAt(i, 3).toString());
            pre = Double.parseDouble(tablaDetalle.getValueAt(i, 4).toString());
            totalpagar += cantidad * pre;
        }
        txtTotal.setText(totalpagar + "");
    }

    void buscarProducto() {
        int r;
        int id = Integer.parseInt(txtCodProd.getText());
        if (txtCodProd.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingresa el codigo de un producto");
        } else {
            pro = pDAO.listarID(id);
            if (pro.getId_producto() != 0) {
                txtProducto.setText(pro.getNombre_Producto());
                txtPrecio.setText(String.valueOf(pro.getPrecio()));
                txtStock.setText(String.valueOf(pro.getStock()));
                txtCodProd.requestFocus();
            } else {
                JOptionPane.showMessageDialog(this, "Producto no encontrado");
            }
        }
    }

    void buscarCliente() {
        int r;
        int cod = Integer.parseInt(txtCodiCliente.getText());
        if (txtCodiCliente.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingresa el codigo de un cliente");
        } else {
            Cliente cliente = cDAO.listarID(cod);
            if (cliente.getId() != 0) {
                txtCliente.setText(cliente.getNombre() + " " + cliente.getApellidos());
                txtCodProd.requestFocus();
            } else {
                r = JOptionPane.showConfirmDialog(this, "Cliente no registrado,desea registrarlo?");
                this.txtCodiCliente.setText("");
                if (r == 0) {
                    ClienteForm cf = new ClienteForm();
                    Principal.ventanaPrincipal.add(cf);
                    cf.setVisible(true);
                }
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCodCliente;
    private javax.swing.JButton btnCodProd;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDetalle;
    private javax.swing.JButton txtCancelar;
    private javax.swing.JSpinner txtCantidad;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCodProd;
    private javax.swing.JTextField txtCodiCliente;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtVend;
    // End of variables declaration//GEN-END:variables
}