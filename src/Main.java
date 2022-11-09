public class Main {
    public static void main(String[] args) {
        MagicBox<String> stringMagicBox = new MagicBox<>(2);

        MagicBox<Integer> integerMagicBox = new MagicBox<>(3);

        /**
         *  Строки
         */

        boolean x = stringMagicBox.add("Vasja");
        boolean y = stringMagicBox.add("Petya");
        boolean z = stringMagicBox.add("Kolya");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(stringMagicBox.pick() + "\n");

        /**
         *  Числа
         */

       /* boolean a = integerMagicBox.add(50);
        boolean b = integerMagicBox.add(132);
        boolean c = integerMagicBox.add(13);
        boolean d = integerMagicBox.add(672);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);*/
        System.out.println(integerMagicBox.pick());
    }
}
