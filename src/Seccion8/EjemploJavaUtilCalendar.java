package Seccion8;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

//        calendar.set(2023,Calendar.DECEMBER,25, 19, 20, 30);
        calendar.set(Calendar.YEAR, 2020);
        calendar.set(Calendar.MONTH, Calendar.OCTOBER);
        calendar.set(Calendar.DAY_OF_MONTH, 31);
        calendar.set(Calendar.HOUR_OF_DAY, 21);

//        calendar.set(Calendar.HOUR, 7);
//        calendar.set(Calendar.AM_PM, Calendar.PM);
        
        calendar.set(Calendar.MINUTE, 11);
        calendar.set(Calendar.SECOND, 11);
        calendar.set(Calendar.MILLISECOND, 163);

        Date fecha = calendar.getTime();
        System.out.println("fecha sin formato = " + fecha);

        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MMMM-dd HH:mm:ss:SSS");
        String fechaConFormato = sd.format(fecha);
        System.out.println("fecha con formato = " + fechaConFormato);

    }
}
