public class Main {
    public static void main(String[] args) throws Exception {
//        Icosahedron ico = new Icosahedron(2);
//        System.out.println("Faces area = " + ico.getFacesArea());
//        System.out.println("Area = " + ico.getArea());
//        System.out.println("Volume = " + ico.getVolume());

        Goat goat = new Goat("Dereza", "Female", 3);
        System.out.println(goat.getInfo());
        goat.addOneYear();
        goat.addOneYear();
        goat.addOneYear();
        goat.addOneYear();
        System.out.println(goat.getInfo());
    }
}