/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurageometrica;

/**
 * Clase que representa la figura geometrica circulo.
 * @author Alumno
 */
public abstract class Circulo extends Figura2D{
    //el valor del radio.
    private double radio;
    /**
     * Crea la figura geometrica circulo dado el valor de su radio
     * y las coordenadas de su posicion en el plano.
     * @param radio el radio del circulo.
     * @param posx la posicion en el eje x del circulo.
     * @param posy la posicion en el eje y del circulo.
     */
    public Circulo(double radio, double posx, double posy) throws DimensionIncorrectaException{
        super(posx, posy);
        this.radio = radio;
    }
    @Override
    protected void calcularExtremos(){
    
    }
}
