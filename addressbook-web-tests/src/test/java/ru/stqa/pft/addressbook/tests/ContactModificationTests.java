package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.Assert.assertEquals;

public class ContactModificationTests extends TestBase{

    @BeforeMethod
    public void ensurePreconditions(){
        if (app.db().contacts().size() == 0){
            app.goTo().homePage();
            app.contact().create(new ContactData()
                    .withFirstname("Alex").withMiddlername("Vladimirovich").withLastname("Maloenko")
                    .withBday("29").withBmonth("December").withByear("1996").withAday("17").withAmonth("October").withAyear("2000"));
        }
    }

    @Test
    public void testContactModification(){
        Contacts before = app.db().contacts();
        ContactData modifiedContact = before.iterator().next();
        ContactData contact = new ContactData()
                .withId(modifiedContact.getId()).withFirstname("Sonya").withMiddlername("Vladimirovna").withLastname("Maloenko")
                .withBday("29").withBmonth("December").withByear("1996").withAday("17").withAmonth("October").withAyear("2000");
        app.goTo().homePage();
        app.contact().modify(contact);
        assertEquals(app.contact().сount(), before.size());
        Contacts after = app.db().contacts();
        assertThat(after, equalTo(before.without(modifiedContact).withAdded(contact)));
    }
}
