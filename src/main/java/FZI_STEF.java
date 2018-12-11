import java.util.Scanner;

public class FZI_STEF {
    public static void main(String[] args) {

        Scanner stephenSings = new Scanner(System.in);
        int numberOfShows = stephenSings.nextInt();
        Integer max = 0;

        if (numberOfShows > 0 && numberOfShows < 100000) {
            int[] tour = new int[numberOfShows];

            for (int i = 0; i < numberOfShows; i++) {
                int profit = stephenSings.nextInt();

                if (profit <= 100000 && profit >= -100000) {
                    tour[i] = profit;
                }
            }
            for (int i = 0; i < tour.length; i++) {
                max += tour[i];
            }
            for (int i = 0; i < tour.length; i++) {
                for (int j = i; j < tour.length; j++) {
                    Integer supportMax = 0;
                    for (int k = i; k <= j; k++) {
                        supportMax += tour[k];
                        if (supportMax > max) {
                            max = supportMax;
                        }
                    }
                }
            }
            if(max<0){
                max=0;
            }
            System.out.println(max);
        }
    }
}
