public class Main {
    public static void main(String[] args) {
        Icosahedron ico = new Icosahedron(2);
        System.out.println("Faces area = " + ico.getFacesArea());
        System.out.println("Area = " + ico.getArea());
        System.out.println("Volume = " + ico.getVolume());
    }
}