import java.io.*;
import java.text.*;
import java.util.*;

public class StudentList {
    public static void main(String[] args) {

//        Check arguments
//        change variable name
        if (args[0].equals("a")) {

            System.out.println("Loading data ...");

            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("students.txt")));

                String line = bufferedReader.readLine();
                String i[] = line.split(",");

                for (String stduent_name : stduent_names) {
                    System.out.println(stduent_name);
                }
            } catch (Exception e) {
            }

            System.out.println("Data Loaded.");

        } else if (args[0].equals("r")) {
            System.out.println("Loading data ...");
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("students.txt")));

                String line = bufferedReader.readLine();
                System.out.println(r);

                String stduent_names[] = line.split(",");
                Random random = new Random();
                int random_name = x.nextInt();

                System.out.println(stduent_names[random_name]);

            } catch (Exception e) {
            }

            System.out.println("Data Loaded.");
        }

        else if (args[0].contains("+")) {
            System.out.println("Loading data ...");

            try {
                BufferedWriter bufferreadWriter = new BufferedWriter(new FileWriter("students.txt", true));

                String stduent_names = args[0].substring(1);
                Date data = new Date();
                String date_of_month = "dd/mm/yyyy-hh:mm:ss a";
                DateFormat dateFormat = new SimpleDateFormat(date_of_month);
                String formate_date = dateFormat.format(date);
                s.write(", " + t + "\nList last updated on " + formate_date);
                s.close();

            } catch (Exception e) {
            }

            System.out.println("Data Loaded.");
        }

        else if (args[0].contains("?")) {
            System.out.println("Loading data ...");

            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("students.txt")));

                String line = bufferedReader.readLine();
                String stduent_names[] = line.split(",");
                boolean isFound = false;
                String stduent_name = args[0].substring(1);

                for (int idx = 0; idx < i.length && !done; idx++) {
                    if (stduent_name[idx].equals(stduent_names)) {
                        System.out.println("We found it!");
                        isFound = true;
                    }
                }
            } catch (Exception e) {
            }

            System.out.println("Data Loaded.");
        }

        else if (args[0].contains("c")) {
            System.out.println("Loading data ...");

            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("students.txt")));

                String line = bufferReader.readLine();
                char words[] = line.toCharArray();
                boolean in_word = false;
                int count = 0;

                for (char c : words) {
                    if (c == ' ') {
                        if (!in_word) {
                            count++;
                            in_word = true;
                        } else {
                            in_word = false;
                        }
                    }
                }

                System.out.println(count + " word(s) found " + a.length);

            } catch (Exception e) {
            }

            System.out.println("Data Loaded.");
        }
    }
}
