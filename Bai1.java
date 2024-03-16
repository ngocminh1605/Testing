public class Bai1 {
    public static int calculateProductPrice(char productType, int totalQuantity) {
        int price = -1;
        if ( totalQuantity < 1 || totalQuantity > 999) {
            return price;
        }
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
        char[] productTypes ={'A', 'A', 'A', 'A', 'A', 'A', 'A', ,'B', 'B', 'B','B', 'B', 'B', 'B'};
        int[] totalQuantities = {1, 2, 0, 500,999,1000,998,1, 2, 0, 500,999,1000,998};

        // Kiểm thử với bảng giá trị
        //char[] productTypes ={'A', 'A', 'A', 'A','B', 'B', 'B','B'};
        //int[] totalQuantities = {0,2,500,2000,0,2,500,2000};


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
