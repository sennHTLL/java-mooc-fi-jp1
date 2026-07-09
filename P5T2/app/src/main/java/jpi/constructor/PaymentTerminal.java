package jpi.constructor;

public class PaymentTerminal {

    private double money;
    private int affordableMeals;
    private int heartyMeals;
    private double affordableMealCost;
    private double heartyMealCost;

    public PaymentTerminal(double money, int affordableMeals, int heartyMeals,
                           double affordableMealCost, double heartyMealCost) {
        this.money = money;
        this.affordableMeals = affordableMeals;
        this.heartyMeals = heartyMeals;
        this.affordableMealCost = affordableMealCost;
        this.heartyMealCost = heartyMealCost;
    }

    public PaymentTerminal() {
        this(1000, 0, 0, 2.5, 4.3);
    }

    public double eatAffordably(double payment) {
        if (payment >= this.affordableMealCost) {
            this.money += this.affordableMealCost;
            affordableMeals++;
            return payment - this.affordableMealCost;
        } else { 
            return this.money; 
        }
    }

    public double eatHeartily(double payment) {
        if (payment >= this.heartyMealCost) {
            this.money += this.heartyMealCost;
            heartyMeals++;
            return payment - this.heartyMealCost;
        } else { 
            return this.money; 
        }
    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.balance() >= this.affordableMealCost) {
            affordableMeals++;
            card.takeMoney(this.affordableMealCost);
            return true;
        } else {
            return false;
        }
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.balance() >= this.heartyMealCost) {
            heartyMeals++;
            card.takeMoney(this.heartyMealCost);
            return true;
        } else {
            return false;
        }
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        card.addMoney(sum);
    }

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
