package Com.Brigedlab;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
        public class AddressBook {
        Scanner scanner = new Scanner(System.in);

        List<Contacts> contactList = new ArrayList<Contacts>();

        public void addContacts() {

            Contacts contacts = new Contacts();

            System.out.println("Enter FirstName ");
            String firstName = scanner.next();
            contacts.setFirstName(firstName);
            System.out.println("Enter LastName ");
            String lastName = scanner.next();
            contacts.setLastName(lastName);
            System.out.println("Enter Address ");
            String address = scanner.next();
            contacts.setAddress(address);
            System.out.println("Enter City ");
            String city = scanner.next();
            contacts.setCity(city);
            System.out.println("Enter State ");
            String state = scanner.next();
            contacts.setState(state);
            System.out.println("Enter Email ");
            String email = scanner.next();
            contacts.setEmail(email);
            System.out.println("Enter Zip  ");
            String zip = scanner.next();
            contacts.setZip(zip);
            System.out.println("Enter Mobile No  ");
            String mobile = scanner.next();
            contacts.setMobileNo(mobile);

            contactList.add(contacts);

        }

        public void editContacts() {

            System.out.println("Enter First Name ");
            String firstName = scanner.next();

            boolean isAvailable = false;
            for (Contacts contact : contactList)
            {
                if (firstName.equalsIgnoreCase(contact.getFirstName()))
                {
                    isAvailable = true;
                    System.out.println("Enter LastName ");
                    String lastName = scanner.next();
                    contact.setLastName(lastName);
                    System.out.println("Enter Address ");
                    String address = scanner.next();
                    contact.setAddress(address);
                    System.out.println("Enter City ");
                    String city = scanner.next();
                    contact.setCity(city);
                    System.out.println("Enter State ");
                    String state = scanner.next();
                    contact.setState(state);
                    System.out.println("Enter Email ");
                    String email = scanner.next();
                    contact.setEmail(email);
                    System.out.println("Enter Zip  ");
                    String zip = scanner.next();
                    contact.setZip(zip);
                    System.out.println("Enter Mobile No  ");
                    String mobile = scanner.next();
                    contact.setMobileNo(mobile);
                }
            }
            if (!isAvailable)
                System.out.println("Contact Name Not Found ");
        }


        public void deleteContacts(){
            System.out.println("Enter First Name ");
            String firstName = scanner.next();

            boolean isAvailable = false;
            for (Contacts contact :contactList) {
                if (firstName.equalsIgnoreCase(contact.getFirstName())) {
                    isAvailable = true;
                    contactList.remove(contact);
                    System.out.println("Contact Deleted :");
                    break;
                }
            }
            if(!isAvailable){
                System.out.println("Contact Name Not Found ");
            }

        }

        public void showContacts()
        {

            for (Contacts contact : contactList) {
                if (contact.getFirstName() == null) {
                    System.out.println("Contact Details not Available ");
                } else {
                    System.out.println("First Name " + contact.getFirstName());
                    System.out.println("Last name " + contact.getLastName());
                    System.out.println("Address " + contact.getAddress());
                    System.out.println("City " + contact.getCity());
                    System.out.println("Email " + contact.getEmail());
                    System.out.println("Mobile No " + contact.getMobileNo());
                    System.out.println("State " + contact.getState());
                    System.out.println("Zip Code " + contact.getZip());
                }
            }
        }
        }

