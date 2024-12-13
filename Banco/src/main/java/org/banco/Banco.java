package org.banco;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.banco.contas.Conta;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor

public class Banco {
    private String nome;
    private List<Conta> contas;

}
