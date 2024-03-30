package bookmarked.command;

import bookmarked.Book;
import bookmarked.exceptions.EmptyArgumentsException;

import bookmarked.ui.Ui;

import java.io.File;
import java.util.ArrayList;

public class AddUserCommand extends Command {
    private String newItem;
    private ArrayList<Book> listOfBooks;
    private ArrayList<Book> listOfUsers;
    private String[] splitItem;
    private File bookDataFile;
    public AddUserCommand(String newItem, ArrayList<Book> listOfBooks, String[] splitItem,
                          File bookDataFile, ArrayList<Book> listOfUsers){
        this.newItem = newItem;
        this.listOfBooks = listOfBooks;
        this.listOfUsers = listOfUsers;
        this.splitItem = splitItem;
        this.bookDataFile = bookDataFile;
    }

    @Override
    public void handleCommand() {
        assert newItem != null : "Item should not be null";
        String[] newSplitUser = this.newItem.split("adduser");
        try {
            processAddUserCommand(newSplitUser, listOfUsers);
            assert newSplitUser.length >= 1 : "There should be an argument to the command";
            assert ! listOfUsers.isEmpty();
        } catch (EmptyArgumentsException e) {
            Ui.printEmptyArgumentsMessage();
        }
    }

    public void processAddUserCommand(String[] newSplitUser, ArrayList<Book> listOfUsers)
            throws EmptyArgumentsException {

        if (newSplitUser.length < 1 || newSplitUser[1].isBlank()) {
            throw new EmptyArgumentsException();
        }
        Book userName = new Book(newSplitUser[1].trim());
        this.listOfUsers.add(userName);
        System.out.println("Added User " + userName + "!");
    }
}
