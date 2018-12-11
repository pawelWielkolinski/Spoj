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
            if (fanSize <= 200 && fanSize != 0) {
                fan = new String[fanSize * 2][fanSize * 2];
                int length = fan.length;
                if (fanSize == 1) {
                    for (int i = 0; i < length; i++) {
                        for (int j = 0; j < length; j++) {
                            fan[i][j] = "*";
                        }
                    }
                    listOfFans.add(fan);
                }
                if (fanSize > 1) {
                    for (int i = 0; i < length; i++) {
                        for (int j = 0; j < length; j++) {
                            boolean angles = j == 0 && (i == 0 || i == length - 1) || j == length - 1 && (i == 0 || i == length - 1);
                            boolean core = i==fanSize && (j==fanSize || j == fanSize-1) || i == fanSize-1 && (j==fanSize || j == fanSize-1);
                            if (angles || core) {
                                fan[i][j] = "*";
                            }
                            if(!angles && !core){
                                fan[i][j]="?";
                            }
                        }
                    }
                    listOfFans.add(fan);
                }
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
