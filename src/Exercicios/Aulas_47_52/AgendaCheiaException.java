/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios.Aulas_47_52;

/**
 *
 * @author worel
 */
public class AgendaCheiaException extends Exception {

    @Override
    public String getMessage() {
        return "Agenda está cheia";
    }   
}
