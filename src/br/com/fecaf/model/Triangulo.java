package br.com.fecaf.model;

import java.util.Scanner;

public class Triangulo {

    public double base, lado2, lado3, area, perimetro, altura, hipotenusa, catetoMenor, catetoMaior;

    Scanner scanner = new Scanner(System.in);

    public boolean cadastrarTriangulo() {
        System.out.println("/***********************************/");
        System.out.println("/*        Cadastro Triângulo       */");
        System.out.println("/***********************************/");
        System.out.print("/* Informe o Base: ");
        base = scanner.nextDouble();
        System.out.print("/* Informe o lado 2: ");
        lado2 = scanner.nextDouble();
        System.out.print("/* Informe o lado 3: ");
        lado3 = scanner.nextDouble();
        System.out.print("/* Informe a Altura: ");
        altura = scanner.nextDouble();
        System.out.println("/* Triângulo Cadastrado com Sucesso !");
        System.out.println("/***********************************/");

        return true;
    }

    public void calcularArea() {
        System.out.println("/***********************************/");
        System.out.println("/*         Calculando Area         */");
        System.out.println("/***********************************/");

        area = (base * altura) / 2;
        System.out.println("A área é: " + area);
        System.out.println("/***********************************/");
    }

    public void calcularPerimetro() {
        System.out.println("/***********************************/");
        System.out.println("/*       Calculando Perimetro      */");
        System.out.println("/***********************************/");

        perimetro = base + lado2 + lado3;
        System.out.println("O perimetro é: " + perimetro);
        System.out.println("/***********************************/");
    }

    // Define Isosceles / Escaleno / Equilatero
    public void definirTipo() {
        System.out.println("/***********************************/");
        System.out.println("/*         Definindo Tipo          */");
        System.out.println("/***********************************/");

        if (base == lado2 && base == lado3) {
            System.out.println("Este Triângulo é Equilátero!");

        } else if (base != lado2 && base != lado3 && lado2 != lado3) {
            System.out.println("Este Triângulo é Escaleno!");

        } else if (base == lado2 || lado2 == lado3 || base == lado3) {
            System.out.println("Este Triângulo é Isosceles!");
        }
        System.out.print("/***********************************/");

    }
    // define quem é hipotenusa, cateto menor e cateto maior
    public void catetosHipotenusa(double b, double l2, double l3) { // Keep parameters for calculation

        //Inicializando as variaveis
        hipotenusa = 0;
        catetoMaior = 0;
        catetoMenor = 0;

        // verifica se B é hipotenusa enquanto l2 e l3 são catetos.
        if (b > l2 && b > l3) {

            hipotenusa = b;

            if (l2 > l3) {

                catetoMenor = l3;
                catetoMaior = l2;

            } else {

                catetoMenor = l2;
                catetoMaior = l3;

            }

            // verifica se l2 é hipotenusa enquanto b e l3 são catetos.
        } else if (l2 > b && l2 > l3) {

            hipotenusa = l2;

            if (b > l3) {

                catetoMenor = l3;
                catetoMaior = b;

            } else {

                catetoMenor = b;
                catetoMaior = l3;

            }

            // verifica se l3 é hipotenusa enquanto b e l2 são catetos.
        } else if (l3 > b && l3 > l2) {

            hipotenusa = l3;

            if (b > l2) {

                catetoMenor = l2;
                catetoMaior = b;

            } else {

                catetoMenor = b;
                catetoMaior = l2;
            }

        } else{
            catetoMenor = b;
            catetoMaior = l2;
        }


    }

    //verifica qual tipo de triângulo é
    public void verificarTrianguloRetangulo() {
        System.out.println("/***********************************/");
        System.out.println("/*  Verificando Triângulo Retangulo  */");
        System.out.println("/***********************************/");
        // chama a função para definir os catetos e a hipotenusa
        catetosHipotenusa(base, lado2, lado3);


    // calculo ao quadrado que define se é um triangulo retangulo
        if (hipotenusa * hipotenusa == catetoMenor * catetoMenor + catetoMenor * catetoMaior) {
            System.out.println("Isso é um Triângulo retangulo");
        }
    // caso não valide como verdadeiro imprime a seguinte mensagem
        else {
            System.out.println("Não é um Triângulo Retangulo");
        }

    }


    //define se o triângulo é 3,4,5
    public void verificarTresQuatroCinco() {
        System.out.println("/***********************************/");
        System.out.println("/*  Verificando Triângulo 3, 4, 5  */");
        System.out.println("/***********************************/");

        // chama a função para definir os catetos e a hipotenusa
        catetosHipotenusa(base, lado2, lado3);
        // verifica se os catetos e a hipotenusa restam 0 para validar o padrão 3,4,5
        if (catetoMenor % 3 == 0 && catetoMaior % 4 == 0 && hipotenusa %5 == 0){
            System.out.println("Este triângulo é do tipo 3, 4, 5");
        //caso não seja valido como verdadeiro imprime a seguinte mensagem
        } else{
            System.out.println("Este triângulo não é do tipo 3, 4, 5");
        }

    }


}
