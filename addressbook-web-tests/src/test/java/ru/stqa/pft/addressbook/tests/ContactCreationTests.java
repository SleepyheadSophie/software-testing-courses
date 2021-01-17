package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreationTests() {
        app.getNavigationHelper().gotoContactCreationPage();
        app.getContactHelper().fillContactCreationForm(new ContactData("Alex", "Vladimirovich", "Maloenko",
                "sleepyhead", "title1", "company1", "Moscow, Russia",
                "111", "89160001122", "232", "123",
                "maloenko@mail.ru", "mail1@mail.ru", "mail2@mai.ru", "ttt.com",
                "29", "December", "1996",
                "17", "October", "2000",
                "test1",
                "123", "123", "123"));
        app.getContactHelper().submitContactCreation();
        app.getNavigationHelper().returnHomePage();
    }

}
