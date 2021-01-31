package coms.krome.app.ws.ui.model.response.request;

import javax.validation.constraints.NotNull;

public class UpdateUserDetailsRequestModel {
	@NotNull(message = "First name can't be left empty")
	private String firstName;
	@NotNull(message = "Last name can't be left empty")
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
