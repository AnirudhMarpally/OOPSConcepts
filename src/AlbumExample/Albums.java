package AlbumExample;

class Album{
    private String title;
    private String artist;
    private double price;
    private int albumId;

    public Album(String title, String artist, double price, int albumId) {
        this.title=title;
        this.artist=artist;
        this.price=price;
        this.albumId=albumId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }
}