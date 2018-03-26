/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurageometrica;

/**
 * Clase que representa la figura geometrica triangulo
 * @author Alumno
 */
public class Triangulo extends Figura2D{
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
            double posx, double posy){
        super(posx, posy);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
}
