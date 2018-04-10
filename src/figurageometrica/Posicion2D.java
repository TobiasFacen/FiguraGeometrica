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
    private double x, y;
    private double limMinX = -1000, limMaxX = 1000;
    private double limMinY = -1000, limMaxY = 1000;
    /**
     * Crea una posicion en el plano de una figura con sus coordenadas
     * x e y.
     * @param x La coordenada en el eje x.
     * @param y La coordenada en el eje y.
     * @throws figurageometrica.FueraDelPlanoException Si la figura geometrica 
     * queda fuera del plano.
     */
    public Posicion2D(double x, double y) throws FueraDelPlanoException{
        this.x = x;
        this.y = y;
    }
    /**
     * Calcula la distancia entre dos figuras geometricas
     * dada su posicion en el plano.
     * @param pos La posicion de la figura.
     * @return aux La distancia calculada.
     */
    public double distancia(Posicion2D pos){
        double aux = 0.0;
        return aux;
    }

    /**
     * @return x La coordenada en el eje x de la posicion de la figura.
     */
    public double getX() {
        return x;
    }

    /**
     * Cambia el valor de la coordenada en el eje x de la posicion de la figura.
     * @param x El valor de coordenada a cambiar.
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @return y La coordenada en el eje y de la posicion de la figura.
     */
    public double getY() {
        return y;
    }

    /**
     * Cambia el valor de la coordenada en el eje x de la posicion de la figura.
     * @param y El valor de coordenada a cambiar.
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * @return limMinX El valor de coordenada negativo maximo en el eje x.
     */
    public double getLimMinX() {
        return limMinX;
    }

    /**
     * @return limMaxX El valor de coordenada positivao maximo en el eje x.
     */
    public double getLimMaxX() {
        return limMaxX;
    }

    /**
     * @return limMinY El valor de coordenada negativo maximo en el eje y.
     */
    public double getLimMinY() {
        return limMinY;
    }

    /**
     * @return limMaxY El valor de coordenada positivo maximo en el eje y.
     */
    public double getLimMaxY() {
        return limMaxY;
    }
    /**
     * Cambia el valor de coordenada negativo maximo en el eje x.
     * @param limMinX El valor de coordenada a cambiar.
     */
    public void setLimMinX(double limMinX) {
        this.limMinX = limMinX;
    }

    /**
     * Cambia el valor de coordenada positivo maximo en el eje x.
     * @param limMaxX El valor de coordenada a cambiar.
     */
    public void setLimMaxX(double limMaxX) {
        this.limMaxX = limMaxX;
    }

    /**
     * Cambia el valor de coordenada negativo maximo en el eje y.
     * @param limMinY El valor de coordenada a cambiar.
     */
    public void setLimMinY(double limMinY) {
        this.limMinY = limMinY;
    }

    /**
     * Cambia el valor de coordenada positivo maximo en el eje y.
     * @param limMaxY El valor de coordenada a cambiar.
     */
    public void setLimMaxY(double limMaxY) {
        this.limMaxY = limMaxY;
    }
}