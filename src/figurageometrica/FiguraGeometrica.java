/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurageometrica;
/**
 * Clase que representa una figura geometrica.
 * @author Alumno
 */
public abstract class FiguraGeometrica {
    /**
     * Crea una figura geometrica.
     * Constructor vacio.
     */
    public FiguraGeometrica(){
    }
    /**
     * Metodo abstracto a implementar por cada una de las figuras geometricas.
     * @return superficie La superficie calculada.
     */
    protected abstract double superficie();
}