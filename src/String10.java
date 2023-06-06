import java.util.Scanner;

public class String10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi ký tự");
        String str = scanner.next();
        System.out.println("Nhập ký tự muốn thay thế");
        String character = scanner.next();
        System.out.println("Nhập vị trí muốn thay thế");
        int number = scanner.nextInt();
        System.out.println(str.replace(character, number));
    }
}
