package com.blhx.chessProject;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

//工具类：用于画图
public class GameImage {
    private GameImage() {};//工具类一般设置为私有
    public static Image getImage( String path) {
        URL u = GameImage.class.getClassLoader().getResource(path);
        BufferedImage img = null;
        try {
            img = ImageIO.read(u);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return img;
    }
}
