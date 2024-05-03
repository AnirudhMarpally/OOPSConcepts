package AlbumExample;

import java.util.ArrayList;
import java.util.List;



public class ListDemo {

    //Method to retrieve album details
    public List<Album> retrieveAlbums(){
        List<Album> albumList=new ArrayList<Album>();

        Album album1=new Album("Five Kilos","Shashi",11.99,1);
        Album album2=new Album("The Second","Jack",14.99,2);
        Album album3=new Album("The Empty road","Pope",10.99,3);
        Album album4=new Album("The Gabba","Smith Steve",15.99,3);

        albumList.add(album1);
        albumList.add(album2);
        albumList.add(album3);
        albumList.add(album4);

        return albumList;
    }

    //Method to search albums by price
    public List<Album> searchAlbum(List<Album> albumList, double priceLimit) throws AlbumNotFoundException{
        List<Album> resultAlbumList=new ArrayList<Album>();

        for (Album album : albumList) {
            if (album.getPrice() <= priceLimit)
                resultAlbumList.add(album);
        }

        if(resultAlbumList.isEmpty()){
            throw new AlbumNotFoundException("Albim Not Found Exception: Albums not found within the price range");
        }
        return resultAlbumList;
    }
}
