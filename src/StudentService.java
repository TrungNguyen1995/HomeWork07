import entities.Student;

import java.util.Scanner;

public class StudentService {
    public Student createStudent(Scanner scanner){
        System.out.println("Enter Name");
        String name = scanner.nextLine();
        do {
            System.out.println("Enter Age:");
            int age = Integer.parseInt(scanner.nextLine());
            if (age<0){
                System.out.println("Tuổi không hợp lệ mời bạn nhập lại ");
                continue;
            }
            System.out.println("Enter Address");
            String  address = scanner.nextLine();
            do {
                System.out.println("Enter Point:");
                Double point = Double.parseDouble(scanner.nextLine());
                if(point <0 || point >10){
                    System.out.println("Điểm không hợp lệ mời bạn nhập lại");
                    continue;
                }
                System.out.println("Enter Classroom:");
                String classroom = scanner.nextLine();
                return new Student(name,age,address,point,classroom);
            }
            while (true);
        }while (true);
    }
}
