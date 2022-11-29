
package ejemplos;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
/**
 *
 * @author otecorse
 */
public class FormateoNumerico {
    public static void main(String[] args) {
        double cantidad=1234.56789;//Numero sin formatear
        
        //FORMATOS PREESTABLECIDOS:
        //Clase NumberFormat
        NumberFormat nf=NumberFormat.getInstance();//Por defecto
        nf.setMaximumFractionDigits(2);//Máximo dos digitos
        System.out.println(nf.format(cantidad));
        
        nf=NumberFormat.getCurrencyInstance();//Moneda
        System.out.println(nf.format(cantidad));
        
        nf=NumberFormat.getPercentInstance();//Porcentaje
        System.out.println(nf.format(0.56));
        
        //Objetos Locales
        nf=NumberFormat.getInstance(Locale.US);//Por defecto en EEUU
        nf.setMaximumFractionDigits(2);//Máximo dos digitos
        System.out.println(nf.format(cantidad));
        
        nf=NumberFormat.getCurrencyInstance(Locale.US);//Moneda dolar
        System.out.println(nf.format(cantidad));
        
        nf=NumberFormat.getPercentInstance(Locale.US);//Porcentaje
        System.out.println(nf.format(0.56));
        
        //FORMATOS CON PLANTILLAS
        //Clase DecimalFormat
        double cantidad1=12345.6789;
        double cantidad2=-.456;
        double cantidad3=-123;
        
        DecimalFormat df=new DecimalFormat("0,000.00;(0,000.00)");//"Positivos;negativos"
        
        System.out.println(df.format(cantidad1));
        System.out.println(df.format(cantidad2));
        System.out.println(df.format(cantidad3));
        
        df.applyPattern("#,##0.##;#,##0.##");//"# para que no muestre ese digito si no existe"
        
        System.out.println(df.format(cantidad1));
        System.out.println(df.format(cantidad2));
        System.out.println(df.format(cantidad3));
        
        //Formateo con String.format
        System.out.println(String.format("%f", cantidad));
        System.out.println(String.format("|%30f|", cantidad));
        System.out.println(String.format("|%-30f|", cantidad));
        System.out.println(String.format("|%,-30f|", cantidad));
        System.out.println(String.format("|%,(30f|", cantidad));
        
        String cadena="Desarrollo de Aplicaciones";
        System.out.println(String.format("|%30s|", cadena));//Separacion de 30 espacios
        System.out.println(String.format("|%-30s|", cadena));
        System.out.println(String.format("|%.5s|", cadena));//Limita la cadena a 5 caracteres
        
       //Representacion en Octal y Hexadecimal de cantidad1
        System.out.println(String.format("|%o|", (int)cantidad1));//Octal
        System.out.println(String.format("|%h|", cantidad1));//Hexadecimal
        
        //Rellenado con ceros a la izquierda hasta una longitud de 30
        
        
        //Mostar cantidad con 2 decimales
        
    }
}
