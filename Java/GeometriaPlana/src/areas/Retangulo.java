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
public class Retangulo extends Geometria{
public Retangulo(double b, double h){
super(b,h);
}
public Retangulo(){
super();
}
//Polimorfismo do método de mesmo nome da classe Geometria
@Override
public double calcArea(){
return super.getBase()* super.getAltura();
}
}