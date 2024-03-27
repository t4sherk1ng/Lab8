public class Icosahedron {

    private int edge;

    Icosahedron(int edge) {
        this.edge = Math.abs(edge);
    }

    public int getFacesArea() {
        return (int) Math.round(Math.sqrt(edge * 3 / 2 * Math.pow((edge * 3 / 2 - edge), 3))); //формула Герона
    }

    public int getArea() {
        return (int) Math.round(5 * Math.pow(edge, 2) * Math.sqrt(3));
    }

    public int getVolume() {
        return (int) Math.round((5 * (3 + Math.sqrt(5)) / 12 * Math.pow(edge, 3)));
    }

    public int getEdge() {
        return edge;
    }
}
