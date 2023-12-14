import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingresa la base del cuadrilatero: ");
        double base = scanner.nextDouble();
        System.out.println("Por favor ingresa la altura del cuadrilatero: ");
        double altura = scanner.nextDouble();

        if (base == altura) {
            System.out.println("Es cuadrado");
        } else {
                System.out.println("Es rectangulo");
            }
// la formula para encontrar el perimetro de un cuadrilatero (cuadrado o rectangulo) es P = 2 X (BASE + ALTURA)
        double perimetro = 2 * (base + altura);
        System.out.println("El perimetro es: "+ perimetro);
// la formula para encontrar la superficie de un cuadrilatero (cuadrado o rectangulo) es S = BASE X ALTURA
        double superficie = base * altura;
        System.out.println("la superficie es "+ superficie);

        }
    }

