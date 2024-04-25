package org.dio.src;

import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da agência!");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Por favor, digite qual a sua agência!");
        String agencia = sc.nextLine();

        System.out.println("Por favor, digite seu nome completo!");
        String nomeCliene = sc.nextLine();

        System.out.println("Por favor, digite o seu saldo!");
        double saldo = sc.nextDouble();
        sc.close();

        System.out.println("Olá ".concat(nomeCliene).concat(" obrigado por criar uma conta em nosso banco, sua agência é ".concat(agencia).concat(", conta ".concat(Integer.toString(numero)).concat(" e seu saldo de ".concat(Double.toString(saldo)).concat(" já está disponível para saque")))));
    }
}
