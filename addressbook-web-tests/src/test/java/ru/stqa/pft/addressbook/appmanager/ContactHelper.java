package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;

import java.util.List;

public class ContactHelper extends BaseHelper {

    private NavigationHelper navigationHelper = new NavigationHelper(wd);

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void fillContactForm(ContactData contactData, boolean creation) {
        type(By.name("firstname"), contactData.getFirstname());
        type(By.name("middlename"), contactData.getMiddlername());
        type(By.name("lastname"), contactData.getLastname());
        type(By.name("nickname"), contactData.getNickname());
        type(By.name("title"), contactData.getTitle());
        type(By.name("company"), contactData.getCompany());
        type(By.name("address"), contactData.getAddress());
        type(By.name("home"), contactData.getHomeTel());
        type(By.name("mobile"), contactData.getMobileTel());
        type(By.name("work"), contactData.getWork());
        type(By.name("fax"), contactData.getFax());
        type(By.name("email"), contactData.getEmail());
        type(By.name("email2"), contactData.getEmail2());
        type(By.name("email3"), contactData.getEmail3());
        type(By.name("homepage"), contactData.getHomepage());
        dropdownPick(By.name("bday"), contactData.getBday());
        dropdownPick(By.name("bmonth"), contactData.getBmonth());
        type(By.name("byear"), contactData.getByear());
        dropdownPick(By.name("aday"), contactData.getAday());
        dropdownPick(By.name("amonth"), contactData.getAmonth());
        type(By.name("ayear"), contactData.getAyear());
        if (creation) {
            dropdownPick(By.name("new_group"), contactData.getGroup());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }
        type(By.name("address2"), contactData.getAddress2());
        type(By.name("phone2"), contactData.getPhone2());
        type(By.name("notes"), contactData.getNotes());
    }


    public void submitContactCreation() {
        click(By.xpath("(//input[@name='submit'])"));
    }

    public void selectContact(int index) {
        wd.findElements(By.xpath("//input[@type='checkbox']")).get(index).click();
    }

    public void selectContactById(int id) {
        wd.findElement(By.xpath("//input[@id='"+id+"']")).click();
    }

    public void deleteSelectedContacts() {
        click(By.xpath("//input[@value='Delete']"));
    }

    public void confirmContactDeletion() {
        wd.switchTo().alert().accept();
    }

    public void initContactModification(int id) {
        wd.findElement(By.xpath("//input[@id='"+id+"']/../..//img[@alt='Edit']")).click();
    }

    public void submitContactModification() {
        click(By.name("update"));
    }

    public void returnHomePage() {
        click(By.linkText("home page"));
    }

    public void create(ContactData contactData) {
        navigationHelper.contactCreationPage();
        fillContactForm(contactData, true);
        submitContactCreation();
        returnHomePage();
    }

    public void modify(ContactData contact) {
        initContactModification(contact.getId());
        fillContactForm(contact, false);
        submitContactModification();
        returnHomePage();
    }

    public void delete(ContactData contact) {
        selectContactById(contact.getId());
        deleteSelectedContacts();
        confirmContactDeletion();
        navigationHelper.homePage();
    }

    public boolean isThereAContact() {
        return isElementPresent(By.name("selected[]"));
    }

    public Contacts all() {
        Contacts contacts = new Contacts();
        List<WebElement> elements = wd.findElements(By.cssSelector("tr[name = 'entry']"));
        for (WebElement element: elements){
            String lastname = element.findElement(By.cssSelector("td:nth-child(2)")).getText();
            String name = element.findElement(By.cssSelector("td:nth-child(3)")).getText();
            int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
            contacts.add(new ContactData().withId(id).withFirstname(name).withLastname(lastname));
        }
        return contacts;
    }
}
