import java.util.Scanner;

public class String5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi ký tự bất kỳ");
        String str = scanner.next();
        System.out.println("Nhập ký tự bất kỳ");
        String str1 = scanner.next();
        for (int i = 0; i < str.length(); i++) {
            if (str1 == str.charAt(i)) {
                System.out.println("Ký tự " + str1 + " có xuất hiện trong chuỗi ban đầu");
                break;
            }
        }
    }
}
