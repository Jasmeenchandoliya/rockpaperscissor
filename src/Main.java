import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int user,computer;
        Random r=new Random();
        Scanner sc=new Scanner(System.in);
        System.out.println("ROCK PAPER SCISSOR GAME");
        System.out.println("enter your choice: 0-->rock    1-->paper    2-->scissor");
        user=sc.nextInt();
        while(user>2){
            System.out.println("choose a correct move");
            System.out.println("value between 0 and 2");
            user=sc.nextInt();
        }
        if(user==0){
            System.out.println("User said 'ROCK'");
        }else{
            if(user==1){
                System.out.println("User said 'PAPER'");
            }else {
                System.out.println("User said 'SCISSOR'");
            }
        }
        computer=r.nextInt(3);
        if(computer==0){
            System.out.println("Computer said 'ROCK'");
        }else{
            if(computer==1){
                System.out.println("Computer said 'PAPER'");
            }else{
                System.out.println("Computer said 'SCISSOR'");
            }
        }
        while(user==computer){
            System.out.println("DRAW");
            user=sc.nextInt();
            while(user>2){
                System.out.println("choose a correct move");
                System.out.println("value between 0 and 2");
                user=sc.nextInt();
            }
            if(user==0){
                System.out.println("User said 'ROCK'");
            }else{
                if(user==1){
                    System.out.println("User said 'PAPER'");
                }else {
                    System.out.println("User said 'SCISSOR'");
                }
            }
            computer=r.nextInt(3);
            if(computer==0){
                System.out.println("Computer said 'ROCK'");
            }else{
                if(computer==1){
                    System.out.println("Computer said 'PAPER'");
                }else{
                    System.out.println("Computer said 'SCISSOR'");
                }
            }
        }
        if(user==0){
            if(computer==1){
                System.out.println("Computer WON!");
            }else{
                System.out.println("User WON!");
            }
        }else if(user==1){
            if(computer==0){
                System.out.println("User WON!");
            }else{
                System.out.println("Computer WON!");
            }
        }else{
            if(computer==0){
                System.out.println("Computer WON!");
            }else{
                System.out.println("User WON!");
            }
        }
    }
}