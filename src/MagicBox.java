import java.util.Random;

public class MagicBox<T> {
    protected T[] items;

    protected MagicBox(int maxItems) {
        this.items = (T[]) new Object[maxItems];
    }

    protected boolean add(Object obj) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = (T) obj;
                return true;
            }
        }
        return false;
    }

    protected T pick() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException("Коробка не полна, осталось " + (items.length - i) + " 'элемент(а/ов) до заполнения");
            }
        }
        Random random = new Random();
        return items[random.nextInt(items.length)];
    }


}



