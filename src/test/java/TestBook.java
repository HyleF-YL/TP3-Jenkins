import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class TestBook {

        @ParameterizedTest
        @MethodSource("getTitles")
        public void TestBookTitle(String title){
                Book book = new Book(title,"", new Date());
                Assertions.assertEquals(title, book.title);
        }

        @ParameterizedTest
        @MethodSource("getAuthors")
        public void TestBookAuthor(String author){
                Book book = new Book("",author,new Date());
                Assertions.assertEquals(author, book.author);
        }

        @ParameterizedTest
        @MethodSource("getDates")
        public void TestBookDate(Date date){
                Book book = new Book("","",date);
                Assertions.assertEquals(date, book.publicationDate);
        }


        public static Stream<Arguments> getTitles(){
                return Stream.of(
                        Arguments.of("Harry Potter"),
                        Arguments.of("L'institut"),
                        Arguments.of("Feur")
                );
        }

        public static Stream<Arguments> getAuthors(){
                return Stream.of(
                        Arguments.of("JK Rowling"),
                        Arguments.of("Stephen King"),
                        Arguments.of("Antony de oliveira")
                );
        }

        public static Stream<Arguments> getDates(){
                return Stream.of(
                        Arguments.of(new GregorianCalendar(1970,Calendar.JUNE,30).getTime()),
                        Arguments.of(new GregorianCalendar(2020,Calendar.DECEMBER,25).getTime()),
                        Arguments.of(new GregorianCalendar(1450,Calendar.SEPTEMBER,10).getTime())
                );
        }

}
