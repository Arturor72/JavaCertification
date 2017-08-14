import java.time.*;
//LocalDate, LocalTime, LocalDateTime son clases inmutables
//Si se quiere modificar el tiempo de un LocalDateTime y no se ha inicializado
//dicho tiempo no compilara
public class ManipulateDatesTimes{
    public static void main(String[] args){
       agregandoFechas();

       quitandoFechas();
       
       agregandoTiempo();

       quitandoTiempo();

        chainingLocalDateTime();
    }

    private static void agregandoFechas(){
        printCabecera("Agregando Fechas");
        LocalDate date =LocalDate.of(2014, Month.JANUARY, 20) ;
        System.out.println("Fecha: "+date);
        date=date.plusDays(2);
        System.out.println("Agregando dos dias: "+date);
        date=date.plusWeeks(1);
        System.out.println("Agregando una semana: "+date);
        date=date.plusMonths(1);
        System.out.println("Agregando un mes: "+date);
        date=date.plusYears(5);
        System.out.println("Agregando 5 anios: "+date);
    
    
    }

    private static void quitandoFechas(){
        printCabecera("Quitando Fechas");
        LocalDate date =LocalDate.of(2014, Month.JANUARY, 20) ;
        System.out.println("Fecha: "+date);
        date=date.minusDays(2);
        System.out.println("Menos dos dias: "+date);
        date=date.minusWeeks(1);
        System.out.println("Menos una semana: "+date);
        date=date.minusMonths(1);
        System.out.println("Menos un mes: "+date);
        date=date.minusYears(5);
        System.out.println("Menos 5 anios: "+date);
    }
    
    private static void agregandoTiempo(){
        printCabecera("Agregando Tiempo");
        LocalTime time =LocalTime.of(10,15,20) ;
        System.out.println("Tiempo: "+time);
        time=time.plusHours(2);
        System.out.println("Agregando dos horas: "+time);
        time=time.plusMinutes(10);
        System.out.println("Agregando 10 minutis: "+time);
        time=time.plusSeconds(10);
        System.out.println("Agregando 10 segundos: "+time);
    
    
    }
    private static void quitandoTiempo(){
        printCabecera("Quitando Tiempo");
        LocalTime time =LocalTime.of(10,15,20) ;
        System.out.println("Tiempo: "+time);
        time=time.minusHours(2);
        System.out.println("Quitando dos horas: "+time);
        time=time.minusMinutes(10);
        System.out.println("Quitando 10 minutis: "+time);
        time=time.minusSeconds(10);
        System.out.println("Quitando 10 segundos: "+time);
    
    
    }

    private static void chainingLocalDateTime(){
        printCabecera("Chaining");
        LocalDate date=LocalDate.of(2017, 8,13);
        LocalTime time=LocalTime.of(8,15,30);
        LocalDateTime dateTime=LocalDateTime.of(date,time);
        System.out.println("Fecha inicial: "+ dateTime);
        dateTime=dateTime.plusWeeks(1).plusMonths(2).plusMinutes(15).minusSeconds(30);
        System.out.println("Chaining dateTime.plusWeeks(1).plusMonths(2).plusMinutes(15).minusSeconds(30): " +dateTime);
    
    }




    private static void printCabecera(String example){
        System.out.println("================");
        System.out.println("Ejemplo: "+example);
        System.out.println("================");
    
    
    }



}
