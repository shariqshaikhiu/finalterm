package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

        public class SingletonExample {
            public static void main(String[] args) {
                ShapeFactorySingleton factory = ShapeFactorySingleton.getInstance();

                Shape circle = factory.getShape("circle");
                if (circle != null) circle.draw();

                Shape rectangle = factory.getShape("rectangle");
                if (rectangle != null) rectangle.draw();
            }
        }




