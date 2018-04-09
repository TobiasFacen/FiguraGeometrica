/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurageometrica;

import static java.lang.Math.sqrt;

/**
 * Clase que representa la figura geometrica triangulo
 * @author Alumno
 */
public abstract class Triangulo extends Figura2D{
    //los valores de los lados.
    private double lado1, lado2, lado3;
    /**
     * Crea la figura geometrica triangulo dado los valores
     * de sus 3 lados y las coordenadas de su posicion en el plano.
     * @param lado1 El valor del primer lado del triangulo.
     * @param lado2 El valor del segundo lado del triangulo.
     * @param lado3 El valor del tercer lado del triangulo.
     * @param posx La posicion en el eje x del triangulo.
     * @param posy La posicion en el eje y del triangulo.
     */
    public Triangulo(double lado1, double lado2, double lado3,
            double posx, double posy) throws DimensionIncorrectaException{
        super(posx, posy, "Triangulo");
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    @Override
    protected void calcularExtremos(){
    
    }
    @Override
    protected double perimetro(){
        double perimetro;
        perimetro = lado1 + lado2 + lado3;
        return perimetro;
    }
    @Override
    protected double superficie(){
        double superficie, semiperimetro, auxiliar;
        semiperimetro = ((lado1+lado2+lado3)/2);
        auxiliar =  semiperimetro*(semiperimetro-lado1)*(semiperimetro-lado2)*
                (semiperimetro-lado3);
        superficie = sqrt(auxiliar);
        return superficie;
    }
}
