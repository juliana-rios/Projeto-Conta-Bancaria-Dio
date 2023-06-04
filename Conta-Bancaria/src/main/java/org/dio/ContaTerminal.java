package org.dio;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO:Conhecer e importar a classe scanner
        Scanner scan = new Scanner(System.in);
         int numero;
         String agencia;
         String nomeCliente;
         double saldo = 237.48;

        //Exibir as mensagens para o nosso usuario
        System.out.println("Por favor informe o seu nome: ");
        nomeCliente = scan.next();
        System.out.println("Informe agencia: ");
        agencia = scan.next();
        System.out.println("Informe o numero da conta: ");
        numero = scan.nextInt();

        //Exibir mensagem conta criada

        System.out.println("Olá " + nomeCliente + "! Obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$ " + saldo + " já está disponível para saque.");
    }
}