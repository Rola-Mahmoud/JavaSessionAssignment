package Session2;

public class TwoNumberSwapping {
    public static void main(String[] args) {
//        int a = 10, b =20;
//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.println(a); // 20
//        System.out.println(b); //10
        int a = 10, b =20;
        a = a + b; //30
        b = a - b; //10
        a = a - b; //20
        System.out.println(a);// 20
        System.out.println(b);// 10
    }
}
