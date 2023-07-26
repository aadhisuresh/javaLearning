package refresher;

public class AverageOfElements {
        public static void main(String[] args) {
            int num[] = {1,2,3,4,5,6};
            double sum = 0;
            int i = 0;
            AverageOfElements obj = new AverageOfElements();
            obj.Average(num, sum, i);
            obj.Average1(num, sum, i);
        }
        public int[] Average(int num[], double sum, int i){
            for(i = 0; i < num.length; i++){
                sum += num[i];
            }
            double Average = sum/num.length;
            System.out.println(Average);
            return num;
        }
        public void Average1(int[] num, double sum,int i){
            for(i = 0; i < num.length; i++){
                sum += num[i];
            }
            double Average = sum/num.length;
            System.out.println(Average);
        }
}
