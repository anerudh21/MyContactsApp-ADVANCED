package contact.model;



import contact.model.Organization.OrganizationBuilder;
import contact.model.Person.PersonBuilder;

/**
 * Factory class to create users based on their type
 */
public class EmailAddress {
	
	public static Person createPersonContact(PersonBuilder builder) {
		return new Person(builder);
	}
	
	public static Organization createOrganizationContact(OrganizationBuilder builder) {
		return new Organization(builder);
	}
}
