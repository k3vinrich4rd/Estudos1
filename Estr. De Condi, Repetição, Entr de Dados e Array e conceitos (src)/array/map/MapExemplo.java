package array.map;
// Declarando um map.:
import java.util.*; // Importa tudo que � da biblioteca util
// Declarando um map.:
public class MapExemplo {
    public static void main(String[] args) {
        // Sempre tem duas informa��es, onde a primeira informa��o sempre � �nica
        Map <String,Double> cardapio = new HashMap<>(); //  Aqui se informa o tipo da vari�vel e o valor
        cardapio.put("Macarronada", 15.00); // put (coloque) adiciona coisas na lista que nem o add das listas
        cardapio.put("Bife a Rol�", 15.00);
        System.out.println(cardapio.get("Macarronada")); // o get do map, faz a busca pela chave

        Map<String,String> listaDeConvidados = new HashMap<>();
        listaDeConvidados.put("kevinrichardve@gmail.com", "Kevin Richard");
        listaDeConvidados.put("kevin.candido@zup.com.br", "Richard");
        // N�o � poss�vel duplicar a primeira informa��o, somente a segunda (ExemploInadequado):
        listaDeConvidados.put("kevinrichardve@gmail.com", "Kevin Richard");
        // Mas � poss�vel duplicar a segunda informa��o:
        listaDeConvidados.put("kevingatinho@gmail.com", "Kevin Richard"); // Tem rela��o chave e valor

        System.out.println(listaDeConvidados.get("kevinrichardve@gmail.com")); // o get do map, faz a busca pela chave
        System.out.println(listaDeConvidados.containsValue("Kevin Richard"));
        // Faz busca se na sua variavel realmente tem aquele valor e retorna um valor boolean (True or False)


        // O map. � mais usado quando se precisa den duas informa��es e uma delas n�o pode repetir
        // como em:
        /*
        Lista de convidados
        Lista de chamada
        Cpf
         */

    }
}
