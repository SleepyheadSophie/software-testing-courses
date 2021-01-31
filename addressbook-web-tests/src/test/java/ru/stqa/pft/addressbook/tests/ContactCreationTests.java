package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreationTests() {
        app.goTo().homePage();
        Contacts before = app.contact().all();
        ContactData contact = new ContactData()
                .withFirstname("Alex").withMiddlername("Vladimirovich").withLastname("Maloenko")
                .withBday("29").withBmonth("December").withByear("1996").withAday("17").withAmonth("October").withAyear("2000").withGroup("test1");
        app.contact().create(contact);
        Contacts after = app.contact().all();
        assertThat(after.size(), equalTo(before.size() + 1));
        assertThat(after, equalTo(before.withAdded(
                contact.withId(after.stream().mapToInt((c) -> c.getId()).max().getAsInt()))));
    }

}
