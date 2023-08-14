package view;
import javax.swing.*;
import controller.FatController;
public class Principal {

	public static void main(String[] args) {
		FatController fc = new FatController();
		int fat = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro menor que 12 para calcularmos o seu fatorial"));
		int fatorial = fc.fatorial(5);
		System.out.println("O resultado do fatorial de "+fat+" é: "+fatorial);
	}

}
