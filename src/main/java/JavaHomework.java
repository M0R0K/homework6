public class JavaHomework {
    public static void main(String[] args) {
        int a = 100;
        int b = 101;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("\nВычисления: \n");
        int sum = a + b;
        System.out.println("Сложение: " + sum);
        int subtr = b - a;
        System.out.println("Вычитание:  " + subtr);
        int mult = a * b;
        System.out.println("Умножение: " + mult);
        int div = b / a;
        System.out.println("Деление: " + div);
        int remainder = b % a;
        System.out.println("Остаток от деления: " + remainder);
        System.out.println("\nCравнение: \n");
        boolean c = a < b;
        System.out.println("a<b " + c);
        boolean d = a > b;
        System.out.println("a>b " + d);
        System.out.println("\nЛогические операции: \n");
        boolean e = true;
        boolean f = false;
        System.out.println("Оператор И: "+ (e && f));
        System.out.println("Оператор ИЛИ: "+(e || f));
        System.out.println("Отрицание: "+(!e));
        System.out.println("\nТернарный оператор: \n");
        int max = (a > b) ? a : b;
        System.out.println("max = " + max);
        byte n = 20;
        byte m = 7;
        System.out.println("\nПереполнение: " + (n * m));
        double x = 6.66;
        int y = 1;
        System.out.println("\nCложение double и int: "+x + y);

    }


}
