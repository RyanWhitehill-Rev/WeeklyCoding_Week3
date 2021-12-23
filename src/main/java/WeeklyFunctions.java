

public class WeeklyFunctions {

    public static void main(String args[]) {


        System.out.println(isHeteromecic(0));
        System.out.println(isHeteromecic(2));
        System.out.println(isHeteromecic(7));
        System.out.println(isHeteromecic(110));
        System.out.println(isHeteromecic(136));
        System.out.println(isHeteromecic(156));

        System.out.println(happy(11));
        System.out.println(happy(107));
        System.out.println(happy(203));

    }


    public static boolean isHeteromecic(int intIn) {

        double root = Math.sqrt((double) intIn);

        double flooredRoot = Math.floor(root);
        double downOne = flooredRoot -1;
        double upOne = flooredRoot + 1;


        if(flooredRoot*downOne == intIn || flooredRoot*upOne == intIn) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean happy(int intIn) {

        String stringIn = Integer.toString(intIn);

        int newSum = 0;

        for(int i = 0; i < stringIn.length(); i++) {
            int singleInt = Character.getNumericValue(stringIn.charAt(i));
            newSum += (singleInt*singleInt);
        }

        if(newSum == 1) {
            return true;
        } else if (newSum == 4) {
            return false;
        } else {
            return happy(newSum);
        }

    }



}


