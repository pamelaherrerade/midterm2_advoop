/*
Una excepción personalizada Checked llamada InvalidPizzaSizeException que herede de Exception y tenga un constructor que reciba un mensaje (String message) y lo pase a super(message).

Un método estático dentro de cualquier clase (o suelto) llamado validateSize(char size):

Si size es diferente de 'S', 'M' y 'L', debe lanzar (throw) la excepción con el mensaje "Invalid size: " + size.

Atención a la firma: Como es una checked exception, recuerda qué palabra clave debes poner en la cabecera del método.
*/

public class InvalidPizzaSizeException extends Exception{
    // Default Constructor
    public InvalidPizzaSizeException(String message){
        super(message);
    }
}