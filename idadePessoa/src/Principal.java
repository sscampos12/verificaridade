import br.com.alura.idadePessoa.modelo.idadePessoa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {
        idadePessoa idadePessoa = new idadePessoa();


        idadePessoa.setNome("Suzy Soares");
        idadePessoa.setIdade(Integer.parseInt("47"));

       idadePessoa.verificarIdade();

        }
    }
