package com.company;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game extends JFrame implements KeyListener {
    private final int width = 800;
    private final int height = 600;
    private final int player_size = 50;
    private final int tile_size = 50;
    private final int num_tiles_x = width / tile_size;
    private final int num_tiles_y = height / tile_size;
    private final int num_floors = 3;
    private final int[][][] map = new int[num_tiles_x][num_tiles_y][num_floors];
    private int currentFloor = 1;
    private int playerXcord;
    private int playerYcord;


    public Game() {
        setTitle("Dungeon Crawler");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 608, 720);
    }

    private void generateMap(){

    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
