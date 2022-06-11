public class Money {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public String currency(){
        return this.currency;
    }

    public Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;

        return this.amount == money.amount &&
                currency.equals(money.currency());
    }

    @Override
    public String toString() {
        return amount + " " + currency;
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }
}
