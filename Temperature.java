public class Temperature {
    private double value; 

    public Temperature(double value) {
        setValue(value); 
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        if (value < -273.15) {
            throw new IllegalArgumentException("Température invalide : en dessous du zéro absolu.");
        }
        this.value = value;
    }

    @Override
    public String toString() {
        return value + " °C";
    }
}

public class Main {
    public static void main(String[] args) {
        Temperature t1 = new Temperature(25.0);
        System.out.println("Température valide : " + t1);

        try {
            Temperature t2 = new Temperature(-300.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur lors de la création : " + e.getMessage());
        }

        Temperature t3 = new Temperature(0.0);
        try {
            t3.setValue(-500.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur lors du set : " + e.getMessage());
        }
    }
}
