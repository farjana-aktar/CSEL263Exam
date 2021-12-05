//Task-1: Indentation done.
//Task-2: Wrong argument correction done.
//Task-3: Improvements to variable names done.
//Task-4: Refactors duplicate file read and write logic into methods done.
//Task-5: Replaces string literals with constants, storing those constants in a new class called Constants java done.
//Task-6: Temporary variables are removed.
T//ask-7: Eliminates the ‘done’ control-flow variable. Adds better response for search operation.
//Task-8: Simplifies the logic behind the count operation.
//Task-9: Adds handling for case when user enters invalid arguments.
//Task-10: Add more comments and makes more naming improvements.


import java.io.*;
import java.text.*;
import java.util.*;

public class StudentList {
    public static void main(String[] args) {

//		Check arguments
        if (args[0].equals("a")) {
            System.out.println("Loading data ...");
            // :) :) :)
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("students.txt")));
                String readLine = bufferedReader.readLine();
                String i[] = readLine.split(",");
                for (String j : i) {
                    System.out.println(j);

            } catch (Exception e) {
            }
            System.out.println("Data Loaded.");
        } else if (args[0].equals("r")) {
            System.out.println("Loading data ...");
            //:D :D :D
            try {
                BufferedReader s = new BufferedReader(new InputStreamReader(new FileInputStream("students.txt")));
                String readline = s.readLine();
                System.out.println(readline);
                String i[] = readline.split(",");
                Random x = new Random();
                int y = x.nextInt();
                System.out.println(i[y]);
            } catch (Exception e) {
            }
            System.out.println("Data Loaded.");
        } else if (args[0].contains("+")) {
            System.out.println("Loading data ...");
            //:( :( :(
            try {
                BufferedWriter s = new BufferedWriter(new FileWriter("students.txt", true));
                String t = args[0].substring(1);
                Date d = new Date();
                String df = "dd/mm/yyyy-hh:mm:ss a";
                DateFormat dateFormat = new SimpleDateFormat(df);
                String fd = dateFormat.format(d);
                s.write(", " + t + "\nList last updated on " + fd);
                s.close();
            } catch (Exception e) {
            }

            System.out.println("Data Loaded.");
        } else if (args[0].contains("?")) {
            System.out.println("Loading data ...");
            //:| :| :|
            try {
                BufferedReader s = new BufferedReader(new InputStreamReader(new FileInputStream("students.txt")));
                String r = s.readLine();
                String i[] = r.split(",");

                String t = args[0].substring(1);
                for (int idx = 0; idx < i.length && !done; idx++) {
                    if (i[idx].equals(t)) {
                        System.out.println("We found it!");
                    }
                }
            } catch (Exception e) {
            }
            System.out.println("Data Loaded.");
        } else if (args[0].contains("c")) {
            System.out.println("Loading data ...");
            //:B :B :B
            try {
                BufferedReader s = new BufferedReader(new InputStreamReader(new FileInputStream("students.txt")));
                String D = s.readLine();
                char a[] = D.toCharArray();
                boolean in_word = false;
                int count = 0;
                for (char c : a) {
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