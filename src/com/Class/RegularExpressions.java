package com.Class;

import org.w3c.dom.ls.LSOutput;

public class RegularExpressions {

   static void StringReplace(){
       String music = "Diaaaa do mozao, turumtumtum, Diaaaa do mozao, turumtumtum. E o melhor dia, de toda semana, porque voi ver o meu mozao!";

       //there are 2 possitiblities to change Strings.
       //relace and replaceall (the second one you can use REGEX)

       //ill change all the "turumtumtum" to "turumtumtum, HEY!"
       System.out.println(music.replace("turumtumtum", "turumtumtum, HEY!"));

       //with regex, the "." mean all the character, so all will be changed "-"
       System.out.println(music.replaceAll(".", "-"));

       //with regex, the "^" mean the first word, so just the first will be changed
       System.out.println(music.replaceAll("^Diaaaa", "DIAAAAAAA"));

       //with regex, the "$" mean the LAST word that i find, so just the LAST will be changed
       System.out.println(music.replaceAll("mozao!$", "looooove"));

       //with regex, the "[]" mean the char inside be changed
       System.out.println(music.replaceAll("[at]", "*"));

        //-------------
       //need to replace itdcanada2019! to ITDCanada2019!
       String password = "Your new Password is itdcanada2019!";
       //searching those character and change to upercase (itdc followed together)
       System.out.println(password.replaceAll("[i][t][d][c]","ITDC"));
       //i want to replace EVERYTHING insted ITDC: 2 ways:
       System.out.println(password.replaceAll("[YournewPas2019!]","*"));
       System.out.println(password.replaceAll("[^itdc ]","*"));
       //replace all the alphabet (lower case and all numbers)
       System.out.println(password.replaceAll("[a-z0-9]","*"));

        //replace all numbers
       System.out.println(password.replaceAll("\\d","*"));
       //replace all Strings + pontuacao
       System.out.println(password.replaceAll("\\D","*"));
       //replace all Strings -> exclude pontuacao and whitespaces
       System.out.println(password.replaceAll("\\w","*"));
       //replace all whiteSpace + pontuacao
       System.out.println(password.replaceAll("\\W","*"));
       //replace all whitespace
       System.out.println(password.replaceAll("\\s","*"));
       //replace all, exclude whitespace
       System.out.println(password.replaceAll("\\S","*"));

       String secret = "11aaa222bbb333cc444444dd";
       //now we will gonna learn {} -> {2} it will repeat x times
       //it will search 22b(if there is one more b after) will replace 22bb -> X
       System.out.println(secret.replaceAll("22b{2}","X"));
       //it will search 11a(if there is one more a after) will replace every 11+ all a after - 11aaaa -> X
       System.out.println(secret.replaceAll("11a+","X"));
       //it will search 22b(if there is one more b after) will replace 22bb -> X
       System.out.println(secret.replaceAll("22b*","X"));
       //it will search minimum 2 times 4 and maximum 5 times 4 and replace to #
       System.out.println(secret.replaceAll("4{2,5}","#"));

       //--------------
       //change color: I have to use \u001B[31m" and clean the code with \u001B[0m"
       System.out.println("\u001B[31m" + "This is the red color" + "\u001B[0m");
       System.out.println("\u001B[96m" + "This is the blue color" + "\u001B[0m");


       System.out.println("\n===============================\n");

       //COMPARATION STRINGS

       //both ref are in the stack and pointing to diferent values in the heap
       String ref1 = new String("Peter Pan");
       String ref2 = new String("Peter Pan");

       //if i compare both, will not come a right information
       if(ref1 == ref2)System.out.println("ref1 and ref2 are the same");
       else System.out.println("ref1 and ref2 are NOT the same");

       //if i compare both, using .equal will come a right information
       if(ref1.equals(ref2))System.out.println("ref1 and ref2 are the same");
       else System.out.println("ref1 and ref2 are NOT the same");

       System.out.println("\n===============================\n");

       //stringbuilder to querys
       //SELECT FROM table WHERE id = 10;
       StringBuilder query = new StringBuilder("SELECT * FROM");
       query.append(" Table");
       query.append(" WHERE");
       query.append(" id = ");
       query.append("10");
       System.out.println(query.toString());
   }

}
