package ejercicio3;

public class Ejercicio3 {
    public static String Contrasenia(String password) {
        int length = password.length();

        if (length < 5) {
            return "password demasiado corto";
        } else if (length >= 5 && length <= 8) {
            return "********";
        } else if (length >= 12 && length <= 40) {
            return "************";
        } else if (length > 40) {
            return "password demasiado largo";
        }

        return "";
    }
}