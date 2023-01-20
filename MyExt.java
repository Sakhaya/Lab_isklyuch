public class MyExt extends Exception{

    public String ErrorAdd(){
        return "Выход за границу: array > size (контейнер переполнен)";
    }

    public String ErrorDelete(){
        return "Контейнер пуст. Невозможно удалить";
    }
    public String ErrorDeleteNum(){
        return "Такого элемента в контейнере нет";
    }
    public String ErrorMethod(){
        return "Oдин из элементов контейнера равен 0";
    }
}
