# idadePessoa

Este projeto Java simples demonstra o conceito de encapsulamento e uso de getters e setters para acessar e modificar atributos de uma classe.

## Descrição

O projeto contém uma classe chamada `idadePessoa` com os seguintes atributos:

* `nome` (privado): armazena o nome da pessoa.
* `idade` (privado): armazena a idade da pessoa.

A classe também inclui os seguintes métodos:

* `getNome()`: retorna o nome da pessoa.
* `setNome(String nome)`: define o nome da pessoa.
* `getIdade()`: retorna a idade da pessoa.
* `setIdade(int idade)`: define a idade da pessoa.
* `verificarIdade()`: verifica se a pessoa é maior de idade (18 anos ou mais) e imprime uma mensagem correspondente no console.

## Como executar

1. **Compile o código:** Utilize um compilador Java para compilar os arquivos `.java` do projeto.
2. **Execute a classe principal:** Execute a classe `Principal` para criar um objeto `idadePessoa`, definir seus atributos e chamar o método `verificarIdade()`.

## Exemplo de uso

```java
import br.com.alura.idadePessoa.modelo.idadePessoa;

public class Principal {
    public static void main(String[] args) {
        idadePessoa idadePessoa = new idadePessoa();

        idadePessoa.setNome("Suzy Soares");
        idadePessoa.setIdade(47);

        idadePessoa.verificarIdade(); 
    }
}


Observações
Este projeto é apenas um exemplo básico para fins educacionais.
O código pode ser expandido para incluir funcionalidades adicionais, como leitura de dados do usuário, validação de entrada e tratamento de exceções.
Autor
[Suzy Campos]
