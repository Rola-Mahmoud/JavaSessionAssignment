package Session2;

public class Operators {
    public static void main(String[] args) {
//        //Arithmetic Operations  +  -  *  /  %
//        int a = 20, b = 10;
//        System.out.println("The Addition of a and b is " + (a + b));
//        System.out.println("The Substraction of a and b is " + (a - b));
//        System.out.println("The Multiplication of a and b is " + (a * b));
//        System.out.println("The Division of a and b is " + (a / b));
//        System.out.println("The Reminder of a and b is " + (a % b));

//        //Relational / Comparison Day2.Operators  >  >=  <  <=  ==  !=
//        int a = 20, b = 10;
//        System.out.println(a > b); //true
//        System.out.println(a >= b); //true
//        System.out.println(a < b); //false
//        System.out.println(a <= b); //false
//        System.out.println(a == b); //false
//        System.out.println(a != b); //true

//        //Logical Day2.Operators  &&  ||  !
//        boolean x = true,y=false;
//        System.out.println(x&&y); //false
//        System.out.println(x||y); //true
//        System.out.println(!x); //false
//        System.out.println(!y); //true

        //Increment & Decrement Day2.Operators  --sometimes depends on compiler
//        int a = 10;
//        int b = a++; //Post Increment
//        System.out.println(a); // 11
//        System.out.println(b); //10

//        int a = 10;
//        int b = ++a; //Pre Increment
//        System.out.println(a); // 11
//        System.out.println(b); //11


//        //Assignments Day2.Operators  =  +=  -=  *=  /=  %=
//        int a = 10;
//        a += 5; // a = a + 5 -> 15
//        a -= 5; // a = a - 5 -> 10
//        a *= 5; // a = a * 5 -> 50
//        a /= 5; // a = a / 5 ->10
//        a %= 5; // a = a % 5 -> 0
//        System.out.println(a); // 0

//        //Ternary / Conditional Operator   Var = exp ? true : false
//        int age = 20;
//        String vote = age > 18? "Eligible":"Not Eligible";
//        System.out.println(vote);

        int age = 20;
        String vote;
        if (age > 18) {
            vote = "Eligible";
        } else {
            vote = "Not Eligible";
        }
        System.out.println(vote);
    }
}