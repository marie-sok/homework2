//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        System.out.println("Задание 1");

        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        System.out.println("Задание 2");


        dog = dog + 4;
        System.out.println(dog + 4);

        cat = cat + 4;
        System.out.println(cat+4);

        paper = paper + 4;
        System.out.println(paper + 4);

        System.out.println("Задание 3");

        dog = 8;
        dog = (int) (dog - 3.5);
        System.out.println(dog);

        cat = 3.6;
        cat = cat - 1.6;
        System.out.println(cat);

        paper = 763789;
        paper = paper - 7639;
        System.out.println(paper);

        System.out.println("Задание 4");

        var friend = 19;
        friend = friend + 2 / 7;
        System.out.println(friend = ( friend + 2) / 7);


        System.out.println("Задание 5");

        var frog = 3.5;
        frog = (frog * 10) / 3.5;
        frog = frog + 4;
        System.out.println(frog);


        System.out.println("Задание 6");

        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        System.out.println(boxer1Weight+boxer2Weight);
        System.out.println(boxer1Weight-boxer2Weight);


        System.out.println("Задание 7");

        boxer1Weight = 78.2;
        boxer2Weight = 82.7;
        var boxersWeight = boxer2Weight % boxer1Weight;
        System.out.println(boxersWeight);


        System.out.println("Задание 8");

        var workingHours = 640;
        var oneEmploee = 8;
        var totalEmployeesInTheCompany = workingHours / oneEmploee;
        System.out.println(640 / 8);

        totalEmployeesInTheCompany = 80;
        var totalEmployees = totalEmployeesInTheCompany + 94;
        System.out.println(totalEmployeesInTheCompany + 94);

        workingHours = 640;
        totalEmployees = 174;
        var totalWorkingHours = workingHours / totalEmployees;
        System.out.println(totalWorkingHours);

        System.out.println("If the Company Employs 174 People, then Only Up to 3 Hours Devided Between Employees");





































            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.

        }
    }
