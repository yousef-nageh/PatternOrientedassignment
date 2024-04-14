class ProxyBook implements Book {
    private String title;
    private RealBook realBook;

    public ProxyBook(String title) {
        this.title = title;
    }

    @Override
    public void displayInfo() {
        if (realBook == null) {
            realBook = new RealBook(title);
        }
        realBook.displayInfo();
    }
}