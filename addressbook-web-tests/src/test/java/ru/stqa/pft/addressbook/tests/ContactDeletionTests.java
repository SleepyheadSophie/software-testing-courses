package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

import static org.testng.Assert.*;

public class ContactDeletionTests  extends TestBase{

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
    public void testContactDeletion(){
        List<ContactData> before = app.contact().list();
        int index = before.size() - 1;
        app.contact().delete(index);
        List<ContactData> after = app.contact().list();
        assertEquals(after.size(), before.size() - 1);

        before.remove(index);
        assertEquals(before, after);
    }


}
