/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author ulacit
 */
public class Exceptions {

    public static double divide (int n1, int n2) throws MiException{
        if (n1 == 0){
            throw new NumberFormatException ("0 is not excepted");
        }
        
        if (n1 == 25){
            throw new MiException ("No puede dividir 25");
        }
        
        return n1/n2;
    }
    public static void main(String[] args) {
       try {
           double res = divide (25,0);
           System.out.println("Resultado" + res);
       } catch (MiException ex){
           System.out.println("Excepcion especial!");
           System.out.println(ex.getMessage());
       } catch (NumberFormatException ex){
           System.out.println("Occurio un Error de formato de numero!");
           System.out.println(ex.getMessage());
       } catch (ArithmeticException ex){
           System.out.println("Excepcion arimetica!");
           System.out.println(ex.getMessage());
       }finally{
           System.out.println("Esto siempre se ejecuta!!");
           }
    }
    
}
