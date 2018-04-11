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
        if(lado1<=0||lado2<=0){
            throw new DimensionIncorrectaException();
        }else{
            base = lado1;
            altura = lado2;
        }
    }
    /**
     * Calcula la posicion de los extremos del rectangulo.
     * @throws FueraDelPlanoException Si alguno de los extremos esta fuera del
     * plano.
     */
    @Override
    protected void calcularExtremos()throws FueraDelPlanoException{
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
        }catch(FueraDelPlanoException e){
            throw new FueraDelPlanoException();
        }
        xAux = x + (getBase()/2);
        yAux = y - (getAltura()/2);
        try{
            extremoInferiorDerecho = new Posicion2D(xAux, yAux);
            xAux = 0;
            yAux = 0;
        }catch(FueraDelPlanoException e){
            throw new FueraDelPlanoException();
        }
        xAux = x - (getBase()/2);
        yAux = y - (getAltura()/2);
        try{
            extremoInferiorIzquierdo = new Posicion2D(xAux, yAux);
            xAux = 0;
            yAux = 0;
        }catch(FueraDelPlanoException e){
            throw new FueraDelPlanoException();
        }
        xAux = x - (getBase()/2);
        yAux = y + (getAltura()/2);
        try{
            extremoSuperiorIzquierdo = new Posicion2D(xAux, yAux);
            xAux = 0;
            yAux = 0;
        }catch(FueraDelPlanoException e){
            throw new FueraDelPlanoException();
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
     * @throws DimensionIncorrectaException Si la dimension es incorrecta.
     */
    public void setBase(double base) throws DimensionIncorrectaException{
        if(base<=0){
            throw new DimensionIncorrectaException();
        }else{
            this.base = base;
        }
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
     * @throws DimensionIncorrectaException Si la dimension es incorrecta.
     */
    public void setAltura(double altura) throws DimensionIncorrectaException{
        if(altura<=0){
            throw new DimensionIncorrectaException();
        }else{
            this.altura = altura;
        }
    }
}