package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends BaseHelper {

    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    public void gotoGroupPage() {
        click(By.linkText("groups"));
    }

    public void returnGroupPage() {
        click(By.linkText("group page"));
    }

    public void gotoContactCreationPage() {
        click(By.linkText("add new"));
    }

    public void returnHomePage() {
        click(By.linkText("home page"));
    }

    public void gotoHomePage() {
        click(By.linkText("home"));
    }
}
