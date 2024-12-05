package ifma.lista04;

public class testes {
    public static void main(String[] args) {
        DequeList<Aluno> deque = new DequeList<>();

        // Adicionando elementos
        deque.addLast(new Aluno("João", 8.5, 7.8));
        deque.addLast(new Aluno("Maria", 7.1, 9.0));
        deque.addLast(new Aluno("Carlos", 6.5, 8.2));

        // Exibindo lista
        System.out.println("Lista atual: " + deque);

        // Obtendo primeiro e último elemento
        System.out.println("Primeiro: " + deque.getFirst().getData());
        System.out.println("Último: " + deque.getLast().getData());

        // Removendo primeiro e último
        System.out.println("Removendo primeiro: " + deque.removeFirst());
        System.out.println("Removendo último: " + deque.removeLast());

        // Exibindo lista após remoções
        System.out.println("Lista após remoções: " + deque);

        // Pesquisando aluno
        try {
            System.out.println("Procurando por Maria: " + deque.search("Maria").getData());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Testando buscar aluno inexistente
        try {
            System.out.println("Procurando por Pedro: " + deque.search("Pedro").getData());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
