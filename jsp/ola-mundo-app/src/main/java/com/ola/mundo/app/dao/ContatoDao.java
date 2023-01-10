package com.ola.mundo.app.dao;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import com.ola.mundo.app.model.Contato;

public class ContatoDao {

    private List<Contato> contatos = new ArrayList<>();

    public ContatoDao(){

        Contato contato1 = new Contato();

        contato1.setNome("Stela Brainer");
        contato1.setEmail("stela.brainer@gmail.com");
        contato1.setEndereco("rua Golfinho");
        contato1.setDataNascimento(new GregorianCalendar(1993, 8, 8));

        contatos.add(contato1);


        Contato contato2 = new Contato();

        contato2.setNome("Gabriel Reis");
        contato2.setEmail("Gabriel2@gmail.com");
        contato2.setEndereco("rua dois");
        contato2.setDataNascimento(new GregorianCalendar(1999, 6, 13));

        contatos.add(contato2);

        Contato contato3 = new Contato();

        contato3.setNome("Herbert");
        contato3.setEndereco("rua doze");
        contato3.setDataNascimento(new GregorianCalendar(1994, 4, 5));

        contatos.add(contato3);

        Contato contato4 = new Contato();

        contato4.setNome("Igor Mesquita");
        contato4.setEmail("igor@gmail.com");
        contato4.setDataNascimento(new GregorianCalendar(2000, 9, 12));

        contatos.add(contato4);
 }
    public List<Contato> getContato() {
        return this.contatos;
        
       }
}
