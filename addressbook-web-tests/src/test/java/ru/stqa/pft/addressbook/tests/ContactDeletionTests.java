package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactDeletionTests  extends TestBase{

    @Test
    public void testContactDeletion(){
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
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectedContacts();
        app.getContactHelper().confirmContactDeletion();
        app.getNavigationHelper().gotoHomePage();
    }
}
