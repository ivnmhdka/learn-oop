/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7;

/**
 *
 * @author Ivan
 */
public class HomePage extends WebPage implements Loginable {
    
    public HomePage(String title) {
        super(title);
    }
    
    @Override
    public void login(String input) {
        this.loggedUsername = input;
        System.out.println("Selamat datang di halaman home, " + loggedUsername + "!");
    }
    
    @Override
    protected void showMainPage() {
        if (loggedUsername == null || loggedUsername.isEmpty()) {
            System.out.printf("## %-36s ##\n", "Selamat datang");
            System.out.printf("## %-36s ##\n", "Anda sedang berada di home page");
            System.out.printf("## %-36s ##\n", "Ini penjelasan umum home page");
        } else {
            System.out.printf("## %-36s ##\n", "Selamat datang, " + loggedUsername + "!");
            System.out.printf("## %-36s ##\n", "Anda sedang berada di home page");
            System.out.printf("## %-36s ##\n", "Ini penjelasan umum home page");
        }
    }
}
