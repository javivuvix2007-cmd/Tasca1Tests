package es.iesmz;

public class EmpleadoBR {
    public enum TipoEmpleado {
        venedor, encarregat;
    }
    public static float calculaSalarioBruto(TipoEmpleado tipus, float ventaMes, float horasExtra) {
        if(tipus == null || ventaMes < 0 || horasExtra < 0) {
            return -1;
        }
        float salarioBruto = (
                switch (tipus) {
                    case TipoEmpleado.venedor -> 1000;
                    case TipoEmpleado.encarregat -> 1500;
                }
                );

        if(ventaMes >= 1500) {
            salarioBruto += 200;
        } else if (ventaMes >= 1000) {
            salarioBruto += 100;
        }

        salarioBruto += (horasExtra * 20);
        return salarioBruto;
    }
    public static float calculaSalarioNeto(float salarioBruto) {
        int retener = 0;
        if(salarioBruto >= 1000 && salarioBruto < 1500) {
            retener = 16;
        } else if(salarioBruto >= 1500) {
            retener = 18;
        }
        return salarioBruto * (1 - (retener / 100f));
    }
}
