import java.awt.*;
import  java.util.Scanner ;
public class Main {
    public static void main(String[] args) {
        float width ;
        float height ;
        Scanner scanner = new Scanner(System.in) ; // cach khai bao 1 doi tuong ten la scaner
        System.out.println(" nhap chieu rong: ");
        width = scanner.nextFloat();
        System.out.println("nhap chieu cao: ");
        height = scanner.nextFloat();
        float area = width * height ;
        System.out.println("area="+area);
    }
}