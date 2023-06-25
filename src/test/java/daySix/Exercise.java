package daySix;

public class Exercise {
//    1. Write a program which will use if conditional statement to verify the value
//    of a variable, if value doesn’t match any condition it’ll print a message.
//    Ex: “Else block has been executed”

    public void exer1() {
        int age = 10;

        if(age > 15) {
            System.out.println("if block");
        }
        else {
            System.out.println("else block");
        }

    }

//2. Write a nested if where country is equal to USA, else print -> no
//    language.
//            Nested if should have below conditions
//if state is equal to NY -> print “You’re a survivor”
//            else if state is equal to NJ -> print “You’re a peace lover”

    public void exer2(String country, String state) {

        // parent if
        if (country.equals("USA")) {

            // child if
            if(state.equals("NY")) {
                System.out.println("You're a survivor");
            }
            else if(state.equals("NJ")) {
                System.out.println("You're a peace lover");
            }
        }
        else {
            System.out.println("no comments");
        }
    }

    public static void main(String[] args) {
        Exercise e = new Exercise();
        e.exer2("USA", "NY");
    }
}
