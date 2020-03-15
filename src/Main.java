import java.util.*;

public class Main {
    public static void main(String[] args) {
        Box<String> value = new Box<String>("В эту коробку можно положить только объекты типа String");
        System.out.println(value);

        value.putObject("Кот"); // Кладем в коробку 3 предмета
        value.putObject("Мышь");
        value.putObject("Ручка");
        try {
            value.takeObject(2);// Забираем из коробки элемент
            value.delObject(1);//Удаляем из коробки элемент
            value.delObject(1);
            value.delObject(0);
            value.delObject(2);
            value.delObject(0);
        } catch (IndexOutOfBoundsException ArrayIndexOutOfBoundsException) {
        }
    }
}


