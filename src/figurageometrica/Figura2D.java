/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurageometrica;

/**
 * Clase que representa una figura en el plano.
 * @author Alumno
 */
public abstract class Figura2D extends FiguraGeometrica implements Movil{
    //la posicion en el plano.
    private Posicion2D pos;
    /**
     * Crea una figura geometrica en el plano.
     * @param posx La posicion en el eje x de la figura.
     * @param posy La posicion en el eje y de la figura.
     * @throws DimensionIncorrectaException
     */
    public Figura2D(double posx, double posy) throws DimensionIncorrectaException{
        super();
        try{
            pos = new Posicion2D(posx, posy);
        }catch(Exception e){
        
        }
    }
    /**
     * Calcula el perimetro de la figura geometrica recibida.
     * @return aux El perimetro de la figura geometrica.
     */
    public double perimetro(){
        double aux = 0.0;
        return aux;
    }
    protected abstract void calcularExtremos();
    private void verificarSiEstaDentroDelPlano(){
        
    }
}
