package masterung.androidthai.in.th.sutfriend;

import android.os.Parcel;
import android.os.Parcelable;

public class UserSutModel implements Parcelable{

    private String nameString, urlAvatarString;

    public UserSutModel() {

    } //Constructor getter

    public UserSutModel(String nameString, String urlAvatarString) {
        this.nameString = nameString;
        this.urlAvatarString = urlAvatarString;
    } //Constructor setter

    protected UserSutModel(Parcel in) {
        nameString = in.readString();
        urlAvatarString = in.readString();
    }

    public static final Creator<UserSutModel> CREATOR = new Creator<UserSutModel>() {
        @Override
        public UserSutModel createFromParcel(Parcel in) {
            return new UserSutModel(in);
        }

        @Override
        public UserSutModel[] newArray(int size) {
            return new UserSutModel[size];
        }
    };

    public String getNameString() {
        return nameString;
    }

    public void setNameString(String nameString) {
        this.nameString = nameString;
    }

    public String getUrlAvatarString() {
        return urlAvatarString;
    }

    public void setUrlAvatarString(String urlAvatarString) {
        this.urlAvatarString = urlAvatarString;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nameString);
        parcel.writeString(urlAvatarString);
    }
}// Main Class
