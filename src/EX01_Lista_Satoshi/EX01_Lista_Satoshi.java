package EX01_Lista_Satoshi;

import javax.swing.JOptionPane;
	
	public class EX01_Lista_Satoshi {
	public static void main(String[] args) {
		double lado, area;
		
		lado=Double.parseDouble(JOptionPane.showInputDialog("Informe o lado do quadrado"));
		
		area=(lado*lado);
		{
			JOptionPane.showMessageDialog(null,"Area do quadrado é: " + area);
		}
		
		

	}

}
