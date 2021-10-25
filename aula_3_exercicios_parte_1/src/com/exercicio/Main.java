package com.exercicio;

import poo.Carro;
import poo.Pessoa;

public class Main {

    public static void main(String[] args) {
        Carro carro = new Carro("PRETO", "PASSEIO", "GGG-1111", 4);

        System.out.println("-------- Carro ---------");
        System.out.println("Cor: "+carro.getCor());
        System.out.println("Tipo: "+carro.getTipo());
        System.out.println("Placa: "+carro.getPlaca());
        System.out.println("Portas: "+carro.getNumPortas());

        Pessoa pessoa = new Pessoa("William", "Castanho", "Mesomorfo", 25);

        System.out.println("-------- Pessoa ---------");
        System.out.println("Nome: "+pessoa.getNome());
        System.out.println("Cor do cabelo: "+pessoa.getCorDoCabelo());
        System.out.println("Biotipo: "+pessoa.getBiotipo());
        System.out.println("Idade: "+pessoa.getIdade());

    }
}
