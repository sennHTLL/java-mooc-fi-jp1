package jpi.constructor;

public class Money {
    private final int tenge;
    private final int tiyn;

    public Money(int tenge, int tiyn) {
        this.tenge = tenge;
        this.tiyn = tiyn;
    }

    public int tenge() { return tenge; }
    public int tiyn() { return tiyn; }

    public Money plus(Money addition) {
        Money newMoney = new Money(tenge + addition.tenge(), 
                                   tiyn + addition.tiyn());
        return newMoney;
    }

    public Money minus(Money decreaser) {
        Money newMoney = new Money(tenge, tiyn);

        int newTenge = newMoney.tenge() - decreaser.tenge();
        int newTiyn = newMoney.tiyn() - decreaser.tiyn();

        if (newTiyn < 0) {
            newTiyn += 100;
            newTenge--;
        }

        if (newTenge < 0) {
            return new Money(0, 0);
        }

        return new Money(newTenge, newTiyn);
    }

    public boolean lessThan(Money compared) {
        if (tenge() == compared.tenge()) {
            if (tiyn() < compared.tiyn()) {
                return true;
            }
        } else if (tenge() < compared.tenge()) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        String zero = "";
        if (tiyn < 10) { zero = "0"; }
        return tenge + "." + zero + tiyn + "tg";
    }
}
