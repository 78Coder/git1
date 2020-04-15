public class Onc {
    public static void main(String[] args) {
        boolean flag = true;
        for (int i = 2; i <= 1000; i++) {
            flag = true;
            for (int j = 2; j < Math.sqrt(i)+1 ; j++) {
                if (i % j == 0){
                    flag = false;
                    break;
                }
            }
            if (flag == false){
                continue;
            }
            System.out.println(i);
        }
    }
}
