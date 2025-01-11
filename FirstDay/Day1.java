public class Day1 {
    public static int add(int a, int b){
        return a+b;
    }
    public static int sub(int a, int b){
        return a-b;
    }
    public static int mul(int a, int b){
        return a*b;
    }
    public static int div(int a, int b){
        return a/b;
    }
    public static void main(String[] args) {
        System.out.println("After addition : " +add(3,5));
        System.out.println("After subtraction : " +sub(8,5));
        System.out.println("After multiplication : " +mul(5,6));
        System.out.println("After division : "+div(6,2));
    }
}
