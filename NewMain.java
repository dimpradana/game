
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.game1;

/**
 *
 * @author USER
 */

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

   // Contoh Game Tebak Angka
    NumberGuessingGame numberGame = new NumberGuessingGame(7);
    numberGame.play();

    // Contoh Game Tebak Kata
    String[] words = {"apel", "pisang", "mangga"};
    WordGuessingGame wordGame = new WordGuessingGame(5, words);
    wordGame.play();
    }
}
