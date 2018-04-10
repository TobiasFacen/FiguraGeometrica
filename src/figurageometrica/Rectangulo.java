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

    /**
     * @return the base
     */
    public double getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
    //los valores de los lados.
    private double base;
    //los valores de los lados.
    private double altura;
    /**
     * Crea la figura geometrica rectangulo dado el valor de sus
     * lados y las coordenadas de su posicion en el plano.
     * @param lado1 La base del rectangulo.
     * @param lado2 La altura del rectangulo.
     * @param posx La posicion en el eje x del rectangulo.
     * @param posy La posicion en el eje y del rectangulo.
     * @throws DimensionIncorrectaException
     */
    public Rectangulo(double lado1, double lado2,
            double posx, double posy) throws DimensionIncorrectaException{
        super(posx, posy, "Rectangulo");
        this.base = lado1;
        this.altura = lado2;
    }
    @Override
    protected void calcularExtremos(){
        double x, y, xAux, yAux;
        Posicion2D pos, extremoSuperiorDerecho, extremoSuperiorIzquierdo,
                extremoInferiorDerecho, extremoInferiorIzquierdo;
        pos = getPos();
        x = pos.getX();
        y = pos.getY();
        xAux = x + (getBase()/2);
        yAux = y + (getAltura()/2);
        try{
            extremoSuperiorDerecho = new Posicion2D(xAux, yAux);
            xAux = 0;
            yAux = 0;
        }catch(Exception e){
        
        }
        xAux = x + (getBase()/2);
        yAux = y - (getAltura()/2);
        try{
            extremoInferiorDerecho = new Posicion2D(xAux, yAux);
            xAux = 0;
            yAux = 0;
        }catch(Exception e){
        
        }
        xAux = x - (getBase()/2);
        yAux = y - (getAltura()/2);
        try{
            extremoInferiorIzquierdo = new Posicion2D(xAux, yAux);
            xAux = 0;
            yAux = 0;
        }catch(Exception e){
        
        }
        xAux = x - (getBase()/2);
        yAux = y + (getAltura()/2);
        try{
            extremoSuperiorIzquierdo = new Posicion2D(xAux, yAux);
            xAux = 0;
            yAux = 0;
        }catch(Exception e){
        
        }
    }
    @Override
    protected double perimetro(){
        double perimetro;
        perimetro = (2*getBase())+(2*getAltura());
        return perimetro;
    }
    @Override
    protected double superficie(){
        double superficie;
        superficie = getBase()*getAltura();
        return superficie;
    }
}
