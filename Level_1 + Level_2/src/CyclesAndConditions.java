public class CyclesAndConditions {

    //Task4
    //Вывести на экран все нечетные числа от 1 до 100
    public void getOddNumbers (){
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }

    //Task5
    //Вывести на экран все четные числа от 1 до 50,
    // но если выводимое число кратно 10,
    // то вывести результат деления этого числа на 10
    // (результат будет 2 4 6 8 1 12 14 …)
    public void getEvenNumbers() {
        for (int i = 0; i < 50; i++) {
            if (i % 2 == 0 ) {
                int j = i;
                if (i % 10 == 0) {
                    j = i / 10;
                }
                System.out.print(j + " ");
            }
        }
    }

    //Task6
    //Вычисление факториала заданного числа X
    //(например факториал 5 = 5*4*3*2, но факториал 0 = 1)
    public void getFactorial(int n) {
        int result = 1;
        for (int i = 1; i < n+1; i++) {
            result = result * i;
        }
        System.out.println(result);
    }


}
