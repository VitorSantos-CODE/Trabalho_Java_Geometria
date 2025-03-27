package br.com.fecaf.controller;

import br.com.fecaf.model.Circulo;

import java.util.Scanner;

public class Menu {

    // Instancia Teclado
    Scanner scanner = new Scanner(System.in);

    public void executarMenu () {


        boolean exit = false;

        while (!exit) {
            System.out.println("/*******************/");
            System.out.println("/*    Geometria    */");
            System.out.println("/*******************/");
            System.out.println("/* 1 - Circulo     */");
            System.out.println("/* 2 - Retângulo   */");
            System.out.println("/* 3 - Triângulo   */");
            System.out.println("/* 4 - Sair        */");
            System.out.println("/*******************/");

            System.out.print("Informe a opção desejada: ");
            int optionUser = scanner.nextInt();

            switch (optionUser) {
                case 1:

                    boolean exitCirculo = false;

                    Circulo circulo = new Circulo();

                    boolean validaCadastro = false;

                    while (!exitCirculo) {

                        System.out.println("/**************************/");
                        System.out.println("/****     Circulo      ****/");
                        System.out.println("/**************************/");
                        System.out.println("/* 1 - Cadastrar Circulo  */");
                        System.out.println("/* 2 - Calcular Area      */");
                        System.out.println("/* 3 - Calcular Perimetro */");
                        System.out.println("/* 4 - Sair               */");
                        System.out.println("/**************************/");
                        System.out.print("Informe a opção desejada: ");

                        int optionCirculo = scanner.nextInt();


                        switch (optionCirculo) {
                            case 1:
                               validaCadastro = circulo.cadastrarCirculo();
                                break;
                            case 2:
                                if (validaCadastro) {
                                    circulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um Circulo");
                                }
                                break;
                            case 3:
                                if (validaCadastro) {
                                    circulo.calcularPerimetro();
                                } else {
                                    System.out.println("Cadastre um Circulo");
                                }
                                break;
                            case 4:
                                System.out.println("Saindo do Circulo ...");
                                exitCirculo = true;
                                break;
                            default:
                                System.out.println("Escolha uma Opção Válida !");
                        }

                    }
                    break;
                case 2:
                    System.out.println("Escolheu 2");
                    break;
                case 3:
                    System.out.println("Escolheu 3");
                    break;
                case 4:
                    System.out.println("Escolheu 4");
                    exit = true;
                    break;
                default:
                    System.out.println("Escolha uma Opção Válida");

            }

        }

    }

}
