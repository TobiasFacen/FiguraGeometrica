/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurageometrica;

import static java.lang.Math.PI;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Clase que representa una figura en el plano.
 * @author Alumno
 */
public abstract class Figura2D extends FiguraGeometrica implements Movil{
    //la posicion en el plano.
    private Posicion2D pos;
    private int nroOrden = 0;
    private String id;
    /**
     * Crea una figura geometrica en el plano.
     * @param posx La posicion en el eje x de la figura.
     * @param posy La posicion en el eje y de la figura.
     * @throws DimensionIncorrectaException
     */
    public Figura2D(double posx, double posy, String nombreClase) 
            throws DimensionIncorrectaException{
        super();
        try{
            nroOrden = getNroOrden() + 1;
            id = "" + nombreClase + " " + nroOrden;
            pos = new Posicion2D(posx, posy);
        }catch(Exception e){
        
        }
    }
    /**
     * Calcula el perimetro de la figura geometrica recibida.
     * @param radio
     * @return aux El perimetro de la figura geometrica.
     */
    protected abstract double perimetro();
    protected abstract void calcularExtremos();
    private void verificarSiEstaDentroDelPlano() 
            throws FueraDelPlanoException{
        calcularExtremos();
    }
    @Override
    public void moverArriba(double distancia){
        double y, yAux;
        yAux = getPos().getY();
        y = yAux + distancia;
        Posicion2D posicionAuxiliar, posicionOriginal;
        posicionOriginal = getPos();
        try {
            posicionAuxiliar = new Posicion2D(posicionOriginal.getX(), y);
            setPos(posicionAuxiliar);
            verificarSiEstaDentroDelPlano();
        } catch (FueraDelPlanoException e) {
            setPos(posicionOriginal);
        }
    }
    @Override
    public void moverAbajo(double distancia){
        Posicion2D posAux, posOrig = getPos();
        try {
            posAux = new Posicion2D(posOrig.getX(), posOrig.getY()-distancia);
            setPos(posAux);
            verificarSiEstaDentroDelPlano();
            
        } catch (FueraDelPlanoException ex) {
            setPos(posOrig);
        }
    }
    @Override
    public void moverDerecha(double distancia){
        Posicion2D posAux, posOrig = getPos();
        try{
            posAux = new Posicion2D(posOrig.getX()+distancia, posOrig.getY());
            setPos(posAux);
            verificarSiEstaDentroDelPlano();
        }catch(FueraDelPlanoException e){
            setPos(posOrig);
        }
    }
    @Override
    public void moverIzquierda(double distancia){
        Posicion2D posAux, posOrig = getPos();
        try{
            posAux = new Posicion2D(posOrig.getX()-distancia, posOrig.getY());
            setPos(posAux);
            verificarSiEstaDentroDelPlano();
        }catch(FueraDelPlanoException e){
            setPos(posOrig);
        }
    }
    @Override
    public void mover(double distanciaX, double distanciaY){
        Posicion2D posOrig = getPos(), posAux;
        try{
            posAux = new Posicion2D(distanciaX, distanciaY);
            setPos(posAux);
            verificarSiEstaDentroDelPlano();
        }catch(FueraDelPlanoException e){
            setPos(posOrig);
        }
    }
    @Override
    public void mover(Posicion2D pos){
        Posicion2D posOrig = getPos();
        try{
            setPos(pos);
            verificarSiEstaDentroDelPlano();
        }catch(FueraDelPlanoException e){
            setPos(posOrig);
        }
    }

    /**
     * @return the pos
     */
    public Posicion2D getPos() {
        return pos;
    }

    /**
     * @param pos the pos to set
     */
    public void setPos(Posicion2D pos) {
        this.pos = pos;
    }
    public int getNroOrden(){
        return nroOrden;
    }
}