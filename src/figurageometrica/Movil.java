/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurageometrica;

/**
 * Interfaz implementada por cada una de las figuras geometricas para
 * desplazarse a travez del plano.
 * @author Alumno
 */
public interface Movil {
    public void moverArriba(double distancia);
    public void moverAbajo(double distancia);
    public void moverDerecha(double distancia);
    public void moverIzquierda(double distancia);
    public void mover(double distanciaX, double distanciaY);
    public void mover(Posicion2D pos);
}