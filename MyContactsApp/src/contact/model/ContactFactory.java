package contact.model;



import contact.model.Organization.OrganizationBuilder;
import contact.model.Person.PersonBuilder;

/**
 * Factory class to create users based on their type
 */
public class ContactFactory {
	
	public static Person createPersonContact(OrganizationBuilder organizationBuilder) {
		return new Person(organizationBuilder);
	}
	
	public static Organization createOrganizationContact(OrganizationBuilder builder) {
		return new Organization(builder);
	}
}