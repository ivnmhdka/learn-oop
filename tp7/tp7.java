/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tp7;

/**
 *
 * @author Ivan
 */
public class tp7 {

    public static void main(String[] args) {
        HomePage home = new HomePage("Home");
        DashboardPage dashboard = new DashboardPage("Dashboard");
        
        System.out.println("====== HomePage Sebelum Login ======\n");
        home.showFullPage();

        System.out.println("\n====== DashboardPage Sebelum Login ======\n");
        dashboard.showFullPage();

        System.out.println();
        home.login("Ivan");

        System.out.println("\n====== HomePage Setelah Login ======\n");
        home.showFullPage();

        System.out.println();
        dashboard.login("Ivan");

        System.out.println("\n====== DashboardPage Sesudah Login ======\n");
        dashboard.showFullPage();
    }
}
