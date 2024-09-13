package com.escola.senai;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuProfessor{ 

public static List<Professor> listaProfessor  = new ArrayList<>();

    public static void menu(){
        Scanner sc = new Scanner(System.in);
        sc.close();
        int opcao;
        do {
            {
                System.out.println("\n = Menu =");
                System.out.println("O que quer fazer?");
                System.out.println("1- Cadastrar novo professor");
                System.out.println("2- Atualizar professor");
                System.out.println("3- Deletar professor");
                System.out.println("4- Listar professores");
                System.out.println("0- Sair\n");
                System.out.print("Digite uma opção: ");
                opcao = sc.nextInt();
            }
                switch (opcao) {
                    case 1:
                        cadastrarProfessor();
                        break;
                    case 2:
                        atualizarProfessor();
                        break;
                    case 3:
                        removerProfessor();
                        break;
                    case 4:
                        listarProfessor();
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
        public static void cadastrarProfessor(){
            System.out.println("	Cadastre o novo professor	");
            Scanner sc  = new Scanner(System.in);
            sc.close();
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                
                Professor professor = new Professor();
                professor.setNome(nome);
                listaProfessor.add(professor);
            
            System.out.println("Professor cadastrado com sucesso");
        }
        
        public static void atualizarProfessor(){
            System.out.println("	Atualizar o Professor	 	");
            System.out.print("Nome do Professor que deseja atualizar: ");
            Scanner sc = new Scanner(System.in);
            sc.close();
            String nomeAtualizar = sc.nextLine();
            int contador = 0;
            
            for (Professor professor : listaProfessor) {
                if(professor.getNome().equals(nomeAtualizar)){
                    System.out.print("Qual será novo nome do Professor?: ");
                    String nome = sc.nextLine();
                    professor.setNome(nome);
                    System.out.println("Professor modificado com sucesso");
                    contador = 0;
                }else{
                    contador++;
                }
            }
            if(contador == listaProfessor.size()){
                System.out.println("Professor não encontrado");
            }      
        }
    
        public static void removerProfessor(){
            System.out.println("   Remover o Professor   ");
            System.out.print("Nome do Professor que deseja remover: ");
            Scanner sc = new Scanner(System.in);
            sc.close();
                String remover = sc.nextLine();
                int contador = 0;
                for (int i = 0; i < listaProfessor.size(); i++) {
                    if (listaProfessor.get(i).getNome().equals(remover)) {
                        listaProfessor.remove(i);
                        System.out.println("Professor removido com sucesso");
                        contador = 0;
                    }else{
                        contador++;
                    }
                }
                if(contador == listaProfessor.size()){
                    System.out.println("Professor não encontrado");
                }
            
        }
    
        public static void listarProfessor(){
            System.out.println("   Lista dos Professor   ");
            if(listaProfessor.isEmpty()){
                System.out.println("   Lista Vazia   ");
            }else{
                for (int i = 0; i < listaProfessor.size(); i++) {
                    Professor professor = listaProfessor.get(i);
                    System.out.println((i + 1) + "- " + professor.getNome());
                    
                }
            }
        }
    }
