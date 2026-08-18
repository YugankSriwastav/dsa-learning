package searching.array;

public class BuyAndSaleStack {
    public void buyAndSale(int[]array){
        int min = 0;
        for (int i = 1; i < array.length; i++) {
            if(array[i] < array[min] ){
                min = i;
            }
        }

        if(min == array.length - 1){
            System.out.println("Profit will be nothing");
            return;
        }
        // second loop
        int max = min + 1;
        for (int i = min + 2; i < array.length; i++) {
            if(array[i]> array[max]){
                max = i;
            }
        }

        int maximum = array[max] - array[min];

        System.out.println("Buy time will be " + min + " and sale " + max +
                " then your profit will be maximum which is : " + maximum);
    }

    public static void main(String[] args) {
        int [] array = {7,4,5,3,0,5};
        BuyAndSaleStack buy = new BuyAndSaleStack();
        buy.buyAndSale(array);
    }
}
