
package planilla_sueldos;
import java.util.Scanner;

/**
 *
 * @author Geovani
 */
public class Planilla_sueldos {

 
    public static void main(String[] args) {
       Scanner leer =new Scanner(System.in);
       String nombre=" ", apellido=" ",puesto=" ";
        float salario=0,sueldoextra=0,sordinario=0,hextra=0,comision=0,tdevengado=0,igss=0;
        float isr=0,dlab=0,anti=0,boni=0,tdescuentos=0,tliquido=0,pdiario=0,otros=0,descuento=0;
        
        
        columnas c[]=new columnas[2];
        
        for(int contador =0;contador<c.length;contador++){
            
            //float diagonal[]=new float [14
            System.out.println("                      ** DATOS PLANILLA **");
            System.out.println("+-----------------");
            System.out.println("+ EMLEADO NO." + contador);
            System.out.println("+-----------------");
            System.out.println("DIGITE NOMBRE ");
            nombre =leer.nextLine();
            System.out.println("DIGITE APELLIDO ");
            apellido =leer.nextLine();
            System.out.println("DIGITE PUESTO ");
            puesto =leer.nextLine();
            System.out.println("DIGITE SUELDO BASE ");
            salario =leer.nextFloat();
            System.out.println("DIGITE SUELDO EXTRAORDINARIO");
            sueldoextra=leer.nextFloat();
            System.out.println("DIGITE BONIFICACION");
            boni=leer.nextFloat();
            System.out.println("DIGITE COMISION");
            comision=leer.nextFloat();
            System.out.println("DIGITE OTROS");
            otros=leer.nextFloat();
            tdevengado=salario+sueldoextra+boni+comision+otros;
            
            
            System.out.println("INGRESE ANTICIPO");
            anti=leer.nextFloat();
            System.out.println("INGRESE DESCUENTOS JUD");
            descuento=leer.nextFloat();
            
            igss=((salario*(float)4.83)/100);
            
            if(salario>=4000){
                isr = ((salario *(float)0.05));
            }else{
                isr=0;
            }
            
            tdescuentos=igss+isr+anti+descuento;
            
            tliquido=tdevengado-tdescuentos;
            
            leer.nextLine();
            
            c[contador]=new columnas(nombre,apellido,puesto,salario,sueldoextra,boni,comision,otros,tdevengado,igss,isr,anti,descuento,tdescuentos,tliquido);
             
        }
           System.out.println("-----------------------------------------------------PLANILLA DE SUELDOS ----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
           System.out.println("+   NOMBRE " + "    APELLIDO " +  "     PUESTO " + "        SUELDO " + "       SUELDO EXTR" + "  BONIFICACION " + "       COMISIONES " + "      OTROS " + "     TOTAL DEVENGADO  " + "   IGSS " + "   ISR " + "   ANTICIPO " + "   DES. JUD " + "   TOTAL DES " + "   TOTAL LIQUIDO +");
           System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------"); 
        for(int contador =0;contador<c.length;contador++){
          // System.out.println("EMLEADO NO." + contador++);
           System.out.println("   "+"|" +c[contador].getNombre()+"|" +"   "+"|" +c[contador].getApellido()+"|"+ "    "+"|" +c[contador].getPuesto()+"|" +"   "+"|" +c[contador].getSalario()+"|" +"       "+"|" +c[contador].getSueldoextra()+"|" +"         "+"|" +c[contador].getBoni()+"|" +"            "+"|" +c[contador].getComision()+"|" +"           "+"|"  +c[contador].getOtros()+"|" +"          "+"|" +c[contador].getTdevengado()+"|" +"    "+"|"  +c[contador].getIgss()+"|" + "  "+ "|"+c[contador].getIsr()+"|" + "  "+ "|"+c[contador].getAnti()+" |" + "  "+ "|" +c[contador].getDescuento()+"  |" + "  "+ "|"+c[contador].getTdescuentos()+ "      |" + "  "+ "|" +c[contador].getTliquido()+ "     |" + "  "+ "|");
          // System.out.println("");
           //System.out.flush();
         //  System.out.close();
           
           
        }
        
        //System.out.println(" \n\n SUMATORIA DE SUELDOS ORDINARIOS = " + salario );
    }
    
}
