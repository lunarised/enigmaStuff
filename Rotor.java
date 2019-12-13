public class Rotor{
    protected String rKey;
    protected int position;
    protected char notch;
    public Rotor(String _rKey, int _position, char _notch){
        rKey = _rKey;
        position = _position;
        notch = _notch;
    }

    public char rtl(char inputPin){
       char pairPin = rKey.charAt((inputPin-65 + position)%26);
        char outputChar = Character.toUpperCase(pairPin);
        //return ((char)(((((int)toEncrypt -  65) + position)%26)+65));
        return (outputChar);
    }
    private void incrementCount(){
        position++;
        if (position > 25){
            position = 0;
        }
        if (position < 0){
            position = 0;
        }
    }

}