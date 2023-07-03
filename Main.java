import java.util.Scanner;

//import javax.swing.JOptionPane;

public class Main{
    public static void main(String[] args) {
        //System.out.println("Olá mundo!");
        /*
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Seu nome é " + nome);   
        
        entrada.close();
        
        
        JOptionPane.showMessageDialog(null, "Seja bem vindo ao sistema!", "Boas vindas!", 1);
        String nome = JOptionPane.showInputDialog("informe seu nome: ");
        JOptionPane.showMessageDialog(null, "Seja bem vindo: " + nome, "Olá!", 1);
        */
    
        Scanner entrada = new Scanner(System.in);
        int idade = -1;
        System.out.println("Bem vindo ao sistema de votação!!\nDigite 0 para sair");
        while (idade != 0){
            System.out.print("Informe sua idade: ");
            idade = entrada.nextInt();
    
            if (idade < 16){
                System.out.println("Você não pode votar!");
            
            } else if (idade >= 16 && idade <18 || idade >= 75){
                System.out.println("Seu voto é opcional!");
            } else{
                System.out.println("Seu voto é obrigatório!");
            }

            System.out.println("Obrigado!");
        }

        entrada.close();
    }




}