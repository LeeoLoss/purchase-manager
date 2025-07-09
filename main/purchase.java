package compras;

// A classe Purchase representa uma compra, com descrição e valor,
// e implementa a interface Comparable para permitir ordenação por valor.
public class Purchase implements Comparable<Purchase> {

    // Atributo que guarda a descrição do produto comprado
    private String description;

    // Atributo que guarda o valor da compra
    private double value;

    // Construtor que inicializa a descrição e o valor da compra
    public Purchase(String description, double value) {
        this.description = description;
        this.value = value;
    }

    // Getter para acessar a descrição da compra
    public String getDescription() {
        return description;
    }

    // Getter para acessar o valor da compra
    public double getValue() {
        return value;
    }

    // Método sobrescrito que retorna uma representação em String da compra
    @Override
    public String toString() {
        return "Purchase [description=" + description + ", value=" + value + "]";
    }

    // Implementação do método compareTo da interface Comparable,
    // que permite comparar duas compras pelo seu valor,
    // usado para ordenar listas de compras.
    @Override
    public int compareTo(Purchase nextPurchase) {
        // Compara os valores das compras usando Double.compareTo
        return Double.valueOf(this.value).compareTo(Double.valueOf(nextPurchase.value));
    }
}
