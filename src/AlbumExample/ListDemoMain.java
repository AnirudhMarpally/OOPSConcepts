package AlbumExample;

import java.util.List;
import java.util.Scanner;



class ListDemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListDemo listDemo=new ListDemo();

	      //Retrieve the album details 
	      System.out.println("Album Details:");
	      List<Album> albumList=listDemo.retrieveAlbums();

	      /*Iterate over the albumList and display the details
	      of all the albums*/
	      for (Album album : albumList) {
	          System.out.println("Album Title: "+album.getTitle());
	          System.out.println("Artist: "+album.getArtist());
	          System.out.println("Price: "+album.getPrice());
	          System.out.println("Album Id: "+album.getAlbumId());
	          System.out.println();
	      }
	      Scanner scanner = new Scanner(System.in);
	      System.out.println("Enter the price limit to check the albums");
	      double priceLimit = scanner.nextDouble();
	      try{
	          //Search albums according to the price limit
	          System.out.println("Search Albums within the price of 12.00:");
	          List<Album> searchAlbumList=listDemo.searchAlbum(albumList,priceLimit);

	          //Iterate over the searchAlbumList and display the details of all the albums which price is less than 12.00
	          for (Album album : searchAlbumList) {
	              System.out.println("Album Title: "+album.getTitle());
	              System.out.println("Artist: "+album.getArtist());
	              System.out.println("Price: "+album.getPrice());
	              System.out.println("Album Id: "+album.getAlbumId());
	              System.out.println();
	          }
	          
	      }catch(AlbumNotFoundException e){
	          System.out.println(e.getMessage());
	      }
	}

}

