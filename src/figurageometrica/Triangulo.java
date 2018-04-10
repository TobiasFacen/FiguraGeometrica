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
     * @throws DimensionIncorrectaException
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
        perimetro = getLado1() + getLado2() + getLado3();
        return perimetro;
    }
    @Override
    protected double superficie(){
        double superficie, semiperimetro, auxiliar;
        semiperimetro = ((getLado1()+getLado2()+getLado3())/2);
        auxiliar =  semiperimetro*(semiperimetro-getLado1())*(semiperimetro-getLado2())*
                (semiperimetro-getLado3());
        superficie = sqrt(auxiliar);
        return superficie;
    }

    /**
     * @return the lado1
     */
    public double getLado1() {
        return lado1;
    }

    /**
     * @param lado1 the lado1 to set
     */
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    /**
     * @return the lado2
     */
    public double getLado2() {
        return lado2;
    }

    /**
     * @param lado2 the lado2 to set
     */
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    /**
     * @return the lado3
     */
    public double getLado3() {
        return lado3;
    }

    /**
     * @param lado3 the lado3 to set
     */
    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
}
