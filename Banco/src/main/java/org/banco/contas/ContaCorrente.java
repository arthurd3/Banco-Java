package org.banco.contas;

import org.banco.client.Cliente;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    void imprimirConta() {
        System.out.println("===== Conta Corrente ======");
        imprimirConta();
    }
}
