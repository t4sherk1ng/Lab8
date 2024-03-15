public class Goat {

    private String name;
    private String gender;
    private Integer age;

    public Goat(String name, String gender, Integer age) throws Exception {
        this.setName(name);
        this.setGender(gender);
        this.setAge(age);
    }

    private void setName(String name) throws Exception {
        if (name.length() > 3) {
            this.name = name;
        } else {
            throw new Exception("Имя короче 3 символов");
        }
    }

    private void setGender(String gender) throws Exception {
        if (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female")) {
            this.gender = gender;
        } else {
            throw new Exception("Неверный пол");
        }
    }

    private void setAge(Integer age) throws Exception {
        if (age >= 0) {
            this.age = age;
        } else {
            throw new Exception("Возраст не может быть меньше 0");
        }
    }

    private int getProductivity() {
        int prod = 0;
        if (gender.equalsIgnoreCase("female")) {
            if (age >= 1 && age <= 6) {
                prod = 5;
            } else if (age > 6) {
                prod = 2;
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
