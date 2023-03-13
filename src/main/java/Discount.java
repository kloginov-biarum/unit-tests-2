public class Discount {

//на каждую вторую покупку скидка 2%
//после 18:00 +2%
//int i - номер покупки
//int after18 (0, 1) - после 18 или нет

    public int getDiscountValue(int i, int after18){
        int discountValue = 0;
        if (i<=0){
            System.out.println("Purchase number could not be negative value");
        }

        if(i%2 == 0 && after18 == 0 ){
            return 2;
        } else if (i%2 == 0 && after18 == 1 ){
            return 4;
        } else if (i%2 == 1 && after18 == 1 ){
            return 2;
        } else {
            return discountValue;
        }

    }
}
