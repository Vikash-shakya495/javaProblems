

public class stringExample {
    public static void main(String[] args) {
        // String str1 = new String("delhi");
        // String str = "delih is in india";
        // System.out.println(str2.indexOf("d"));


       /** String s1 = "java";
        char ch[] = {'S','t','r','i','n','g','s'};
        System.out.print("Array of string : ");
        System.out.println(ch);
        String s2 = new String(ch);
        String s3 = new String("example");
        System.out.println("Normal string literal : " + s1);
        System.out.println("Converting Array to string  : " + s2);
        System.out.println("Declaring string in String object : " +s3); 
        */

        // strings methods 
        String s4 = "java is a Programming Language , ";
        String s5 = "It is also widely used in EnterPrise Application.";
        System.out.println(s4.length()); // give the length of the string
        System.out.println(s4.isEmpty()); // must need initializsation
        System.out.println(s4.replace("a", "A")); // replace the character "a" to "A"
        System.out.println(s4.concat(s5)); // concate two strings
        System.out.println(s4.startsWith("java")); // it returns true if it starts with "java"
        System.out.println(s4.toUpperCase()); // to upper case the string
        System.out.println(s4.toLowerCase()); // to lower case the string
        System.out.println(s4.compareTo(s5)); // it finds the difference from 1 string to 2 string , by each character
        System.out.println(s4.indexOf("P")); // if it doesn't find the character then it will return -1
        System.out.println(s4.charAt(23)); // give the character at particular index
        
        String s6 = s4.toUpperCase();
        System.out.println(s4.equals(s6)); // it also the checks the uppercase of equals both strings
        System.out.println(s4.equalsIgnoreCase(s6)); // it simply ignore the case , just equals both strings


        // String is immutable let's see how
        String name = "Vikash";
        name.concat("Shakya"); // .concat() method appends the string at the end
        // vikashShakya is new object and name is reference variable still refers to " vikash  " not to "VikashShakya"
        System.out.println(name);

        // but if we explicitly assign it to the refernce variable, it will refer to "VikashShakya"
        name = name.concat("Shakya");
        System.out.println(name);



        // java string comparison
        String s7 = "java";
        String s8 = "java";
        String s9 =  new String("java");
        String s10 = "javascript";
        System.out.println(s7.equals(s8)); // true
        System.out.println(s7.equals(s9)); // true
        System.out.println(s7 == s8); // both variable are pointing the same object
        System.out.println(s7 == s9); // now s9 is new object with same value of s8
        System.out.println(s7.equals(s10)); // false

        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println(str1 == str2); // false, because str1 and str2 refer to different objects.
        System.out.println(str1.equals(str2)); // true, because both have the same content "Hello".

        String str3 = "React";
        String str4 = "React";
        String str5 = "Tailwind";
        System.out.println(str3.compareTo(str4)); // 0
        System.out.println(str3.compareTo(str5)); // -2
        System.out.println(str5.compareTo(str3)); // 2

    }
}
