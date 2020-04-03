public class Main {
    public static void main(String[] args){
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
//        System.out.println("Mini " + myMinFloatValue);
//        System.out.println("MAX " + myMaxFloatValue);


        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
//        System.out.println("Double Mini " + myMinDoubleValue);
//        System.out.println("Double MAX " + myMaxDoubleValue);


        int myIntValue = 5/2;
        // int cannot handle decimal
        float myFloatInt = 5f /2f;
        double myDouble = 5d /2d;
//        System.out.println("Int " + myIntValue);
//        System.out.println("Float " + myFloatInt);
//        System.out.println("double " + myDouble);

        double numberOfPound = 200;
        double convertedKilograms = numberOfPound * 0.45359237;
        System.out.println(convertedKilograms);
    }


}
