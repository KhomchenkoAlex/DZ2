package edu.alex;

import edu.alex.Shape.*;

import java.util.*;
public class Main {
    enum shapes  {
        CIRCLE, TRIANGLE, RECTANGLE, SQUARE
    }

        static private shapes inputShapeType(){
            shapes type = null;
            Scanner scanner = new Scanner(System.in);
            boolean validShape = false;
            while (!validShape){
                System.out.println("Enter shape name(circle,square,rectangle,triangle):");
                String shapeName = scanner.next();
                for (shapes s: shapes.values()) {
                    if(shapeName.toUpperCase().equals(s.toString())){
                        type = s;
                        validShape = true;
                    }
                }
            }
            return type;
        }

        public static void main(String [] args){

            ShapeCreator creator = new ShapeCreator();

            switch (inputShapeType()){
                case CIRCLE:
                    creator.createCircle().shapeInfo();
                    break;
                case TRIANGLE:
                    creator.createTriangle().shapeInfo();
                    break;
                case RECTANGLE:
                    creator.createRectangle().shapeInfo();
                    break;
                case SQUARE:
                    creator.createSquare().shapeInfo();
                    break;
            }
        }
    }
