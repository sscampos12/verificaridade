package br.com.alura.idadePessoa.modelo;

public class idadePessoa {
    private String nome;
    private int idade;

    public void verificarIdade(){
        System.out.println("Nome: " + nome); // Adicionei espaço após "Nome:"
        System.out.println("Idade: " + idade); // Adicionei espaço após "Idade:"

        if (idade >= 18) { // Corrigido a condição para usar o atributo 'idade'
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }

    // Getters e setters permanecem iguais
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}