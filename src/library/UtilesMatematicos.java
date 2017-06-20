/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class UtilesMatematicos {

    // Calcula PERÍMETRO CÍRCULO.
    public static double calcularPermimetroCirculo(double radio) {
        return 2 * Math.PI * radio;
    }

    // Calcula ÁREA CÍRCIULO.
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    // Calcula ÁREA ESFERA.
    public static double calcularAreaEsfera(double radio) {
        return 4 * Math.PI * Math.pow(radio, 2);
    }

    // Calcula VOLUMEN ESFERA.
    public static double calcularVolumenEsfera(double radio) {
        return 4.0 / 3 * Math.PI * Math.pow(radio, 3);
    }

    // Resuelve ECUACIÓN 2 GRADO.
    public static double segundoGrado(double a, double b, double c) {
        double x = (-b + Math.sqrt(Math.pow(b, 2.0) - 4 * a * c)) / (2 * a);
        return x;
    }

}
