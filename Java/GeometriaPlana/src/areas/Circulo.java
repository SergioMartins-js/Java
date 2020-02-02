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
public class Circulo extends Geometria{
public Circulo(double r){
super(r);
}
public Circulo(){
super();
}
//Polimorfismo do método de mesmo nome da classe Geometria
@Override
public double calcArea(){
return Math.PI * Math.pow(super.getRaio(), 2);
}
}
