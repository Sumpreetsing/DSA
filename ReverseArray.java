import java.util.Scanner;

class Reverse {
    public int n;

    Reverse(int n) {
        this.n = n;
    }

    public int[] arr = new int[20];
    public int[] temp = new int[20];
    Scanner sc = new Scanner(System.in);

    public void read() {
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element : " + (i + 1));
            arr[i] = sc.nextInt();
        }
    }

    public void reverse() {
        for (int i = 0; i < n; i++) {
            temp[i] = arr[n - i - 1];
        }
        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }
    }

    public void display() {
        System.out.println("reversed array is given by :");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

}

public class ReverseArray {

    public static void main(String[] args) {
        int n;
        System.out.println("Enter the no of elements :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Reverse r = new Reverse(n);
        r.read();
        r.reverse();
        r.display();
        sc.close();
    }
}