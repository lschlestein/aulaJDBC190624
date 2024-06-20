package Jdbc;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> listPersons = new ArrayList<>(); // lista de pessoas encontrada no banco de dados
        Database.getConnection();                      //conecta ao banco de dados
       /* listPersons = Database.getAllPersons();       //método que busca as pessoas no banco, e popula a lista
        for (Person person : listPersons) {
            System.out.println(person);
        }
        */
        System.out.println(Database.getPerson(2));//busca uma única pessoa por id
        int lines;
        Database.updatePerson(new Person(2,"updatedPerson","updatedPerson@mail.com"));//modifica uma pessoa já existente no banco de dados
        //lines = Database.deletePerson(1);// remove uma pessoa por id
        lines = Database.insertPerson(new Person("Paul 2", "paul2@mail.com")); //insere um novo registro no bando de dados
        //System.out.println("Lines changed: "+lines);
        Database.disconnect();
    }
}