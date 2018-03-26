/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurageometrica;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alumno
 */
public class Plano {
    private List figuras = new ArrayList<FiguraGeometrica>();
    private List circulos = new ArrayList<Circulo>();
    private List rectangulos = new ArrayList<Rectangulo>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static void addCirculo(){
        
    }
    public static void addRectangulo(){
    
    }
    public static boolean solapamiento(Circulo circulo){
        return true;
    }
    public static boolean solapamiento(Rectangulo rectangulo){
        return true;
    }
}
