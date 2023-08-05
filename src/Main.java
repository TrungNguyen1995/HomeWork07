import entities.Student;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        StudentService studentService = new StudentService();
        System.out.println("danh sách sinh viên: "+studentService.createStudent(scanner));

//        Thêm học sinh mới
        System.out.println("Mời bạn nhập số học sinh muốn thêm vào:");
        int n = Integer.parseInt(scanner.nextLine());
        if (n<0){
            System.out.println("Không hợp lệ, mời bạn nhập lại");
        }
        Student [] arrStudent = new  Student[n];
        for (int i = 0; i < arrStudent.length; i++) {
            System.out.println("Sinh viên thứ "+(i+1));
            arrStudent[i] = studentService.createStudent(scanner);
        }
        System.out.println("Sinh viên mới thêm vào là: "+ Arrays.toString(arrStudent));
//        Cập nhật điểm học sinh
        System.out.println("Chọn học sinh muốn nhập điểm");
        int updatePoint = Integer.parseInt(scanner.nextLine());
        do {
            if(updatePoint<0 || updatePoint > arrStudent.length){
                System.out.println("Mời bạn nhập lại học sinh");
                continue;
            }
            do {
                System.out.println("Enter New Point");
                double newPoint = Double.parseDouble(scanner.nextLine());
                if (newPoint<0 || newPoint>10){
                    System.out.println("Điểm không hợp lệ, mời nhập lại");
                    continue;
                }
                arrStudent[updatePoint-1].setPoint(newPoint);
                break;
            }while (true);
            break;
        }
        while (true);
        System.out.println("Danh sách học sinh sau khi cập nhật điểm:"+Arrays.toString(arrStudent));
        
    }
}