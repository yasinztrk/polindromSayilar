public class Main {

    static boolean isPolindrom(int number) {
        int temp, lastNumber, reserveNumber = 0;
        temp = number;
        while (temp != 0) {
            lastNumber = temp % 10;
            reserveNumber = (reserveNumber * 10) + lastNumber;
            temp /= 10;

        }
        if (reserveNumber == number) {
            return true;
        } else {
            return false;
        }


    }

    public static void main(String[] args) {
        System.out.println(isPolindrom(9889));

    }
}