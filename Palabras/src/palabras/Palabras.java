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
public class Palabras {
    
    public String cadena = "";
    public String comprobacion = "";
    
    public Palabras() {
    }    
    
    public String RevertWord(String cadena, String comprobacion){
        this.cadena=cadena;
        this.comprobacion=comprobacion;
        String comprobacionfor="";
            for(int i=cadena.length()-1;i >= 0;i--){
                comprobacionfor =  cadena.charAt(i) + comprobacion;
                System.out.println(comprobacionfor);
            }
        return comprobacionfor;      
    }
    
    public int checkWord(String cadena, String comprobacion){
        RevertWord(cadena, comprobacion);
        int i=0;
        int pos =-1;
        if(cadena.length() <= 5){
        while((pos=cadena.indexOf(comprobacion,pos +5))>-1){
            i++;
        }
      }
        return i;
    }
    
    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public void setComprobacion(String comprobacion) {
        this.comprobacion = comprobacion;
    }

    public String getCadena() {
        return cadena;
    }

    public String getComprobacion() {
        return comprobacion;
    }    
}
