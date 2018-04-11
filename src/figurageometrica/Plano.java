/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurageometrica;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
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
    /**
     * Ordena las figuras geometricas de la lista de figuras segun el valor de 
     * su superfice.
     * @return ordenPorSuperficie La lista con las figuras ordenadas.
     */
    public static List ordenarPorSuperficie(){
        String nombre;
        List ordenPorSuperficie = new ArrayList<FiguraGeometrica>();
        Map superficies = new TreeMap<String, FiguraGeometrica>();
        Iterator it = getFiguras().iterator();
        while(it.hasNext()){
            Figura2D figura = (Figura2D)it.next();
            nombre = "" + figura.superficie() + " " + figura.getId();
            superficies.put(nombre, figura);
        }
        Collection auxiliar = superficies.values();
        it = auxiliar.iterator();
        while(it.hasNext()){
            FiguraGeometrica figura = (FiguraGeometrica)it.next();
            ordenPorSuperficie.add(figura);
        }
        return ordenPorSuperficie;
    }
    /**
     * Ordena las figuras geometricas de la lista de figuras segun el valor
     * de su perimetro.
     * @return ordenPorPerimetro La lista con las figuras ordenadas.
     */
    public static List ordenarPorPerimetro(){
        Map perimetros = new TreeMap<String, FiguraGeometrica>();
        String nombre;
        List ordenPorPerimetro = new ArrayList<FiguraGeometrica>();
        Iterator it = getFiguras().iterator();
        while(it.hasNext()){
            Figura2D figura = (Figura2D)it.next();
            nombre = "" + figura.perimetro() + " " + figura.getId();
            perimetros.put(nombre, figura);
        }
        Collection auxiliar = perimetros.values();
        it = auxiliar.iterator();
        while(it.hasNext()){
            FiguraGeometrica figura = (FiguraGeometrica)it.next();
            ordenPorPerimetro.add(figura);
        }
        return ordenPorPerimetro;
    }
    /**
     * Muestra por pantalla la lista de figuras sin orden alguno.
     */
    public static void listarFiguras(){
        Iterator it = getFiguras().iterator();
        while(it.hasNext()){
            Figura2D figura = (Figura2D)it.next();
            System.out.println("" + figura.getId());
        }
    }
    /**
     * Muestra por pantalla la lista de figuras ordenadas por el valor de 
     * su perimetro.
     */
    public static void listarPorPerimetro(){
        List auxiliar = new ArrayList<FiguraGeometrica>();
        auxiliar = ordenarPorPerimetro();
        Iterator it = auxiliar.iterator();
        while(it.hasNext()){
            Figura2D figura = (Figura2D)it.next();
            System.out.println("" + figura.getId());
        }
    }
    /**
     * Muestra por pantalla la lista de figuras ordenadas por el valor de
     * su superficie.
     */
    public static void listarPorSuperficie(){
        List auxiliar = new ArrayList<FiguraGeometrica>();
        auxiliar = ordenarPorSuperficie();
        Iterator it = auxiliar.iterator();
        while(it.hasNext()){
            Figura2D figura = (Figura2D)it.next();
            System.out.println("" + figura.getId());
        }
    }
    /**
     * Devuelve la lista de figuras.
     * @return figuras la lista de figuras.
     */
    public static List getFiguras(){
        return figuras;
    }
    /**
     * Cambia la lista de figuras ya creada por la lista recibida.
     * @param aFiguras La lista nueva de figuras a cambiar por la otra.
     */
    public static void setFiguras(List aFiguras) {
        figuras = aFiguras;
    }
    /**
     * Devuelve la lista de las figuras geometricas <code>Circulo</code>.
     * @return circulos La lista de circulos.
     */
    public static List getCirculos() {
        return circulos;
    }
    /**
     * Cambia la lista de circulos ya creada por la lista recibida.
     * @param aCirculos La lista nueva de figuras a cambiar por la otra.
     */
    public static void setCirculos(List aCirculos) {
        circulos = aCirculos;
    }
    /**
     * Devuelve la lista de las figuras geometricas <code>Rectangulo</code>.
     * @return rectangulos La lista de rectangulos.
     */
    public static List getRectangulos() {
        return rectangulos;
    }
    /**
     * Cambia la lista de circulos ya creada por la lista recibida.
     * @param aRectangulos La lista nueva de rectangulos.
     */
    public static void setRectangulos(List aRectangulos) {
        rectangulos = aRectangulos;
    }
}