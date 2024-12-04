package ifma.lista01;

public class TestarAlunos {
    public static void main(String[] args) {
        CadastrarAlunos cadastro = new CadastrarAlunos(5);

        // Adicionar alunos
        cadastro.adicionarNoFinal(new Aluno(3, "João"));
        cadastro.adicionarNoInicio(new Aluno(1, "Maria"));
        cadastro.adicionarNoFinal(new Aluno(4, "Carlos"));
        cadastro.adicionarNoFinal(new Aluno(2, "Ana"));

        System.out.println("Alunos após adições:");
        cadastro.exibirAlunos();

        // Remover do final
        cadastro.removerNoFinal();
        System.out.println("\nApós remover do final:");
        cadastro.exibirAlunos();

        // Remover do início
        cadastro.removerNoInicio();
        System.out.println("\nApós remover do início:");
        cadastro.exibirAlunos();

        // Remover por índice
        System.out.println("\nRemovendo aluno no índice 1:");
        System.out.println("Aluno removido: " + cadastro.removerComIndice(1));
        cadastro.exibirAlunos();

        // Ordenar vetor
        cadastro.ordenarVetor();
        System.out.println("\nApós ordenar pelo código:");
        cadastro.exibirAlunos();
    }
}
