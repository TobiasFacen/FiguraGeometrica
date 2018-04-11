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
     * @throws DimensionIncorrectaException Si la dimension es incorrecta.
     */
    public Triangulo(double lado1, double lado2, double lado3,
            double posx, double posy) throws DimensionIncorrectaException{
        super(posx, posy, "Triangulo");
        if(lado1<=0){
            throw new DimensionIncorrectaException();
        }else if(lado2<=0){
            throw new DimensionIncorrectaException();
        }else if(lado3<=0){
            throw new DimensionIncorrectaException();
        }else{
            this.lado1 = lado1;
            this.lado2 = lado2;
            this.lado3 = lado3;
        }
    }
    /**
     * Calcula posicion de los extremos del triangulo.
     * @throws FueraDelPlanoException Si alguno de los extremos de la figura
     * queda fuera del plano.
     */
    @Override
    protected void calcularExtremos() throws FueraDelPlanoException{
        Posicion2D vertice1, vertice2, vertice3;
        double mediana1, mediana2, mediana3, auxiliar;
        auxiliar = (2*((lado2*lado2)+(lado3*lado3))-(lado1*lado1));
        mediana1 = (sqrt(auxiliar))/2;
        auxiliar = (2*((lado1*lado1)+(lado3*lado3))-(lado2*lado2));
        mediana2 = (sqrt(auxiliar))/2;
        auxiliar = (2*((lado1*lado1)+(lado2*lado2))-(lado3*lado3));
        mediana3 = (sqrt(auxiliar))/2;
        try{
            vertice1 = new Posicion2D((((getPos().getX())*2*mediana1)/3),
            (((getPos().getY())*2*mediana1)/3));
        }catch(FueraDelPlanoException e){
            throw new FueraDelPlanoException();
        }
        try{
            vertice2 = new Posicion2D((((getPos().getX())*2*mediana2)/3),
            (((getPos().getY())*2*mediana2)/3));
        }catch(FueraDelPlanoException e){
            throw new FueraDelPlanoException();
        }
        try{
            vertice3 = new Posicion2D((((getPos().getX())*2*mediana3)/3),
            (((getPos().getY())*2*mediana3)/3));
        }catch(FueraDelPlanoException e){
            throw new FueraDelPlanoException();
        }
    }
    /**
     * Calcula el perimetro del triangulo.
     * @return perimetro El perimetro calculado del triangulo.
     */
    @Override
    protected double perimetro(){
        double perimetro;
        perimetro = getLado1() + getLado2() + getLado3();
        return perimetro;
    }
    /**
     * Calcula la superficie del triangulo.
     * @return superficie La superficie calculada del triangulo.
     */
    @Override
    protected double superficie(){
        double superficie, semiperimetro, auxiliar;
        semiperimetro = ((getLado1()+getLado2()+getLado3())/2);
        auxiliar =  semiperimetro*(semiperimetro-getLado1())*
                (semiperimetro-getLado2())*(semiperimetro-getLado3());
        superficie = sqrt(auxiliar);
        return superficie;
    }
    /**
     * @return lado1 El valor del primer lado del triangulo.
     */
    public double getLado1() {
        return lado1;
    }
    /**
     * Cambia el valor del primer lado del triangulo.
     * @param lado1 El valor a cambiar del primer lado del triangulo.
     * @throws DimensionIncorrectaException Si la dimension es incorrecta.
     */
    public void setLado1(double lado1) throws DimensionIncorrectaException{
        if(lado1<=0){
            throw new DimensionIncorrectaException();
        }else{
            this.lado1 = lado1;
        }
    }
    /**
     * @return lado2 El valor del segundo lado del triangulo.
     */
    public double getLado2() {
        return lado2;
    }
    /**
     * Cambia el valor del segundo lado del triangulo.
     * @param lado2 El valor a cambiar del segundo lado del triangulo.
     * @throws DimensionIncorrectaException Si la dimension es incorrecta.
     */
    public void setLado2(double lado2) throws DimensionIncorrectaException{
        if(lado2<=0){
            throw new DimensionIncorrectaException();
        }else{
            this.lado2 = lado2;
        }
    }
    /**
     * @return lado3 El valor del tercer lado del triangulo.
     */
    public double getLado3() {
        return lado3;
    }
    /**
     * Cambia el valor del tercer lado del triangulo.
     * @param lado3 El valor a cambiar del tercer lado del triangulo.
     * @throws DimensionIncorrectaException Si la dimension es incorrecta.
     */
    public void setLado3(double lado3) throws DimensionIncorrectaException{
        if(lado3<=0){
            throw new DimensionIncorrectaException();
        }else{
            this.lado3 = lado3;
        }
    }
}