package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.US_05_Page;
import com.trycloud.pages.US_08_DeleteFilePage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class US_8_DeleteFile_StepDefenition {

 US_08_DeleteFilePage us_08_deleteFilePage = new US_08_DeleteFilePage();
 US_05_Page us_05_page = new US_05_Page();

 @When("user click action-icon  from any {int} on the page")
 public void user_click_action_icon_from_any_file_on_the_page(Integer fileIndexNumber) {
  us_05_page.setActionIcon(fileIndexNumber);

 }
 @When("user choose the Delete f option")
 public void user_choose_the_delete_f_option() {
 us_08_deleteFilePage.actionDelete.click();


 }

 @When("the user clicks the Deleted files sub-module on the left side")
 public void the_user_clicks_the_deleted_files_sub_module_on_the_left_side() {
  BrowserUtils.sleep(4);
  us_08_deleteFilePage.deleteFiles.click();

 }

 @Then("Verify the {int} is displayed on the page.")
 public void verifyTheDeletedFileIsDisplayedOnThePage(Integer deleteFile) {

  List <String> allDeleted = new ArrayList<>();
  for(WebElement each : us_08_deleteFilePage.fileName){
    allDeleted.add(each.getText());
  }

  String fileName = us_08_deleteFilePage.filesText(deleteFile);
  assertTrue(allDeleted.contains(fileName));

  us_08_deleteFilePage.restoreIcon.click();


 }
}