package hibernate;

public enum Gender {
    MALE('M'),
    FEMALE('F');
    private final char code;
    Gender(char code){
        this.code = code;
    }
    public static Gender getByCode(char code){
        if (code=='M'){
            return MALE;
        }else{
            return FEMALE;
        }
    }

    public char getCode() {
        return code;
    }
}
