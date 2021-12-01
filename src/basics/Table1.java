package basics;

public class Table1 {
    public static void main(String[] args) {
        call();
    }
    public static void call(){
        int Variable1 = 5;
        for(int Variable2 =1; Variable2<=10; Variable2++){
            int Variable3 = Variable1 * Variable2;
            System.out.println(Variable1 + " * " + Variable2 + " = " + Variable3);
        }
    }
}
