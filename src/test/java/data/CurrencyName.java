package data;

public enum CurrencyName {

    RUB("Российский рубль"),
    BYN("Белорусский рубль"),
    KZT("Казахстанский тенге"),
    AMD("Армянский драм"),
    KGS("Киргизский сом"),
    UZS("Узбекский сум");

    private final String name;
    CurrencyName(String name) {

        this.name = name;
    }

    public String getCurrency() {

        return name;
    }
}


