package refresher;

public class ProductOfElement {
        public static void main(String[] args) {
            int Num[] = {1,2,3,4,5,6};
            int Pro = 1;
            int i = 0;
            ProductOfElement obj = new ProductOfElement();
            obj.Product(Num,Pro,i);
            obj.Product1(Num,Pro,i);
        }
        public int Product(int [] Num, int Pro, int i){
            for(i = 0; i < Num.length; i++){
                Pro = Pro * Num[i];
            }
            System.out.println(Pro);
            return Pro;
        }
        public void Product1(int [] Num, int Pro, int i){
        for(i = 0; i < Num.length; i++){
            Pro = Pro * Num[i];
        }
        System.out.println(Pro);
        }
}
