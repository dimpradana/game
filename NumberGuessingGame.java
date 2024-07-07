
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
public class NumberGuessingGame extends Game{
    public NumberGuessingGame(int guessLimit) {
        super(guessLimit);
    }
    @Override
    public void play() {
        super.play(); // Memanggil metode dari kelas base
        System.out.println("Terima kasih sudah bermain!");
    }
}