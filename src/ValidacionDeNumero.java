
public class ValidacionDeNumero {

	public static boolean ValidarNumero(String numeroInput) {
		try {
			double x = Double.parseDouble(numeroInput);
				if(x >= 0 || x < 0) {
					return true;
				}	
			} catch (NumberFormatException e) {
				return false;
			}
		return false;
	}
}
