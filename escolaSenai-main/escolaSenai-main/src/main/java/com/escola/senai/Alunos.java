package com.escola.senai;


public class Alunos extends Pessoa{

    public static int contadorMatricula = 1;
    private String matricula;

    
    public Alunos(String nome, String cpf, Endereco endereco) {
        super(nome, cpf, endereco);
        this.matricula = (contadorMatricula + ".24/2");
        contadorMatricula++;
    }

    public Alunos() {
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    

 
    

}
