import java.util.Scanner;

public class Nokia {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        boolean running = true;

        while (running) {
            // Main menu
            String prompt = """
                    Welcome to Nokia

                    Press:
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
                    """;
 System.out.println(prompt);
 System.out.print("Enter your choice: ");
 int userInput = inputCollector.nextInt();

switch (userInput) {
case 1: // phone book
 System.out.println("""

 1-> PHONE BOOK

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
  """);

 System.out.print("Enter your choice 8 to see options or 0 to return): ");
 int phoneBookInput = inputCollector.nextInt();
 if (phoneBookInput == 8) {
   System.out.println("""
 8 -> Options
   1: Type of view
   2: Memory status
   0: Back to menu
 """);

} 

 break;

  case 2: // Message
 System.out.println("""
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
     """);
 System.out.print("Enter 7 to see Message settings submenu or 0 to return: ");
  int messageInput = inputCollector.nextInt();
  if (messageInput == 7) {
 System.out.println("""
7 -> Message settings
   1: Set 1
   2: Common
   0:Back to menu
 """);
 System.out.print("Enter 1 or 2 to see submenu or 0 to return: ");
 int settingsInput = inputCollector.nextInt();
 switch (settingsInput) {
 case 1:
 System.out.println("""
 1 -> Set 1
  1: Message center number
  2: Message sent as
  3: Message validity
 """);
 break;
 case 2:
 System.out.println("""
 2 -> Common
   1: Delivery reports
   2: Reply via same center
   3: Character support
 """);
 break;
 default:
 System.out.println("Invalid input. Returning to main menu.");
 }
 }
break;

case 3: // Chat
 System.out.println("Chat");
 break;

 case 4: // Call register
 System.out.println("""
 4 -> Call register
   1: Missed calls
   2: Received calls
   3: Dialled numbers
   4: Erase recent call lists
   5: Show call duration
   6: Show call cost
7: Call cost settings
 8: Prepaid credit
 """);
 System.out.print("Press 5, 6, or 7 for options or 0 to return: ");
 int callRegisterInput = inputCollector.nextInt();
 switch (callRegisterInput) {
case 5:
 System.out.println("""
 5 -> Show call duration
   1: Last call duration
   2: All calls duration
   3: Received calls duration
   4: Dialled calls duration
   5: Clear timers
 """);
 break;
 case 6:
 System.out.println("""
 6 -> Show call costs
    1: Last call cost
    2: All calls cost
    3: Clear counters
  """);
break;
case 7:
 System.out.println("""
  7 -> Call cost settings
    1: Call cost limit
    2: Show costs in
""");
 break;
 default:
 System.out.println("Invalid input. Returning to main menu.");
 }
 break;

 case 5: // Tones
  System.out.println("""
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
  """);
break;
case 6: // Settings
System.out.println("""
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
  """);
 break;

                case 7:
                    System.out.println("Call divert");
                    break;

                case 8:
                    System.out.println("Games");
                    break;

                case 9:
                    System.out.println("Calculator");
                    break;

                case 10:
                    System.out.println("Reminders");
                    break;

                case 11:
                    System.out.println("Clock");
                    break;

                case 12:
                    System.out.println("Profiles");
                    break;

                case 13:
                    System.out.println("SIM services");
                    break;

                case 0: // Exit
                    System.out.println("Exiting Nokia menu. Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid input. Please try again.");
            }
        }
        
    }
}