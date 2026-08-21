package br.com.fiap.agenda.tests;

import br.com.fiap.agenda.dao.ContatoDAO;
import br.com.fiap.agenda.models.Contato;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteListar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNum = new Scanner(System.in);

        Contato contato = new Contato();
        ContatoDAO dao = new ContatoDAO();
        List<Contato> contatos = new ArrayList<>();

        contatos = dao.listar();
        System.out.println("Agenda");
        System.out.println("========================");
        contatos.forEach(System.out::println);

    }
}
