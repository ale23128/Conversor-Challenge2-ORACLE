package conversorMonedas;
import javax.swing.JOptionPane;

public class ConvertirMonedas {
	
              //   OPCIONES PESOS ARGENTINOS A INTERNACIONAL
	
	public void ConvertirPesoADolares(double valor) {
		double valorDolar = valor / 271.61;
		valorDolar = (double) Math.round(valorDolar * 100)/100;
		                         // (Component parentComponent, Object message)
		JOptionPane.showMessageDialog(null, "Tienes $ " + valorDolar + " Dolares");
	}
	
	public void ConvertirPesoAEuro(double valor) {
		double valorEuro = valor / 300.28;
		valorEuro = (double) Math.round(valorEuro * 100)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + valorEuro + " Euros");
	}
	
	public void ConvertirPesoALibra(double valor) {
		double valorLibra = valor / 350.36;
		valorLibra = (double) Math.round(valorLibra * 100)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + valorLibra + " Libras Esterlinas");
	}
	
	public void ConvertirPesoAYen(double valor) {
		double valorYen = valor / 1.92;
		valorYen = (double) Math.round(valorYen * 100)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + valorYen + " Yen Japones");
	}
	
	public void ConvertirPesoAWon(double valor) {
		double valorWon = valor / 0.21;
		valorWon = (double) Math.round(valorWon * 100)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + valorWon + " Won Surcoreano");
	}
	
			//  OPCIONES INTERNACIONAL A PESOS ARGENTINOS
	
	public void ConvertirDolaresAPesos(double valor) {
		double valorDolar = valor * 271.61;
		valorDolar = (double) Math.round(valorDolar * 100)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + valorDolar + " Pesos Argentinos");
	}
	
	public void ConvertirEurosAPesos(double valor) {
		double valorEuro = valor * 300.28;
		valorEuro = (double) Math.round(valorEuro * 100)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + valorEuro + " Pesos Argentinos");
	}
	
	public void ConvertirLibrasAPesos(double valor) {
		double valorLibra = valor * 350.36;
		valorLibra = (double) Math.round(valorLibra * 100)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + valorLibra + " Pesos Argentinos");
	}
	
	public void ConvertirYenesAPesos(double valor) {
		double valorYen = valor * 1.92;
		valorYen = (double) Math.round(valorYen * 100)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + valorYen + " Pesos Argentinos");
	}
	
	public void ConvertirWonAPesos(double valor) {
		double valorWon = valor * 0.21;
		valorWon = (double) Math.round(valorWon * 100)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + valorWon + " Pesos Argentinos");
	}
	
	              // CONVERSOR GENERAL
	public void Conversor(double entrada) {
		String elegirOpcion = (JOptionPane.showInputDialog(null, "Elige las divisas para la converción", "Monedas", JOptionPane.PLAIN_MESSAGE,
				null, new Object[] { "De Pesos a Dólar", "De Pesos a Euros", "De Pesos a Libras Esterlinas", "De Pesos a Yen Japones", "De Pesos a Won Surcoreano",
						"De Dólar a Pesos", "De Euros a Pesos", "De Libras Esterlinas a Pesos", "De Yen Japones a Pesos", "De Won Surcoreano a Pesos"}, "Selección")).toString();
	
		switch (elegirOpcion) {
		
		case "De Pesos a Dólar":
			ConvertirPesoADolares(entrada);
			break;
			
		case "De Pesos a Euros":
			ConvertirPesoAEuro(entrada);
			break;
			
		case "De Pesos a Libras Esterlinas":
			ConvertirPesoALibra(entrada);
			break;
			
		case "De Pesos a Yen Japones":
			ConvertirPesoAYen(entrada);
			break;
			
		case "De Pesos a Won Surcoreano":
			ConvertirPesoAWon(entrada);
			break;
			
		case "De Dólar a Pesos":
			ConvertirDolaresAPesos(entrada);
			break;
			
		case "De Euros a Pesos":
			ConvertirEurosAPesos(entrada);
			break;
			
		case "De Libras Esterlinas a Pesos":
			ConvertirLibrasAPesos(entrada);
			break;
			
		case "De Yen Japones a Pesos":
			ConvertirYenesAPesos(entrada);
			break;
			
		case "De Won Surcoreano a Pesos":
			ConvertirWonAPesos(entrada);
			break;
		}
		
	}
	

}
