package com.pluralsight;

import java.util.Scanner;

public class famousQuotes {
    public static void main(String[] args) {
      try {
          String[] famousWords = new String[10];

          famousWords[0] = ("Rumors are rumors. The Internet is going to report whatever they have to speculate on.");
          famousWords[1] = ("My three wishes are just be respected out the game. I want respect from everybody. And just make a successful clothing line and company. I’m not going to put a number on it. Just to have a great career.");
          famousWords[2] = ("I need to let people know who I am and instead of just trying to make great records, just be honest and make it more personal and make it more passionate, to make records with emotion and not be afraid to express that.");
          famousWords[3] = ("If you’re doing what you think people might like, rather than doing what you like, people will see through it.");
          famousWords[4] = ("I take a little bit from everybody and add that to my life to make me, me. I wanna be nobody else but Future. When you look at me, I want you to say, ‘Future.’ The way I talk, the way I dress, there’s nobody in the world but me.");
          famousWords[5] = ("I feel like guitar explains a lot. You can just listen to a guitar without any lyrics over it; you can just feel what kind of track it is. If it’s pain… you can feel it. It sets the mood.");
          famousWords[6] = ("I can’t leave home without certain movies. ‘The Godfather’ is a big one for me. And I’ve gotta have my beats so I can write new music.");
          famousWords[7] = ("My favorite designer has to be Louis Vuitton.");
          famousWords[8] = ("They listen to you on the radio, they look at you on TV and when people speak on you in a good light, you have a couple people who hold grudges.");
          famousWords[9] = ("Every mistake you make allows you to be honest because what’s in the dark will come to light, so it’s better to be truthful about it.");


          Scanner myscan = new Scanner(System.in);
          System.out.println("Please select a number 1-10");
          int number = myscan.nextInt();
          if (number >= 1 && number <= 10) {
              System.out.println("Quote " + number + ": " + famousWords[number - 1]);
          }
      }catch (Exception error){
          System.out.println("Error");
      }
    }

}
