/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package areas;
import java.util.Scanner;
/**
*
* @author Sérgio
*/
public class Programa {
/**
* @param args the command line arguments
*/
//A classe Programa.java é a responsável por incializar a aplicação e
//instanciar (criar objetos) as classes filhas e requisitar o método
//para cálculo da área.
public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
//Valores de entrada para o cálculo da área do retângulo
System.out.println("****Cálculo da área do retângulo****");
System.out.print("Digite um valor de Base: ");
double b = leia.nextDouble();
System.out.print("Digite um valor de Altura: ");
double h = leia.nextDouble();
//Criação de um objeto da classe Retângulo
Retangulo retan = new Retangulo(b,h);
System.out.println("Area do Retangulo é: " + retan.calcArea());
//Valores de entrada para o cálculo da área do Triângulo
System.out.println("****Cálculo da área do Triângulo****");
System.out.print("Digite um valor de Base: ");
double bt = leia.nextDouble();
System.out.print("Digite um valor de Altura: ");
double ht = leia.nextDouble();
//Criação de um objeto da classe triâgulo
Triangulo tri = new Triangulo(bt,ht);
//Valores de entrada para o cálculo da área do Círculo
System.out.println("Area do Triângulo é: " + tri.calcArea());
System.out.println("****Cálculo da área do Círculo****");
System.out.print("Digite um valor de Raio: ");
double r = leia.nextDouble();
//Criação de um objeto da classe Círculo
Circulo cir = new Circulo(r);
System.out.println("Area do Triângulo é: " + cir.calcArea());
}
}