package com.example.aroutetest.serializable;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

class Orange implements Parcelable {
    private String name;
    private List<Integer> nums;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeList(this.nums);
    }

    public void readFromParcel(Parcel source) {
        this.name = source.readString();
        this.nums = new ArrayList<Integer>();
        source.readList(this.nums, Integer.class.getClassLoader());
    }

    public Orange() {
    }

    protected Orange(Parcel in) {
        this.name = in.readString();
        this.nums = new ArrayList<Integer>();
        in.readList(this.nums, Integer.class.getClassLoader());
    }

    public static final Parcelable.Creator<Orange> CREATOR = new Parcelable.Creator<Orange>() {
        @Override
        public Orange createFromParcel(Parcel source) {
            return new Orange(source);
        }

        @Override
        public Orange[] newArray(int size) {
            return new Orange[size];
        }
    };
}
