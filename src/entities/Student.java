package entities;

public class Student {
    public Student( String name, int age, String address, double point, String classroom) {
        this.id = ++studentId;
        this.name = name;
        this.age = age;
        this.address = address;
        this.point = point;
        this.classroom = classroom;
    }

    public static int studentId;
    private int id;
    private String name;
    private int age;
    private String address;
    private double point;
    private String classroom;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    @Override
    public String toString() {
        return "Danh sách học sinh:{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", point=" + point +
                ", classroom='" + classroom + '\'' +
                '}';
    }
}
