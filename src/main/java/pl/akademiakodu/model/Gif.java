package pl.akademiakodu.model;

public class Gif {

    private boolean favorite;
    private String name;
    private String username;

    public Gif(boolean favorite, String name, String username) {
        this.favorite = favorite;
        this.name = name;
        this.username = username;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }



}
