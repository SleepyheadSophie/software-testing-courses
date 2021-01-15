package ru.stqa.pft.addressbook;

import org.testng.annotations.*;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreationTests() {
        gotoContactCreationPage();
        fillContactCreationForm(new ContactData("Alex", "Vladimirovich", "Maloenko",
                "sleepyhead", "title1", "company1", "Moscow, Russia",
                "111", "89160001122", "232", "123",
                "maloenko@mail.ru", "mail1@mail.ru", "mail2@mai.ru", "ttt.com",
                "29", "December", "1996",
                "17", "October", "2000",
                "test1",
                "123", "123", "123"));
        submitContactCreation();
        gotoHomePage();
    }

}
