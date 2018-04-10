/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurageometrica;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
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
        getFiguras().add(circulo);
        getCirculos().add(circulo);
    }
    /**
     * Agrega la figura geometrica rectangulo a la lista de figuras
     * geometricas y a la lista de rectangulos.
     * @param rectangulo el rectangulo a agregar a las listas.
     */
    public static void addRectangulo(Rectangulo rectangulo){
        getFiguras().add(rectangulo);
        getRectangulos().add(rectangulo);
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
    public static List ordenarPorSuperficie(){
        double superficie;
        List ordenPorSuperficie = new ArrayList<FiguraGeometrica>();
        Map superficies = new HashMap<Double, FiguraGeometrica>();
        Iterator it = getFiguras().iterator();
        while(it.hasNext()){
            Figura2D figura = (Figura2D)it.next();
            superficie = figura.superficie();
            while(superficies.containsKey(superficie)){
                superficie = superficie + figura.getNroOrden();
                superficies.put(superficie, figura);
            }
            superficies.put(superficie, figura);
        }
        Collection auxiliar = superficies.values();
        it = auxiliar.iterator();
        while(it.hasNext()){
            FiguraGeometrica figura = (FiguraGeometrica)it.next();
            ordenPorSuperficie.add(figura);
        }
        return ordenPorSuperficie;
    }
    public static List ordenarPorPerimetro(){
        Map perimetros = new HashMap<Double, FiguraGeometrica>();
        double perimetro;
        List ordenPorPerimetro = new ArrayList<FiguraGeometrica>();
        Iterator it = getFiguras().iterator();
        while(it.hasNext()){
            Figura2D figura = (Figura2D)it.next();
            perimetro = figura.perimetro();
            while(perimetros.containsKey(perimetro)){
                perimetro = perimetro + figura.getNroOrden();
                perimetros.put(perimetro, figura);
            }
            perimetros.put(perimetro, figura);
        }
        Collection auxiliar = perimetros.values();
        it = auxiliar.iterator();
        while(it.hasNext()){
            FiguraGeometrica figura = (FiguraGeometrica)it.next();
            ordenPorPerimetro.add(figura);
        }
        return ordenPorPerimetro;
    }
    public static void listarFiguras(){
        Iterator it = getFiguras().iterator();
        while(it.hasNext()){
            Figura2D figura = (Figura2D)it.next();
            System.out.println("" + figura.getId());
        }
    }
    public static void listarPorPerimetro(){
        List auxiliar = new ArrayList<FiguraGeometrica>();
        auxiliar = ordenarPorPerimetro();
        Iterator it = auxiliar.iterator();
        while(it.hasNext()){
            Figura2D figura = (Figura2D)it.next();
            System.out.println("" + figura.getId());
        }
    }
    public static void listarPorSuperficie(){
        List auxiliar = new ArrayList<FiguraGeometrica>();
        auxiliar = ordenarPorSuperficie();
        Iterator it = auxiliar.iterator();
        while(it.hasNext()){
            Figura2D figura = (Figura2D)it.next();
            System.out.println("" + figura.getId());
        }
    }
    public static List getFiguras(){
        return figuras;
    }

    /**
     * @param aFiguras the figuras to set
     */
    public static void setFiguras(List aFiguras) {
        figuras = aFiguras;
    }

    /**
     * @return the circulos
     */
    public static List getCirculos() {
        return circulos;
    }

    /**
     * @param aCirculos the circulos to set
     */
    public static void setCirculos(List aCirculos) {
        circulos = aCirculos;
    }

    /**
     * @return the rectangulos
     */
    public static List getRectangulos() {
        return rectangulos;
    }

    /**
     * @param aRectangulos the rectangulos to set
     */
    public static void setRectangulos(List aRectangulos) {
        rectangulos = aRectangulos;
    }
}
