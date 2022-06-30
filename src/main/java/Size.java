public enum Size {
    SMALL("S",14,15), MEDIUM("M",16,17)
    , LARGE("L",18,19), EXTRA_LARGE("XL",20,21);
    String shortname;
    private int width;
    private int length;
    //Конструктор
    Size(String shortname, int width, int length) {
        this.shortname = shortname;
        this.width = width;
        this.length = length;
    }
    //Геттеры

    public String getShortname() {
        return shortname;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return getShortname()+" or "+super.name()+" size: width="+getWidth()+", length="+getLength()+" .";
    }
    //Переопределение

}
