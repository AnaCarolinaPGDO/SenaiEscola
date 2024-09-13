package com.escola.senai;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuAluno{ 

public static List<Aluno> listaAluno  = new ArrayList<>();

    public static void menu(){
        Scanner sc = new Scanner(System.in);
        sc.close();
        int opcao;
        do {
            {
                System.out.println("\n = Menu =");
                System.out.println("O que quer fazer?");
                System.out.println("1- Cadastrar novo aluno");
                System.out.println("2- Atualizar aluno");
                System.out.println("3- Deletar aluno");
                System.out.println("4- Listar alunos");
                System.out.println("0- Sair\n");
                System.out.print("Digite uma opção: ");
                opcao = sc.nextInt();
            }
                switch (opcao) {
                    case 1:
                        cadastrarAluno();
                        break;
                    case 2:
                        atualizarAluno();
                        break;
                    case 3:
                        removerAluno();
                        break;
                    case 4:
                        listarAluno();
                        break;
                    case 0:
                        System.out.println("Programa Finalizado!\n");
                        break;
                    default:
                        System.out.println("Número Inválido\n");
                        break;
                }
            }while(opcao != 0);
        }
    
        public static void cadastrarAluno(){
            System.out.println("	Cadastre o seu novo aluno	");
            Scanner sc  = new Scanner(System.in);
            sc.close();
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                Aluno aluno = new Aluno();
                aluno.setNome(nome);
                listaAluno.add(aluno);
            
            System.out.println("Aluno cadastrado com sucesso");
        }
    
        
        public static void atualizarAluno(){
            System.out.println("	Atualizar o Aluno	 	");
            System.out.print("Nome do Aluno que deseja atualizar: ");
            Scanner sc = new Scanner(System.in);
            sc.close();
            String nomeAtualizar = sc.nextLine();
            int contador = 0;
    
            for (Aluno aluno : listaAluno) {
                if(aluno.getNome().equals(nomeAtualizar)){
                    System.out.print("Qual será novo nome do Aluno?: ");
                    String nome = sc.nextLine();
                    aluno.setNome(nome);
                    System.out.println("Aluno modificado com sucesso");
                    contador = 0;
                }else{
                    contador++;
                }
            }
            if(contador == listaAluno.size()){
                System.out.println("Aluno não encontrado");
            }      
        }
    
        public static void removerAluno(){
            System.out.println("   Remover o Aluno   ");
            System.out.print("Nome do Aluno que deseja remover: ");
            Scanner sc = new Scanner(System.in);
            sc.close();
                String remover = sc.nextLine();
                int contador = 0;
                for (int i = 0; i < listaAluno.size(); i++) {
                    if (listaAluno.get(i).getNome().equals(remover)) {
                        listaAluno.remove(i);
                        System.out.println("Aluno removido com sucesso");
                        contador = 0;
                    }else{
                        contador++;
                    }
                }
                if(contador == listaAluno.size()){
                    System.out.println("Aluno não encontrado");
                }
            
        }
    
        public static void listarAluno(){
            System.out.println("   Lista dos Aluno   ");
            if(listaAluno.isEmpty()){
                System.out.println("   Lista Vazia   ");
            }else{
                for (int i = 0; i < listaAluno.size(); i++) {
                    Aluno aluno = listaAluno.get(i);
                    System.out.println((i + 1) + "- " + aluno.getNome());
                    
                }
            }
        }

}
