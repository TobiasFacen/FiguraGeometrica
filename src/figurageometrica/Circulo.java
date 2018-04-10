/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurageometrica;

import static java.lang.Math.PI;

/**
 * Clase que representa la figura geometrica circulo.
 * @author Alumno
 */
public abstract class Circulo extends Figura2D{
    private double radio;
    /**
     * Crea la figura geometrica circulo dado el valor de su radio
     * y las coordenadas de su posicion en el plano.
     * @param radio el radio del circulo.
     * @param posx la posicion en el eje x del circulo.
     * @param posy la posicion en el eje y del circulo.
     * @throws DimensionIncorrectaException Si la dimension es incorrecta.
     */
    public Circulo(double radio, double posx, double posy) 
            throws DimensionIncorrectaException{
        super(posx, posy, "Circulo");
        if(radio<=0){
            throw new DimensionIncorrectaException();
        }else{
            this.radio = radio;
        }
        
    }
    /**
     * Calcula la superficie del circulo.
     * @return superficie La superficie calculada del circulo.
     */
    @Override
    protected double superficie(){
        double superficie;
        superficie = getRadio()*getRadio()*PI;
        return superficie;
    }
    /**
     * Calcula el perimetro del circulo.
     * @return perimetro El perimetro calculado del circulo.
     */
    @Override
    protected double perimetro(){
        double perimetro;
        perimetro = 2*getRadio()*PI;
        return perimetro;
    }
    /**
     * Calcula la posicion de los extremos del circulo.
     */
    @Override
    protected void calcularExtremos(){
        double x, y, xAux, yAux;
        Posicion2D extremoSuperior, extremoInferior, 
                extremoDerecho, extremoIzquierdo, pos;
        pos = getPos();
        x = pos.getX();
        y = pos.getY();
        yAux = y + getRadio();
        try{
            extremoSuperior = new Posicion2D(x, yAux);
            yAux = 0;
        }catch(Exception e){
        
        }
        yAux = y - getRadio();
        try{
            extremoInferior = new Posicion2D(x, yAux);
            yAux = 0;
        }catch(Exception e){
        
        }
        xAux = x + getRadio();
        try{
            extremoDerecho = new Posicion2D(xAux, y);
            xAux = 0;
        }catch(Exception e){
        
        }
        xAux = x - getRadio();
        try{
            extremoIzquierdo = new Posicion2D(xAux, y);
            xAux = 0;
        }catch(Exception e){
        
        }
    }
    /**
     * @return radio El valor del radio del circulo.
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Cambia el valor del radio del circulo.
     * @param radio El valor a cambiar del circulo.
     * @throws DimensionIncorrectaException Si el valor del radio es incorrecto.
     */
    public void setRadio(double radio) throws DimensionIncorrectaException{
       if(radio<=0){
           throw new DimensionIncorrectaException();
       }else{
           this.radio = radio;
       }
    }
}
