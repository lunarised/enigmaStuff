public class Rotor{
    protected String rKey;
    protected int position;
    protected char notch;
    public Rotor(String _rKey, int _position, char _notch){
        rKey = _rKey;
        position = _position;
        notch = _notch;
    }
    public char encrypt(char toEncrypt){
        incrementCount();
        toEncrypt = Character.toUpperCase(toEncrypt);
        char encryptedChar = rKey.charAt((int)toEncrypt - 65);
        return encryptedChar;
    }
    public char staticencrypt(char toEncrypt){
        toEncrypt = Character.toLowerCase(toEncrypt);
        return toEncrypt;
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