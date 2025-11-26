package calculadora; 

public class TesteCalculadora {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        // Testes rápidos com impressão do resultado
        System.out.println("2 + 3 = " + calc.calcular(2, 3, "+"));   // esperado: 5
        System.out.println("10 - 4 = " + calc.calcular(10, 4, "-")); // esperado: 6
        System.out.println("3 * 5 = " + calc.calcular(3, 5, "*"));   // esperado: 15
        System.out.println("8 / 2 = " + calc.calcular(8, 2, "/"));   // esperado: 4

        // Teste de divisão por zero
        try {
            calc.calcular(8, 0, "/");  // erro esperado
        } catch (Exception e) {
            System.out.println("Divisão por zero -> " + e.getMessage());
        }

        // Teste de operação inválida
        try {
            calc.calcular(5, 5, "x");  // erro esperado
        } catch (Exception e) {
            System.out.println("Operação inválida -> " + e.getMessage());
        }
    }
}
