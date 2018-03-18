package guia5;

import javax.swing.JOptionPane;
   
public class funciones1 {
    private double base,altura,multiplicacion,diagonal,radio,diametro,circulo,volumen,diagcubo,lado;
    int opcion;
    double dato;
    public funciones1(){
    }
    
    public String Area(double base,double altura){
    multiplicacion=base*altura;
    diagonal=Math.sqrt((base*base)+(altura*altura));
    String salida="";
    salida=salida+"el area es de:"+multiplicacion+" metros cuadrados.\nLa diagonal es:"+diagonal+" metros";
    return salida;
    }
    
    public String circunferencia(int opcion, double radio, double diametro){
      if(opcion==1){ 
          circulo=3.1414*(radio*2);
      }else if(opcion==2){
          circulo=3.1414*diametro;
      } String salida="La circunferencia del ciculo es de:"+circulo+" metros";
      return salida;
    }
    
    public String esfera(int opcion, double radio, double diametro){
   if(opcion==1){
    volumen=(4*3.14*radio*radio*radio)/3;
    }else if(opcion==2){
          radio=diametro/2;
          volumen=(4*3.14*radio*radio*radio)/3;
      }String salida="El volumen de la esfera es: "+volumen+" metros cubicos.";
   return salida;
    }
    
    public String cubo(double diagcubo){
    lado=(diagcubo)/Math.sqrt(3);
    multiplicacion=lado*lado*lado;
    String salida="el volumen es de :"+multiplicacion+" metros cubicos";
    return salida;
    }

 public String promedio(double suma){
double promedio=suma/10;
String salida="el promedio es: "+promedio;
return salida;
}
}