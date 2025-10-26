/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7;

/**
 *
 * @author Ivan
 */
public class DashboardPage extends WebPage implements Loginable{
    
    public DashboardPage(String title) {
        super(title);
    }
    
    @Override
    public void login(String input) {
        this.loggedUsername = input;
        System.out.println(loggedUsername + " berhasil login ke hal dashboard");
    }
    
    @Override
    protected void showMainPage() {
        if (loggedUsername == null || loggedUsername.isEmpty()) {
            System.out.printf("## %-36s ##\n", "Akses ditutup untuk user guest");
            System.out.printf("## %-36s ##\n", "Mohon login terlebih dahulu");
        } else {
            System.out.printf("## %-36s ##\n", "Dashboard Page - " + loggedUsername);
            System.out.printf("## %-36s ##\n", "Opsi-opsi page dashboard");
            System.out.printf("## %-36s ##\n", "dsb");
        }
    }
}
