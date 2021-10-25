package com.exercicio;

import poo.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    //Representação "banco de dados" em Maps
    public static Map<String, Autor> autores;
    public static Map<String, Editora> editoras;
    public static Map<String, Area> areas;
    public static Map<String, Livro> livros;
    public static Map<String, Usuario> usuarios;
    public static void main(String[] args) {
        //Semear autores
        autores = new HashMap<String, Autor>();
        autores.put("autor_cod_1", new Autor("Autor Nome Exemplo 1"));
        autores.put("autor_cod_2", new Autor("Autor Nome Exemplo 2"));
        autores.put("autor_cod_3", new Autor("Autor Nome Exemplo 3"));
        autores.put("autor_cod_4", new Autor("Autor Nome Exemplo 4"));
        autores.put("autor_cod_5", new Autor("Autor Nome Exemplo 5"));
        autores.put("autor_cod_6", new Autor("Autor Nome Exemplo 6"));

        //Semear editoras
        editoras = new HashMap<String, Editora>();
        editoras.put("editora_cod_1", new Editora("Editora Nome Exemplo 1"));
        editoras.put("editora_cod_2", new Editora("Editora Nome Exemplo 2"));
        editoras.put("editora_cod_3", new Editora("Editora Nome Exemplo 3"));
        editoras.put("editora_cod_4", new Editora("Editora Nome Exemplo 4"));
        editoras.put("editora_cod_5", new Editora("Editora Nome Exemplo 5"));

        //Semear areas
        areas = new HashMap<String, Area>();
        areas.put("areas_cod_1", new Area("Policial"));
        areas.put("areas_cod_2", new Area("Romance"));
        areas.put("areas_cod_3", new Area("Infantil"));
        areas.put("areas_cod_4", new Area("Suspense"));
        areas.put("areas_cod_5", new Area("Misterio"));


        //Semear livros
        livros = new HashMap<String, Livro>();

        for (int i = 0; i < 5000; i++){
            int randomAutor = ThreadLocalRandom.current().nextInt(1, Main.autores.size());
            int randomEditora = ThreadLocalRandom.current().nextInt(1, Main.editoras.size());
            int randomArea = ThreadLocalRandom.current().nextInt(1, Main.areas.size());

            livros.put("livro_cod_"+i, new Livro("Livro Exemplo "+i, 1996, 2, 240,"autor_cod_"+randomAutor, "editora_cod_"+randomEditora, "areas_cod_"+randomArea));
        }

        //Semear usuarios
        String[] nomeArray = {"Alice", "Miguel", "Sophia", "Arthur", "Helena", "Bernardo", "Valentina", "Heitor", "Laura", "Davi", "Isabella", "Lorenzo", "Manuela", "Théo", "Júlia", "Pedro", "Heloísa", "Gabriel", "Luiza", "Enzo", "Maria", "Luiza", "Matheus", "Lorena", "Lucas", "Lívia", "Benjamin", "Giovanna", "Nicolas", "Maria", "Eduarda", "Guilherme", "Beatriz", "Rafael", "Maria", "Clara", "Joaquim", "Cecília", "Samuel", "Eloá", "Enzo", "Gabriel", "Lara", "João", "Miguel", "Maria", "Júlia", "Henrique", "Isadora", "Gustavo", "Mariana", "Murilo", "Emanuelly", "Pedro", "Henrique", "Ana", "Júlia", "Pietro", "Ana", "Luiza", "Lucca", "Ana", "Clara", "Felipe", "Melissa", "João", "Pedro", "Yasmin", "Isaac", "Maria", "Alice", "Benício", "Isabelly", "Daniel", "Lavínia", "Anthony", "Esther", "Leonardo", "Sarah", "Davi", "Lucca", "Elisa", "Bryan", "Antonella", "Eduardo", "Rafaela", "João", "Lucas", "Maria", "Cecília", "Victor", "Liz", "João", "Marina", "Cauã", "Nicole", "Antônio", "Maitê", "Vicente", "Isis", "Caleb", "Alícia", "Gael", "Luna", "Bento", "Rebeca", "Caio", "Agatha", "Emanuel", "Letícia", "Vinícius", "Maria", "João", "Guilherme", "Gabriela", "Davi", "Lucas", "Ana", "Laura", "Noah", "Catarina", "João", "Gabriel", "Clara", "João", "Victor", "Ana", "Beatriz", "Luiz", "Miguel", "Vitória", "Francisco", "Olívia", "Kaique", "Maria", "Fernanda", "Otávio", "Emilly", "Augusto", "Maria", "Valentina", "Levi", "Milena", "Yuri", "Maria", "Helena", "Enrico", "Bianca", "Thiago", "Larissa", "Ian", "Mirella", "Victor", "Hugo", "Maria", "Flor", "Thomas", "Allana", "Henry", "Ana", "Sophia", "Luiz", "Felipe", "Clarice", "Ryan", "Pietra", "Arthur", "Miguel", "Maria", "Vitória", "Davi", "Luiz", "Maya", "Nathan", "Laís", "Pedro", "Lucas", "Ayla", "Davi", "Miguel", "Ana", "Lívia", "Raul", "Eduarda", "Pedro", "Miguel", "Mariah", "Luiz", "Henrique", "Stella", "Luan", "Ana", "Erick", "Gabrielly", "Martin", "Sophie", "Bruno", "Carolina", "Rodrigo", "Maria", "Laura", "Luiz", "Gustavo", "Maria", "Heloísa", "Arthur", "Gabriel", "Maria", "Sophia", "Breno", "Fernanda", "Kauê", "Malu", "Enzo", "Miguel", "Analu", "Fernando", "Amanda", "Arthur", "Henrique", "Aurora", "Luiz", "Otávio", "Maria", "Isis", "Carlos", "Eduardo", "Louise", "Tomás", "Heloise", "Lucas", "Gabriel", "Ana", "Vitória", "André", "Ana", "Cecília", "José", "Ana", "Liz", "Yago", "Joana", "Danilo", "Luana", "Anthony", "Gabriel", "Antônia", "Ruan", "Isabel", "Miguel", "Henrique", "Bruna", "Oliver"};
        String[] sobrenomeArray = {"da Silva", "dos Santos", "Pereira", "Alves", "Ferreira", "de Oliveira", "Silva", "Rodrigues", "de Souza", "Gomes", "Santos", "Oliveira", "Ribeiro", "Martins", "Gonçalves", "Soares", "Barbosa", "Lopes", "Vieira", "Souza", "Fernandes", "Lima", "Costa", "Batista", "Dias", "Moreira", "de Lima", "de Sousa", "Nunes", "da Costa", "de Almeida", "Mendes", "Carvalho", "Araujo", "Cardoso", "Teixeira", "Marques", "do Nascimento", "Almeida", "Ramos", "Machado", "Rocha", "Nascimento", "de Araujo", "da Conceiçao", "Bezerra", "Sousa", "Borges", "Santana", "de Carvalho", "Aparecido", "Pinto", "Pinheiro", "Monteiro", "Andrade", "Leite", "Correa", "Nogueira", "Garcia", "de Freitas", "Henrique", "Tavares", "Coelho", "Pires", "de Paula", "Correia", "Miranda", "de Jesus", "Duarte", "Freitas", "Barros", "de Andrade", "Campos", "Sántos", "de Melo", "da Cruz", "Reis", "Guimaraes", "Moraes", "do Carmo", "dos Reis", "Viana", "de Castro", "Silveira", "Moura", "Brito", "Neves", "Carneiro", "Melo", "Medeiros", "Cordeiro", "Conceição", "Farias", "Dantas", "Cavalcante", "da Rocha", "de Assis", "Braga", "Cruz", "Siqueira"};
        String[] sexos = {"masculino", "feminino", "outros"};

        usuarios = new HashMap<String, Usuario>();

        for (int i = 0; i < 500; i++){
            int randomNome = ThreadLocalRandom.current().nextInt(0, nomeArray.length-1);
            int randomSobrenome = ThreadLocalRandom.current().nextInt(0, sobrenomeArray.length-1);
            int randomSex = ThreadLocalRandom.current().nextInt(0, sexos.length-1);
            int randomIdade = ThreadLocalRandom.current().nextInt(16, 75);
            int randomPhone = ThreadLocalRandom.current().nextInt(900000000, 999999999);

            usuarios.put("usuario_cod_"+i, new Usuario(nomeArray[randomNome]+" "+sobrenomeArray[randomSobrenome], sexos[randomSex], randomIdade, randomPhone));
        }

        //Simulando emprestimos
        ArrayList<Emprestimo> emprestimosAtivos = new ArrayList<Emprestimo>();
        emprestimosAtivos.add(new Emprestimo(new Date(), livros.get("livro_cod_1"), usuarios.get("usuario_cod_9")));
        emprestimosAtivos.add(new Emprestimo(new Date(), livros.get("livro_cod_2"), usuarios.get("usuario_cod_9")));
        emprestimosAtivos.add(new Emprestimo(new Date(), livros.get("livro_cod_3"), usuarios.get("usuario_cod_10")));
        emprestimosAtivos.add(new Emprestimo(new Date(), livros.get("livro_cod_4"), usuarios.get("usuario_cod_12")));

        System.out.println("Emprestimos Ativos: ");
        for(int i = 0; i < emprestimosAtivos.size(); i++){
            System.out.println(emprestimosAtivos.get(i).toString());
        }

    }
}
