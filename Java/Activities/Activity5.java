package Activities;

public class Activity5 {

    public static void main(String args[]){
        String title = "MyNewBookName";
        Mybook newNovel = new Mybook();
        newNovel.setTitle(title);
        System.out.println("The Book name is "+newNovel.getTitle());
    }
}
