public class Bai1 {
    public static int calculateProductPrice(char productType, int totalQuantity) {
        int price = 0;
        if (productType == 'A') {
            if (totalQuantity >= 100) {
                price = 100000;
            } else {
                price = 150000;
            }
        } else if (productType == 'B') {
            if (totalQuantity >= 100) {
                price = 200000;
            } else {
                price = 250000;
            }
        }
        return price;
    }

    public static void main(String[] args) {
        // Kiểm thử với các trường hợp biên
        char[] productTypes = {'A', 'A', 'A', 'A', 'B', 'B', 'B', 'B'};
        int[] totalQuantities = {1, 99, 100, 999, 1, 99, 100, 999};

        for (int i = 0; i < productTypes.length; i++) {
            int price = calculateProductPrice(productTypes[i], totalQuantities[i]);
            if (price != -1) {
                System.out.println("Product Type: " + productTypes[i] + ", Total Quantity: " + totalQuantities[i] + ", Price: " + price + " VND");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
