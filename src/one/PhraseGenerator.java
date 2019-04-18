package one;

public class PhraseGenerator {
    public static void main(String[] args) {
        String[] wordListOne = {"круглосуточный", "взаимный",
                "фронтэнд", "на основе веб-технологий",
                "метод критического пути", "динамичный"};
        String[] wordListTwo = {"чистый продукт", "ориентированный",
                "распределенный", "сетевой", "нацеленный на", "общий",
                "нестандартный ум", "фирменный"};
        String[] wordListThree = {"процесс", "тип структуры",
                "талант", "портал"};
        // Вычисляем сколько слов в каждом списке
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        // Генерируем три случайных числа
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);
        //Строим фразу
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("Всё, что нам нужно, - это " + phrase);
    }
}
