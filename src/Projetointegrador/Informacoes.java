package Projetointegrador;

import java.io.FileWriter;
import java.io.IOException;

public class Informacoes {
	 private static void Informacoes (String nome, int idade, String mainAgente, String rank, int horasPorSemana, String numTorneios, String melhorColocacao) {
	        try (FileWriter writer = new FileWriter("candidatos.txt", true)) {
	            writer.write("Nome: " + nome + "\n");
	            writer.write("Idade: " + idade + "\n");
	            writer.write("Main Agente: " + mainAgente + "\n");
	            writer.write("Rank: " + rank + "\n");
	            writer.write("Horas por Semana: " + horasPorSemana + "\n");
	            writer.write("Número de Torneios: " + numTorneios + "\n");
	            writer.write("Melhor Colocação: " + melhorColocacao + "\n");
	            writer.write("--------------------------------------------------\n");
	        } catch (IOException e) {
	            System.out.println("Ocorreu um erro ao salvar as informações.");
	            e.printStackTrace();
	        }
	    }
	}


