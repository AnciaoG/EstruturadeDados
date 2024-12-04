package ifma.lista03;

public class SimpleListTest {
    public static void main(String[] args) {
        SimpleList list = new SimpleList();

        // Adicionando elementos
        list.adicionarInicio(1);
        list.adicionarFim(2);
        list.adicionarFim(3);

        System.out.println("Lista: " + list); // [1, 2, 3]

        // Removendo elementos
        System.out.println("Removido do início: " + list.removerComeco()); // 1
        System.out.println("Removido do fim: " + list.removerFinal()); // 3

        // Verificando o estado da lista após remoções
        System.out.println("Lista após remoções: " + list); // [2]

        // Testando os métodos adicionais
        System.out.println("Maior valor: " + list.maiorValor()); // 2
        System.out.println("Menor valor: " + list.menorValor()); // 2
        System.out.println("Média dos valores: " + list.mediaValores()); // 2.0
    }
}
