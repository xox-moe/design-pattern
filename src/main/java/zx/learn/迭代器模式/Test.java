package zx.learn.迭代器模式;

public class Test {
    public static void main(String[] args) {
        TVChanneMenu tvMenu = new TVChanneMenu();
        FilmMenu filmMenu = new FilmMenu();

        MainMenu mainMenu = new MainMenu(tvMenu, filmMenu);
        mainMenu.printMenu();
    }
}