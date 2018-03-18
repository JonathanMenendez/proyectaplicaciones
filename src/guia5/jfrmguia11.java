
package guia5;

import guia5.funciones1;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


public class jfrmguia11 extends javax.swing.JFrame {
    private double base,altura,multiplicacion,diagonal,radio,diametro,circulo,volumen,diagcubo,lado,suma=0,desborde=0;
    int opcioncircunferencia,conteo=3;
    double dato;
       
    public jfrmguia11() {
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

        txtrespuesta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        cmbxfuncion = new javax.swing.JComboBox<>();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        btnaccionar = new javax.swing.JToggleButton();
        txtrelleno1 = new javax.swing.JTextField();
        txtrelleno2 = new javax.swing.JTextField();
        btnoperar = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        panelrespuesta = new javax.swing.JTextPane();
        btnreiniciar = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        fondoguia1 = new javax.swing.JLabel();

        txtrespuesta.setEditable(false);
        txtrespuesta.setBackground(new java.awt.Color(204, 204, 204));
        txtrespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrespuestaActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbxfuncion.setBackground(new java.awt.Color(240, 240, 240));
        cmbxfuncion.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        cmbxfuncion.setForeground(new java.awt.Color(51, 51, 0));
        cmbxfuncion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Area de rectangulo", "Circunferencia", "volumen de esfera", "volumen cubo", "Promedio de datos" }));
        cmbxfuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbxfuncionActionPerformed(evt);
            }
        });
        getContentPane().add(cmbxfuncion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 180, -1));

        txt1.setEditable(false);
        txt1.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 60, -1));

        txt2.setEditable(false);
        txt2.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 60, -1));

        btnaccionar.setText("Accionar");
        btnaccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaccionarActionPerformed(evt);
            }
        });
        getContentPane().add(btnaccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        txtrelleno1.setEditable(false);
        txtrelleno1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtrelleno1KeyPressed(evt);
            }
        });
        getContentPane().add(txtrelleno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 80, -1));

        txtrelleno2.setEditable(false);
        txtrelleno2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrelleno2ActionPerformed(evt);
            }
        });
        txtrelleno2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtrelleno2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtrelleno2KeyReleased(evt);
            }
        });
        getContentPane().add(txtrelleno2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 80, -1));

        btnoperar.setText("operar");
        btnoperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnoperarActionPerformed(evt);
            }
        });
        getContentPane().add(btnoperar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, -1));

        panelrespuesta.setEditable(false);
        panelrespuesta.setBackground(new java.awt.Color(204, 204, 255));
        panelrespuesta.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new javax.swing.ImageIcon(getClass().getResource("/guia5/parafuncion.jpg"))), "RESULTADO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 3, 18))); // NOI18N
        jScrollPane2.setViewportView(panelrespuesta);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 340, 80));

        btnreiniciar.setText("Reiniciar");
        btnreiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreiniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btnreiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, -1, -1));

        jButton1.setText("REGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 20));

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("La información sera tomada en metros.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 300, 20));

        fondoguia1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guia5/paraguia1.jpg"))); // NOI18N
        getContentPane().add(fondoguia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbxfuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbxfuncionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbxfuncionActionPerformed

    private void btnaccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaccionarActionPerformed
        btnreiniciar.doClick();
        if(cmbxfuncion.getSelectedIndex()==0){
        txt1.setText("base:");
        txt2.setText("altura:"); 
        txtrelleno1.setEditable(true);
        txtrelleno2.setEditable(true);
        txtrelleno1.requestFocus();
        }else if(cmbxfuncion.getSelectedIndex()==1){
        do{
      opcioncircunferencia=Integer.parseInt(JOptionPane.showInputDialog("¿que dato tiene?\n1.Radio.\n2.Diametro."));
      if(opcioncircunferencia<1 || opcioncircunferencia>2){
      JOptionPane.showMessageDialog(null, "Debe seleccionar uno de las dos opciones puestas.");}
              }while(opcioncircunferencia<1 || opcioncircunferencia>2);
        if(opcioncircunferencia==1){
        txt1.setText("radio");
        txtrelleno1.setEditable(true);
        txtrelleno1.requestFocus();
        } else if(opcioncircunferencia==2){
        txt1.setText("Diametro");
        txtrelleno1.setEditable(true);
        txtrelleno1.requestFocus();
        }
    }else if(cmbxfuncion.getSelectedIndex()==2){
     do{
      opcioncircunferencia=Integer.parseInt(JOptionPane.showInputDialog("¿que dato tiene?\n1.Radio.\n2.Diametro."));
      if(opcioncircunferencia<1 || opcioncircunferencia>2){
      JOptionPane.showMessageDialog(null, "Debe seleccionar uno de las dos opciones puestas.");}
              }while(opcioncircunferencia<1 || opcioncircunferencia>2);
        if(opcioncircunferencia==1){
        txt1.setText("radio");
        txtrelleno1.setEditable(true);
        txtrelleno1.requestFocus();
        } else if(opcioncircunferencia==2){
        txt1.setText("Diametro");
        txtrelleno1.setEditable(true);
        txtrelleno1.requestFocus();
        }
    }else if(cmbxfuncion.getSelectedIndex()==3){
    txt1.setText("Diagonal:");
    txtrelleno1.setEditable(true);
    txtrelleno1.requestFocus();
    }else if(cmbxfuncion.getSelectedIndex()==4){
    txt1.setText("dato 1");
    txt2.setText("dato 2");
    txtrelleno1.setEditable(true);
    txtrelleno2.setEditable(true);
    btnoperar.setEnabled(false);
    desborde=0;
    conteo=3;
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnaccionarActionPerformed

    private void txtrelleno1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrelleno1KeyPressed
       char c=evt.getKeyChar();
       int car=evt.getKeyCode();
       if(Character.isLetter(c) || (car>=32 && car<=45) || car==47){
       JOptionPane.showMessageDialog(null, "debe ingresar solo numero");
       txtrelleno1.setText(null);
       } 
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
       double base=Double.parseDouble(txtrelleno1.getText());
       if(base<0){
           JOptionPane.showMessageDialog(null, "la base debe ser mayor de cero");
       }else{
       txtrelleno2.requestFocus();
       }
       }
       
       
       
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrelleno1KeyPressed

    private void txtrelleno2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrelleno2KeyPressed
       char c=evt.getKeyChar();
       int car=evt.getKeyCode();
        if(cmbxfuncion.getSelectedIndex()==4){
            btnaccionar.setEnabled(false);
           if(Character.isLetter(c) || (car>=32 && car<=45) || car==47){
       JOptionPane.showMessageDialog(null, "debe ingresar solo numero");
       txtrelleno2.setText(null);
       }
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
       if(txtrelleno2.equals("")){
           JOptionPane.showMessageDialog(null, "debe escribir un dato");
       }else if(desborde<4){
       double dato1=Double.parseDouble(txtrelleno1.getText());
       double dato2=Double.parseDouble(txtrelleno2.getText());
       suma=suma+dato1+dato2;
       txt1.setText("dato "+conteo);
       conteo=conteo+1;
       txt2.setText("dato "+conteo);
       conteo=conteo+1;
       txtrelleno1.setText(null);
       txtrelleno2.setText(null);
       txtrelleno1.requestFocus();
       desborde=desborde+1;
       }else{
       double dato1=Double.parseDouble(txtrelleno1.getText());
       double dato2=Double.parseDouble(txtrelleno2.getText());
       suma=suma+dato1+dato2;
       btnoperar.setEnabled(true);}
       }
       }else{
       if(Character.isLetter(c) || (car>=32 && car<=45) || car==47){
       JOptionPane.showMessageDialog(null, "debe ingresar solo numero");
       txtrelleno2.setText(null);
       }
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
       btnoperar.requestFocus();
       }
       }      // TODO add your handling code here:
    }//GEN-LAST:event_txtrelleno2KeyPressed

    private void btnoperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnoperarActionPerformed
      if((txtrelleno1.getText().length()==0 || txtrelleno2.getText().length()==0) && (cmbxfuncion.getSelectedIndex()==0 || cmbxfuncion.getSelectedIndex()==4)){
      JOptionPane.showMessageDialog(null, "debe ingresar los datos requeridos");
      }else if(txtrelleno1.getText().length()==0 && (cmbxfuncion.getSelectedIndex()==1 || cmbxfuncion.getSelectedIndex()==2 || cmbxfuncion.getSelectedIndex()==3)){
      JOptionPane.showMessageDialog(null, "debe ingresar los datos requeridos");
      }else{if(cmbxfuncion.getSelectedIndex()==0){base=Double.parseDouble(txtrelleno1.getText());
      altura=Double.parseDouble(txtrelleno2.getText());
      funciones1 rectangulo=new funciones1();
      panelrespuesta.setText(rectangulo.Area(base, altura));
      }else if(cmbxfuncion.getSelectedIndex()==1){
      funciones1 circulo=new funciones1();
      radio=Double.parseDouble(txtrelleno1.getText());
      diametro=Double.parseDouble(txtrelleno1.getText());
      panelrespuesta.setText(circulo.circunferencia(opcioncircunferencia, radio, diametro));
      }else if(cmbxfuncion.getSelectedIndex()==2){
      funciones1 esfera=new funciones1();
      radio=Double.parseDouble(txtrelleno1.getText());
      diametro=Double.parseDouble(txtrelleno1.getText());
      panelrespuesta.setText(esfera.esfera(opcioncircunferencia, radio, diametro));
      }else if(cmbxfuncion.getSelectedIndex()==3){
          funciones1 cubo=new funciones1();
          diagonal=Double.parseDouble(txtrelleno1.getText());
          panelrespuesta.setText(cubo.cubo(diagonal));
      }else if(cmbxfuncion.getSelectedIndex()==4){
          funciones1 promedio=new funciones1();
      panelrespuesta.setText(promedio.promedio(suma));
      }
      }
    }//GEN-LAST:event_btnoperarActionPerformed

    private void txtrespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrespuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrespuestaActionPerformed

    private void btnreiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreiniciarActionPerformed
        txt1.setText(null);
        txt2.setText(null);
        txtrelleno1.setText(null);
        txtrelleno2.setText(null);
        panelrespuesta.setText(null);
        txtrelleno1.setEditable(false);
        txtrelleno2.setEditable(false);
        btnaccionar.setEnabled(true);
// TODO add your handling code here:
    }//GEN-LAST:event_btnreiniciarActionPerformed

    private void txtrelleno2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrelleno2ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_txtrelleno2ActionPerformed

    private void txtrelleno2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrelleno2KeyReleased
             // TODO add your handling code here:
    }//GEN-LAST:event_txtrelleno2KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.setEnabled(false);
       frmfuncion fun = new frmfuncion();
       fun.show();
       fun.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(jfrmguia11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfrmguia11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfrmguia11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfrmguia11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfrmguia11().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnaccionar;
    private javax.swing.JToggleButton btnoperar;
    private javax.swing.JToggleButton btnreiniciar;
    private javax.swing.JComboBox<String> cmbxfuncion;
    private javax.swing.JLabel fondoguia1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextPane panelrespuesta;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txtrelleno1;
    private javax.swing.JTextField txtrelleno2;
    private javax.swing.JTextField txtrespuesta;
    // End of variables declaration//GEN-END:variables
}