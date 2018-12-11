import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PA05_POT {
    public static void main(String[] args) throws java.lang.Exception {

        Scanner scanNumber = new Scanner(System.in);
        List<BigInteger> listOfPower = new ArrayList<BigInteger>();

        int numberOfCases = scanNumber.nextInt();
        if (numberOfCases > 0 && numberOfCases < 10) {

            for (int i = 0; i < numberOfCases; i++) {

                Integer base = scanNumber.nextInt();
                Integer exponent = scanNumber.nextInt();
                boolean getPowerGoing = base > 0 && base <= 1000000000 && exponent > 0 && exponent <= 1000000000;

                if (getPowerGoing) {

                    BigInteger power = BigInteger.valueOf(base).pow(exponent);
                    listOfPower.add(power);
                }
            }
        }

        for (int i = 0; i < listOfPower.size(); i++) {

            String powerString = listOfPower.get(i).toString();
            System.out.println(powerString.charAt(powerString.length()-1));
        }
    }
}
