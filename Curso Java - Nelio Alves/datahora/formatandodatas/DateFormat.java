package datahora.formatandodatas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateFormat {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");

        //Instant n�o tem o m�todo format
        Instant d06 = Instant.parse("2022-07-21T01:30:26Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //Para formatar data
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); // Para formatar data e hora

        //systemDefault pega o fuso hor�rio do computador
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); //Considerando o fuso de Sp

        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME; //Data local (Sem fuso hor�rio)
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT; //Data global (com fuso hor�rio)


        //Para converter a data para formato Br
        System.out.println("d04 = " + d04.format(fmt1)); //Forma de imprimir e como voc� quer transformar para string
        System.out.println("d04 = " + fmt1.format(d04)); //Forma de imprimir (a partir do objeto)
        System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))); //Forma de imprimir diferente
        System.out.println();

        System.out.println("d05 = " + d05.format(fmt1)); //Dia, m�s e ano
        System.out.println("d05 = " + d05.format(fmt2)); //Dia, m�s, ano e Hora
        System.out.println("d05 = " + d05.format(fmt4));
        System.out.println("d05 = " + fmt5.format(d06));
        System.out.println("d05 = " + d06);

        System.out.println();
        System.out.println("d06 = " + fmt3.format(d06));
        System.out.println("d06 = " + fmt5.format(d06));
        System.out.println("d06 = " + d06); //Outra forma de imprimir

    }
}
