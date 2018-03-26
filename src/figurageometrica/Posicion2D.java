/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurageometrica;
/**
 * Clase que representa la posicion en el plano de una figura geometrica.
 * @author Alumno
 */
public class Posicion2D {
    //las coordenadas de la figura en el plano.
    private double x, y;
    /**
     * Crea una posicion en el plano de una figura con sus coordenadas
     * x e y.
     * @param x La coordenada en el eje x.
     * @param y La coordenada en el eje y.
     */
    public Posicion2D(double x, double y){
        this.x = x;
        this.y = y;
    }
    /**
     * Calcula la distancia entre dos figuras geometricas
     * dada su posicion en el plano.
     * @param pos la posicion de las figuras.
     * @return aux - la distancia calculada.
     */
    public double distancia(Posicion2D pos){
        double aux = 0.0;
        return aux;
    }
}