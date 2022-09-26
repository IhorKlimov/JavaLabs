package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/*
 * Варіант 1
 * */
public class Lab2 {
    public static void main(String[] args) throws IOException {
        ArrayList<CuratorJournalEntry> list = new ArrayList<>();

        while (true) {
            System.out.println("Please enter student data separated by coma in this order: Last name, First name, birth date (DD.MM.YYYY), phone number, address");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String data = reader.readLine();
            String[] split = data.split(",");
            CuratorJournalEntry entry = parseEntry(split);

            if (entry == null) {
                System.out.println("Wrongly formatted data. Would you like to try again? Enter Y or N");
                if (getBinaryAnswer()) {
                    continue;
                }
            } else {
                list.add(entry);
                System.out.println("Saved your input. Would you like to enter one more? Enter Y or N");
                if (getBinaryAnswer()) {
                    continue;
                }
            }

            System.out.println("Would you like to print all the entries? Enter Y or N");
            if (getBinaryAnswer()) {
                for (CuratorJournalEntry curatorJournalEntry : list) {
                    System.out.println(curatorJournalEntry);
                }
            } else {
                System.out.println("Done...");
            }
            return;
        }
    }

    private static CuratorJournalEntry parseEntry(String[] input) {
        if (input.length != 5) {
            return null;
        }

        if (input[0].length() == 0) {
            return null;
        }
        if (input[1].length() == 0) {
            return null;
        }
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date date;
        try {
            date = format.parse(input[2]);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }

        if (input[3].length() < 10) {
            return null;
        }

        if (input[4].length() == 0) {
            return null;
        }

        return new CuratorJournalEntry(input[0], input[1], date, input[3], input[4]);
    }

    private static boolean getBinaryAnswer() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                String data = reader.readLine();
                if (data.equalsIgnoreCase("y")) {
                    return true;
                } else if (data.equalsIgnoreCase("n")) {
                    return false;
                }
            } catch (IOException e) {
                // NOOP
            }
            System.out.println("Come again?");
        }
    }
}
