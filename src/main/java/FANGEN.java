import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FANGEN {

    public static void main(String[] args) {

        Scanner fanGenerator = new Scanner(System.in);
        int fanSize = 0;
        String[][] fan;
        List<String[][]> listOfFans = new ArrayList<String[][]>();

        do {
            fanSize = fanGenerator.nextInt();
            if (fanSize <= 200 && !(fanSize <= 0)) {
                fan = new String[fanSize * 2][fanSize * 2];
                int length = fan.length;

                for (int i = 0; i < length; i++) {
                    for (int j = 0; j < length; j++) {
                        if (j == i
                                || i + j == 2 * fanSize - 1
                                || (i < fanSize && j < fanSize && i > j)
                                || (i >= fanSize && j >= fanSize && i < j)
                                || (i < fanSize && j >= fanSize && i < 2 * fanSize - 1 - j)
                                || (i >= fanSize && j < fanSize && j > 2 * fanSize - 1 - i)) {
                            fan[i][j] = "*";
                        } else {
                            fan[i][j] = ".";
                        }
                    }
                }
                listOfFans.add(fan);
            }

            if (fanSize >= -200 && !(fanSize >= 0)) {
                int negativeFanSize = Math.abs(fanSize);
                fan = new String[negativeFanSize * 2][negativeFanSize * 2];
                int length = fan.length;

                for (int i = 0; i < length; i++) {
                    for (int j = 0; j < length; j++) {
                        if (j == i
                                || i + j == 2 * negativeFanSize - 1
                                || (i < negativeFanSize && j < negativeFanSize && j > i)
                                || (i < negativeFanSize && j >= negativeFanSize && j > 2 * negativeFanSize - 1 - i)
                                || (i >= negativeFanSize && j < negativeFanSize && i < 2 * negativeFanSize - 1 - j)
                                || (i >= negativeFanSize && j >= negativeFanSize && i > j)) {
                            fan[i][j] = "*";
                        } else {
                            fan[i][j] = ".";
                        }
                    }
                }
                listOfFans.add(fan);
            }

        } while (fanSize != 0);

        for (String[][] tab : listOfFans) {
            for (int i = 0; i < tab.length; i++) {
                for (int j = 0; j < tab.length; j++) {
                    System.out.print(tab[i][j]);
                }
                System.out.println();
            }
            System.out.println();
        }

    }

}
