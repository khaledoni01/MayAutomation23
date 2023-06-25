package stringArrayPkg;

import java.util.Arrays;

public class StringArrayCls {

    public void strExample() {

        String[] states = {"NY", "NJ", "TX", "CT"};

        for(int i=0; i<states.length; i++) {
            System.out.println(states[i]);
        }

//        for(String s : states) {
//            System.out.println(s);
//        }

//        String[] states = new String[4];
//        states[0] = "NY";
//        states[1] = "NJ";
//        states[2] = "TX";
//        states[3] = "KT";
//
//        states[2] = "PA";
//        System.out.println(states[2]);


//        System.out.println(Arrays.toString(states));


//        System.out.println(states[0]);
//        System.out.println(states[1]);
//        System.out.println(states[2]);
//        System.out.println(states.length);

//        String specialStr = "They are called \t'Vikings'";
//
//        System.out.println(specialStr);

//        System.out.println("string".toUpperCase());
//
//        System.out.println("STRING".toLowerCase());
//
//        System.out.println("String".indexOf("i")); //3
//
//        System.out.println("String".concat(" ").concat("String"));
//        System.out.println("String" + " " + 10);
    }
    public void exOne(String arg) {
        System.out.println( arg.toUpperCase() );
    }
//
//2.
//    i. Write a method which takes an array of int
//    ii. Array can contain 3 values
//    iii. Add all the values
//    iv. Return the total.

    public int total(int[] args) {

        int t = 0;

        for(int i=0; i<args.length; i++) {
            t = t + args[i];
        }
        return t;
    }
//    for(int v : args) {
//        t = t + v; // 60
//    }


    public static void main(String[] args) {
        StringArrayCls strArrCls = new StringArrayCls();

        int[] values = {10, 20, 30};
        System.out.println( strArrCls.total(values) );

    }

}
