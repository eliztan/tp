package bookmarked.command;

import bookmarked.Book;
import bookmarked.exceptions.EmptyArgumentsException;
import bookmarked.exceptions.InvalidStringException;
import bookmarked.exceptions.MaxIntNumberException;
import bookmarked.exceptions.NegativeQuantityException;
import bookmarked.exceptions.WrongQuantityException;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AddCommandTest {

    @Test
    public void addCommand_emptyArguments_exceptionThrown() {
        ArrayList<Book> listOfBooks = new ArrayList<>();
        File bookDataFile = null;
        AddCommand addCommandBlank = new AddCommand("", listOfBooks, bookDataFile);
        assertThrows(EmptyArgumentsException.class, addCommandBlank::handleCommand);

        AddCommand addCommandQuantity = new AddCommand("add /quantity", listOfBooks, bookDataFile);
        assertThrows(EmptyArgumentsException.class, addCommandQuantity::handleCommand);

        AddCommand addCommandQuantitySpace = new AddCommand("add /quantity ", listOfBooks, bookDataFile);
        assertThrows(EmptyArgumentsException.class, addCommandQuantitySpace::handleCommand);

        AddCommand addCommandNameQuantity = new AddCommand("add Book /quantity", listOfBooks, bookDataFile);
        assertThrows(EmptyArgumentsException.class, addCommandNameQuantity::handleCommand);

        AddCommand addCommandQuantityNumber = new AddCommand("add /quantity 100", listOfBooks, bookDataFile);
        assertThrows(EmptyArgumentsException.class, addCommandQuantityNumber::handleCommand);
    }

    @Test
    public void addCommand_wrongQuantityFormat_exceptionThrown() {
        ArrayList<Book> listOfBooks = new ArrayList<>();
        Book newBook = new Book("newBook");
        AddCommand addCommand = new AddCommand("add Book /quantity p", listOfBooks, new File("books.txt"));
        assertThrows(WrongQuantityException.class, addCommand::handleCommand);
    }
    @Test
    public void addCommand_maxIntNumber_exceptionThrown() {
        ArrayList<Book> listOfBooks = new ArrayList<>();
        AddCommand addCommand = new AddCommand("add Book /quantity 10000", listOfBooks, new File("books.txt"));
        assertThrows(MaxIntNumberException.class, addCommand::handleCommand);
    }
    @Test
    public void addCommand_negativeQuantity_exceptionThrown() {
        ArrayList<Book> listOfBooks = new ArrayList<>();
        AddCommand addCommand = new AddCommand("add Book /quantity -1", listOfBooks, new File("books.txt"));
        assertThrows(NegativeQuantityException.class, addCommand::handleCommand);
    }
    @Test
    public void addCommand_invalidString_exceptionThrown() {
        ArrayList<Book> listOfBooks = new ArrayList<>();
        AddCommand addCommand = new AddCommand("add |", listOfBooks, new File("books.txt"));
        assertThrows(InvalidStringException.class, addCommand::handleCommand);
    }


}
