import java.util.Scanner;

public class String6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi ký tự bất kỳ");
        String str1 = scanner.next();
        String str = "dsgasjh";
        if (str.equals(str1)) {
            System.out.println("chuỗi ban đầu giống vs chuỗi đã cho");
        } else {
            System.out.println("chuỗi ban đầu khác vs chuỗi đã cho");
        }
    }
}
