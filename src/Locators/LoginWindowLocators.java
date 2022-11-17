package Locators;

import org.openqa.selenium.By;

public class LoginWindowLocators {

    public static By element1 = By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div/div/div[2]/button[2]/div");
    public static By usernameBox = By.name("login");
    public static By acceptCookies = By.id("diffuse-cookie-notice");
    public static By  loginButton = By.linkText("Login");
    public static By passwordBox =  By.name("password");
}