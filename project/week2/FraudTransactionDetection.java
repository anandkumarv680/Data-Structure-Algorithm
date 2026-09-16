package project.week2;

import java.util.Scanner;

public class FraudTransactionDetection {

    public static boolean fraudDetection(int[] iDs, int suspiciousId){
        for(int i = 0; i < iDs.length; i++){
            if(iDs[i] == suspiciousId){
                System.out.println("Fraud Transaction Found");
                return true;
            }
        }
        System.out.println("No Transaction Found");
        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of total Transaction");
        int N = sc.nextInt();

        int[] iDs = new int[N];
        System.out.println("Enter Transaction IDs");
        for(int i = 0; i < N; i++){
            iDs[i] = sc.nextInt();
        }

        System.out.println("Enter Suspicious Id");
        int  suspiciousId = sc.nextInt();


        fraudDetection(iDs,suspiciousId);
    }
}
