package jpi.p3;

public class Exercise16 {
    public static void run() {
        IO.println(" === EXERCISE 16 === ");
        
        IO.println("[strings] · print thrice");
        String nickname = "sen";
        for (int i = 0; i < 3; i++){
            IO.print(nickname);
            if (i == 2) IO.println("");
        }

        IO.println("[strings] · login");
        // use scanner for entering values
        String username = "alex";
        String password = "sunshine";
        if (username.equals("alex") && password.equals("sunshine")) {
            IO.println("Success! You logged in");
        } else if (username.equals("emma") && password.equals("haskell")) {
            IO.println("Success! You logged in");
        } else {
            IO.println("Incorrect username or password");
        }

        IO.println("[string] · splitting");
        String text = "first second third fourth";
        String[] pieces = text.split(" ");
        IO.println(pieces[0]);
        IO.println(pieces[1]);
        IO.println(pieces[2]);
        IO.println(pieces[3]);
        IO.println();
    }
} 
