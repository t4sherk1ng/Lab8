public class Goat {

    private String name;
    private String gender;
    private Integer age;

    public Goat(String name, String gender, Integer age) throws Exception {
        if (name.length() > 3) {
            this.name = name;
        } else {
            throw new Exception("Имя короче 3 символов");
        }

        if (gender.toLowerCase().equals("male") || gender.toLowerCase().equals("female")) {
            this.gender = gender;
        } else {
            throw new Exception("Неверный пол");
        }

        if (age >= 0) {
            this.age = age;
        } else {
            throw new Exception("Возраст не может быть меньше 0");
        }

    }

    private int getProductivity() {
        int prod = 0;
        if (gender.toLowerCase().equals("female")) {
            if (age < 1) {
                prod = 0;
            } else if (age > 6) {
                prod = 2;
            } else {
                prod = 5;
            }
        }
        return prod;
    }

    public void addOneYear() {
        age++;
    }

    public String getInfo() {
        return "Goat " + name + " gives " + getProductivity() + " liters of milk per day";
    }
}
