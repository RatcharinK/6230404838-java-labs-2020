package harinsalai.ratchanon.lab9;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class DiceImageCanvas extends JPanel {
    protected int diceNumber;
    protected Graphics2D g2d;
    protected Ellipse2D.Double circleCenter, circleTopRight, circleBottomLeft,
            circleTopLeft, circleBottomRight, circleTopCenter, circleBottomCenter;
    protected Rectangle2D.Double square;
    protected int width = 150, height = 150;
    protected int canvasWidth = 400, canvasHeight = 400;
    protected int circleWidth = 30, circleHeight = 30;
    protected int startSquareX = 125;
    protected int startSquareY = 40;
    protected int margin = 10;
    public DiceImageCanvas(int diceNumber) {
        this.diceNumber = diceNumber;
        // set size
        setSize(new Dimension(canvasWidth, canvasHeight));
        // initialize a rectangle which is a background
        square = new Rectangle2D.Double(startSquareX, startSquareY, width, height);
        // call method createCircles to place dots on a rectangle
        createCircles();
    }

    protected void createCircles() {
        // fill red on all circles that will be placed on a rectangle
        circleTopLeft = new Ellipse2D.Double(startSquareX + margin,
                                             startSquareY + margin,
                                             circleWidth, circleHeight);

        circleTopCenter = new Ellipse2D.Double(startSquareX + (width/2) - (circleWidth/2),
                                               startSquareY + margin,
                                               circleWidth, circleHeight);

        circleTopRight = new Ellipse2D.Double(startSquareX + width - margin - circleWidth,
                                              startSquareY + margin,
                                              circleWidth, circleHeight);

        circleCenter = new Ellipse2D.Double(startSquareX + (width/2) - (circleWidth/2),
                                            startSquareY + (height/2)- (circleHeight/2),
                                            circleWidth, circleHeight);

        circleBottomLeft = new Ellipse2D.Double(startSquareX + margin,
                                                startSquareY + height - margin - circleHeight,
                                                circleWidth, circleHeight);

        circleBottomCenter = new Ellipse2D.Double(startSquareX  + (width/2) - (circleWidth/2),
                                                  startSquareY + height - margin - circleHeight,
                                                  circleWidth, circleHeight);

        circleBottomRight = new Ellipse2D.Double(startSquareX + width - margin - circleWidth,
                                                 startSquareY + height - margin - circleHeight,
                                                 circleWidth, circleHeight);
    }

    protected void drawDiceNumber() {
        // depending on a dice number, place red dots properly on a rectangle
        g2d.setColor(Color.WHITE);
        g2d.fill(square);
        g2d.setColor(Color.RED);

        if (diceNumber == 1) {
            g2d.fill(circleCenter);
            g2d.draw(circleCenter);
        }

        else if (diceNumber == 2) {
            g2d.fill(circleTopRight);
            g2d.draw(circleTopRight);
            g2d.fill(circleBottomLeft);
            g2d.draw(circleBottomLeft);
        }

        else if (diceNumber == 3) {
            g2d.fill(circleTopRight);
            g2d.draw(circleTopRight);
            g2d.fill(circleCenter);
            g2d.draw(circleCenter);
            g2d.fill(circleBottomLeft);
            g2d.draw(circleBottomLeft);
        }

        else if (diceNumber == 4) {
            g2d.fill(circleTopLeft);
            g2d.draw(circleTopLeft);
            g2d.fill(circleTopRight);
            g2d.draw(circleTopRight);
            g2d.fill(circleBottomLeft);
            g2d.draw(circleBottomLeft);
            g2d.fill(circleBottomRight);
            g2d.draw(circleBottomRight);
        }

        else if (diceNumber == 5) {
            g2d.fill(circleTopLeft);
            g2d.draw(circleTopLeft);
            g2d.fill(circleTopRight);
            g2d.draw(circleTopRight);
            g2d.fill(circleCenter);
            g2d.draw(circleCenter);
            g2d.fill(circleBottomLeft);
            g2d.draw(circleBottomLeft);
            g2d.fill(circleBottomRight);
            g2d.draw(circleBottomRight);
        }

        else if (diceNumber == 6) {
            g2d.fill(circleTopLeft);
            g2d.draw(circleTopLeft);
            g2d.fill(circleTopCenter);
            g2d.draw(circleTopCenter);
            g2d.fill(circleTopRight);
            g2d.draw(circleTopRight);
            g2d.fill(circleBottomLeft);
            g2d.draw(circleBottomLeft);
            g2d.fill(circleBottomCenter);
            g2d.draw(circleBottomCenter);
            g2d.fill(circleBottomRight);
            g2d.draw(circleBottomRight);
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        // call paintComponent of super class
        super.paintComponent(g);
        // cast graphics object to graphics2D object
        g2d =(Graphics2D) g;
        // call code to draw dice number
        drawDiceNumber();
    }
}
