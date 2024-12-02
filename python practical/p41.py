def display_menu():
    print("\nContact Book Menu:")
    print("1. Add Contact")
    print("2. View Contacts")
    print("3. Delete Contact")
    print("4. Exit")

def add_contact(contact_book):
    name = input("Enter contact name: ")
    phone = input("Enter contact phone number: ")
    contact_book[name] = phone
    print(f"Contact '{name}' added.")

def view_contacts(contact_book):
    if contact_book:
        print("\nContacts:")
        for name, phone in contact_book.items():
            print(f"{name}: {phone}")
    else:
        print("No contacts available.")

def delete_contact(contact_book):
    name = input("Enter the name of the contact to delete: ")
    if name in contact_book:
        del contact_book[name]
        print(f"Contact '{name}' deleted.")
    else:
        print(f"Contact '{name}' not found.")

def main():
    contact_book = {}
    
    while True:
        display_menu()
        choice = input("Choose an option (1-4): ")
        
        if choice == '1':
            add_contact(contact_book)
        elif choice == '2':
            view_contacts(contact_book)
        elif choice == '3':
            delete_contact(contact_book)
        elif choice == '4':
            print("Exiting the contact book. Goodbye!")
            break
        else:
            print("Invalid choice. Please select a valid option.")

if __name__ == "__main__":
    print("Name : Sameer\nClass : M.Sc(IT) - 3rd Sem\n")
    main()