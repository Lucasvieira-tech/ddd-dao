package br.com.fiap.agenda.tests;

import br.com.fiap.agenda.dao.ContatoDAO;
import br.com.fiap.agenda.models.Contato;

import java.util.Scanner;

public class TesteBuscaPorId {
    public static void main(String[] args) {
        Scanner leitorNum = new Scanner(System.in);

        Contato contato =new Contato();
        ContatoDAO dao = new ContatoDAO();
        System.out.println("Consulta contato por ID");
        System.out.println("=======================");
        System.out.println("Dígite o id do contato");
        int id = leitorNum.nextInt();
        contato = dao.buscarPorId(id);

    }
}
