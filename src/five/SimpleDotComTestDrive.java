package five;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        // Создаем экземпляр класса SimpleDotCom
        SimpleDotCom dot = new SimpleDotCom();
        // массив местоположения сайта
        int[] locations = {2,3,4};
        // Вызываем сеттер сайта
        dot.setLocationCells(locations);
        // Делаем ход от имени пользователя
        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
        }
}
