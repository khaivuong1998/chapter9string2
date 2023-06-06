import java.util.Scanner;

public class String7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi thứ nhất");
        String str1 = scanner.next();
        System.out.println("Nhập chuỗi thứ hai");
        String str2 = scanner.next();
        if (str1.endsWith(str2)) {
            System.out.println("Chuỗi thứ nhất kết thúc được bắt đầu bằng ký tự của chuỗi thứ hai");
        } else {
            System.out.println("Chuỗi thứ nhất kết thúc không phải bắt đầu bằng ký tự của chuỗi thứ hai");
        }
    }
}
