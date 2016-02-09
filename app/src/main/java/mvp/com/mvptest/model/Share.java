package mvp.com.mvptest.model;

import com.google.gson.annotations.Expose;

import org.parceler.Parcel;

@Parcel
public class Share {
    @Expose
    public String id;
    @Expose
    public String name;
}