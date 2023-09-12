public class Multiples {
    public static void main(String[] args) {

        int amount = 0;
        for (int i = 1; i < 1000; i++) {
            boolean multipleof3 = i % 3 == 0;
            boolean multipleof5 = i % 5 == 0;

            if (multipleof3) {
                amount++;
            } else if (multipleof5) {
                amount++;
            }


        }
        return amount;


    }

}
