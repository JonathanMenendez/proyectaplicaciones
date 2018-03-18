
package guia5;

import java.awt.Container;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class frmpuntaje extends javax.swing.JFrame {
    
    int cpu,g,bateria1,garantia,bateria,principal,secundaria;
    double numero1,ram,precio, numero;
    String marca;
    boolean flash1=false;
    private int puntajebp,puntajemarca,puntajeprecio,principal1,secundaria1,puntajepixel,meses;
    private int puntajegarantia,nucleos,puntajecpu,puntajeram,puntos;
    private String marca1;
    private double valor,capacidad;
    boolean flash=false;
    String camara,salida,salida1;
   double pantalla1,pantalla;
    public frmpuntaje(){
        initComponents();
    }
    public int bateriapantalla(double pantalla,int bateria){
      if(this.pantalla<=4) {
          if(this.bateria<=1200){
          puntajebp=0;
          }else if(this.bateria>1200 && this.bateria<2400){
          puntajebp=1;
          }else if(this.bateria>2400 && this.bateria<3100){
          puntajebp=2;
          }else if(this.bateria>3100){
          puntajebp=3;}
      } else if(this.pantalla<=5) {
          if(this.bateria<=1200){
          puntajebp=1;
          }else if(this.bateria>1200 && this.bateria<2400){
          puntajebp=2;
          }else if(this.bateria>2400 && this.bateria<3100){
          puntajebp=3;
          }else if(this.bateria>3100){
          puntajebp=4;
          }}
          else if(this.pantalla<=6) {
          if(this.bateria<=1200){
          puntajebp=3;
          }else if(this.bateria>1200 && this.bateria<2400){
          puntajebp=4;
          }else if(this.bateria>2400 && this.bateria<3100){
          puntajebp=5;
          }else if(this.bateria>3100){
          puntajebp=6;}  
          } return puntajebp;
    }
    
    public int rangoprecio(double valor){
    valor=this.valor;
    if(valor<100){
        puntajeprecio=2;
    }else if(valor>=100 && valor<=350){
    puntajeprecio=3;
    }else if(valor>350){
    puntajeprecio=4;
    } return puntajeprecio;
    }
    
     public int ram(double capacidad){
    capacidad=this.capacidad;
    if(capacidad<=1){
    puntajeram=0;
    }else if(capacidad>1 && capacidad<=2){
    puntajeram=1;
    }else if(capacidad>2 && capacidad<=4){
    puntajeram=4;
    }else if(capacidad>4){
    puntajeram=6;}
    return puntajeram;
    }
    
     public int garantia(int meses){
meses=this.meses;
if(meses<=3){
puntajegarantia=1;
}else if(meses>3 && meses<6){
puntajegarantia=2;
}else if(meses>6){
puntajegarantia=3;}
return puntajegarantia;
}
     
     public int refdemarca(String marca){
    marca=this.marca;
        switch (marca) {
            case "NEXUS":
            case "GOOGLE":
            case "LENOVO":
            case "HUAWEI":
            case "APPLE":
            case "SONY":
                puntajemarca=4;
                break;
            case "SAMSUNG":
            case "ALCATEL":
            case "LG":
                puntajemarca=3;
                break;
            default:
                puntajemarca=2;
                break;
        } return puntajemarca;
    }
     
     public int cpu(int nucleos){
    nucleos=this.nucleos;
        switch (nucleos) {
            case 2:
                puntajecpu=0;
                break;
            case 4:
                puntajecpu=1;
                break;
            case 6:
                puntajecpu=2;
                break;
            case 8:
                puntajecpu=3;
                break;
            default:
                break;
        }
        return puntajecpu;
    }
     
     public int pixelaje(int principal, int secundaria, boolean flash){
    principal=this.principal;
    secundaria=this.secundaria;
    flash=this.flash;
    if(principal<=5){
        if(secundaria<=2){
            puntajepixel=1;
                }else if(secundaria>2){
                puntajepixel=2;
                }
    }else if(principal>5 && principal<=8){
    if(secundaria<2){
    puntajepixel=1;
    }else if(secundaria>1 && secundaria<3){
    puntajepixel=2;
    }else if(secundaria>=3){
    puntajepixel=3;
    } 
    } else if(principal>8){
      if(secundaria<2){
      puntajepixel=1;
      }else if(secundaria>=2 && secundaria<5){
      puntajepixel=2;
      }else if(secundaria>=5){
      puntajepixel=3;
      }
    }
    if(flash==false){
        puntajepixel=puntajepixel-1;
    }return puntajepixel;
    }
     
     public String mostrar(){
    puntos=this.cpu(nucleos)+this.bateriapantalla(pantalla, bateria)+this.garantia(meses)+this.pixelaje(principal, secundaria, flash)+this.ram(capacidad)+this.rangoprecio(valor)+this.refdemarca(marca);
    if (puntos<=7){
    salida1="No es buena inversion con "+puntos+" puntos";
    }else if(puntos>7 && puntos<=14){
         salida1="inversion de riesgo con "+puntos+" puntos";
    }else if(puntos>14 && puntos<=21){
     salida1="inversion viable con "+puntos+" puntos";
    }else if(puntos>22){
     salida1="Buena inversion con "+puntos+" puntos";
    }
    return salida1;
    }
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtbateria = new javax.swing.JTextField();
        txtpantalla = new javax.swing.JTextField();
        txtgarantia = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        txtram = new javax.swing.JTextField();
        cmbxcpu = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cmbxmarca = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        chbprincipal = new javax.swing.JCheckBox();
        chbsecundaria = new javax.swing.JCheckBox();
        chbflash = new javax.swing.JCheckBox();
        txtprincipal1 = new javax.swing.JTextField();
        txtsecundaria = new javax.swing.JTextField();
        btnejecutar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtdescripcion = new javax.swing.JTextArea();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jLabel4.setText("cpu");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("clasificador de puntaje");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 12, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bateria");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pantalla");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Garantia");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("precio:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ram:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        txtbateria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtbateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbateriaActionPerformed(evt);
            }
        });
        txtbateria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtbateriaKeyPressed(evt);
            }
        });
        getContentPane().add(txtbateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 49, 49, -1));

        txtpantalla.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtpantalla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpantallaKeyPressed(evt);
            }
        });
        getContentPane().add(txtpantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 92, 49, -1));

        txtgarantia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtgarantia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgarantiaActionPerformed(evt);
            }
        });
        txtgarantia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtgarantiaKeyPressed(evt);
            }
        });
        getContentPane().add(txtgarantia, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 186, 49, -1));

        txtprecio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtprecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtprecioKeyPressed(evt);
            }
        });
        getContentPane().add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 227, 49, -1));

        txtram.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtram.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtramKeyPressed(evt);
            }
        });
        getContentPane().add(txtram, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 137, 49, -1));

        cmbxcpu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbxcpu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "4", "6", "8" }));
        getContentPane().add(cmbxcpu, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 45, 120, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("CPU:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 48, -1, -1));

        cmbxmarca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbxmarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NEXUS", "GOOGLE", "LENOVO", "HUAWEI", "SONY", "APPLE", "SAMSUNG", "ALCATEL", "LG", "Otra marca" }));
        getContentPane().add(cmbxmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 133, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Marca:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 136, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Camara:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 275, -1, -1));

        chbprincipal.setBackground(new java.awt.Color(102, 0, 102));
        chbprincipal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chbprincipal.setForeground(new java.awt.Color(255, 255, 255));
        chbprincipal.setText("Principal");
        chbprincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbprincipalActionPerformed(evt);
            }
        });
        getContentPane().add(chbprincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 268, -1, -1));

        chbsecundaria.setBackground(new java.awt.Color(102, 0, 102));
        chbsecundaria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chbsecundaria.setForeground(new java.awt.Color(255, 255, 255));
        chbsecundaria.setText("secundaria");
        chbsecundaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbsecundariaActionPerformed(evt);
            }
        });
        getContentPane().add(chbsecundaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 268, -1, -1));

        chbflash.setBackground(new java.awt.Color(102, 0, 102));
        chbflash.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chbflash.setForeground(new java.awt.Color(255, 255, 255));
        chbflash.setText("flash");
        chbflash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbflashActionPerformed(evt);
            }
        });
        getContentPane().add(chbflash, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 268, -1, -1));

        txtprincipal1.setEditable(false);
        txtprincipal1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtprincipal1.setText("0");
        getContentPane().add(txtprincipal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 300, 75, -1));

        txtsecundaria.setEditable(false);
        txtsecundaria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtsecundaria.setText("0");
        txtsecundaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsecundariaActionPerformed(evt);
            }
        });
        getContentPane().add(txtsecundaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 300, 65, -1));

        btnejecutar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnejecutar.setText("Ejecutar");
        btnejecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnejecutarActionPerformed(evt);
            }
        });
        getContentPane().add(btnejecutar, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 336, -1, -1));

        txtdescripcion.setEditable(false);
        txtdescripcion.setColumns(20);
        txtdescripcion.setRows(5);
        txtdescripcion.setText(" \n");
        jScrollPane3.setViewportView(txtdescripcion);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 374, 379, 127));

        jToggleButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jToggleButton1.setText("Reiniciar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 337, -1, -1));

        jToggleButton3.setText("REGRESAR");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 11, -1, -1));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guia5/aplicacion3.jpg"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtbateriaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbateriaKeyPressed
char c= evt.getKeyChar();
int car=evt.getKeyChar();
        if(Character.isLetter(c) || (car>=32 && car<=47)){
            JOptionPane.showMessageDialog(null, "solo introduzca numeros");
            txtbateria.setText(null);
        } 
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        numero=Integer.parseInt(txtbateria.getText());
            if(numero<=0){
            JOptionPane.showMessageDialog(null, "debe ser mayor que cero");
            txtbateria.setText("");
            }else{
            txtpantalla.requestFocus();
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtbateriaKeyPressed

    private void txtpantallaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpantallaKeyPressed
char c= evt.getKeyChar();
int car=evt.getKeyChar();
        if(Character.isLetter(c) || (car>=32 && car<=45) || car==47){
            JOptionPane.showMessageDialog(null, "solo introduzca numeros");
            txtpantalla.setText(null);
        } 
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        numero=Integer.parseInt(txtpantalla.getText());
            if(numero<3.0 || numero>6.7){
            JOptionPane.showMessageDialog(null, "debe estar entre 0 y 6");
            txtpantalla.setText("");
            }else{
            txtram.requestFocus();
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtpantallaKeyPressed

    private void txtramKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtramKeyPressed
       char c= evt.getKeyChar();
       int car=evt.getKeyChar();
        if(Character.isLetter(c) || (car>=32 && car<=45) || car==47){
            JOptionPane.showMessageDialog(null, "solo introduzca numeros");
            txtram.setText(null);
        } 
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        numero1=Double.parseDouble(txtram.getText());
            if(numero1<=0){
            JOptionPane.showMessageDialog(null, "debe ser mayor de 0");
            txtram.setText("");
            }else{
            txtgarantia.requestFocus();
            }
        }       // TODO add your handling code here:
    }//GEN-LAST:event_txtramKeyPressed

    private void txtgarantiaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtgarantiaKeyPressed
char c= evt.getKeyChar();
int car=evt.getKeyChar();
        if(Character.isLetter(c) || (car>=32 && car<=47)){
            JOptionPane.showMessageDialog(null, "solo introduzca numeros");
            txtgarantia.setText(null);
        } 
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        numero=Double.parseDouble(txtgarantia.getText());
            if(numero<0){
            JOptionPane.showMessageDialog(null, "debe estar ser mayor o igual a cero");
            txtgarantia.setText("");
            }else{
            txtprecio.requestFocus();
            }
        }              // TODO add your handling code here:
    }//GEN-LAST:event_txtgarantiaKeyPressed

    private void txtgarantiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgarantiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgarantiaActionPerformed

    private void txtprecioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecioKeyPressed
char c= evt.getKeyChar();
int car=evt.getKeyChar();
        if(Character.isLetter(c) || (car>=32 && car<=45) || car==47){
            JOptionPane.showMessageDialog(null, "solo introduzca numeros");
            txtprecio.setText(null);
        } 
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        numero1=Double.parseDouble(txtprecio.getText());
            if(numero1<=0){
            JOptionPane.showMessageDialog(null, "El precio debe ser mayor de cero");
            txtprecio.setText("");
            }else{
            cmbxcpu.requestFocus();
            }
        }              // TODO add your handling code here:
    }//GEN-LAST:event_txtprecioKeyPressed

    private void chbprincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbprincipalActionPerformed
     if(chbprincipal.isSelected()){
     txtprincipal1.setText(null);
     txtprincipal1.setEditable(true);
     txtprincipal1.requestFocus();
     }
        // TODO add your handling code here:
    }//GEN-LAST:event_chbprincipalActionPerformed

    private void txtsecundariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsecundariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsecundariaActionPerformed

    private void txtbateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbateriaActionPerformed

    private void btnejecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnejecutarActionPerformed
      if(txtpantalla.getText().length()==0 || txtbateria.getText().length()==0 || txtram.getText().length()==0 || txtprecio.getText().length()==0){
      JOptionPane.showMessageDialog(null, "debe llenar todos los campos");}
      else{
      ram=Double.parseDouble(txtram.getText());
      this.ram(ram);
      precio=Double.parseDouble(txtprecio.getText());
      this.rangoprecio(precio);
      pantalla=Double.parseDouble(txtpantalla.getText());
      bateria=Integer.parseInt(txtbateria.getText());
      this.bateriapantalla(pantalla, bateria);
      garantia=Integer.parseInt(txtgarantia.getText());
      this.garantia(garantia);
      marca=String.valueOf(cmbxmarca.getSelectedItem());
      this.refdemarca(marca);
      cpu=Integer.parseInt(String.valueOf(cmbxcpu.getSelectedItem()));
      this.cpu(cpu);
      principal=Integer.parseInt(txtprincipal1.getText());
      secundaria=Integer.parseInt(txtsecundaria.getText());
      flash1=chbflash.isSelected();
      this.pixelaje(principal, secundaria, flash1);
      if(chbprincipal.isSelected() && chbsecundaria.isSelected() && chbflash.isSelected()){
        camara=" principal:"+txtprincipal1.getText()+"mpx        secundaria:"+txtsecundaria.getText()+"mpx\nTiene Flash";
       } else if(chbprincipal.isSelected() && chbflash.isSelected()){
            camara=" principal:"+txtprincipal1.getText()+"mpx       Tiene Flash";}
       else if(chbprincipal.isSelected() && chbsecundaria.isSelected()){
           camara=" principal:"+txtprincipal1.getText()+"        secundaria:"+txtsecundaria.getText();
       } else if(chbprincipal.isSelected()){
           camara=" principal:"+txtprincipal1.getText()+"mpx";
       }else if(chbsecundaria.isSelected()){
       camara=" secundaria:"+txtsecundaria.getText()+"mpx";
       }else{
           camara=" no tiene camara:";}
        salida="El numero de cpu es:"+cmbxcpu.getSelectedItem()+"        El tamaño de pantalla es:"+txtpantalla.getText()+" pulgadas\nLa memoria ram es de:"+txtram.getText()+"Gb        La garantia es de :"+txtgarantia.getText()+" meses\nSu precio es de:$"+txtprecio.getText()+"     Y la marca es:"+cmbxmarca.getSelectedItem()+"\n Posee camara:"+camara+"\n"+this.mostrar();
        txtdescripcion.setText(salida);   
      }
// TODO add your handling code here:
    }//GEN-LAST:event_btnejecutarActionPerformed

    private void chbsecundariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbsecundariaActionPerformed
        if(chbsecundaria.isSelected()){
        txtsecundaria.setText(null);
            txtsecundaria.setEditable(true);
            txtsecundaria.requestFocus();
        }
        else{
            txtsecundaria.setText("0");
        }
        
// TODO add your handling code here:
    }//GEN-LAST:event_chbsecundariaActionPerformed

    private void chbflashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbflashActionPerformed
     // TODO add your handling code here:
    }//GEN-LAST:event_chbflashActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
    txtpantalla.setText(null);
    txtram.setText(null);
    txtprecio.setText(null);
    txtbateria.setText(null);
    txtgarantia.setText(null);
    txtdescripcion.setText(null); 
    

// TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
       frmfuncion funcion = new frmfuncion();
       this.setVisible(false);
       funcion.show();
       funcion.setLocationRelativeTo(null);
    }//GEN-LAST:event_jToggleButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(frmpuntaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmpuntaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmpuntaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmpuntaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new frmpuntaje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnejecutar;
    private javax.swing.JCheckBox chbflash;
    private javax.swing.JCheckBox chbprincipal;
    private javax.swing.JCheckBox chbsecundaria;
    private javax.swing.JComboBox<String> cmbxcpu;
    private javax.swing.JComboBox<String> cmbxmarca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JTextField txtbateria;
    private javax.swing.JTextArea txtdescripcion;
    private javax.swing.JTextField txtgarantia;
    private javax.swing.JTextField txtpantalla;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txtprincipal1;
    private javax.swing.JTextField txtram;
    private javax.swing.JTextField txtsecundaria;
    // End of variables declaration//GEN-END:variables


}
