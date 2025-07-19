Nokia = input("""
WELCOME TO
                        
	NOKIA
		MENU 
			
		    1 -> Phone book
                    2 -> Messages
                    3 -> Chat
                    4 -> Call register
                    5 -> Tones
                    6 -> Settings
                    7 -> Call divert
                    8 -> Games
                    9 -> Calculator
                    10 -> Reminders
                    11 -> Clock
                    12 -> Profiles
                    13 -> SIM services
                    0 -> Exit
                    """)
choice = int(input("Enter your choice: "))
match choice:
	case 1: 
		print("""
           	 1 -> PHONE BOOK

           	 1: Search
            	 2: Service Nos.
            	 3: Add name
            	 4: Erase
           	 5: Edit
           	 6: Assign tone
           	 7: Send b'card
           	 8: Options
           	 9: Speed dials
            	10: Voice tags
           	0: Back to menu
           	 """)
		phone_book_input = int(input("Enter your choice 8 to see options or 0 to return: "))
		match phone_book_input:
              	   case 8:
                       print("""
                       8 -> Options
                       1: Type of view
                       2: Memory status
                       0: Back to menu
                       """)
	case 2:  
            print("""
            2 -> Messages
            1: Write messages
            2: Inbox
            3: Outbox
            4: Picture messages
            5: Templates
            6: Smileys
            7: Message settings
            8: Info service
            9: Voice mailbox number
            10: Service command editor
            0: Back to menu
            """)
message_input = int(input("Enter 7 to see Message settings submenu or 0 to return: "))
match message_input:
                case 7:
                    print("""
                    7 -> Message settings
                    1: Set 1
                    2: Common
                    0: Back to menu
                    """)
settings_input = int(input("Enter 1 or 2 to see submenu or 0 to return: "))
match settings_input:
                        case 1:
                            print("""
                            1 -> Set 1
                            1: Message center number
                            2: Message sent as
                            3: Message validity
                            """)
                        case 2:
                            print("""
                            2 -> Common
                            1: Delivery reports
                            2: Reply via same center
                            3: Character support
                            """)
print("Invalid input. Returning to main menu.")
 case 3:  
            print("""
	      1:Chat

	       """)	

