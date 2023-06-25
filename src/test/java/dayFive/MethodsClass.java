package dayFive;

public class MethodsClass {

    // user-defined methods

    // Non-return type && Non-parameterized method
    public void testMethodName() {
        int number = 20;
        System.out.println("testMethodName");
        System.out.println(number);
    }

    // Parameterized method
    public void paramMethod(int number) {
        System.out.println("Favorite Number: " + number);//hard-coded value
    }
    public void billEmail(String name, double billAmount, int accountNumber, boolean eligible) {
        if(eligible) {
            System.out.println("Hello " + name + ",\nYour bill amount is $" + billAmount + "\nYour account number is " + accountNumber);//hard-coded value
        }
    }

    // return type method
    public int returningTotalAmount() {
        return 10 + 20;
    }
//    1. Create a method with one argument/parameter which will print “Hello
//    World” in the console
//    Ex: printHello(“Hello World”);

    public void exerOne(String randStr) {
        System.out.println(randStr);
    }
//2.
//    i) Create a method which will return sum/total of two given number
//    ii) Print in the console
    public double exerTwo() {
        return 10.12 + 20.23;
    }

//3.
//    i) Create a method which will return an int
//    ii) Add 10 to it and print in the console.

    public int exerThree(int fv, int sv) {
        return fv + sv;
    }

    public static void main(String[] args) {

        MethodsClass mc = new MethodsClass();
        System.out.println( mc.exerThree(5, 10) + 10 );// 25
        System.out.println( mc.exerThree(5, 5) + 10 );// 20

//        System.out.println( mc.exerTwo() );

//        mc.exerOne("Hello World");

//        int finalOutput = mc.returningTotalAmount();
//
//        System.out.println(finalOutput * 2);
//
//        mc.billEmail("Amir", 25.56, 234342, true);

//        mc.paramMethod(5); // int number = 10;

//        mc.billEmail("Amir", 25.56, 234342, true);
//        mc.billEmail("Adeel", 26.25, 5621, false);
//        mc.billEmail("Shaki", 12.34, 9875, true);
//        mc.billEmail("KZ", 25.56, 234342, true);
//        mc.billEmail("Towhid", 26.25, 5621, false);


//        mc.testMethodName(); //invoking/calling/executing a method


    }
}
