
public class Radio<certainStation> {
    private int currentStation;
    private int currentVolume;
    private int stationAmount;


    public Radio() {
        stationAmount = 10;

    }
    public Radio(int stationAmount) {
        this.stationAmount = stationAmount;
    }

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
        if (currentStation > stationAmount - 1) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void next() {
        if (currentStation == stationAmount - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = stationAmount - 1;
        } else {
            currentStation--;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume < 100) {
            currentVolume--;
        }
    }



}

