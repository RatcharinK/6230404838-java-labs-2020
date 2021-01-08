package harinsalai.ratchanon.lab2;
/**
 * This ChangeMachine program is to accept four arguments:
 * 1-baht coins, 2-baht coins, 5-baht coins, 10-baht coins
 *
 * Summation all arguments and output as bills
 * Its output format is
 * 1-baht coins : <coins1>
 * 2-baht coins : <coins2>
 * 5-baht coins : <coins5>
 * 10-baht coins : <coins10>
 * Total amount : <summations>
 * 1000-baht bills : <bills1000>
 * 500-baht bills : <bills500>
 * 100-baht bills : <bills100>
 * 20-baht bills : <bills20>
 * Money remains : <remain>
 *
 * Author: Ratchanon Harinsalai
 * ID: 623040483-8
 * Sec: 1
 * Date:
 *
 **/
public class ChangeMachine {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.err.println("ChangeMachine <1-baht coins> <2-baht coins> <5-baht coins> <10-baht coins>");
            System.exit(0);
        }
        //coins
        int coins1 = Integer.parseInt(args[0]);
        int coins2 = Integer.parseInt(args[1]);
        int coins5 = Integer.parseInt(args[2]);
        int coins10 = Integer.parseInt(args[3]);

        //summation of money
        int summation = coins1+(2*coins2)+(5*coins5)+(10*coins10);

        //bills
        int bills1000 = summation/1000;
        int bills500 = (summation%1000)/500;
        int bills100 = (summation%500)/100;
        int bills20 = (summation%100)/20;

        //remain form bills
        int remains = summation%20;

        System.out.println(  "1-baht coins : " + coins1 + "\n" +
                             "2-baht coins : " + coins2 + "\n" +
                             "5-baht coins : " + coins5 + "\n" +
                             "10-baht coins : " + coins10 +"\n" +
                             "Total amount : " + summation +"\n" +
                             "1000-baht bills : " + bills1000 +"\n" +
                             "500-baht bills : " + bills500 +"\n" +
                             "100-baht bills : " + bills100 +"\n" +
                             "20-baht bills : " + bills20 +"\n" +
                             "Money remains : " + remains);
    }
}
