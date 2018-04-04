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
    private final double base, altura;
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
        super(posx, posy);
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
        xAux = x + (base/2);
        yAux = y + (altura/2);
        try{
            extremoSuperiorDerecho = new Posicion2D(xAux, yAux);
            xAux = 0;
            yAux = 0;
        }catch(Exception e){
        
        }
        xAux = x + (base/2);
        yAux = y - (altura/2);
        try{
            extremoInferiorDerecho = new Posicion2D(xAux, yAux);
            xAux = 0;
            yAux = 0;
        }catch(Exception e){
        
        }
        xAux = x - (base/2);
        yAux = y - (altura/2);
        try{
            extremoInferiorIzquierdo = new Posicion2D(xAux, yAux);
            xAux = 0;
            yAux = 0;
        }catch(Exception e){
        
        }
        xAux = x - (base/2);
        yAux = y + (altura/2);
        try{
            extremoSuperiorIzquierdo = new Posicion2D(xAux, yAux);
            xAux = 0;
            yAux = 0;
        }catch(Exception e){
        
        }
    }
}
