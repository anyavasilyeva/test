package main.task02;

public class Task1 {
    public static void main(String[] args) {
        for(int i = 2; i <= 100; i ++){
            boolean isPrime = true;

            for(int j = 3; j < i; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                System.out.println(i);
            }

    }
    }
}
//простые числа - это те числа, которые имеют только Два делителя
// просто числа