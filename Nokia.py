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
match settings_input:
case 3:  
            print("""
	      1:Chat

	       """)
 case 4:  
                print("""
                4 -> Call register
                  1: Missed calls
                  2: Received calls
                  3: Dialled numbers
                  4: Erase recent call lists
                  5: Show call duration
                  6: Show call cost
                  7: Call cost settings
                  8: Prepaid credit
                """)
call_register_input = int(input("Press 5, 6, or 7 for options or 0 to return: "))
match call_register_input:
 case 5:
                        print("""
                        5 -> Show call duration
                          1: Last call duration
                          2: All calls duration
                          3: Received calls duration
                          4: Dialled calls duration
                          5: Clear timers
                        """)
 case 6:
                        print("""
                        6 -> Show call costs
                          1: Last call cost
                          2: All calls cost
                          3: Clear counters
                        """)
 case 7:
                        print("""
                        7 -> Call cost settings
                          1: Call cost limit
                          2: Show costs in
                        """)
 case 0:
 			pass
 case _:
                   print("Invalid input. Return to main menu: ")     
 case 5: 
                print("""
                5 -> Tones
                  1: Ringing tone
                  2: Ringing volume
                  3: Incoming call alert
                  4: Composer
                  5: Message alert tone
                  6: Keypad tones
                  7: Warning and game tones
                  8: Vibrating alert
                  9: Screen saver
                """)
 case 6: 
                print("""
                6 -> Settings
                  1: Call settings
                      1: Automatic redial
                      2: Speed dialling
                      3: Call waiting options
                      4: Own number sending
                      5: Phone line in use
                      6: Automatic answer
                  2: Phone settings
                  3: Security settings
                  4: Restore factory settings
                """)
 case 7:
                print("Call divert")
 case 8:
                print("Games")
 case 9:
                print("Calculator")
 case 10:
                print("Reminders")
 case 11:
                print("Clock")
 case 12:
                print("Profiles")
 case 13:
                print("SIM services")
 case 0:  
                print("Exiting Nokia menu. Goodbye!")
                running = False
 case _:
                
