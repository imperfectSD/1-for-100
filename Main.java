public class Main {
    public static void main(String[] args) {
        int current_amount = 123;
        int replenishment_amount = 1150;
        int bonus;
    if (replenishment_amount > 1000) {
        bonus = replenishment_amount / 100;
    } else {
            bonus = 0;
    }
    int total_amount = current_amount + replenishment_amount + bonus;

        System.out.println(total_amount);
    }
}
