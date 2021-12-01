package basics;

public class Squares {
    public static void main(String[] args) {
        square();
    }

    public static void square(){
        int j = 1;
        for (int i=1; i<=10; i++){
            System.out.println(i*j);
            j++;
        }
    }
}
