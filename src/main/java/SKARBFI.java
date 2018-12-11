import java.util.*;

public class SKARBFI {

    public static void main(String[] args) {

        Scanner clueScanner = new Scanner(System.in);
        int numberOfDataSets = clueScanner.nextInt();
        List<String> result = new ArrayList<String>();

        if (numberOfDataSets <= 50 && numberOfDataSets > 0) {

            for (int i = 0; i < numberOfDataSets; i++) {
                Integer numberOfCluePairs = clueScanner.nextInt();
                Integer northSouth = 0;
                Integer eastWest = 0;

                if (numberOfCluePairs >= 0 && numberOfCluePairs <= 100000) {

                    for (int j = 0; j < numberOfCluePairs; j++) {
                        Integer direction = clueScanner.nextInt();
                        Integer steps = clueScanner.nextInt();

                        if (direction >= 0 && direction <= 3 && steps <= 10000 && steps >= 1) {
                            switch (direction) {
                                case 0:
                                    northSouth += steps;
                                    break;
                                case 1:
                                    northSouth -= steps;
                                    break;
                                case 2:
                                    eastWest += steps;
                                    break;
                                case 3:
                                    eastWest -= steps;
                                    break;
                            }
                        }
                    }
                }
                if (northSouth == 0 && eastWest == 0) {
                    result.add("studnia");
                }
                if (northSouth > 0) {
                    result.add(0 + " " + northSouth);
                }
                if (northSouth < 0) {
                    result.add(1 + " " + Math.abs(northSouth));
                }
                if (eastWest > 0) {
                    result.add(2 + " " + eastWest);
                }
                if (eastWest < 0) {
                    result.add(3 + " " + Math.abs(eastWest));
                }
            }
        }

        for(int i = 0;i<result.size();i++){
            System.out.println(result.get(i));
        }

    }
}
