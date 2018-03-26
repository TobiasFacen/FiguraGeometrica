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
    private static List figuras = new ArrayList<FiguraGeometrica>();
    private static List circulos = new ArrayList<Circulo>();
    private static List rectangulos = new ArrayList<Rectangulo>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static void addCirculo(Circulo circulo){
        figuras.add(circulo);
        circulos.add(circulo);
    }
    public static void addRectangulo(Rectangulo rectangulo){
        figuras.add(rectangulo);
        rectangulos.add(rectangulo);
    }
    public static boolean solapamiento(Circulo circulo){
        return true;
    }
    public static boolean solapamiento(Rectangulo rectangulo){
        return true;
    }
}
