package org.banco;

import org.banco.client.Cliente;
import org.banco.contas.Conta;
import org.banco.contas.ContaCorrente;
import org.banco.contas.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Cliente antonio = new Cliente();
        antonio.setNome("Antonio");
        Cliente jose = new Cliente();
        jose.setNome("Jose");

        Conta cc = new ContaCorrente(antonio);
        cc.depositar(100);
        Conta cc2 = new ContaCorrente(jose);
        Conta poupanca = new ContaPoupanca(antonio);

        cc.transferir(55, cc2);
        cc.sacar(30);
        cc2.transferir(30, poupanca);
        cc.imprimirInfos();
        cc2.imprimirInfos();
        poupanca.imprimirInfos();





    }
}