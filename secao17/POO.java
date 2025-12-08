package secao17;

import java.util.Arrays;

public class POO {
    public static void main(String[] args) {
      Pessoa joao = new Pessoa(null, 0);
      ContaBancaria ContaDaAna = new ContaBancaria();
       ContaDaAna.setTitular("Ana");       
       ContaDaAna.setSaldo(-1000);

       joao.setNome("João");
       joao.setIdade(42);

        //System.out.println("O nome do titular é:" + ContaDaAna.getTitular(titular));
        System.out.println("O nome do correntista é: "+ joao.getNome());
        System.out.println("A idade do correntista é: " + joao.getIdade());
        //System.out.println("O saldo da Ana é: " + ContaDaAna);
         
        String[] meusAlunos = {"Maria", "João", "Gerson" };
        Turma novaTurma = new Turma(meusAlunos);

        System.out.println(Arrays.toString(novaTurma.getAlunos()));
          String[] outrosAlunos = {"Aluno1", "Aluno2"}; 
        
        novaTurma.setAlunos(outrosAlunos);
        System.out.println(Arrays.toString(novaTurma.getAlunos()));


    }    
}
