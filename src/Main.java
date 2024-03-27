public class Main {
    public static void main(String[] args) throws Exception {


//        Goat goat = new Goat("Dereza", "Female", 3);
        Goat goat = new Goat(null, null, 3);
        System.out.println(goat.getInfo());
        goat.addOneYear();
        goat.addOneYear();
        goat.addOneYear();
        goat.addOneYear();
        System.out.println(goat.getInfo());


    }
}