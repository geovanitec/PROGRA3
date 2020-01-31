/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio_2_progra_3;
import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author Geovani
 */
public class LABORATORIO_2_PROGRA_3 {

    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer =new Scanner(System.in);
      // String nombre=" ", apellido=" ",puesto=" ";
        float salario=0,sueldoextra=0,sordinario=0,hextra=0,comision=0,tdevengado=0,igss=0,otros1=0,otros2=0;
        float isr=0,dlab=0,anti=0,boni=0,tdescuentos=0,tliquido=0,pdiario=0,otros=0,descuento=0;
        
         int cantidad=1;
        
       cantidad= Integer.parseInt(JOptionPane.showInputDialog(" Digite numero de empleados" ));
         
         String nombre[]=new String[cantidad];
         String puesto[]=new String [cantidad];
        
        float matriz[][] = new float[cantidad][13];
        
        for(int i = 0; i < cantidad;i++){
        nombre[i] = JOptionPane.showInputDialog("DIGITE EL NOMBRE ");
        puesto[i] = JOptionPane.showInputDialog("DIGITE EL PUESTO " );
        
     
            
        System.out.println("                         ------- PLANILLA DE SUELDOS ---------" );
            for (int j=0; j< 13 ;j++){
                
               matriz[i][j] = Float.parseFloat(JOptionPane.showInputDialog("DIGITE EL SUELDO ORDINARIO: "));
               
               if (matriz[i][j]<2800){
                   JOptionPane.showInputDialog(" SALARIO MINIMO ES 2800 ");
                   matriz[i][j]=2800;
               }
               
               salario=salario+matriz[i][j];
         
                    // ingreso salario extraoridinario
             matriz[i][j+1] = Float.parseFloat(JOptionPane.showInputDialog(" DIGITE SUELDO EXTRAORDINARIO " ));
             sueldoextra=sueldoextra+matriz[i][j+1];
              
              
                   // INGRESO DE BONIFICACION
             matriz[i][j+2] = Float.parseFloat(JOptionPane.showInputDialog(" DIGITE BONIFICACION " ));
             boni=boni+matriz[i][j+2];
                    // INGRESO DE COMISIONES
              matriz[i][j+3] = Float.parseFloat(JOptionPane.showInputDialog(" DIGITE COMISIONES " ));
              comision=comision+matriz[i][j+3];
             //INGRESO DE OTROS
            matriz[i][j+4] = Float.parseFloat(JOptionPane.showInputDialog(" DIGITE OTROS "));
            otros1=otros1+matriz[i][j+4];
          
                    
            //calculo total devengado
            matriz[i][j+5]=matriz[i][j] + matriz[i][j+1] + matriz[i][j+2] + matriz[i][j+3] + matriz[i][j+4] + matriz[i][j+4];
             JOptionPane.showConfirmDialog(null," TOTAL DEVENGADO "+ matriz[i][j+5]);
            tdevengado=tdevengado+matriz[i][j+5];
             
             //calculo del igss
             matriz[i][i+6]=(float)(( matriz[i][j+5])*(0.0486));
             igss=igss+matriz[i][j+6];
             
             
             //calculo del isr
             
             if(matriz[i][j] >= 6000 && matriz[i][j]<= 7500){
                            matriz[i][j+7]=(float)((matriz[i][j])*(0.05));
                        }
                        else if(matriz[i][j] >= 7500 && matriz[i][j] <= 9000){
                            matriz[i][j+7]=(float)((matriz[i][j])*(0.06));
                        }
                        else if(matriz[i][j] >= 9000){
                             matriz[i][j+7]=(float)((matriz[i][j])*(0.08));
                    }
                        else{
                            matriz[i][j+7]= 0;
                        }
             
                        isr=isr+matriz[i][j+7];
                       
                        // INGRESO DE ANTICIPOS
                           matriz[i][j+8] = Float.parseFloat(JOptionPane.showInputDialog(" DIGITE ANTICIPOS " ));
                           anti=anti+matriz[i][j+8];
                           
                           //INGRESO DE DESCUENTOS JUDICIALES
                           matriz[i][j+9] = Float.parseFloat(JOptionPane.showInputDialog(" DIGITE DESCUENTOS JUDICIALES" ));
                           descuento=descuento+matriz[i][j+9];
                           
                           // INGRESO DE OTROS DESCUENTOS
                           matriz[i][j+10] = Float.parseFloat(JOptionPane.showInputDialog(" DIGITE OTROS " ));
                           otros2=otros2+matriz[i][j+10];
                           
                           
                           // calculo de total descuentos
                          matriz[i][j+11]= matriz[i][j+6] + matriz[i][j+7] + matriz[i][j+8] + matriz[i][j+9] + matriz[i][j+10];
                          JOptionPane.showConfirmDialog(null," TOTAL DESCUENTOS "+ matriz[i][j+11]);
                          tdescuentos=tdescuentos+matriz[i][j+11];
                          
                          
                          // calculo total liquido
                          matriz[i][j+12]= ((matriz[i][j+5]) - (matriz[i][j+11]));
                          JOptionPane.showConfirmDialog(null," TOTAL LIQUIDO "+ matriz[i][j+12]);
                          
                          tliquido=tliquido+matriz[i][j+12];
                          j = 13;
                }
        }
       
          

        
           for(int i = 0; i < cantidad;i++){
            System.out.println("\n");
            System.out.println("  NOMBRE : " + nombre[i]+"   ");
            System.out.println("  PUESTO : " +puesto[i]+"   ");

           

       //for(int i = 0; i < 13;i++){
            for(int j = 0; j < 13;j++){
                System.out.print("   "+matriz[i][j]);


            }
   }
           System.out.println("\n\n");
           System.out.println("------- SUMATORIAS DE OPERACIONES O CULUMNAS ---------" );
           System.out.println("SALARIO TOTAL               : " + salario);
           System.out.println("SUELDO EXTRAORDINARIO TOTAL : " + sueldoextra);
           System.out.println("TOTAL BONIFICACIONES        : " + boni);
           System.out.println("TOTAL COMISIONES            : " + comision);
           System.out.println("TOTAL OTROS                 : " + otros1);
           System.out.println("TOTAL SALARIO DEVENGADO     : " + tdevengado);
           System.out.println("TOTAL IGSS                  : " + igss);
           System.out.println("TOTAL ISR                   : " + isr);
           System.out.println("TOTAL ANTICIPOS             : " + anti);
           System.out.println("TOTAL DESCUENTOS            : " + descuento);
           System.out.println("TOTAL OTROS DESC.           : " + otros2);
           System.out.println("TOTAL DESC. PERCIBIDOS      : " + tdescuentos);
           System.out.println("TOTAL LIQUIDO               : " + tliquido);
           
           
    }
}
