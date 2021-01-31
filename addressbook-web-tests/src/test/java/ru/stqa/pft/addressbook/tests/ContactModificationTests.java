package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.List;

import static org.testng.Assert.*;

public class ContactModificationTests extends TestBase{

    @BeforeMethod
    public void ensurePreconditions(){
        app.goTo().homePage();
        if (app.contact().list().size() == 0){
            app.contact().create(new ContactData()
                    .withFirstname("Alex").withMiddlername("Vladimirovich").withLastname("Maloenko")
                    .withBday("29").withBmonth("December").withByear("1996").withAday("17").withAmonth("October").withAyear("2000").withGroup("test1"));
        }
    }

    @Test
    public void testContactModification(){
        List<ContactData> before = app.contact().list();
        int index = before.size() - 1;
        ContactData contact = new ContactData()
                .withId(before.get(index).getId()).withFirstname("Sonya").withMiddlername("Vladimirovna").withLastname("Maloenko")
                .withBday("29").withBmonth("December").withByear("1996").withAday("17").withAmonth("October").withAyear("2000");
        app.contact().modify(contact, index);
        List<ContactData> after = app.contact().list();

        assertEquals(after.size(), before.size());
        before.remove(index);
        before.add(contact);
        Comparator<? super ContactData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId());
        before.sort(byId);
        after.sort(byId);
        assertEquals(before, after);
    }


}
