package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;

public class GroupDeletionTests extends TestBase {

    @Test
    public void testUntitledTestCase() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroups();
        app.getNavigationHelper().returnGroupPage();
    }

}
