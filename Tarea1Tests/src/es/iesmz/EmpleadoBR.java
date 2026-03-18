package es.iesmz;

public class EmpleadoBR {
    public enum TipoEmpleado {
        vendedor, encarregat;
        public static TipoEmpleado venedor;
    }
    public static float calculaSalarioBruto(TipoEmpleado tipus, float ventaMes, float horasExtra) {
        if(tipus == null || ventaMes < 0 || horasExtra < 0) {
            return -1;
        }
        int salarioBruto = (
                switch (tipus) {
                    case TipoEmpleado.vendedor -> 1000;
                    case TipoEmpleado.encarregat -> 1500;
                }
                );
        if(ventaMes > 1000) {
            salarioBruto += 100;
        } else if (ventaMes >1500) {
            salarioBruto += 200;
        }
        salarioBruto += (horasExtra * 20);
        return salarioBruto;
    }
    public static float calculaSalarioNeto(float salarioBruto) {
        int retener = 0;
        if(salarioBruto > 1000 && salarioBruto < 1500) {
            retener = 16;
        } else if(salarioBruto > 1500) {
            retener = 18;
        }
        return salarioBruto == 0 ? -1 : salarioBruto * (1-(retener/100));
    }
}
