/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areas;

/**
 *
 * @author Sérgio
 */
public abstract class Geometria {
protected double base;
protected double altura;
protected double raio;
protected Geometria(){
System.out.println("Criou um objeto da classe sem passar valores!!!");
}
protected Geometria(double b, double h){
this.base = b;
this.altura = h;
}
protected Geometria(double r){
this.raio = r;
}
public double getBase(){
return this.base;
}
public double getAltura(){
return this.altura;
}
public double getRaio(){
return this.raio;
}
public double calcArea(){
return 0;
}
}
