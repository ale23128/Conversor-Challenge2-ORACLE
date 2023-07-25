package conversorLongitud;
import javax.swing.JOptionPane;

public class ConvertirLongitudes {
	
              //   OPCIONES METRO - PIE - PULGADA
	
	public void ConvertirMetroAPie1(double valor) {
		double valorPie = valor * 3.28;
		valorPie = (double) Math.round(valorPie * 100)/100;
		JOptionPane.showMessageDialog(null, valor + " Metros(m) equivale a " + valorPie + " Pies(ft)");
	}
	
	public void ConvertirPieAMetro(double valor) {
		double valorPie = valor / 3.28;
		valorPie = (double) Math.round(valorPie * 100)/100;
		JOptionPane.showMessageDialog(null, valor + " Pies(ft) equivale a " + valorPie + " Metros(m)");
	}
	
	public void ConvertirMetroAPulgada1(double valor) {
		double valorPulgada = valor * 39.37;
		valorPulgada = (double) Math.round(valorPulgada * 100)/100;
		JOptionPane.showMessageDialog(null, valor + " Metros(m) equivale a " + valorPulgada + " Pulgadas(in)");
	}
	
	public void ConvertirPulgadaAMetro(double valor) {
		double valorPulgada = valor / 39.37;
		valorPulgada = (double) Math.round(valorPulgada * 100)/100;
		JOptionPane.showMessageDialog(null, valor + " Pulgadas(in) equivale a " + valorPulgada + " Metros(m)");
	}
	
	public void ConvertirPulgadaAPie1(double valor) {
		double valorPie = valor / 12;
		valorPie = (double) Math.round(valorPie * 100)/100;
		JOptionPane.showMessageDialog(null, valor + " Pulgadas(in) equivale a " + valorPie + " Pies(ft)");
	}
	
	public void ConvertirPieAPulgada(double valor) {
		double valorPie = valor * 12;
		valorPie = (double) Math.round(valorPie * 100)/100;
		JOptionPane.showMessageDialog(null, valor + " Pies(ft) equivale a " + valorPie + " Pulgadas(in)");
	}
	
	              // CONVERSOR GENERAL
	public void Conversor(double entrada) {
		String elegirOpcion = (JOptionPane.showInputDialog(null, "Elige el tipo de converción", "Longitudes", JOptionPane.PLAIN_MESSAGE,
				null, new Object[] { "De Metros a Pies", "De Metros a Pulgadas", "De Pies a Metros", "De Pies a Pulgadas", "De Pulgadas a Metros", "De Pulgadas a Pies"}, "Selección")).toString();
	
		switch (elegirOpcion) {
		
		case "De Metros a Pies":
			ConvertirMetroAPie1(entrada);
			break;
			
		case "De Metros a Pulgadas":
			ConvertirMetroAPulgada1(entrada);
			break;
			
		case "De Pies a Metros":
			ConvertirPieAMetro(entrada);
			break;
			
		case "De Pies a Pulgadas":
			ConvertirPieAPulgada(entrada);
			break;
			
		case "De Pulgadas a Metros":
			ConvertirPulgadaAMetro(entrada);
			break;
			
		case "De Pulgadas a Pies":
			ConvertirPulgadaAPie1(entrada);
			break;
		
		}
		
	}
	

}
