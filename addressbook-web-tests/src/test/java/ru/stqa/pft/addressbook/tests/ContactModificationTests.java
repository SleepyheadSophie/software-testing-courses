package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.List;

public class ContactModificationTests extends TestBase{

    @Test (enabled = false)
    public void testContactModification(){
        app.goTo().homePage();
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
        app.getContactHelper().initContactModification(before.size() - 1);
        ContactData contact = new ContactData("Sonya", "Vladimirovna", "Maloenko",
                "sleepyhead", "title2", "company2", "Moscow, Russia",
                "111", "89160001122", "232", "123",
                "maloenko@mail.ru", "mail1@mail.ru", "mail2@mai.ru", "ttt.com",
                "29", "December", "1996",
                "17", "October", "2000",
                null,
                "321", "321", "321");
        app.getContactHelper().fillContactForm(contact, false);
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnHomePage();
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size());

        before.remove(before.size() - 1);
        before.add(contact);
        Comparator<? super ContactData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId());
        before.sort(byId);
        after.sort(byId);
        Assert.assertEquals(before, after);
    }
}
