package EXERCICIOS;
import  java.util.Scanner;

public class Alunos {
  
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       
        int idade;
        String nome;
      
        String curso; 
        String endereco;
       
        

        System.out.println("Entre com seu nome:    ");
        nome = sc.nextLine();


        System.out.println("Entre com seu curso:    ");
        curso = sc.nextLine();

        System.out.println("Entre com seu endereço:    ");
        endereco = sc.nextLine();

        
        System.out.println("Entre com sua idade:    ");
        idade = sc.nextInt();

        System.out.println("Seu nome é " + nome + " , sua idade é " + idade + " , seu curso é " + curso + ", seu endereço é " + endereco);


        sc.close();
    }

}