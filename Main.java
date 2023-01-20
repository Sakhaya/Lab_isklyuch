public class Main {
    public static void main(String[] args) throws MyExt {

        System.out.println("Hello world!");
        Generic mas = new Generic();
        System.out.println("Добавить элемент 2");
        mas.Add(2);

        System.out.println("Добавить элемент 2");
        mas.Add(2);
        mas.Print();

        System.out.println("Умножить все элементы контейнера");
        mas.Print();
        System.out.println(mas.Multi());

        System.out.println("Удалить элемент 2");
        mas.Delete(2);
        mas.Print();

        System.out.println("Удалить элемент 8");
        mas.Delete(8);
        mas.Print();

        System.out.println("Удалить элемент 2");
        mas.Delete(2);
        mas.Print();

        System.out.println("Удалить элемент 7");
        mas.Delete(7);



        for (int i = 0; i < 15; i++){
            mas.Add(i);
            mas.Print();
        }

        System.out.println("Умножить все элементы контейнера");
        mas.Print();
        System.out.println(mas.Multi());

    }
}