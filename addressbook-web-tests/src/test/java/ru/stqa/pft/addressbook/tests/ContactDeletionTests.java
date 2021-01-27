package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

public class ContactDeletionTests  extends TestBase{

    @Test(enabled = false)
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
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getContactHelper().selectContact(before.size() - 1);
        app.getContactHelper().deleteSelectedContacts();
        app.getContactHelper().confirmContactDeletion();
        app.getNavigationHelper().gotoHomePage();
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size() - 1);

        before.remove(before.size() - 1);
        Assert.assertEquals(before, after);
    }
}
