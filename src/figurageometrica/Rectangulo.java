/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurageometrica;

/**
 * Clase que representa la figura geometrica rectangulo.
 * @author Alumno
 */
public abstract class Rectangulo extends Figura2D{
    //los valores de los lados.
    private double lado1, lado2;
    /**
     * Crea la figura geometrica rectangulo dado el valor de sus
     * lados y las coordenadas de su posicion en el plano.
     * @param lado1 La base del rectangulo.
     * @param lado2 La altura del rectangulo.
     * @param posx La posicion en el eje x del rectangulo.
     * @param posy La posicion en el eje y del rectangulo.
     */
    public Rectangulo(double lado1, double lado2,
            double posx, double posy) throws DimensionIncorrectaException{
        super(posx, posy);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    @Override
    protected void calcularExtremos(){
        
    }
}
