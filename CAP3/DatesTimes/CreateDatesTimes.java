import java.time.*;

//LocalDate: Contiene solo fecha, no tiempo ni zona horaria
//LocalTime: Contiene solo tiempo, no fecha ni zona horaria
//LocalDateTime: Contiene fecha y tiempo pero no zona horaria
//La creacion de cualquier objeto es a travez de la clase estatica
//No se permite una instancia usando el constructor (ya que es privado)
//Los valores validos para el campo dias del mes (1-28/31)
public class CreateDatesTimes{

    public static void main(String[] args){
        System.out.println("LocalDate.now(): "+LocalDate.now());
        System.out.println("LocalTime.now(): "+LocalTime.now());
        System.out.println("LocalDateTime.now(): "+LocalDateTime.now());
       
        createDates();

        createTimes();

        createDateTimes();
    }

    private static void createDates(){
        printCabecera("createDates");
        //  public static LocalDate of(int year, int month, int dayOfMonth)
        //  public static LocalDate of(int year, Month month, int dayOfMonth)
        LocalDate date1=LocalDate.of(2015, Month.JANUARY, 20);
        LocalDate date2=LocalDate.of(2015,1,20);
        System.out.println("LocalDate.of(2015, Month.JANUARY,20): "+ date1);
        System.out.println("LocalDate.of(2015, 1,20): "+ date2);
    }
    private static void createTimes(){
        printCabecera("createTimes");
        //  public static LocalTime of(int hour, int minute)
        //  public static LocalTime of(int hour, int minute, int second)
        //  public static LocalTime of(int hour, int minute, int second, int nanos)
        LocalTime time1=LocalTime.of(6,15);
        LocalTime time2=LocalTime.of(6,15,30);
        LocalTime time3=LocalTime.of(6,15,30,200);
        System.out.println("LocalTime.of(6,15): "+ time1);
        System.out.println("LocalTime.of(6,15,30): "+ time2);
        System.out.println("LocalTime.of(6,15,30,200): "+ time3);
    }

    private static void createDateTimes(){
        printCabecera("createDateTimes");
        LocalDateTime dateTime1=LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
        LocalTime time1=LocalTime.of(6,15, 30);
        LocalDate date1=LocalDate.of(2015, Month.JANUARY, 20);
        LocalDateTime dateTime2=LocalDateTime.of(date1, time1);
        System.out.println("LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30): "+dateTime1);
        System.out.println("LocalDateTime.of(date1, time1): "+dateTime2);
    }


    private static void printCabecera(String example){
        System.out.println("======================");
        System.out.println("Ejemplo: "+ example);
        System.out.println("======================");
    }


}
