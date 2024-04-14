class RealBook implements Book {
    private String title;

    public RealBook(String title) {
        this.title = title;
        loadFromDatabase(title); // Simulate loading book info from a database
    }

    private void loadFromDatabase(String title) {
        // Simulate loading book information from a database
        System.out.println("Loading information for book: " + title);
        // Assume loading from a database is a time-consuming task
        // In real-world scenario, this could involve database queries, network requests, etc.
        // For simplicity, we'll just simulate a delay here
        try {
            Thread.sleep(1000); // Simulate a delay of 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Displaying information for book: " + title);
        // Display book information
    }
}