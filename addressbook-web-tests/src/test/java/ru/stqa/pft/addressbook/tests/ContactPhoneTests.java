package ru.stqa.pft.addressbook.tests;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class ContactPhoneTests extends TestBase{

    @BeforeMethod
    public void ensurePreconditions(){
        app.goTo().homePage();
        if (app.contact().all().size() == 0){
            app.contact().create(new ContactData()
                    .withFirstname("Alex").withMiddlername("Vladimirovich").withLastname("Maloenko")
                    .withBday("29").withBmonth("December").withByear("1996").withAday("17").withAmonth("October").withAyear("2000").withGroup("test1")
                    .withHomeTel("111").withMobileTel("222").withWork("333"));
        }
    }

    @Test
    public void testContactCreationTests() {
        ContactData contact = app.contact().all().iterator().next();
        ContactData contactInfoFromEditForm = app.contact().infoFromEditForm(contact);
        assertThat(contact.getHomeTel(), equalTo(cleaned(contactInfoFromEditForm.getHomeTel())));
        assertThat(contact.getMobileTel(), equalTo(cleaned(contactInfoFromEditForm.getMobileTel())));
        assertThat(contact.getWork(), equalTo(cleaned(contactInfoFromEditForm.getWork())));
    }

    public String cleaned(String phone){
        return phone.replaceAll("\\s","").replaceAll("[-()]","");
    }
}
