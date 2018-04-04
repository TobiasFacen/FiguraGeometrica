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
    private double limMinX = -1000, limMaxX = 1000;
    private double limMinY = -1000, limMaxY = 1000;
    /**
     * Crea una posicion en el plano de una figura con sus coordenadas
     * x e y.
     * @param x La coordenada en el eje x.
     * @param y La coordenada en el eje y.
     * @throws FueraDelPLanoException
     */
    public Posicion2D(double x, double y) throws FueraDelPlanoException{
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

    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * @return the limMinX
     */
    public double getLimMinX() {
        return limMinX;
    }

    /**
     * @return the limMaxX
     */
    public double getLimMaxX() {
        return limMaxX;
    }

    /**
     * @return the limMinY
     */
    public double getLimMinY() {
        return limMinY;
    }

    /**
     * @return the limMaxY
     */
    public double getLimMaxY() {
        return limMaxY;
    }
}