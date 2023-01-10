import java.util.Scanner;

/* Crie utilizando tudo que aprendeu até o momento, uma pirâmide de números, onde você deve imprimir em cada linha separada a quantidade 
   de números que está sendo iterado no momento! Por exemplo, se a sua iteração for de 1 a 5 ficaria assim o resultado final: */

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho da sua pirâmide - valor inteiro maior que 0");

        int n = sc.nextInt();

        System.out.println(" ---------- Pirâmide ----------");

        for (int i = 1; i <= n; i++) {
            if (n == 1) {
                System.out.println(n);
                break;
            }
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        sc.close();
    }
}
