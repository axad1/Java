import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

class Main{
    public static void main(String args[]){
        File file = new File("data.txt");

        while(true){
            System.out.println("----------\n1. Login\n2. Register\n3. Exit");
            System.out.print("Select: ");
            char choice = new Scanner(System.in).next().charAt(0);

            if(choice == '1'){
                // check file exists
                if(!file.exists()){
                    System.out.println("\tEmpty");
                    return;
                }
                // input username & password
                String username, password, un, pw;
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter username: ");
                username = scanner.nextLine();
                System.out.print("Enter password: ");
                password = scanner.nextLine();
                try{
                    // read from file
                    scanner = new Scanner(file);
                    boolean found = false;
                    while(scanner.hasNextLine()){
                        un = scanner.nextLine();
                        pw = scanner.nextLine();
                        // check username
                        if(username.compareTo(un) == 0){
                            // check password
                            if(password.compareTo(pw) == 0){
                                System.out.println("\tWelcome " + un + "!");
                            }else{
                                System.out.println("\tPassword Incorrect");
                            }
                            found = true;
                            break;
                        }
                    }
                    // false login
                    if(!found){
                        System.out.println("\tFalse Login");
                    }
                }catch(Exception e){
                    System.out.println("File error");
                }
            }

            else if(choice == '2'){
                String username, password, un, pw;
                // input username
                System.out.print("Enter username: ");
                username = new Scanner(System.in).nextLine();
                // check if user already exist
                try{
                    // check file exists
                    if(!file.exists()){
                        file.createNewFile();
                    }
                    // read from file
                    Scanner scanner = new Scanner(file);
                    boolean found = false;
                    while(scanner.hasNextLine()){
                        un = scanner.nextLine();
                        // skip password line
                        pw = scanner.nextLine();
                        // check username
                        if(username.compareTo(un) == 0){
                            System.out.println("\tUser already exist");
                            found = true;
                            break;
                        }
                    }
                    if(found)
                    continue;
                }catch(Exception e){
                    System.out.println("Read Error");
                }
                // input password
                System.out.print("Enter password: ");
                password = new Scanner(System.in).nextLine();
                // write to file
                try{
                    // append file
                    FileWriter writer = new FileWriter(file, true);
                    writer.write(username + "\n");
                    writer.write(password + "\n");
                    writer.close();
                    System.out.println("\tRegister Successfully!");
                }catch(Exception e){
                    System.out.println("Writer Error");
                }
            }

            else if(choice == '3'){
                return;
            }

            else{
                System.out.println("\twrong input");
                continue;
            }
        }
    }
}