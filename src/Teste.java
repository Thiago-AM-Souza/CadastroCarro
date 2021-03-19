import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numVeiculos;

        System.out.println("Quantos veículos você quer cadastrar?");
        numVeiculos = input.nextInt();

        Carro[] carrinhos = new Carro[numVeiculos];

        for(int j = 0; j < numVeiculos; j++) {
            carrinhos[j] = new Carro();
            System.out.print("\nInsira a marca do veículo: ");
            carrinhos[j].marca = input.next();

            System.out.println("\nInsira o modelo do veículo: ");
            carrinhos[j].modelo = input.next();

            System.out.println("\nInsira o ano do veículo: ");
            carrinhos[j].ano = input.nextInt();
        }

        System.out.println("\n\n");

        for(int k = 0; k < numVeiculos; k++) {
            System.out.println(carrinhos[k].marca);
            System.out.println(carrinhos[k].modelo);
            System.out.println(carrinhos[k].ano);
            System.out.println("\n");
        }

        input.close();
    }
}
