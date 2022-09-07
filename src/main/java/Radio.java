
public class Radio<certainStation> {
    public int currentStation;
    public int currentVolume;


    public int getCurrentStation() {
        return currentStation;

    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void next() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation--;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume < 10) {
            currentVolume--;
        }
    }

    public void certainStation() {
    }

    int certainStation[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};


}

