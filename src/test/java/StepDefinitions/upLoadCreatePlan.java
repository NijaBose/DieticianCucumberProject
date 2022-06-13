package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class upLoadCreatePlan {

	@Given("user is logged on dietiction website to test upload button")
	public void user_is_logged_on_dietiction_website_to_test_upload_button() {
	}

	@When("user lands on create new plan page")
	public void user_lands_on_create_new_plan_page() {
	}

	@Then("User should see a button with name Upload on the page")
	public void user_should_see_a_button_with_name_upload_on_the_page() {
	}
	
	@Given("user is logged on create new plan page to test with no file selected")
	public void user_is_logged_on_create_new_plan_page_to_test_with_no_file_selected() {
	}

	@When("User clicks the Upload button without selecting a document")
	public void user_clicks_the_upload_button_without_selecting_a_document() {
	}

	@Then("User should see an error message Only files with extension .pdf are allowed")
	public void user_should_see_an_error_message_only_files_with_extension_pdf_are_allowed() {
	}
	
	@Given("user is logged on create new plan page to test incorrect file format")
	public void user_is_logged_on_create_new_plan_page_to_test_incorrect_file_format() {
	}

	@When("User clicks the Upload button by selecting a non-PDF file")
	public void user_clicks_the_upload_button_by_selecting_a_non_pdf_file() {
	}

	@Then("User should get an error message Only files with extension .pdf are allowed")
	public void user_should_get_an_error_message_only_files_with_extension_pdf_are_allowed() {
	}
	
	@Given("user is logged on create new plan page to test incorrect file size")
	public void user_is_logged_on_create_new_plan_page_to_test_incorrect_file_size() {
	}

	@When("User clicks the Upload button by selecting a PDF file of size greater than 2MB")
	public void user_clicks_the_upload_button_by_selecting_a_pdf_file_of_size_greater_than_2mb() {
	}

	@Then("User should see an error message PDF File exceeding the size limit of 2MB")
	public void user_should_see_an_error_message_pdf_file_exceeding_the_size_limit_of_2mb() {
	}
	
	@Given("user is logged on create new plan page to test incorrect file format and size")
	public void user_is_logged_on_create_new_plan_page_to_test_incorrect_file_format_and_size() {
	}

	@When("User clicks the Upload button by selecting a non-pdf file of size greater than 2MB")
	public void user_clicks_the_upload_button_by_selecting_a_non_pdf_file_of_size_greater_than_2mb() {
	}

	@Then("User should be get an error message Only files with extension .pdf are allowed")
	public void user_should_be_get_an_error_message_only_files_with_extension_pdf_are_allowed() {
	}
	
	@Given("user is logged on create new plan page to test correct file format and size")
	public void user_is_logged_on_create_new_plan_page_to_test_correct_file_format_and_size() {
	}

	@When("User clicks the Upload button by selecting a pdf file of size less than 2MB")
	public void user_clicks_the_upload_button_by_selecting_a_pdf_file_of_size_less_than_2mb() {
	}

	@Then("User should see a message File uploaded succesfully")
	public void user_should_see_a_message_file_uploaded_succesfully() {
	}


}
