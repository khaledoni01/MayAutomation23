package daySix;

public class ConditionalsClass {

    int a = 19;

    public void demo() {
        String country = "USA";

        switch (country){

            case "UK":
                System.out.println("kjafskf");
            case "USA":
                System.out.println("List of state's capital");
            case "NY":
                System.out.println("Albany");
            case "NJ":
                System.out.println("Newark");
            default:
                System.out.println("No more capital");
        }
    }

    public static void main(String[] args) {
        ConditionalsClass cc = new ConditionalsClass();
        cc.demo();
    }

}
