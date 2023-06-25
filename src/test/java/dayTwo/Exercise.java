package dayTwo;

public class Exercise {
    boolean username;
    int password;

//    public Exercise() {
//        bool = false;
//        number = 10;
//    }
    public Exercise(boolean b, int n) {
        username = b;
        password = n;
    }

    public static void main(String[] args) {

        Exercise oni = new Exercise(true, 22);

        Exercise amir = new Exercise(false, 44);

        System.out.println(oni.username);
        System.out.println(oni.password);

        System.out.println(amir.username);
        System.out.println(amir.password);
    }

}
