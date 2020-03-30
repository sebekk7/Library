package io;

import model.Book;
import model.Magazine;
import model.Publication;

public class ConsolePrinter {
    public void printBooks(Publication[] publications) {
        int counter = 0;
        for (Publication publication : publications) {
            if (publication instanceof Book) {
                printLine(publication.toString());
                counter++;
            }
        }
        if (counter == 0) {
            printLine("Brak ksiazek w bibliotece.");
        }
    }

    public void printMagazines(Publication[] publications) {
        int counter = 0;
        for (Publication publication : publications) {
            if (publication instanceof Magazine) {
                printLine(publication.toString());
                counter++;
            }
        }
        if (counter == 0) {
            printLine("Brak magazynow w bibliotece.");
        }
    }

    public void printLine(String text){
        System.out.println(text);
    }
}
