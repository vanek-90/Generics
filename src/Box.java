import java.util.ArrayList;

public class Box<T> {

    private T val;

    public Box(T arg) {

        val = arg;
    }

    public String toString() {
        return (String) val;
    }

    static ArrayList object = new ArrayList();

    /* Метод для задания 1.Положить в коробку. Так как используем ArrayList, то проверки на добавление не нужны*/
    public void putObject(T arg) {
        object.add(new Box(arg));
    }

    /*Метод для задания 2.Забрать из коробки. Сделано 2 проверки
     * 1. Если введен индекс > чем существует элементов
     * 2. Если введен отрицательный индекс*/
    public void takeObject(int index) {
        if (index >= object.size())
            System.out.println("Введено число больше, чем существует элементов." +
                    " Крайний номер элемента " + (object.size() - 1));
        if (index < 0)
            System.out.println("Индекс должен быть больше 0");
        else
            System.out.println("Из коробки забрали объект " + object.get(index));
    }

    /*Метод для задания 3 Удалить из коробки.  Сделано 2 проверки
     * 1. Если введен индекс > чем существует элементов
     * 2. Если введен отрицательный индекс*/
    public void delObject(int index) {
        if (index >= object.size())
            System.out.println("Введено число больше, чем существует элементов." +
                    " Всего элементов " + (object.size()));
        else if (index < 0)
            System.out.println("Индекс должен быть больше 0");
        System.out.println("");
        System.out.println("Список до удаления " + object);
        Object temp = object.get(index);
        object.remove(index);
        System.out.println("Список после удаления " + object);
        System.out.println("Был удален объект " + temp);
        System.out.println("");
    }
}



