public class Main {
    public static void main(String[] args) {
        int currentAmount = 123;
        int replenishmentAmount = 1150;
        int bonus;
    if (replenishmentAmount > 1000) {
        bonus = replenishmentAmount / 100;
    } else {
            bonus = 0;
    }
    int totalAmount = currentAmount + replenishmentAmount + bonus;

        System.out.println(totalAmount);
    }
}
