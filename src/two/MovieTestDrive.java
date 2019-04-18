package two;

public class MovieTestDrive {
    public static void main(String[] args) {
        // Создаем объекты класса Movie
        Movie one = new Movie();
        // Устанавливаем значения полей
        one.title = "Как Прогореть на Акциях";
        one.genre = "Трагедия";
        one.rating = -2;
        Movie two = new Movie();
        two.title = "Потерянные в Офисе";
        two.genre = "Комедия";
        two.rating = 5;
        two.playIt();
    }
}
