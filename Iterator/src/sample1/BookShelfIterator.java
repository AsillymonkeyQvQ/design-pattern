package sample1;

public class BookShelfIterator implements Iterator {

    private BookShelf bookShelf;

    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = -1;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength() - 1;
    }

    @Override
    public Object next() {
        index++;
        return bookShelf.getBookAt(index);
    }
}
