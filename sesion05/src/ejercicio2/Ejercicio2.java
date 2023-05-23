package ejercicio2;

public class Ejercicio2 {
public boolean login (String username, String password){
	//comprobar si están vacíos
	if (username.isEmpty()|| password.isEmpty())
		return false;
	// comprobar que la longitud sea menor a 30
	if (username.length()>=30 || password.length()>=30)
		return false;
	// comprueba uso de los caracteres especificados para la contraseña
	
	int N = 0;
	int n = 0;
	int numb = 0;
	
	for (int i = 0; i < password.length(); i++) {
		//Comprobar mayuscula
		if(password.charAt(i) == Character.toUpperCase(password.charAt(i)))
			N += 1;
		//Comprobar minuscula
		if(password.charAt(i) == Character.toLowerCase(password.charAt(i)))
			n += 1;
		//Comprobar numero
		if(Character.isDigit(password.charAt(i)))
			numb += 1;
	}
	// Una vez comprobado todo, si no se cumple la condicion anterior, la contrasenia no seria valida
	if (N == 0 || n == 0 || numb ==0)
		return false;
	
return compruebaLoginEnBD(username, password);
}

public boolean compruebaLoginEnBD

 (String username, String password){
	if (username.equals("user") && password.equals("Pass1"))
		return true;
	else
		return false;
}
}
