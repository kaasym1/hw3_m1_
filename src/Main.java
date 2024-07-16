public class Main {
    public static void main(String[] args) {
        double[] numbers = {12.4, 23.1, -11.6, -16.8, 45.5, -53.6, 1.9, 5.7, -90.4, -78.3, 21.2, 66.6, 77.7, -88.8, 44.4};

        int kolvo = 0;
        double sum = 0;
        boolean minus = false;

        for (double num : numbers) {

            if (!minus) {
                if (num < 0) {
                    minus = true;
                }
            } else if (num > 0) {
                sum = sum + num;
                kolvo++;
            }
        }
        System.out.println(sum / kolvo);
    }
}