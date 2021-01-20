package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase{

    @Test
    public void testContactModification(){
        app.getNavigationHelper().gotoHomePage();
        if (! app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact(new ContactData("Alex", "Vladimirovich", "Maloenko",
                    "sleepyhead", "title1", "company1", "Moscow, Russia",
                    "111", "89160001122", "232", "123",
                    "maloenko@mail.ru", "mail1@mail.ru", "mail2@mai.ru", "ttt.com",
                    "29", "December", "1996",
                    "17", "October", "2000",
                    "test1",
                    "123", "123", "123"));
        }
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("Sonya", "Vladimirovna", "Maloenko",
                "sleepyhead", "title2", "company2", "Moscow, Russia",
                "111", "89160001122", "232", "123",
                "maloenko@mail.ru", "mail1@mail.ru", "mail2@mai.ru", "ttt.com",
                "29", "December", "1996",
                "17", "October", "2000",
                null,
                "321", "321", "321"), false);
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnHomePage();

    }
}
