import javax.swing.JOptionPane;

import conversorLongitud.ConvertirLongitudes;
import conversorMonedas.ConvertirMonedas;

public class Principal {
	
		public static void main(String[] args) {
			
			ConvertirMonedas monedas = new ConvertirMonedas();
			ConvertirLongitudes longitud = new ConvertirLongitudes();
			boolean relanzar = true;
			
			while(relanzar) {			
				                                       // showInputDialog(Component parentComponent,Object message, String title, int messageType, Icon icon, Object[] selectionValues, Object initialSelectionValue)
				String opcionesDeConvercion = (JOptionPane.showInputDialog(null, "Seleccione un tipo de conversor", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de Moneda","Conversor de Longitud"}, "Selección")).toString();
				
				switch (opcionesDeConvercion) {
				
					case "Conversor de Moneda":
						String cantidadAConvertir = JOptionPane.showInputDialog("Ingrese la cantidad de dinero que desee convertir: ");
						
						if(ValidacionDeNumero.ValidarNumero(cantidadAConvertir)) {
							double cantidadDouble = Double.parseDouble(cantidadAConvertir);
						    monedas.Conversor(cantidadDouble);
						    
						    int respuesta = JOptionPane.showConfirmDialog(null, "Desea realizar otra converción?");
						    	if(JOptionPane.OK_OPTION == respuesta) {
						    		System.out.println("Selecciona opcion afirmativa");
						    	} else {
						    		relanzar = false;
						    		JOptionPane.showMessageDialog(null, "Programa Terminado" );
						           }
						    } else{
						    	JOptionPane.showMessageDialog(null, "Valor INVALIDO");
						    }
								break;
						
					case "Conversor de Longitud":
						String longitudAConvertir = JOptionPane.showInputDialog("Ingrese la cantidad que desee convertir: ");
						
						if(ValidacionDeNumero.ValidarNumero(longitudAConvertir)) {
							double longitudDouble = Double.parseDouble(longitudAConvertir);
						    longitud.Conversor(longitudDouble);
						    
						    int respuesta = JOptionPane.showConfirmDialog(null, "Desea realizar otra converción?");
						    	if(JOptionPane.OK_OPTION == respuesta) {
						    		System.out.println("Selecciona opcion afirmativa");
						    	} else {
						    		relanzar = false;
						    		JOptionPane.showMessageDialog(null, "Programa Terminado" );
						           }
						    } else{
						    	JOptionPane.showMessageDialog(null, "Valor INVALIDO");
						    }
								break;
				   
					} // fin switch							
		      } // fin while			 				
	 } // fin main
} // fin class
