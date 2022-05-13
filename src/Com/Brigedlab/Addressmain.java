package Com.Brigedlab;

import java.util.Scanner;
    public class Addressmain
        {

        public static void main(String[] args) {
            AddressBook addressBook = new AddressBook();
            int choice=0;
            int number = 0;
            //Scanner scanner=new Scanner(System.in);
            do {

                System.out.println("Address Book Details..");
                System.out.println("1: ADD NEW CONTACT ");
                System.out.println("2: EDIT CONTACT ");
                System.out.println("3: DELETE CONTACT");
                System.out.println("4: DISPLAY CONTACT  ");
                System.out.println("5: Exit ");
                System.out.println("Enter Operation Number ");
                choice = addressBook.scanner.nextInt();
                switch (choice) {
                    case 1:
                        addressBook.addContacts();
                        break;
                    case 2:
                        addressBook.editContacts();
                        break;
                    case 3:
                        addressBook.deleteContacts();
                        break;
                    case 4:
                        addressBook.showContacts();
                        break;
                    case 5:
                        System.out.println("Thank You for Using Address Book");
                        break;
                    default:
                        System.out.println("Enter Operation Number ");
                        break;
                }
            }   while (choice!=5);
        }
    }

