public class ControledeAproveitamentopedagogicodealunos
public class Aluno {
    private String nome;
    private int matricula;
    // Getters e setters
}

public class Disciplina {
    private String nome;
    private int codigo;
    // Getters e setters
}

public class Nota {
    private Disciplina disciplina;
    private Aluno aluno;
    private double valor;
    // Getters e setters
}
