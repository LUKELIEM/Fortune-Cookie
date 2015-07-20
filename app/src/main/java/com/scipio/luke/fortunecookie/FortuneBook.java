package com.scipio.luke.fortunecookie;

import java.util.Random;

/**
 * Created by Luke on 7/4/2015.
 */
public class FortuneBook {
    //Member variables - properties about the object
    public String[] mFortunes = {
            "Your ability for accomplishment will follow with success.",
            "You will be traveling and coming into a fortune.",
            "An enjoyable vacation is awaiting you.",
            "You will soon discover how truly fortunate you really are.",
            "Use your ability at this time to stay focused on your goal. You will succeed.",
            "Your respect for others will be your ticket to success.",
            "Don't worry about the stock market. Invest in family.",
            "Be patient and love will find you when you least expect it.",
            "Your life is trouble free.",
            "You will obtain your goal if you maintain your course.",
            "Treat yourself to something of quality.",
            "You will make a sudden rise in life.",
            "Many admire your social and physical appearance.",
            "You will always be surrounded by true friends.",
            "Prosperity is in your future.",
            "You are deep thinker with a knack for solving problem.",
            "You will be selected for a promotion because of your accomplishments.",
            "People find it difficult to resist your persuasive manner.",
            "Your kindness will lead you to happiness.",
            "When love and skill works together, expect a masterpiece.",
            "You are in good hand.",
            "Your ability for accomplishment will follow with success.",
            "You will have many friends when you need them.",
            "You will be called to fill a position of high honor and responsibility.",
            "You will win success in whatever calling you adopt.",
            "Sing and rejoice, fortune is smiling on you.",
            "You will never need to worry about a steady income.",
            "Your past success will be overshadowed by your future successes.",
            "A financial investment will yield return beyond your wildest hopes.",
            "You will be fortunate in everything you put your hands on.",
            "Your greatest fortune is the large number of friends you have.",
            "Your love life will be happy and harmonious.",
            "Your eyes will be opened to a world full of beauty, charm and adventure.",
            "Your future will be happy and productive.",
            "Appearance is deceiving. Remember endurance makes gold.",
            "Good to begin well. Better to end well.",
            "Money speaks a language everyone understands.",
            "All your hard work will soon pay off.",
            "Don't be afraid to take that big step.",
            "You will find hidden treasures where least expected."};

    //Methods (Abilities) - things it can do
    public String getFortune(){
        String fortune = "";

        //Randomly select a fact
        Random randomGenerator = new Random(); //construct a new random generator
        int randomNumber = randomGenerator.nextInt(mFortunes.length);
        fortune = mFortunes[randomNumber];
        return fortune;
    }
}