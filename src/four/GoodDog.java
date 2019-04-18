package four;

public class GoodDog {
    private int size;
    // Возвращаем значение
    public int getSize() {
        return size;
    }
    // Принимаем аргумент и устанавливаем его значение для переменной
    public void setSize(int s) {
        size = s;
    }
    void bark() {
        if (size > 60) {
            System.out.println("Гав Гав!");
        } else if (size > 14) {
            System.out.println("Вуф Вуф!");
        } else {
            System.out.println("Тяф Тяф!");
        }
    }
}
