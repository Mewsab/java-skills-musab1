public class PayrollCalculator {

    public static double calculateWeeklyPay(String employeeType, double hoursWorked, double hourlyRate) {

        if (hoursWorked<=0){
            System.out.println("There has been an invalid input, negative values");
            return 0.0;
        }
        switch (employeeType) {
            case "FULL_TIME":
                if (hoursWorked <= 40) {
                    return hoursWorked * hourlyRate;
                } else {
                    double overTime = hourlyRate * 1.5;
                    return hoursWorked * overTime;
                }

            case "PART_TIME":
                if (hoursWorked <= 25){
                    return hoursWorked * hourlyRate;
                }
                else if (hoursWorked > 25){
                    System.out.println("Part-time employee has worked over 25 hours");
                }
            case "CONTRACTOR":
                return hoursWorked * hourlyRate;

            case "INTERN":
                if (hoursWorked <= 20){
                    return hoursWorked * (hourlyRate * 0.8); //20% discount
                } else if (hoursWorked > 20) {
                    System.out.println("Intern has worked overtime, please check");
                }
            default:
                System.out.println("Invalid employee type: " + employeeType);
                return 0.0;
        }
    }
    public static double calculateTaxDeduction(double grossPay, boolean hasHealthInsurance){
        double tax = 0.0;

        if (grossPay < 500){
            tax = 0.1;
            tax = grossPay * 0.1;
        } else if (grossPay > 501 && grossPay<= 1000) {
            tax = 0.15;
            tax = grossPay * 0.15;
        } else if (grossPay > 10001 && grossPay < 2000) {
            tax = 0.2;
            tax = grossPay * 0.2;
        }
        else if(grossPay > 2000){
            tax = 0.25;
            tax = grossPay * 0.25;
        }
        if (hasHealthInsurance){
            tax -=50;
        }
        return tax;
    }

    public static void processPayroll(String[] types, double[] hours, double[] rates, String[] names) {
        int n = Math.min(Math.min(types.length, hours.length), Math.min(rates.length, names.length));
        double total = 0, maxPay = Double.MIN_VALUE, minPay = Double.MAX_VALUE;
        String maxName = "", minName = "";
        int overtimeCount = 0;

        System.out.printf("%-10s %-12s %-10s %-10s %-10s%n", "Name", "Type", "Hours", "Rate", "Pay");
        for (int i = 0; i < n; i++) {
            double pay = calculateWeeklyPay(types[i], hours[i], rates[i]);
            total += pay;
            if (pay > maxPay) { maxPay = pay; maxName = names[i]; }
            if (pay < minPay) { minPay = pay; minName = names[i]; }
            if (hours[i] > 40) overtimeCount++;
            System.out.printf("%-10s %-12s %-10.2f %-10.2f %-10.2f%n", names[i], types[i], hours[i], rates[i], pay);
        }

        System.out.println("\nSummary:");
        System.out.printf("Highest: %s ($%.2f)%nLowest: %s ($%.2f)%nAvg: $%.2f%nOvertime: %d\n",
                maxName, maxPay, minName, minPay, total / n, overtimeCount);
    }

    public static void main (String[] args){
        String[] types = {"FULL_TIME", "PART_TIME", "CONTRACTOR", "INTERN",
                "FULL_TIME"};
        double[] hours = {45, 20, 35, 15, 50};
        double[] rates = {25.0, 18.0, 40.0, 12.0, 30.0};
        String[] names = {"Alice", "Bob", "Charlie", "Diana", "Eve"};
    }


}
