package org.banco.contas;

import lombok.Getter;
import org.banco.client.Cliente;

@Getter
public abstract class Conta implements IConta {

    private double saldo;
    private static int proximaAgencia = 1;
    private int agencia = 1 ;
    private Cliente cliente;


    public Conta(Cliente cliente) {
        this.agencia = proximaAgencia;
        proximaAgencia++ ;
        this.cliente = cliente;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void transferir(double valor, Conta destino) {
        this.saldo -= valor;
        destino.depositar(valor);
    }

    public void imprimirInfos(){
        System.out.println(String.format("Nome : %s" , this.getCliente().getNome()));
        System.out.println(String.format("Agencia : %d", this.agencia));
        System.out.println(String.format("Saldo : %.2f", this.saldo));;
        System.out.println("\n");
    }
}
