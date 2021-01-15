package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;

public class GroupDeletionTests extends TestBase {

    @Test
    public void testUntitledTestCase() {
        app.gotoGroupPage();
        app.selectGroup();
        app.deleteSelectedGroups();
        app.gotoGroupPage();
    }

}
