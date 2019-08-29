
class MyBook extends Book
{

        int bookPrice;
     MyBook(String title,String author,int price)
    {
        super(title,author);
       bookPrice = price;
    }
    public void display()
    {
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+bookPrice);
    }
}
    // Write your method here

// End class
