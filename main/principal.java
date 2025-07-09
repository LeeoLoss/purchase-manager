package purchases;

import java.util.Collections;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário via teclado
        Scanner reading = new Scanner(System.in);

        // Solicita que o usuário informe o limite do cartão de crédito
        System.out.println("Please enter your credit card limit: ");
        double limit = reading.nextDouble();  // Lê o valor digitado pelo usuário

        // Cria um objeto CreditCard com o limite informado
        CreditCard card = new CreditCard(limit);

        int exit = 1;  // Variável de controle do loop: 1 para continuar, 0 para sair

        // Loop para registrar várias compras enquanto o usuário quiser continuar
        while(exit != 0) {
            // Solicita a descrição do produto comprado
            System.out.println("Please enter the purchased product.");
            String description = reading.next();  // Lê a descrição (uma palavra)

            // Solicita o valor da compra
            System.out.println("Please enter the amount of the purchase.");
            double value = reading.nextDouble();  // Lê o valor da compra

            // Cria um objeto Purchase com a descrição e valor informados
            Purchase purchase = new Purchase(description, value);

            // Tenta registrar a compra no cartão de crédito
            boolean purchaseCompleted = card.registerPurchase(purchase);

            if (purchaseCompleted) {
                // Se a compra foi aprovada (saldo suficiente), exibe mensagem de sucesso
                System.out.println("Purchase successful!");
                System.out.println("Enter 0 to exit or 1 to continue.");
                exit = reading.nextInt();  // Pergunta se o usuário quer continuar ou sair
            } else {
                // Se o saldo é insuficiente para a compra, exibe mensagem e encerra loop
                System.out.println("Insufficient funds");
                exit = 0;  // Sai do loop
            }
        }

        // Exibe um separador visual no console
        System.out.println("******************");
        System.out.println("PURCHASE HISTORY:\n");

        // Ordena a lista de compras pelo valor (implementação no Comparable da classe Purchase)
        Collections.sort(card.getPurchase());

        // Exibe todas as compras feitas, com descrição e valor
        for (Purchase p : card.getPurchase()) {
            System.out.println(p.getDescription() + " - " + p.getValue());
        }

        // Outro separador visual
        System.out.println("\n******************");

        // Exibe o saldo restante no cartão de crédito
        System.out.println("\nCredit card balance: " + card.getBalance());

        // Fecha o Scanner para liberar recursos
        reading.close();
    }

}
