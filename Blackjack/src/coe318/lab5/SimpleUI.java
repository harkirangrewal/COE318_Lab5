/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author h36grewa
 */
package coe318.lab5;

import java.util.Scanner;

public class SimpleUI implements UserInterface {
    private BlackjackGame game;
    private Scanner user = new Scanner(System.in);

  @Override
    public void setGame(BlackjackGame game) {
        this.game = game;
    }

  @Override
    public void display() {
        //FIX THIS
      System.out.println("House holds:" + this.game.getHouseCards().toString()); 
      //House cards
      System.out.println("You hold:" + this.game.getYourCards().toString());
      // Your cards
    }

  @Override
    public boolean hitMe() {
        //FIX THIS
        System.out.println("Would you like a hit? (Y/N)");
        String ChoiceOfUser = user.nextLine();
        boolean hit = false;
        switch(ChoiceOfUser)
        {
            case "Y":
                hit = true;
                break;
            case "N":
                hit = false;
                break;
            default: 
                System.out.println("You can only type either Y or N");
                hitMe();
        }
        return hit;

  }  

  @Override
    public void gameOver() {
        //FIX THIS
      
      this.display();
        int MyScore = game.score(game.getYourCards());
        int HouseScore = game.score(game.getHouseCards());
        System.out.println("House Score: " + HouseScore + " Your Score: " + MyScore);
        if( (MyScore > HouseScore || HouseScore > 21) && (MyScore <= 21) )
        {
            System.out.println("You win");
        }else
        {
            System.out.println("The House wins");
        }
    }

    }

