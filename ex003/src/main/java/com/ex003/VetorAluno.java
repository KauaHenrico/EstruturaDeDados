package com.ex003;

public class VetorAluno implements IVetorAluno {
    private Aluno[] alunos;
    private int totalAlunos;

    public VetorAluno() {
        alunos = new Aluno[5];
        totalAlunos = 0;
    }

    @Override
    public void adiciona(Aluno aluno) {
        if (totalAlunos < alunos.length) {
            alunos[totalAlunos] = aluno;
            totalAlunos++;
        } else {
            // Vetor cheio, redimensionar o vetor se necessário
            Aluno[] novoVetor = new Aluno[alunos.length * 2];
            System.arraycopy(alunos, 0, novoVetor, 0, totalAlunos);
            novoVetor[totalAlunos] = aluno;
            totalAlunos++;
            alunos = novoVetor;
        }
    }

    @Override
    public int tamanho() {
        return totalAlunos;
    }

    @Override
    public boolean contem(Aluno aluno) {
        for (int i = 0; i < totalAlunos; i++) {
            if (alunos[i].equals(aluno)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean cheio() {
        return totalAlunos == alunos.length;
    }

    @Override
    public boolean remove(Aluno aluno) {
        for (int i = 0; i < totalAlunos; i++) {
            if (alunos[i].equals(aluno)) {
                // Deslocar os elementos para preencher o espaço vazio
                for (int j = i; j < totalAlunos - 1; j++) {
                    alunos[j] = alunos[j + 1];
                }
                alunos[totalAlunos - 1] = null;
                totalAlunos--;
                return true;
            }
        }
        return false;
    }
}
