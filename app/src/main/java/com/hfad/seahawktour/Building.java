package com.hfad.seahawktour;

public class Building {
    private int name;
    private int description;
    private int imageResourceId;
    private int thumbnail;




    //build is an array of Buildings
    public static final Building[] build = new Building[]{
            new Building( R.string.cis, R.string.cis_info, R.drawable.cis, R.drawable.cis),
            new Building ( R.string.bear, R.string.bear_info, R.drawable.newbear,R.drawable.newbear),
            new Building( R.string.fisher, R.string.fisher_info, R.drawable.fisher, R.drawable.fisher),
            new Building( R.string.warwick, R.string.warwick_info, R.drawable.warwickctr,R.drawable.warwickctr),
            new Building( R.string.burney, R.string.burney_info, R.drawable.burney, R.drawable.burney)

    };

    //Each building has a name, description, and an image resource
    public Building(int name, int description, int imageResourceId, int thumbnail) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
        this.thumbnail = thumbnail;

    }
    public int getDescription(){
        return description;
    }
    public int getName(){
        return name;
    }
    public int getImageResourceId(){
        return imageResourceId;
    }

    public int getThumbnail(){
        return thumbnail;
    }
    public void setThumbnail(int thumbnail){
        this.thumbnail = thumbnail;
    }


}

