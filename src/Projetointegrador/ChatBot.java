package Projetointegrador;
import java.util.Scanner;

public class ChatBot {

    public static void main(String[] args) {
        // Mensagem inicial do ChatBot
        System.out.println("Seja Bem-Vindo! Sou Agatha, a recrutadora de atletas do Panteras E-Sports");
        
        Scanner scanner = new Scanner(System.in);
        
        // Aqui um coletamos o nome
        System.out.println("Para começarmos, digite como você quer ser chamado(a):");
        String nome = scanner.nextLine();
        
        // Aqui será coletada a idade
        System.out.printf("Olá %s, qual a sua idade?%n", nome);
        int idade = scanner.nextInt();
        scanner.nextLine(); //nova linha
        
        // Verificar se é aluno de ADS/PUC
        System.out.printf("Então %s, você estuda Análise e Desenvolvimento de Sistemas na PUC? [S/N]%n", nome);
        char choice = scanner.next().charAt(0);
        scanner.nextLine(); //nova linha
        
        if (choice == 'S' || choice == 's') {
        	//Informações para contato
        	System.out.println("Escreva seu email ou Discord para contato:");
            String contato = scanner.nextLine();
           
            //Informações sobre Valorant
            System.out.println("Temos vagas para o Time de Valorant, qual o seu Main Agente?");
            String mainAgente = scanner.nextLine();
            
            System.out.println("Qual o seu Nick #_ (com tracker.gg) da Riot?");
            String nickname = scanner.nextLine();
            
            System.out.println("Qual o seu nível de habilidade (Rank) em Valorant?");
            String rank = scanner.nextLine();
            
            System.out.println("Quantas horas por dia você joga Valorant?");
            int horasPorSemana = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha
            
            System.out.println("Qual o seu grau de motivação para fazer parte do nosso time?");
            String motivacao = scanner.nextLine();
            scanner.nextLine(); // Consumir a nova linha
            
            System.out.println("Você já participou de algum torneio? [S/N]");
            char participouTorneio = scanner.next().charAt(0);
            scanner.nextLine(); // Consumir a nova linha
            
            if (participouTorneio == 'S' || participouTorneio == 's') {
                System.out.println("Quantos torneios você já participou?");
                int numTorneios = scanner.nextInt();
                scanner.nextLine(); // Consumir a nova linha
                
                System.out.println("Qual foi a sua melhor colocação?");
                String melhorColocacao = scanner.nextLine();
                
                System.out.printf("Obrigado, %s! Suas informações foram registradas, em breve entraremos com contato.%n", nome);
                
            } else {
                System.out.printf("Obrigado, %s! Suas informações foram registradas, em breve entraremos com contato.%n", nome);
                
            }
        } else {
            System.out.println("Desculpe, apenas alunos do curso de Análise e Desenvolvimento de Sistemas podem se inscrever.");
        }
        
        scanner.close();
    }
}

