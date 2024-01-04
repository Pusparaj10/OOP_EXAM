package Model;

public class Order {
        // Fields
         String name;
         String phoneNumber;
         String[] items;
         double[] prices;


        public Order(String name, String phoneNumber, String[] items, double[] prices) {
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.items = items;
            this.prices = prices;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    public double[] getPrices() {
        return prices;
    }

    public void setPrices(double[] prices) {
        this.prices = prices;
    }

    // Method to print the bill with VAT and total price
        public void printBill() {
            double vatRate = 0.13;
            double total = 0;

            System.out.println("Order details of Customer:");
            System.out.println("Name: " + name);
            System.out.println("Phone number: " + phoneNumber);
            System.out.println("Items:");

            for (int i = 0; i < items.length; i++) {
                System.out.println("   Item code: " + items[i]);
                System.out.println("   Price: " + prices[i]);
                total += prices[i];
            }

            double vat = total * vatRate;
            double totalPrice = total + vat;

            System.out.println("\nTotal Price (including VAT 13%): " + totalPrice);
        }
    }

