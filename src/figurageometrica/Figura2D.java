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
     * @param nombreClase El nombre de la figura geometrica.
     * @throws DimensionIncorrectaException Si la dimension es incorrecta.
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
     * Metodo abstracto implementado por cada una de las Figuras Geometricas
     * para calcular su perimetro.
     */
    protected abstract double perimetro();
    /**
     * Metodo abstracto implementado por cada una de las figuras geometricas
     * para calcular su superficie.
     */
    protected abstract void calcularExtremos();
    /**
     * Verifica si la figura geometrica esta contenida en el plano.
     * @throws FueraDelPlanoException Si la figura no esta 
     * contenida en el plano.
     */
    private void verificarSiEstaDentroDelPlano() 
            throws FueraDelPlanoException{
        calcularExtremos();
    }
    /**
     * Traslada a la figura geometrica hacia arriba a travez del plano partiendo
     * de su posicion original. Si al moverse queda fuera del plano vuelve a su
     * posicion original.
     * @param distancia La cantidad de pixeles que se va a mover la figura.
     */
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
    /**
     * Traslada a la figura geometrica hacia abajo a travez del plano partiendo
     * de su posicion original. Si al moverse queda fuera del plano vuelve a su
     * posicion original.
     * @param distancia La cantidad de pixeles que se va a mover la figura.
     */
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
    /**
     * Traslada la figura geometrica hacia la derecha a travez del plano
     * partiendo de su posicion original. Si al moverse queda fuera del plano
     * vuelve a su posicion original.
     * @param distancia La cantidad de pixeles que se va a mover la figura.
     */
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
    /**
     * Traslada la figura geometrica hacia la izquierda a travez del plano
     * partiendo de su posicion original. Si al moverse queda fuera del plano
     * vuelve a su posicion original.
     * @param distancia La cantidad de pixeles que se va a mover la figura.
     */
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
    /**
     * Traslada la figura geometrica una cierta cantidad de pixeles en el eje x
     * y otra cierta cantidad de pixeles en el eje y. Si al hacerlo quedase 
     * fuera del plano vuelve a su posicion original.
     * @param distanciaX La cantidad de pixeles que se va a mover la figura en 
     * el eje x.
     * @param distanciaY La cantidad de pixeles que se va a mover la figura en
     * el eje y.
     */
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
    /**
     * Traslada la figura geometrica a una nueva posicion en el plano. Si al 
     * hacerlo quedase fuera del plano vuelve a su posicion original.
     * @param pos La posicion donde se trasladara la figura.
     */
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
     * @return pos La posicion en que se encuentra la figura en el plano.
     */
    public Posicion2D getPos() {
        return pos;
    }

    /**
     * Cambia la posicion de la figura en el plano por una nueva.
     * @param pos La posicion a la que se cambiara la figura.
     */
    public void setPos(Posicion2D pos) {
        this.pos = pos;
    }
    /**
     * @return nroOrden El numero que representa el orden de la figura. 
     */
    public int getNroOrden(){
        return nroOrden;
    }

    /**
     * @return id El id de la figura.
     */
    public String getId() {
        return id;
    }

    /**
     * Cambia el numero de orden de la figura.
     * @param nroOrden El nuevo numero de orden para la figura.
     */
    public void setNroOrden(int nroOrden) {
        this.nroOrden = nroOrden;
    }

    /**
     * Cambia el id de la figura.
     * @param id El nuevo id para la figura.
     */
    public void setId(String id) {
        this.id = id;
    }
    
}