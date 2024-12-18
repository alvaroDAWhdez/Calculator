public class calculadora {
    public static void main(String[] args) {
    // Valores predefinidos (puedes cambiarlos aquí)
    double num1 = 10.5;
    double num2 = 3.2;
    char operador = '-';
    double resultado = 0;
    switch (operador) {
        case '-':
            resultado = num1 - num2;
            break;
        default:
            System.out.println("Operador inválido");
        return;
    }
    System.out.println("Resultado: " + resultado);
   
    }
}