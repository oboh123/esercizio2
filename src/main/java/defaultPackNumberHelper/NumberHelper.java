/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defaultPackNumberHelper;

/**
 *
 * @author informatica
 */
public class NumberHelper {

    private int number;
    
    

    public NumberHelper(int n) {
        number = n;
    }

    public boolean isEven() {
        // ritorna true se number numero pari, altrimenti ritorna false
        if (number % 2 == 0) {
            return true;
        } else {
            return false;

        }

    }

    public boolean isOdd() {
        // ritorna true se number è un numero dispari, altrimenti ritorna false

        if (number % 2 != 0) {
            return true;
        } else {
            return false;

        }

    }

    public int sum(int n) {
        // ritorna la somma tra number e n
        int somma = n + number;
        return somma;

    }

    public boolean isPrime() {
        // ritorna true se number è un numero primo, altrimenti ritorna false

        for (int i = number - 1; i < 1; i--) {

            if (number % i == 0) {
                return false;
            }
        }return true;
    }

    public boolean isDivisibleBy(int n) {
        // ritorna true se number è divisibile per il parametro n, altrimenti ritorna false
    
        if(number/n == 0){
            return true;
        }return false;    
    }
}
