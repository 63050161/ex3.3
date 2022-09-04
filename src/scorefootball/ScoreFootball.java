/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scorefootball;

/**
 *
 * @author HP
 */

import java.util.Scanner;

public class ScoreFootball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User1 user1 = new User1();
        User2 user2 = new User2();
        HeadQuater obj = new HeadQuater();
        obj.register(user1);
        obj.register(user2);
        while(true){
        System.out.print("Enter Score Thai-UAE : ");
        String score = sc.nextLine();
        if(score.equals("")) break;
        obj.setUpdateData(score);
        }
    }
}
