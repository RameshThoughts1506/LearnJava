package basics;

public class OddSquareNumbers {
    public static void main(String[] args) {
        oddSquare();
    }

    public static void oddSquare(){
        for (int i=1; i<=10; i=i+2){
            System.out.println(i*i);
        }
    }
}
