package controller;
import javax.swing.*;

public class FatController {

	public FatController() {
		super();
	}
	public int fatorial(int n) {
		if (n>12) {
			JOptionPane.showMessageDialog(null, "O número deve ser menor que 12. Insira um novo valor.");
		}
		
		if (n==0) { //Ao chegar em 0 interrompe a recursividade
			return 1;
		}
		return n*fatorial(n-1); //recursividade chama o valor do próximo número inteiro menor que n
	}
}
