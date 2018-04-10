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
    private double base;
    private double altura;
    /**
     * Crea la figura geometrica rectangulo dado el valor de sus
     * lados y las coordenadas de su posicion en el plano.
     * @param lado1 La base del rectangulo.
     * @param lado2 La altura del rectangulo.
     * @param posx La posicion en el eje x del rectangulo.
     * @param posy La posicion en el eje y del rectangulo.
     * @throws DimensionIncorrectaException Si la dimension es incorrecta
     */
    public Rectangulo(double lado1, double lado2,
            double posx, double posy) throws DimensionIncorrectaException{
        super(posx, posy, "Rectangulo");
        this.base = lado1;
        this.altura = lado2;
    }
    /**
     * Calcula la posicion de los extremos del rectangulo.
     */
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
    /**
     * Calcula el perimetro del rectangulo.
     * @return perimetro El perimetro calculado del rectangulo.
     */
    @Override
    protected double perimetro(){
        double perimetro;
        perimetro = (2*getBase())+(2*getAltura());
        return perimetro;
    }
    /**
     * Calcula la superficie del rectangulo.
     * @return superficie La superficie calculada del rectangulo.
     */
    @Override
    protected double superficie(){
        double superficie;
        superficie = getBase()*getAltura();
        return superficie;
    }
     /**
     * @return base El valor de la base del rectangulo.
     */
    public double getBase() {
        return base;
    }

    /**
     * Cambia el valor de la base del rectangulo.
     * @param base El valor de la base a cambiar.
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * @return altura El valor de la altura del rectangulo.
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Cambia el valor de la altura de rectangulo.
     * @param altura El valor de altura a cambiar del rectangulo.
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
}
