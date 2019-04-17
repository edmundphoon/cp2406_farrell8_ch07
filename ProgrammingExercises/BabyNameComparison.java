import java.util.Scanner;

public class BabyNameComparison
{
    public static String concat(String s1, String s2)
    {
        return (s1 + " " + s2);
    }

    public static void main(String[] args)
    {
        String name1;
        String name2;
        String name3;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number 1 First name >> ");
        name1 = input.nextLine();

        System.out.print("Enter Number 2 First name >> ");
        name2 = input.nextLine();

        System.out.print("Enter Number 3 First name >> ");
        name3 = input.nextLine();

        System.out.println("Possible two-name combinations: ");
        System.out.println(". " + concat(name1, name2));
        System.out.println(". " + concat(name1, name3));
        System.out.println(". " + concat(name2, name1));
        System.out.println(". " + concat(name2, name3));
        System.out.println(". " + concat(name3, name1));
        System.out.println(". " + concat(name3, name2));
    }
}
