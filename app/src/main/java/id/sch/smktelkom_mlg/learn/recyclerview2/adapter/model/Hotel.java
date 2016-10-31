package id.sch.smktelkom_mlg.learn.recyclerview2.adapter.model;

import android.graphics.drawable.Drawable;

/**
 * Created by Mochammad Al_97 on 10/30/2016.
 */
public class Hotel {
    public String judul;
    public String descripsi;
    public Drawable foto;

    public Hotel(String judul, String descripsi, Drawable foto) {
        this.judul = judul;
        this.descripsi = descripsi;
        this.foto = foto;
    }
}
