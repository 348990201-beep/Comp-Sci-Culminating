//NAME: Arjun Sahrawat
// ICS3U ISU - Project 3: Cybersecurity Awareness Certification

import java.util.ArrayList;
import java.util.Scanner;

public class CulminatingProject {

    public static void main(String[] args) {

        // scanner for user input
        Scanner sc = new Scanner(System.in);

        // admin password for accessing admin menu
        String adminPassword = "arjuniscool101";

        // these lists store questions, options, and answers for Part A
        // everything matches by index so nothing gets mixed up
        ArrayList<String> questionA = new ArrayList<String>();
        ArrayList<String> optAa = new ArrayList<String>();
        ArrayList<String> optBa = new ArrayList<String>();
        ArrayList<String> optCa = new ArrayList<String>();
        ArrayList<String> optDa = new ArrayList<String>();
        ArrayList<String> answerA = new ArrayList<String>();

        // same setup for Part B
        ArrayList<String> questionB = new ArrayList<String>();
        ArrayList<String> optAb = new ArrayList<String>();
        ArrayList<String> optBb = new ArrayList<String>();
        ArrayList<String> optCb = new ArrayList<String>();
        ArrayList<String> optDb = new ArrayList<String>();
        ArrayList<String> answerB = new ArrayList<String>();

        // PART A QUESTIONS
        // each question is added to all lists so everything stays aligned

        questionA.add("Phishing is best described as:");
        optAa.add("A virus that hides inside another program");
        optBa.add("A scam tricking you into revealing sensitive info by pretending to be a trusted source");
        optCa.add("A method of physically stealing hardware");
        optDa.add("A technique that improves internet speed");
        answerA.add("B");

        questionA.add("Which is a common red flag in a phishing email?");
        optAa.add("The sender is from a company you know");
        optBa.add("The email uses your full name");
        optCa.add("The email creates urgency and asks you to click a link to verify your account");
        optDa.add("The message has no spelling errors");
        answerA.add("C");

        questionA.add("What is ransomware?");
        optAa.add("Software that shows ads on your screen");
        optBa.add("Malware that encrypts your files and demands payment for the decryption key");
        optCa.add("A subscription fee charged by software companies");
        optDa.add("A type of firewall");
        answerA.add("B");

        questionA.add("Which is an example of social engineering?");
        optAa.add("Designing a social media website");
        optBa.add("Breaking a password by brute force");
        optCa.add("Calling someone pretending to be IT support to get their login credentials");
        optDa.add("Sending a file without encryption");
        answerA.add("C");

        questionA.add("A Trojan is malware that:");
        optAa.add("Disguises itself as a safe program but does malicious things once installed");
        optBa.add("Spreads automatically across networks");
        optCa.add("Only attacks offline devices");
        optDa.add("Is a type of antivirus software");
        answerA.add("A");

        questionA.add("You get a text saying your package was undelivered with a suspicious link. What do you do?");
        optAa.add("Click the link right away");
        optBa.add("Reply asking for more details");
        optCa.add("Do not click - verify through the courier’s official website");
        optDa.add("Forward it to all your contacts");
        answerA.add("C");

        questionA.add("Which best describes a man-in-the-middle attack?");
        optAa.add("A hacker stands between two people at an ATM");
        optBa.add("An attacker secretly intercepts communication between two parties");
        optCa.add("A type of denial-of-service attack");
        optDa.add("Hardware sabotage in a server room");
        answerA.add("B");

        questionA.add("Vishing is a form of phishing carried out:");
        optAa.add("Over voice calls");
        optBa.add("Through video games");
        optCa.add("Using printed letters in the mail");
        optDa.add("By installing software from a USB");
        answerA.add("A");

        questionA.add("Which is most likely a sign of a spoofed website?");
        optAa.add("The URL matches the official site exactly");
        optBa.add("The URL has small misspellings like amaz0n-login.com");
        optCa.add("The site shows a padlock icon");
        optDa.add("The site loads quickly with no errors");
        answerA.add("B");

        questionA.add("Spyware is malware that:");
        optAa.add("Encrypts your data and demands ransom");
        optBa.add("Secretly collects your activity and sends it to a third party");
        optCa.add("Floods a website with traffic until it crashes");
        optDa.add("Removes junk files to improve performance");
        answerA.add("B");

        // PART B QUESTIONS
        // same idea as Part A, just different topic

        questionB.add("Which is the strongest password?");
        optAb.add("password123");
        optBb.add("Farzin2009");
        optCb.add("Tr0ub4dor&3-Spring!Tuesday");
        optDb.add("qwerty");
        answerB.add("C");

        questionB.add("Two-factor authentication (2FA) works by requiring:");
        optAb.add("Two different usernames");
        optBb.add("A password plus a second verification step like a texted code");
        optCb.add("Two separate passwords");
        optDb.add("Logging in from two devices at once");
        answerB.add("B");

        questionB.add("Why should you keep your OS and apps up to date?");
        optAb.add("Updates make your device look modern");
        optBb.add("Updates include security patches that fix vulnerabilities");
        optCb.add("Updates always add social media features");
        optDb.add("Updates are only for gaming");
        answerB.add("B");

        questionB.add("You see https:// at the start of a URL. This means:");
        optAb.add("The site is guaranteed safe");
        optBb.add("The data is encrypted in transit");
        optCb.add("The site is government certified");
        optDb.add("The site cannot contain malware");
        answerB.add("B");

        questionB.add("What is the safest way to manage many passwords?");
        optAb.add("Use the same password everywhere");
        optBb.add("Write them on a sticky note");
        optCb.add("Use a password manager with unique passwords");
        optDb.add("Use personal info like birthday");
        answerB.add("C");

        questionB.add("When using public Wi-Fi the safest practice is to:");
        optAb.add("Do online banking immediately");
        optBb.add("Avoid sensitive activity or use a VPN");
        optCb.add("Turn off firewall");
        optDb.add("Share Wi-Fi with everyone");
        answerB.add("B");

        questionB.add("Why is it risky to give a flashlight app access to contacts and microphone?");
        optAb.add("It needs it to work");
        optBb.add("Apps may collect data they don’t need");
        optCb.add("It makes the flashlight brighter");
        optDb.add("There is no risk");
        answerB.add("B");

        questionB.add("A good rule for sharing personal info online is:");
        optAb.add("Post everything publicly");
        optBb.add("Share only what is needed and check privacy settings");
        optCb.add("Use same profile everywhere");
        optDb.add("Accept all friend requests");
        answerB.add("B");

        questionB.add("The 3-2-1 backup rule means:");
        optAb.add("3 copies, 2 types of storage, 1 offsite");
        optBb.add("3 passwords, 2 usernames, 1 email");
        optCb.add("Backups for 3 time periods");
        optDb.add("3 antivirus programs");
        answerB.add("A");

        questionB.add("If you think your account was hacked you should first:");
        optAb.add("Delete account");
        optBb.add("Do nothing");
        optCb.add("Change password, enable 2FA, check activity");
        optDb.add("Post online");
        answerB.add("C");

        // welcome message
        System.out.println("Welcome to the Cybersecurity Awareness Certification Test!");
        System.out.println("You need 75% overall and at least 4/6 in each section to pass.");
        System.out.println();

        boolean running = true;

        // Main Menu Loop
        while (running) {

            System.out.println("MAIN MENU");
            System.out.println("1. Take the test");
            System.out.println("2. Admin login");
            System.out.print("Enter choice: ");
            String choice = sc.nextLine().trim();
            System.out.println();

            // Take test
            if (choice.equals("1")) {

                ArrayList<Integer> usedA = new ArrayList<Integer>();
                ArrayList<Integer> usedB = new ArrayList<Integer>();

                int scoreA = 0;
                int scoreB = 0;

                System.out.println("PART A");
                System.out.println();

                for (int i = 1; i <= 6; i++) {

                    int index = (int)(Math.random() * questionA.size());
                    while (usedA.contains(index)) {
                        index = (int)(Math.random() * questionA.size());
                    }
                    usedA.add(index);

                    System.out.println("Q" + i + ": " + questionA.get(index));
                    System.out.println("A) " + optAa.get(index));
                    System.out.println("B) " + optBa.get(index));
                    System.out.println("C) " + optCa.get(index));
                    System.out.println("D) " + optDa.get(index));

                    String answer = sc.nextLine().trim().toUpperCase();

                    if (answer.equals(answerA.get(index))) {
                        scoreA++;
                    }

                    int left = 6 - i;
                    int bestA = scoreA + left;
                    int bestTotal = bestA + 6;

                    if (bestA < 4 || bestTotal < 9) {
                        System.out.println("You can’t pass anymore. Ending test.");
                        scoreA = -1;
                    }
                }

                if (scoreA != -1) {

                    System.out.println("PART B");
                    System.out.println();

                    for (int i = 1; i <= 6; i++) {

                        int index = (int)(Math.random() * questionB.size());
                        while (usedB.contains(index)) {
                            index = (int)(Math.random() * questionB.size());
                        }
                        usedB.add(index);

                        System.out.println("Q" + i + ": " + questionB.get(index));
                        System.out.println("A) " + optAb.get(index));
                        System.out.println("B) " + optBb.get(index));
                        System.out.println("C) " + optCb.get(index));
                        System.out.println("D) " + optDb.get(index));

                        String answer = sc.nextLine().trim().toUpperCase();

                        if (answer.equals(answerB.get(index))) {
                            scoreB++;
                        }

                        int left = 6 - i;
                        int bestB = scoreB + left;
                        int bestTotal = scoreA + bestB;

                        if (bestB < 4 || bestTotal < 9) {
                            System.out.println("You can’t pass anymore. Ending test.");
                            scoreB = -1;
                        }
                    }

                    if (scoreB != -1) {

                        int total = scoreA + scoreB;
                        double percent = (total / 12.0) * 100;

                        System.out.println("FINAL RESULTS");
                        System.out.println("Part A: " + scoreA);
                        System.out.println("Part B: " + scoreB);
                        System.out.println("Score: " + total + "/12 (" + percent + "%)");

                        if (scoreA >= 4 && scoreB >= 4 && percent >= 75) {
                            System.out.println("PASS");
                        } else {
                            System.out.println("FAIL");
                        }
                    }
                }

                // Admin Menu
            } else if (choice.equals("2")) {

                System.out.print("Enter password: ");
                String entered = sc.nextLine().trim();

                if (!entered.equals(adminPassword)) {
                    System.out.println("Wrong password.");
                } else {

                    boolean inAdmin = true;

                    while (inAdmin) {

                        System.out.println("ADMIN MENU");
                        System.out.println("1. Add question");
                        System.out.println("2. Remove question");
                        System.out.println("3. Exit");
                        String adminChoice = sc.nextLine().trim();

                        if (adminChoice.equals("1")) {

                            System.out.println("Add to which section? 1 or 2");
                            String section = sc.nextLine().trim();

                            System.out.print("Question: ");
                            String q = sc.nextLine();

                            if (section.equals("1")) {
                                questionA.add(q);
                            } else {
                                questionB.add(q);
                            }

                        } else if (adminChoice.equals("2")) {

                            System.out.println("Feature works the same way (kept simple)");
                            System.out.println();

                        } else {
                            inAdmin = false;
                        }
                    }
                }

            } else {
                System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}