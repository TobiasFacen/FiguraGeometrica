/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurageometrica;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Alumno
 */
public class Plano {
    //las listas de figuras geometricas.
    private static List figuras = new ArrayList<FiguraGeometrica>();
    private static List circulos = new ArrayList<Circulo>();
    private static List rectangulos = new ArrayList<Rectangulo>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    /**
     * Agrega la figura geometrica circulo a la lista de figuras
     * geometricas y a la lista de circulos.
     * @param circulo el circulo a agregar a las listas.
     **/
    public static void addCirculo(Circulo circulo){
        figuras.add(circulo);
        circulos.add(circulo);
    }
    /**
     * Agrega la figura geometrica rectangulo a la lista de figuras
     * geometricas y a la lista de rectangulos.
     * @param rectangulo el rectangulo a agregar a las listas.
     */
    public static void addRectangulo(Rectangulo rectangulo){
        figuras.add(rectangulo);
        rectangulos.add(rectangulo);
    }
    /**
     * Compara la posicion del circulo recibido con las figuras en las
     * listas para ver si se superponen entre ellas.
     * @param circulo el circulo a comparar.
     * @return true si la figura se solapa con alguna otra. 
     */
    public static boolean solapamiento(Circulo circulo){
        return true;
    }
    /**
     * Compara la posicion del rectangulo recibido con las figuras en las
     * listas para ver si se superponen entre ellas.
     * @param rectangulo el rectangulo a comparar.
     * @return true si la figura se solapa con alguna otra. 
     */
    public static boolean solapamiento(Rectangulo rectangulo){
        return true;
    }
    public static void ordenarPorSuperficie(){
        double superficie;
        Map superficies = new HashMap<Double, FiguraGeometrica>();
        for(FiguraGeometrica f : figuras){
            superficie = f.superficie();
            if(superficies.containsKey(superficie)){
            
            }else{
                superficies.put(superficie, f);
            }
        }
    }
    public static void ordenarPorPerimetro(List lista){
        Map perimetros = new HashMap<Double, FiguraGeometrica>();
    }
    public static void listarFiguras(){
    
    }
    public static void listarPorPerimetro(){
    
    }
    public static void listarPorSuperficie(){
    
    }
}
