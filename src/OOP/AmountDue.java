package OOP;

class AmountDue {
    static double tax = 0.12;
    static double total_due;

    double computeAmountDue(double price) {
        tax *= price;
        total_due = price + tax;
        return total_due;
    }

    double computeAmountDue(double price, double quantity) {
        tax *= price;
        total_due = (price * quantity) + tax;
        return total_due;
    }

    double computeAmountDue(double price, double quantity, double discount) {
        tax *= price;
        total_due = ((price * quantity) - discount) + tax;
        return total_due;
    }
}