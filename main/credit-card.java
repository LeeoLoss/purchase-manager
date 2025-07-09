package compras;

import java.util.ArrayList;
import java.util.List;

// A classe CreditCard representa um cartão de crédito com limite, saldo e lista de compras realizadas.
public class CreditCard {
    // Limite total do cartão de crédito
    private double limit;

    // Saldo atual disponível para compras
    private double balance;

    // Lista que armazena todas as compras feitas no cartão
    private List<Purchase> purchase;

    // Construtor que inicializa o limite e o saldo (saldo começa igual ao limite)
    // e cria uma lista vazia para armazenar as compras
    public CreditCard(double limit) {
        this.limit = limit;
        this.balance = limit;
        this.purchase = new ArrayList<>();
    }

    // Método para registrar uma nova compra no cartão
    public boolean registerPurchase(Purchase purchase) {
        // Verifica se o saldo atual é maior que o valor da compra
        if (this.balance > purchase.getValue()) {
            // Deduz o valor da compra do saldo disponível
            this.balance -= purchase.getValue();
            // Adiciona a co
