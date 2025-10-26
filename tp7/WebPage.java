/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7;

/**
 *
 * @author Ivan
 */
public class WebPage {
    private String webTitle;
    protected String loggedUsername;
    
    public WebPage(String title) {
        this.webTitle = title;
    }
    
    protected void showHeader() {
        System.out.println("########################################");
        System.out.printf("## %-36s ##\n", webTitle);
        System.out.println("## ---------------------------------- ##");
    }

    protected void showFooter() {
        System.out.println("## ---------------------------------- ##");
        System.out.printf("## %-36s ##\n", "Created by Ivan Mahadika Yanuarizqi");
        System.out.println("########################################");
    }
    
    protected void showMainPage() {
        
    }
    
    public void showFullPage() {
        showHeader();
        showMainPage();
        showFooter();
    }
}
