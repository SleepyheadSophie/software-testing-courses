package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.Groups;

import java.util.Set;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class AddContactToGroupTests extends TestBase{

    @BeforeMethod
    public void ensurePreconditions(){
        if (app.db().contacts().size() == 0){
            app.goTo().homePage();
            app.contact().create(new ContactData()
                    .withFirstname("Alex").withMiddlername("Vladimirovich").withLastname("Maloenko")
                    .withBday("29").withBmonth("December").withByear("1996").withAday("17").withAmonth("October").withAyear("2000"));
        }

        ContactData contact = app.db().contacts().iterator().next();

        if (app.db().groups().size() == 0 | contact.getGroups().size() == app.db().groups().size()) {
            app.goTo().groupPage();
            app.group().create(new GroupData().withName("newAddedGroup"));
        }
    }

    @Test
    public void testAddingContactToGroup() throws InterruptedException {
        ContactData modifiedContact = app.db().contacts().iterator().next();
        Groups groups = app.db().groups();
        GroupData requiredGroup = new GroupData();

        for (GroupData group : groups) {
            if (!modifiedContact.getGroups().contains(group)) {
                requiredGroup = group;
            }
        }
        System.out.println("Группа");
        System.out.println(requiredGroup);

        Set<GroupData> before = modifiedContact.getGroups();
        System.out.println(before);
        app.goTo().homePage();
        app.contact().addToGroup(modifiedContact, requiredGroup);
        Set<GroupData> after = modifiedContact.getGroups();
        System.out.println(after);
        //assertThat(after, equalTo(before.remove(requiredGroup)));
    }
}
