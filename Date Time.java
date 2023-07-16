import java.time.*;
import java.time.format.*;
class Main{
    public static void main(String args[]){
        LocalDate date = LocalDate.now();

        LocalTime time = LocalTime.now();
        
        LocalDateTime datetime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String str = datetime.format(formatter);

        System.out.println(str);

}