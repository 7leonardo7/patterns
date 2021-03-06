package com.esipovich.patterns.behavioral.templatemethod;

/*  Template method
 *  ���������� ������ ���������, ������������ ��������������� �� ��������� ��� ����
 *  �� ���������.
 *  ��������� ���������� �������������� ���� ���������, �� ����� ��� ����� ���������
 */

public class Main {
    public static void main (String [] args){
        final GameCode gameCode = GameCode.CHESS;

        Game game;

        switch (gameCode){
            case CHESS :
                game = new Chess();
                break;
            case MONOPOLY :
                game = new Monopoly();
                break;
            default :
                throw new IllegalStateException();
        }

        game.playOneGame(2);
        System.out.println(game);
    }
}

/*  �����
 *  ��������� ��������� ������������� ����
 */

/*  ������
 *  �������������� �������� ������������� ���������
 */
