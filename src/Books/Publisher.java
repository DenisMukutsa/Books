package Books;

public class Publisher {
    private String nameOfpublisher;
    private String city;

    public Publisher(String nameOfpublisher, String city) {
        setNameOfpublisher(nameOfpublisher);
        setCity(city);
    }

    public String getNameOfpublisher() {
        return nameOfpublisher;
    }

    public String getCity() {
        return city;
    }

    public void setNameOfpublisher(String nameOfpublisher) {
        if(nameOfpublisher != null && !nameOfpublisher.equals(" ")) {
            this.nameOfpublisher = nameOfpublisher;
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public void setCity(String city) {
        if(city != null && !city.equals(" ")) {
            this.city = city;
        }
        else {
            throw new IllegalArgumentException();
        }
    }
}
