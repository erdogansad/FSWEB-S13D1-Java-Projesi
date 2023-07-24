import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------------------");
        boolean sWUpOne = shouldWakeUp(true, 3);
        boolean sWUpTwo = shouldWakeUp(false, 2);
        boolean swUpThree = shouldWakeUp(true, 8);
        boolean sWUpFour = shouldWakeUp(true, -1);
        System.out.printf(
                "shouldWakeUp(true, 3) = %s\nshouldWakeUp(false, 2) = %s\nshouldWakeUp (true, 8) = %s\nshouldWakeUp(true, -1) = %s\n",
                sWUpOne, sWUpTwo, swUpThree, sWUpFour);

        boolean hTOne = hasTeen(9, 99, 19);
        boolean hTTwo = hasTeen(23, 15, 42);
        boolean hTThree = hasTeen(22, 23, 34);
        System.out.printf("hasTeen(9, 99, 19) = %s\nhasTeen(23, 15, 42) = %s\nhasTeen(22, 23, 34) = %s\n", hTOne, hTTwo,
                hTThree);

        boolean cPOne = isCatPlaying(true, 10);
        boolean cPTwo = isCatPlaying(false, 36);
        boolean cPThree = isCatPlaying(false, 35);
        System.out.printf("isCatPlaying(true, 10) = %s\nisCatPlaying(false, 36) = %s\nisCatPlaying(false, 35) = %s\n",
                cPOne, cPTwo, cPThree);

        double areaOne = area(5.0, 4.0);
        double areaTwo = area(-1.0, 4.0);
        System.out.printf("area(5.0, 4.0) = %s\narea(-1.0, 4.0) = %s\n", areaOne,
                areaTwo);

        String areaCOne = areaC(5.0);
        String areaCTwo = areaC(-1.0);
        System.out.printf("areaC(5.0) = %s\nareaC(-1.0) = %s\n", areaCOne,
                areaCTwo);
        System.out.println("--------------------------------------------------------------------");

    }

    static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
            return true;
        } else {
            return false;
        }
    }

    static boolean hasTeen(int ageOne, int ageTwo, int ageThree) {
        if ((ageOne > 13 && ageOne < 20) || (ageTwo > 13 && ageTwo < 20) || (ageThree > 13 && ageThree < 20)) {
            return true;
        } else {
            return false;
        }
    }

    static boolean isCatPlaying(boolean season, int temperature) {
        if (!season && (temperature >= 25 && temperature <= 35)) {
            return true;
        } else if (season && (temperature >= 25 && temperature <= 45)) {
            return true;
        } else {
            return false;
        }
    }

    static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1;
        } else {
            return (x * y);
        }
    }

    static String areaC(double x) {
        if (x < 0) {
            return String.valueOf(-1);
        } else {
            return String.format("%.5f", x * x * Math.PI);
        }
    }
}