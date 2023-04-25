package org.example.lesson9;

public class Wether {
    public static void getWether(String season) {
        switch (season) {
            case "Winter":
                System.out.println("-15");
                break;
            case "Summer":
                System.out.println("+35");
                break;
            case "Spring":
                System.out.println("+15");
        }
    }

    public static void getWether(Season season) {
        System.out.println("Enum = "+season.name());
        switch (season) {
            case SPRING -> {
                System.out.println("+15");
                System.out.println(season.getSinoptis());
            }
            case SUMMER -> System.out.println("35");
            case WINTER -> System.out.println("-15");
            case FALL -> System.out.println("+12");
            default -> System.out.println("Soryy yhis case not exist");
        }
    }
}
