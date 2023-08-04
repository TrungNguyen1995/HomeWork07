import entities.Student;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter ID:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Name:");
        String name = scanner.nextLine();
        System.out.println("Enter Age:");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Address:");
        String address = scanner.nextLine();
        System.out.println("Enter Point:");
        Double point = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter Classroom:");
        String classroom = scanner.nextLine();
        Student student =new Student(id,name,age,address,point,classroom);
        System.out.println("danh sách sinh viên: "+student.toString());
//        Thêm học sinh mới
        System.out.println("Mời bạn nhập số học sinh muốn thêm vào:");
        int n = Integer.parseInt(scanner.nextLine());
        Student [] students = new  Student[n];
        for (int i = 0; i < students.length; i++) {
            Student value = new Student(id,name,age,address,point,classroom);
             students [i] = value;
        }
        System.out.println(""+ Arrays.toString(students));
    }
}