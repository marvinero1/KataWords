/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabras;
/**
 *
 * @author Marvinero
 */
public class main {
    public static void main(String[] args) {
    String cadena= "holasz";
    String comprobacion = "";
    //comprobacion = cadena.split("")[4];
    System.out.println(comprobacion);
    for(int i=cadena.length()-1;i >= 0;i--){
        String comprobacionfor =  cadena.charAt(i) + comprobacion;
        System.out.println(comprobacionfor);
    }
  }
}