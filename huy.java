import java.io.*;
import java.util.Scanner;
import java.math.*;
public class kiểm {

    public static void main(String[] args) {
        int[] a;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n: ");
        n = scanner.nextInt();
        /*khởi tạo mảng
         */
        a = new int[n];
        nhap(a,n);
        xuat(a,n);
        /*In ra min max
         */
        System.out.println("Min: " + min(a,n));
        System.out.println("Max: " + max(a,n));
        /*in so nguyen to ra màn hình
         */
        System.out.print("Cac so nguyen to la: ");
        for (int i=0;i<n;i++) {
            if (check(a[i])  )
                System.out.print(a[i] + " ");
        }
        System.out.println("");
        /**gọi hàm sắp xếp
         * in hàm sau khi sắp xếp
         */
        sapxep(a,n);
        xuat(a,n);
    }
    

    
    
    
    

    
}