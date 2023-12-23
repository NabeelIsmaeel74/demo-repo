import observ.Observer;
import observ.user;
import subj.Group;
import subj.Subject;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    final static Scanner scan = new Scanner(System.in);
    static HashMap<Integer, Group> groups = new HashMap<>();
    static HashMap<Integer, user> users = new HashMap<>();

    public static void action1() {
        System.out.print("Enter user ID: ");
        int id = scan.nextInt();

        System.out.println("\n");

        if (!users.containsKey(id)) {
            users.put(id, new user(id));
        }

    }


    public static void action2() {
        System.out.print("Enter Group ID: ");

        int id = scan.nextInt();
        System.out.println("\n");

        if (!groups.containsKey(id)) {
            groups.put(id, new Group(id));
        }
    }


    public static void action3() {
        System.out.print("Enter user ID: ");
        int userID = scan.nextInt();
        System.out.println("\n");

        if (!users.containsKey(userID)) {
            System.out.println("The user not exist\n");
            return;
        }

        System.out.print("Enter Group ID: ");
        int groupID = scan.nextInt();
        System.out.println("\n");

        if (!groups.containsKey(groupID)) {
            System.out.println("The Group not exist\n");
            return;
        }

        if (!users.get(userID).userIngGroup(groupID)) {
            groups.get(groupID).addUser(users.get(userID));
            users.get(userID).joinGroup(groupID);
        }

    }


    public static void action4() {
        System.out.print("Enter user ID: ");
        int userID = scan.nextInt();
        System.out.println("\n");

        if (!users.containsKey(userID)) {
            System.out.println("The user not exist\n");
            return;
        }

        System.out.print("Enter Group ID: ");
        int groupID = scan.nextInt();
        System.out.println("\n");

        if (!groups.containsKey(groupID)) {
            System.out.println("The Group not exist\n");
            return;
        }

        if (!users.get(userID).userIngGroup(groupID)) {
            System.out.println("The user not in the group\n");
            return;
        }

        System.out.print("Enter the message: ");
        String str1 = scan.nextLine();
        String str2 = scan.nextLine() ;
        System.out.println("\n");
        groups.get(groupID).sendMessage(userID, str2);
    }


    public static void action5() {
        System.out.print("Enter user ID: ");
        int userID = scan.nextInt();
        System.out.println("\n");

        if (!users.containsKey(userID)) {
            System.out.println("The user not exist\n");
            return;
        }

        System.out.print("Enter Group ID: ");
        int groupID = scan.nextInt();
        System.out.println("\n");

        if (!groups.containsKey(groupID)) {
            System.out.println("The Group not exist\n");
            return;
        }

        users.get(userID).openGroup(groupID);
    }


    public static void main(String[] args) {

        while (true) {
            System.out.println("Choose an action:");
            System.out.println("1. Add user (provide user ID)");
            System.out.println("2. Create group (provide group ID)");
            System.out.println("3. Add user to group (provide user ID and group ID)");
            System.out.println("4. Send message to group (provide user ID and group ID)");
            System.out.println("5. let user open the chat of a group (provide user ID and group ID)");
            System.out.println("6. to end the program.\n");

            System.out.print("Enter action number : ");
            int action = scan.nextInt();

            System.out.println("\n");


            if (action == 1)
                action1();
            else if (action == 2)
                action2();
            else if (action == 3)
                action3();
            else if (action == 4)
                action4();
            else if (action == 5)
                action5();
            else if (action == 6)
                break;

            else
                System.out.println("Invalid input. Please enter a number or '6'.\n");
        }
    }

}